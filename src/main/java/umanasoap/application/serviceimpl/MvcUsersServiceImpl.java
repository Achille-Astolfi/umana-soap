package umanasoap.application.serviceimpl;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Optional;

import javax.persistence.EntityExistsException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import umanasoap.application.entity.MvcUser;
import umanasoap.application.repository.MvcUsersRepository;
import umanasoap.service.MvcUsersService;

@Service
public class MvcUsersServiceImpl implements MvcUsersService {
	private Logger logger = LoggerFactory.getLogger(MvcUsersService.class);

	@Autowired
	private MvcUsersRepository mvcUsersRepository;

	@Override
	@Transactional
	public MvcUser createMvcUser(String username, String password) {
		if (mvcUsersRepository.existsById(username)) {
			throw new EntityExistsException();
		}
		var mvcUser = new MvcUser();
		mvcUser.setUsername(username);
		mvcUser.setPassword(password);
		var save = mvcUsersRepository.save(mvcUser);
		logToken(username, password);
		return save;
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<MvcUser> readMvcUserByAuth(String auth) {
		String basic;
		try {
			basic = new String(Base64.getDecoder().decode(auth), StandardCharsets.UTF_8);
		} catch (IllegalArgumentException e) {
			return Optional.empty();
		}
		var split = basic.split(":");
		if (split.length == 2) {
			return mvcUsersRepository.findByUsernameAndPassword(split[0], split[1]);
		} else {
			return Optional.empty();
		}
	}

	private void logToken(String username, String password) {
		logger.info(username.toUpperCase() + " Authorization: Bearer " + tokenize(username, password));
	}

	private String tokenize(String username, String password) {
		var basic = username + ':' + password;
		return Base64.getEncoder().encodeToString(basic.getBytes(StandardCharsets.UTF_8));
	}
}

package umanasoap.service;

import java.util.Optional;

import umanasoap.application.entity.MvcUser;

public interface MvcUsersService {

	MvcUser createMvcUser(String username, String password);

	Optional<MvcUser> readMvcUserByAuth(String auth);

}
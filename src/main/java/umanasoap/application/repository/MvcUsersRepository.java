package umanasoap.application.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import umanasoap.application.entity.MvcUser;

public interface MvcUsersRepository extends JpaRepository<MvcUser, String> {
	public Optional<MvcUser> findByUsernameAndPassword(String username, String password);
}

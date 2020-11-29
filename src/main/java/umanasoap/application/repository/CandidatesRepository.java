package umanasoap.application.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import umanasoap.application.entity.Candidate;

public interface CandidatesRepository extends JpaRepository<Candidate, Long> {
	public Optional<Candidate> findByEmailAddress(String emailAddress);
}

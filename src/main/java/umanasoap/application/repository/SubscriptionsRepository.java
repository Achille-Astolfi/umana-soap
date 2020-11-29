package umanasoap.application.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import umanasoap.application.entity.Candidate;
import umanasoap.application.entity.Course;
import umanasoap.application.entity.Subscription;

public interface SubscriptionsRepository extends JpaRepository<Subscription, Long> {
	Optional<Subscription> findByCandidateAndCourse(Candidate candidate, Course course);

	List<Subscription> findByCourse(Course course);
}

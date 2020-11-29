package umanasoap.service;

import java.util.List;
import java.util.Optional;

import umanasoap.application.entity.Candidate;
import umanasoap.application.entity.Course;
import umanasoap.application.entity.Subscription;

public interface SubscriptionsService {

	Subscription createSubscription(Candidate candidate, Course course);

	Subscription createSubscription(long candidateId, long courseId);

	Optional<Subscription> readSubscriptionById(Long id);

	List<Subscription> readSubscriptionsByCourse(Course course);

}
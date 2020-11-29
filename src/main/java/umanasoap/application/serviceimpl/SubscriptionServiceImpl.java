package umanasoap.application.serviceimpl;

import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import umanasoap.application.entity.Candidate;
import umanasoap.application.entity.Course;
import umanasoap.application.entity.Subscription;
import umanasoap.application.repository.SubscriptionsRepository;
import umanasoap.service.CandidatesService;
import umanasoap.service.CoursesService;
import umanasoap.service.SubscriptionsService;

@Service
public class SubscriptionServiceImpl implements SubscriptionsService {
	@Autowired
	private SubscriptionsRepository subscriptionsRepository;
	@Autowired
	private CandidatesService candidatesService;
	@Autowired
	private CoursesService coursesService;

	@PostConstruct
	private void initService() {
		createSubscription(1, 1);
		createSubscription(1, 2);
		createSubscription(2, 2);
	}

	@Override
	@Transactional
	public Subscription createSubscription(long candidateId, long courseId) {
		Candidate candidate = candidatesService.readCandidateById(candidateId)//
				.orElseThrow(EntityNotFoundException::new);
		Course course = coursesService.readCourseById(courseId)//
				.orElseThrow(EntityNotFoundException::new);
		return createSubscription(candidate, course);
	}

	@Override
	@Transactional
	public Subscription createSubscription(Candidate candidate, Course course) {
		if (subscriptionsRepository.findByCandidateAndCourse(candidate, course).isPresent()) {
			throw new EntityExistsException();
		}
		var subscription = new Subscription();
		subscription.setCandidate(candidate);
		subscription.setCourse(course);
		return subscriptionsRepository.save(subscription);
	}

	@Override
	public Optional<Subscription> readSubscriptionById(Long id) {
		return subscriptionsRepository.findById(id);
	}

	@Override
	public List<Subscription> readSubscriptionsByCourse(Course course) {
		return subscriptionsRepository.findByCourse(course);
	}
}

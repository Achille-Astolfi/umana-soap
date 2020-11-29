package umanasoap.service;

import java.util.List;
import java.util.Optional;

import umanasoap.application.entity.Candidate;

public interface CandidatesService {

	Candidate createCandidate(Candidate candidate);

	Optional<Candidate> readCandidateById(Long id);

	List<Candidate> readCandidatesAll();

}
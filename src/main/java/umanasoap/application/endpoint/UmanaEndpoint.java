package umanasoap.application.endpoint;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import umanasoap.application.repository.CandidatesRepository;
import umanasoap.webservice.Candidate;
import umanasoap.webservice.GetCandidateRequest;
import umanasoap.webservice.GetCandidateResponse;

@Endpoint
public class UmanaEndpoint {
    private static final String NAMESPACE_URI = "http://umanasoap/webservice";

    @Autowired
    private CandidatesRepository candidatesRepository;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCandidateRequest")
    @ResponsePayload
    public GetCandidateResponse getCandidate(@RequestPayload GetCandidateRequest req) {
        umanasoap.application.entity.Candidate c = candidatesRepository.findById(req.getId()).get();
        Candidate wsc = new Candidate();
        BeanUtils.copyProperties(c, wsc);
        GetCandidateResponse response = new GetCandidateResponse();
        response.setCandidate(wsc);
        return response;
    }

}

package umanasoap.application.endpoint;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import umanasoap.application.repository.CandidatesRepository;
import umanasoap.application.repository.CoursesRepository;
import umanasoap.webservice.Candidate;
import umanasoap.webservice.Course;
import umanasoap.webservice.GetCandidateRequest;
import umanasoap.webservice.GetCandidateResponse;
import umanasoap.webservice.GetCourseListResponse;
import umanasoap.webservice.GetCourseListResponse.Courses;
import umanasoap.webservice.GetCourseRequest;
import umanasoap.webservice.GetCourseResponse;

@Endpoint
public class UmanaEndpoint {
    private static final String NAMESPACE_URI = "http://umanasoap/webservice";

    @Autowired
    private CandidatesRepository candidatesRepository;

    @Autowired
    private CoursesRepository coursesRepository;

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

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCourseRequest")
    @ResponsePayload
    public GetCourseResponse getCourse(@RequestPayload GetCourseRequest req) {
        umanasoap.application.entity.Course c = coursesRepository.findById(req.getId()).get();
        Course wsc = new Course();
        BeanUtils.copyProperties(c, wsc);
        GetCourseResponse response = new GetCourseResponse();
        response.setCourse(wsc);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCourseListRequest")
    @ResponsePayload
    public GetCourseListResponse getCourseList() {
        var cl = coursesRepository.findAll();
        var courses = new Courses();
        for (var c : cl) {
            var wsc = new Course();
            BeanUtils.copyProperties(c, wsc);
            courses.getCourse().add(wsc);
        }
        var response = new GetCourseListResponse();
        response.setCourses(courses);
        return response;
    }
}

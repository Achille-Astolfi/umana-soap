//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.2 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.11.30 alle 05:35:21 PM CET 
//


package umanasoap.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the umanasoap.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetCourseListRequest_QNAME = new QName("http://umanasoap/webservice", "getCourseListRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: umanasoap.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCourseListResponse }
     * 
     */
    public GetCourseListResponse createGetCourseListResponse() {
        return new GetCourseListResponse();
    }

    /**
     * Create an instance of {@link GetCandidateRequest }
     * 
     */
    public GetCandidateRequest createGetCandidateRequest() {
        return new GetCandidateRequest();
    }

    /**
     * Create an instance of {@link GetCandidateResponse }
     * 
     */
    public GetCandidateResponse createGetCandidateResponse() {
        return new GetCandidateResponse();
    }

    /**
     * Create an instance of {@link Candidate }
     * 
     */
    public Candidate createCandidate() {
        return new Candidate();
    }

    /**
     * Create an instance of {@link GetCourseRequest }
     * 
     */
    public GetCourseRequest createGetCourseRequest() {
        return new GetCourseRequest();
    }

    /**
     * Create an instance of {@link GetCourseResponse }
     * 
     */
    public GetCourseResponse createGetCourseResponse() {
        return new GetCourseResponse();
    }

    /**
     * Create an instance of {@link Course }
     * 
     */
    public Course createCourse() {
        return new Course();
    }

    /**
     * Create an instance of {@link GetCourseListResponse.Courses }
     * 
     */
    public GetCourseListResponse.Courses createGetCourseListResponseCourses() {
        return new GetCourseListResponse.Courses();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://umanasoap/webservice", name = "getCourseListRequest")
    public JAXBElement<Object> createGetCourseListRequest(Object value) {
        return new JAXBElement<Object>(_GetCourseListRequest_QNAME, Object.class, null, value);
    }

}

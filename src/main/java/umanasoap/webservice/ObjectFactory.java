//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.2 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.11.29 alle 11:00:27 PM CET 
//


package umanasoap.webservice;

import javax.xml.bind.annotation.XmlRegistry;


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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: umanasoap.webservice
     * 
     */
    public ObjectFactory() {
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

}

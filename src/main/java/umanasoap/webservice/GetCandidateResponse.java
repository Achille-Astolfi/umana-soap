//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.2 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.11.29 alle 11:00:27 PM CET 
//


package umanasoap.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="candidate" type="{http://umanasoap/webservice}candidate"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "candidate"
})
@XmlRootElement(name = "getCandidateResponse")
public class GetCandidateResponse {

    @XmlElement(required = true)
    protected Candidate candidate;

    /**
     * Recupera il valore della proprietà candidate.
     * 
     * @return
     *     possible object is
     *     {@link Candidate }
     *     
     */
    public Candidate getCandidate() {
        return candidate;
    }

    /**
     * Imposta il valore della proprietà candidate.
     * 
     * @param value
     *     allowed object is
     *     {@link Candidate }
     *     
     */
    public void setCandidate(Candidate value) {
        this.candidate = value;
    }

}

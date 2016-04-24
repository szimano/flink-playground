
package london.jaxb.disruption;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="toid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Line" type="{}LineType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkType", propOrder = {
    "toid",
    "line"
})
public class LinkType {

    @XmlElement(required = true)
    protected String toid;
    @XmlElement(name = "Line", required = true)
    protected LineType line;

    /**
     * Gets the value of the toid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToid() {
        return toid;
    }

    /**
     * Sets the value of the toid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToid(String value) {
        this.toid = value;
    }

    /**
     * Gets the value of the line property.
     * 
     * @return
     *     possible object is
     *     {@link LineType }
     *     
     */
    public LineType getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineType }
     *     
     */
    public void setLine(LineType value) {
        this.line = value;
    }

}

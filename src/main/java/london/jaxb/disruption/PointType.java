
package london.jaxb.disruption;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PointType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PointType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="coordinatesEN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="coordinatesLL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointType", propOrder = {
    "coordinatesEN",
    "coordinatesLL"
})
public class PointType {

    @XmlElement(required = true)
    protected String coordinatesEN;
    @XmlElement(required = true)
    protected String coordinatesLL;

    /**
     * Gets the value of the coordinatesEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoordinatesEN() {
        return coordinatesEN;
    }

    /**
     * Sets the value of the coordinatesEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoordinatesEN(String value) {
        this.coordinatesEN = value;
    }

    /**
     * Gets the value of the coordinatesLL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoordinatesLL() {
        return coordinatesLL;
    }

    /**
     * Sets the value of the coordinatesLL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoordinatesLL(String value) {
        this.coordinatesLL = value;
    }

}

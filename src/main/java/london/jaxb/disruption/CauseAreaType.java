
package london.jaxb.disruption;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CauseAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CauseAreaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DisplayPoint" type="{}DisplayPointType"/>
 *         &lt;element name="Streets" type="{}StreetsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CauseAreaType", propOrder = {
    "displayPoint",
    "streets"
})
public class CauseAreaType {

    @XmlElement(name = "DisplayPoint", required = true)
    protected DisplayPointType displayPoint;
    @XmlElement(name = "Streets", required = true)
    protected StreetsType streets;

    /**
     * Gets the value of the displayPoint property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayPointType }
     *     
     */
    public DisplayPointType getDisplayPoint() {
        return displayPoint;
    }

    /**
     * Sets the value of the displayPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayPointType }
     *     
     */
    public void setDisplayPoint(DisplayPointType value) {
        this.displayPoint = value;
    }

    /**
     * Gets the value of the streets property.
     * 
     * @return
     *     possible object is
     *     {@link StreetsType }
     *     
     */
    public StreetsType getStreets() {
        return streets;
    }

    /**
     * Sets the value of the streets property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreetsType }
     *     
     */
    public void setStreets(StreetsType value) {
        this.streets = value;
    }

}

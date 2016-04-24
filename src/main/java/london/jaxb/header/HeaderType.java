
package london.jaxb.header;

import lombok.ToString;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DisplayTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PublishDateTime" type="{}PublishDateTimeType"/>
 *         &lt;element name="Author" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Owner" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RefreshRate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Max_Latency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TimeToError" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Schedule" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Attribution" type="{}AttributionType"/>
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaderType", propOrder = {
    "identifier",
    "displayTitle",
    "version",
    "publishDateTime",
    "author",
    "owner",
    "refreshRate",
    "maxLatency",
    "timeToError",
    "schedule",
    "attribution",
    "language"
})
@ToString
public class HeaderType {

    @XmlElement(name = "Identifier", required = true)
    protected String identifier;
    @XmlElement(name = "DisplayTitle", required = true)
    protected String displayTitle;
    @XmlElement(name = "Version", required = true)
    protected String version;
    @XmlElement(name = "PublishDateTime", required = true)
    protected PublishDateTimeType publishDateTime;
    @XmlElement(name = "Author", required = true)
    protected String author;
    @XmlElement(name = "Owner", required = true)
    protected String owner;
    @XmlElement(name = "RefreshRate", required = true)
    protected String refreshRate;
    @XmlElement(name = "Max_Latency", required = true)
    protected String maxLatency;
    @XmlElement(name = "TimeToError", required = true)
    protected String timeToError;
    @XmlElement(name = "Schedule", required = true)
    protected String schedule;
    @XmlElement(name = "Attribution", required = true)
    protected AttributionType attribution;
    @XmlElement(name = "Language", required = true)
    protected String language;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the displayTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayTitle() {
        return displayTitle;
    }

    /**
     * Sets the value of the displayTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayTitle(String value) {
        this.displayTitle = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the publishDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link PublishDateTimeType }
     *     
     */
    public PublishDateTimeType getPublishDateTime() {
        return publishDateTime;
    }

    /**
     * Sets the value of the publishDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublishDateTimeType }
     *     
     */
    public void setPublishDateTime(PublishDateTimeType value) {
        this.publishDateTime = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the refreshRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefreshRate() {
        return refreshRate;
    }

    /**
     * Sets the value of the refreshRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefreshRate(String value) {
        this.refreshRate = value;
    }

    /**
     * Gets the value of the maxLatency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxLatency() {
        return maxLatency;
    }

    /**
     * Sets the value of the maxLatency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxLatency(String value) {
        this.maxLatency = value;
    }

    /**
     * Gets the value of the timeToError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeToError() {
        return timeToError;
    }

    /**
     * Sets the value of the timeToError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeToError(String value) {
        this.timeToError = value;
    }

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchedule(String value) {
        this.schedule = value;
    }

    /**
     * Gets the value of the attribution property.
     * 
     * @return
     *     possible object is
     *     {@link AttributionType }
     *     
     */
    public AttributionType getAttribution() {
        return attribution;
    }

    /**
     * Sets the value of the attribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributionType }
     *     
     */
    public void setAttribution(AttributionType value) {
        this.attribution = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

}

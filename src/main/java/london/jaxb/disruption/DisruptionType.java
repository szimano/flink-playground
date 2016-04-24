
package london.jaxb.disruption;

import lombok.ToString;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisruptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisruptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="severity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="levelOfInterest" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subCategory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="corridor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="currentUpdate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="remarkTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastModTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CauseArea" type="{}CauseAreaType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisruptionType", propOrder = {
    "status",
    "severity",
    "levelOfInterest",
    "category",
    "subCategory",
    "startTime",
    "endTime",
    "location",
    "corridor",
    "comments",
    "currentUpdate",
    "remarkTime",
    "lastModTime",
    "causeArea"
})
@ToString
public class DisruptionType {

    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected String severity;
    @XmlElement(required = true)
    protected String levelOfInterest;
    @XmlElement(required = true)
    protected String category;
    @XmlElement(required = true)
    protected String subCategory;
    @XmlElement(required = true)
    protected String startTime;
    @XmlElement(required = true)
    protected String endTime;
    @XmlElement(required = true)
    protected String location;
    @XmlElement(required = true)
    protected String corridor;
    @XmlElement(required = true)
    protected String comments;
    @XmlElement(required = true)
    protected String currentUpdate;
    @XmlElement(required = true)
    protected String remarkTime;
    @XmlElement(required = true)
    protected String lastModTime;
    @XmlElement(name = "CauseArea", required = true)
    protected CauseAreaType causeArea;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeverity(String value) {
        this.severity = value;
    }

    /**
     * Gets the value of the levelOfInterest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelOfInterest() {
        return levelOfInterest;
    }

    /**
     * Sets the value of the levelOfInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelOfInterest(String value) {
        this.levelOfInterest = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the subCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCategory() {
        return subCategory;
    }

    /**
     * Sets the value of the subCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCategory(String value) {
        this.subCategory = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(String value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(String value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the corridor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorridor() {
        return corridor;
    }

    /**
     * Sets the value of the corridor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorridor(String value) {
        this.corridor = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the currentUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentUpdate() {
        return currentUpdate;
    }

    /**
     * Sets the value of the currentUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentUpdate(String value) {
        this.currentUpdate = value;
    }

    /**
     * Gets the value of the remarkTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarkTime() {
        return remarkTime;
    }

    /**
     * Sets the value of the remarkTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarkTime(String value) {
        this.remarkTime = value;
    }

    /**
     * Gets the value of the lastModTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModTime() {
        return lastModTime;
    }

    /**
     * Sets the value of the lastModTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModTime(String value) {
        this.lastModTime = value;
    }

    /**
     * Gets the value of the causeArea property.
     * 
     * @return
     *     possible object is
     *     {@link CauseAreaType }
     *     
     */
    public CauseAreaType getCauseArea() {
        return causeArea;
    }

    /**
     * Sets the value of the causeArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link CauseAreaType }
     *     
     */
    public void setCauseArea(CauseAreaType value) {
        this.causeArea = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}

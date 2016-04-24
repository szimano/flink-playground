
package london.jaxb.disruption;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wikiedits.jaxb package. 
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

    private final static QName _Disruption_QNAME = new QName("", "Disruption");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wikiedits.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DisruptionType }
     * 
     */
    public DisruptionType createDisruptionType() {
        return new DisruptionType();
    }

    /**
     * Create an instance of {@link CauseAreaType }
     * 
     */
    public CauseAreaType createCauseAreaType() {
        return new CauseAreaType();
    }

    /**
     * Create an instance of {@link PointType }
     * 
     */
    public PointType createPointType() {
        return new PointType();
    }

    /**
     * Create an instance of {@link StreetsType }
     * 
     */
    public StreetsType createStreetsType() {
        return new StreetsType();
    }

    /**
     * Create an instance of {@link LinkType }
     * 
     */
    public LinkType createLinkType() {
        return new LinkType();
    }

    /**
     * Create an instance of {@link StreetType }
     * 
     */
    public StreetType createStreetType() {
        return new StreetType();
    }

    /**
     * Create an instance of {@link DisplayPointType }
     * 
     */
    public DisplayPointType createDisplayPointType() {
        return new DisplayPointType();
    }

    /**
     * Create an instance of {@link LineType }
     * 
     */
    public LineType createLineType() {
        return new LineType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisruptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Disruption")
    public JAXBElement<DisruptionType> createDisruption(DisruptionType value) {
        return new JAXBElement<DisruptionType>(_Disruption_QNAME, DisruptionType.class, null, value);
    }

}

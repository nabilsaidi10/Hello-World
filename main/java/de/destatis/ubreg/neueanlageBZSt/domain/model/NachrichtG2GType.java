//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package de.destatis.ubreg.neueanlageBZSt.domain.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Basistyp für alle Nachrichten zwischen Behörden und anderen öffentlichen Stellen (government-to-government).
 * 
 * <p>Java-Klasse für Nachricht.G2GType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>{@code
 * <complexType name="Nachricht.G2GType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://xoev.de/schemata/basisnachricht/g2g/1_0}nachrichtenkopf.g2g"/>
 *       </sequence>
 *       <attribute name="produkt" use="required" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" />
 *       <attribute name="produkthersteller" use="required" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" />
 *       <attribute name="produktversion" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" />
 *       <attribute name="standard" use="required" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" />
 *       <attribute name="test" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" />
 *       <attribute name="version" use="required" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Nachricht.G2GType", namespace = "http://xoev.de/schemata/basisnachricht/g2g/1_0", propOrder = {
    "nachrichtenkopfG2G"
})
public class NachrichtG2GType {

    @XmlElement(name = "nachrichtenkopf.g2g", required = true)
    protected NachrichtenkopfG2GType nachrichtenkopfG2G;
    @XmlAttribute(name = "produkt", required = true)
    protected String produkt;
    @XmlAttribute(name = "produkthersteller", required = true)
    protected String produkthersteller;
    @XmlAttribute(name = "produktversion")
    protected String produktversion;
    @XmlAttribute(name = "standard", required = true)
    protected String standard;
    @XmlAttribute(name = "test")
    protected String test;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Nachrichtenkopf für Nachrichten zwischen Behörden und anderen (öffentlichen) Stellen. Der Nachrichtenkopf umfasst Angaben zur eindeutigen Identifikation des Autors und des Lesers der Nachricht sowie der Nachricht selbst.
     * 
     * @return
     *     possible object is
     *     {@link NachrichtenkopfG2GType }
     *     
     */
    public NachrichtenkopfG2GType getNachrichtenkopfG2G() {
        return nachrichtenkopfG2G;
    }

    /**
     * Legt den Wert der nachrichtenkopfG2G-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NachrichtenkopfG2GType }
     *     
     */
    public void setNachrichtenkopfG2G(NachrichtenkopfG2GType value) {
        this.nachrichtenkopfG2G = value;
    }

    /**
     * Ruft den Wert der produkt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdukt() {
        return produkt;
    }

    /**
     * Legt den Wert der produkt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdukt(String value) {
        this.produkt = value;
    }

    /**
     * Ruft den Wert der produkthersteller-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdukthersteller() {
        return produkthersteller;
    }

    /**
     * Legt den Wert der produkthersteller-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdukthersteller(String value) {
        this.produkthersteller = value;
    }

    /**
     * Ruft den Wert der produktversion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduktversion() {
        return produktversion;
    }

    /**
     * Legt den Wert der produktversion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduktversion(String value) {
        this.produktversion = value;
    }

    /**
     * Ruft den Wert der standard-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandard() {
        return standard;
    }

    /**
     * Legt den Wert der standard-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandard(String value) {
        this.standard = value;
    }

    /**
     * Ruft den Wert der test-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTest() {
        return test;
    }

    /**
     * Legt den Wert der test-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTest(String value) {
        this.test = value;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
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
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}

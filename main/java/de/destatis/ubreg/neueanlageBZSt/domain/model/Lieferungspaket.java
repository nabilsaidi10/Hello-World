//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package de.destatis.ubreg.neueanlageBZSt.domain.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="produkt" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
 *         <element name="produkthersteller" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
 *         <element name="produktversion" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *         <element name="version" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
 *         <element name="lieferungspaketkopf" type="{urn:BZStBasisregisterSST_0.2.6}Lieferungspaketkopf"/>
 *         <element name="unternehmenseinheit" type="{urn:BZStBasisregisterSST_0.2.6}Unternehmenseinheit" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "produkt",
    "produkthersteller",
    "produktversion",
    "version",
    "lieferungspaketkopf",
    "unternehmenseinheit"
})
@XmlRootElement(name = "lieferungspaket")
public class Lieferungspaket {

    @XmlElement(required = true)
    protected String produkt;
    @XmlElement(required = true)
    protected String produkthersteller;
    protected String produktversion;
    @XmlElement(required = true)
    protected String version;
    @XmlElement(required = true)
    protected Lieferungspaketkopf lieferungspaketkopf;
    @XmlElement(required = true)
    protected List<Unternehmenseinheit> unternehmenseinheit;

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

    /**
     * Ruft den Wert der lieferungspaketkopf-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Lieferungspaketkopf }
     *     
     */
    public Lieferungspaketkopf getLieferungspaketkopf() {
        return lieferungspaketkopf;
    }

    /**
     * Legt den Wert der lieferungspaketkopf-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Lieferungspaketkopf }
     *     
     */
    public void setLieferungspaketkopf(Lieferungspaketkopf value) {
        this.lieferungspaketkopf = value;
    }

    /**
     * Gets the value of the unternehmenseinheit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the unternehmenseinheit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnternehmenseinheit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Unternehmenseinheit }
     * 
     * 
     * @return
     *     The value of the unternehmenseinheit property.
     */
    public List<Unternehmenseinheit> getUnternehmenseinheit() {
        if (unternehmenseinheit == null) {
            unternehmenseinheit = new ArrayList<>();
        }
        return this.unternehmenseinheit;
    }

}

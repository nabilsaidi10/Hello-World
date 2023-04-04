//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package de.destatis.ubreg.neueanlageBZSt.domain.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Element zur Übertragung der Wirtschaftsidentifikationsnummer und der Gültigkeit.
 * 
 * <p>Java-Klasse für W-IdNr complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>{@code
 * <complexType name="W-IdNr">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="w-IdNr." type="{urn:BZStBasisregisterSST_0.2.6}Identifikator"/>
 *         <element name="u-Merkmal" type="{urn:BZStBasisregisterSST_0.2.6}Identifikator"/>
 *         <element name="gueltigkeit" type="{urn:BZStBasisregisterSST_0.2.6}Gueltigkeit"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "W-IdNr", propOrder = {
    "wIdNr",
    "uMerkmal",
    "gueltigkeit"
})
public class WIdNr {

    @XmlElement(name = "w-IdNr.", required = true)
    protected Identifikator wIdNr;
    @XmlElement(name = "u-Merkmal", required = true)
    protected Identifikator uMerkmal;
    @XmlElement(required = true)
    protected Gueltigkeit gueltigkeit;

    /**
     * Ruft den Wert der wIdNr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Identifikator }
     *     
     */
    public Identifikator getWIdNr() {
        return wIdNr;
    }

    /**
     * Legt den Wert der wIdNr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifikator }
     *     
     */
    public void setWIdNr(Identifikator value) {
        this.wIdNr = value;
    }

    /**
     * Ruft den Wert der uMerkmal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Identifikator }
     *     
     */
    public Identifikator getUMerkmal() {
        return uMerkmal;
    }

    /**
     * Legt den Wert der uMerkmal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifikator }
     *     
     */
    public void setUMerkmal(Identifikator value) {
        this.uMerkmal = value;
    }

    /**
     * Ruft den Wert der gueltigkeit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Gueltigkeit }
     *     
     */
    public Gueltigkeit getGueltigkeit() {
        return gueltigkeit;
    }

    /**
     * Legt den Wert der gueltigkeit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Gueltigkeit }
     *     
     */
    public void setGueltigkeit(Gueltigkeit value) {
        this.gueltigkeit = value;
    }

}

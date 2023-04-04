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
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:wirtschaftlichetaetigkeit_1.1}artBetriebsstaette"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1}anschrift" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:wirtschaftlichetaetigkeit_1.1}geschaeftsbezeichnung" minOccurs="0"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:kommunikation_1.1}kommunikation" maxOccurs="unbounded" minOccurs="0"/>
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
    "artBetriebsstaette",
    "anschrift",
    "geschaeftsbezeichnung",
    "kommunikation"
})
@XmlRootElement(name = "betriebsstaette", namespace = "urn:xoev-de:xunternehmen:standard:basismodul:wirtschaftlichetaetigkeit_1.1")
public class Betriebsstaette {

    @XmlElement(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:wirtschaftlichetaetigkeit_1.1", required = true)
    protected CodeArtNiederlassung artBetriebsstaette;
    @XmlElement(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1")
    protected List<AnschriftType> anschrift;
    @XmlElement(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:wirtschaftlichetaetigkeit_1.1")
    protected String geschaeftsbezeichnung;
    @XmlElement(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:kommunikation_1.1")
    protected List<Kommunikation> kommunikation;

    /**
     * Nähere Bestimmung der Art der Betriebsstätte
     * 
     * @return
     *     possible object is
     *     {@link CodeArtNiederlassung }
     *     
     */
    public CodeArtNiederlassung getArtBetriebsstaette() {
        return artBetriebsstaette;
    }

    /**
     * Legt den Wert der artBetriebsstaette-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeArtNiederlassung }
     *     
     */
    public void setArtBetriebsstaette(CodeArtNiederlassung value) {
        this.artBetriebsstaette = value;
    }

    /**
     * Angaben für die Adressierung. Eine Anschrift ist entweder eine Inlands- oder ein Auslandsanschrift.Gets the value of the anschrift property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the anschrift property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnschrift().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnschriftType }
     * 
     * 
     * @return
     *     The value of the anschrift property.
     */
    public List<AnschriftType> getAnschrift() {
        if (anschrift == null) {
            anschrift = new ArrayList<>();
        }
        return this.anschrift;
    }

    /**
     * Zur Außendarstellung einer wirtschaftlichen Tätigkeit oder einer Betriebsstätte verwendeter Name, der nicht im Handel-, Genossenschafts-, Partnerschafts- oder Vereinsregister eingetragen ist oder davon abweicht (z.B. Gasthof "Zum lustigen Wirt"; "Ruck-Zuck-GbR").
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeschaeftsbezeichnung() {
        return geschaeftsbezeichnung;
    }

    /**
     * Legt den Wert der geschaeftsbezeichnung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeschaeftsbezeichnung(String value) {
        this.geschaeftsbezeichnung = value;
    }

    /**
     * Angaben zu Telefon, Telefax, Email-Adresse und/oder Webseite.Gets the value of the kommunikation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the kommunikation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKommunikation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Kommunikation }
     * 
     * 
     * @return
     *     The value of the kommunikation property.
     */
    public List<Kommunikation> getKommunikation() {
        if (kommunikation == null) {
            kommunikation = new ArrayList<>();
        }
        return this.kommunikation;
    }

}

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
 * Dieser Typ enthält Angaben zur Erreichbarkeit über elektronische Kommunikationskanäle (z. B. Telefon, E-Mail).
 * 
 * <p>Java-Klasse für KommunikationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>{@code
 * <complexType name="KommunikationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="kanal" type="{http://xoev.de/schemata/basisnachricht/kommunikation/1_0}Code.Kommunikation.KanalType"/>
 *         <element name="kennung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
 *         <element name="zusatz" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KommunikationType", namespace = "http://xoev.de/schemata/basisnachricht/kommunikation/1_0", propOrder = {
    "kanal",
    "kennung",
    "zusatz"
})
public class KommunikationType {

    @XmlElement(required = true)
    protected CodeKommunikationKanalType kanal;
    @XmlElement(required = true)
    protected String kennung;
    protected String zusatz;

    /**
     * Ruft den Wert der kanal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeKommunikationKanalType }
     *     
     */
    public CodeKommunikationKanalType getKanal() {
        return kanal;
    }

    /**
     * Legt den Wert der kanal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeKommunikationKanalType }
     *     
     */
    public void setKanal(CodeKommunikationKanalType value) {
        this.kanal = value;
    }

    /**
     * Ruft den Wert der kennung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKennung() {
        return kennung;
    }

    /**
     * Legt den Wert der kennung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKennung(String value) {
        this.kennung = value;
    }

    /**
     * Ruft den Wert der zusatz-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZusatz() {
        return zusatz;
    }

    /**
     * Legt den Wert der zusatz-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZusatz(String value) {
        this.zusatz = value;
    }

}

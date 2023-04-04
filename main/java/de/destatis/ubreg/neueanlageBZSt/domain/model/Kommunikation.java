//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package de.destatis.ubreg.neueanlageBZSt.domain.model;

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
 *     <extension base="{urn:xoev-de:xunternehmen:standard:basismodul:kommunikation_1.1}kommunikationBasis">
 *       <choice>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:kommunikation_1.1}telefon"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:kommunikation_1.1}telefax"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:kommunikation_1.1}eMail"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:kommunikation_1.1}deMail"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:kommunikation_1.1}webAdresse"/>
 *       </choice>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "telefon",
    "telefax",
    "eMail",
    "deMail",
    "webAdresse"
})
@XmlRootElement(name = "kommunikation", namespace = "urn:xoev-de:xunternehmen:standard:basismodul:kommunikation_1.1")
public class Kommunikation
    extends KommunikationBasis
{

    @XmlElement(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:kommunikation_1.1")
    protected String telefon;
    @XmlElement(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:kommunikation_1.1")
    protected String telefax;
    @XmlElement(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:kommunikation_1.1")
    protected String eMail;
    @XmlElement(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:kommunikation_1.1")
    protected String deMail;
    @XmlElement(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:kommunikation_1.1")
    protected String webAdresse;

    /**
     * Telefonnummer, strukturiert gemäß ITU E.123. Beispiel: "+49 \u2009421 1234567", "+49 \u2009421 123 4567", "(0421) 1234567". Die Angabe soll möglichst gemäß DIN 5008 aufgebaut sein.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     * Legt den Wert der telefon-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefon(String value) {
        this.telefon = value;
    }

    /**
     * Telefaxnummer, strukturiert gemäß ITU E.123. Beispiel: "+49 \u2009421 1234567", "+49 \u2009421 123 4567", "(0421) 1234567". Die Angabe soll möglichst gemäß DIN 5008 aufgebaut sein.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefax() {
        return telefax;
    }

    /**
     * Legt den Wert der telefax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefax(String value) {
        this.telefax = value;
    }

    /**
     * E-Mail-Adresse
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMail() {
        return eMail;
    }

    /**
     * Legt den Wert der eMail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMail(String value) {
        this.eMail = value;
    }

    /**
     * De-Mail-Adresse, strukturiert gemäß BSI TR-01201 De-Mail. Beispiel: erika.mustermann@mustermann.de-mail.de
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeMail() {
        return deMail;
    }

    /**
     * Legt den Wert der deMail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeMail(String value) {
        this.deMail = value;
    }

    /**
     * Web-Adresse
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebAdresse() {
        return webAdresse;
    }

    /**
     * Legt den Wert der webAdresse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebAdresse(String value) {
        this.webAdresse = value;
    }

}

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
 * <p>Java-Klasse für StaatType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>{@code
 * <complexType name="StaatType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1}staat.code" minOccurs="0"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1}staat.freitext"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StaatType", namespace = "urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", propOrder = {
    "staatCode",
    "staatFreitext"
})
public class StaatType {

    @XmlElement(name = "staat.code")
    protected CodeStaat staatCode;
    @XmlElement(name = "staat.freitext", required = true)
    protected String staatFreitext;

    /**
     * Identifikation des Staats bzw. Staatsgebiets anhand einer Codeliste. Es ist eine der folgenden Codelisten zu verwenden: Codeliste Staat aus der Staats- und Gebietssystematik des Statistischen Bundesamtes (urn:de:bund: destatis:bevoelkerungsstatistik:schluessel:staat) Codeliste Staatsgebiete aus der Staats- und Gebietssystematik des Statistischen Bundesamtes (urn:de: bund:destatis:bevoelkerungsstatistik:schluessel:staatsgebiete) Codeliste Staatsangehörigkeit aus der Staats- und Gebietssystematik des Statistischen Bundesamtes (urn:de:bund:destatis:bevoelkerungsstatistik:schluessel:staatsangehoerigkeit) Country Codes (urn:xoev-de:kosit:codeliste:country-codes)
     * 
     * @return
     *     possible object is
     *     {@link CodeStaat }
     *     
     */
    public CodeStaat getStaatCode() {
        return staatCode;
    }

    /**
     * Legt den Wert der staatCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeStaat }
     *     
     */
    public void setStaatCode(CodeStaat value) {
        this.staatCode = value;
    }

    /**
     * Die Bezeichnung des Staats- bzw. Staatsgebiets.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaatFreitext() {
        return staatFreitext;
    }

    /**
     * Legt den Wert der staatFreitext-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaatFreitext(String value) {
        this.staatFreitext = value;
    }

}

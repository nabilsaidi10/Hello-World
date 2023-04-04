//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package de.destatis.ubreg.neueanlageBZSt.domain.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für kommunikationBasis complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>{@code
 * <complexType name="kommunikationBasis">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:kommunikation_1.1}klassifikationKommunikation" minOccurs="0"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:kommunikation_1.1}hinweis" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kommunikationBasis", namespace = "urn:xoev-de:xunternehmen:standard:basismodul:kommunikation_1.1", propOrder = {
    "klassifikationKommunikation",
    "hinweis"
})
@XmlSeeAlso({
    Kommunikation.class
})
public class KommunikationBasis {

    protected CodeKlassifikationKommunikation klassifikationKommunikation;
    protected String hinweis;

    /**
     * Eine Klassifikation der Kommunikationsangabe (privat, geschäftlich, ...)
     * 
     * @return
     *     possible object is
     *     {@link CodeKlassifikationKommunikation }
     *     
     */
    public CodeKlassifikationKommunikation getKlassifikationKommunikation() {
        return klassifikationKommunikation;
    }

    /**
     * Legt den Wert der klassifikationKommunikation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeKlassifikationKommunikation }
     *     
     */
    public void setKlassifikationKommunikation(CodeKlassifikationKommunikation value) {
        this.klassifikationKommunikation = value;
    }

    /**
     * Ein ergänzender Hinweis zur Verwendung dieses Kommunikationsangabe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHinweis() {
        return hinweis;
    }

    /**
     * Legt den Wert der hinweis-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHinweis(String value) {
        this.hinweis = value;
    }

}

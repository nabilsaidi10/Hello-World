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
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:wirtschaftlichetaetigkeit_1.1}wirtschaftlichTaetiger.id"/>
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
    "wirtschaftlichTaetigerId"
})
@XmlRootElement(name = "wirtschaftlichTaetiger", namespace = "urn:xoev-de:xunternehmen:standard:basismodul:wirtschaftlichetaetigkeit_1.1")
public class WirtschaftlichTaetiger {

    @XmlElement(name = "wirtschaftlichTaetiger.id", namespace = "urn:xoev-de:xunternehmen:standard:basismodul:wirtschaftlichetaetigkeit_1.1", required = true)
    protected String wirtschaftlichTaetigerId;

    /**
     * ID-Verweis innerhalb des jeweiligen Kontextes auf ein Element np:natuerlichePerson, jp:juristischePerson, pg:rechtsfaehigePersonengesellschaft, pv:sonstigePersonenvereinigung (oder auf ein entsprechendes abgeleitetes Element) in der Rolle Wirtschaftlich Tätiger.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWirtschaftlichTaetigerId() {
        return wirtschaftlichTaetigerId;
    }

    /**
     * Legt den Wert der wirtschaftlichTaetigerId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWirtschaftlichTaetigerId(String value) {
        this.wirtschaftlichTaetigerId = value;
    }

}

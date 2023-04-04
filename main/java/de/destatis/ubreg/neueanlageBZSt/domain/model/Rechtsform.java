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
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:rechtsform_1.1}rechtsformcode" minOccurs="0"/>
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
    "rechtsformcode"
})
@XmlRootElement(name = "rechtsform", namespace = "urn:xoev-de:xunternehmen:standard:basismodul:rechtsform_1.1")
public class Rechtsform {

    @XmlElement(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:rechtsform_1.1")
    protected CodeRechtsformen rechtsformcode;

    /**
     * Code dieser Rechtsform
     * 
     * @return
     *     possible object is
     *     {@link CodeRechtsformen }
     *     
     */
    public CodeRechtsformen getRechtsformcode() {
        return rechtsformcode;
    }

    /**
     * Legt den Wert der rechtsformcode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeRechtsformen }
     *     
     */
    public void setRechtsformcode(CodeRechtsformen value) {
        this.rechtsformcode = value;
    }

}

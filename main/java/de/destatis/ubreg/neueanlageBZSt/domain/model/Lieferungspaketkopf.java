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
 * Lieferungspaketkopf für das Lieferungspaket zwischen Behörden und anderen (öffentlichen) Stellen. Der Lieferungpaketskopf umfasst Angaben zur eindeutigen Identifikation des Autors und des Lesers der Nachricht sowie der Nachricht selbst.
 * 
 * <p>Java-Klasse für Lieferungspaketkopf complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>{@code
 * <complexType name="Lieferungspaketkopf">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="identifikation" type="{urn:BZStBasisregisterSST_0.2.6}Identifikation.Lieferungspaket"/>
 *         <element name="autor" type="{urn:BZStBasisregisterSST_0.2.6}BehoerdeInfo"/>
 *         <element name="leser" type="{urn:BZStBasisregisterSST_0.2.6}BehoerdeInfo"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Lieferungspaketkopf", propOrder = {
    "identifikation",
    "autor",
    "leser"
})
public class Lieferungspaketkopf {

    @XmlElement(required = true)
    protected IdentifikationLieferungspaket identifikation;
    @XmlElement(required = true)
    protected BehoerdeInfo autor;
    @XmlElement(required = true)
    protected BehoerdeInfo leser;

    /**
     * Ruft den Wert der identifikation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IdentifikationLieferungspaket }
     *     
     */
    public IdentifikationLieferungspaket getIdentifikation() {
        return identifikation;
    }

    /**
     * Legt den Wert der identifikation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifikationLieferungspaket }
     *     
     */
    public void setIdentifikation(IdentifikationLieferungspaket value) {
        this.identifikation = value;
    }

    /**
     * Ruft den Wert der autor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BehoerdeInfo }
     *     
     */
    public BehoerdeInfo getAutor() {
        return autor;
    }

    /**
     * Legt den Wert der autor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BehoerdeInfo }
     *     
     */
    public void setAutor(BehoerdeInfo value) {
        this.autor = value;
    }

    /**
     * Ruft den Wert der leser-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BehoerdeInfo }
     *     
     */
    public BehoerdeInfo getLeser() {
        return leser;
    }

    /**
     * Legt den Wert der leser-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BehoerdeInfo }
     *     
     */
    public void setLeser(BehoerdeInfo value) {
        this.leser = value;
    }

}

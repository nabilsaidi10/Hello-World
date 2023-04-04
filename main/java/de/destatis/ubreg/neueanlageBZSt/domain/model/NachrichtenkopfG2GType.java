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
 * Nachrichtenkopf für Nachrichten zwischen Behörden und anderen (öffentlichen) Stellen. Der Nachrichtenkopf umfasst Angaben zur eindeutigen Identifikation des Autors und des Lesers der Nachricht sowie der Nachricht selbst.
 * 
 * <p>Java-Klasse für Nachrichtenkopf.G2GType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>{@code
 * <complexType name="Nachrichtenkopf.G2GType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://xoev.de/schemata/basisnachricht/g2g/1_0}identifikation.nachricht"/>
 *         <element ref="{http://xoev.de/schemata/basisnachricht/g2g/1_0}leser"/>
 *         <element ref="{http://xoev.de/schemata/basisnachricht/g2g/1_0}autor"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Nachrichtenkopf.G2GType", namespace = "http://xoev.de/schemata/basisnachricht/g2g/1_0", propOrder = {
    "identifikationNachricht",
    "leser",
    "autor"
})
public class NachrichtenkopfG2GType {

    @XmlElement(name = "identifikation.nachricht", required = true)
    protected IdentifikationNachrichtType identifikationNachricht;
    @XmlElement(required = true)
    protected BehoerdeType leser;
    @XmlElement(required = true)
    protected BehoerdeType autor;

    /**
     * Dieses Element enthält Angaben zur eindeutigen Identifikation einer Nachricht.
     * 
     * @return
     *     possible object is
     *     {@link IdentifikationNachrichtType }
     *     
     */
    public IdentifikationNachrichtType getIdentifikationNachricht() {
        return identifikationNachricht;
    }

    /**
     * Legt den Wert der identifikationNachricht-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifikationNachrichtType }
     *     
     */
    public void setIdentifikationNachricht(IdentifikationNachrichtType value) {
        this.identifikationNachricht = value;
    }

    /**
     * Dieses Element enthält Angaben zum Leser der Nachricht. Der Leser ist die fachlich zuständige Behörde / öffentliche Stelle, der die Nachricht zugestellt werden soll und die die Nachricht fachlich verarbeiten soll.
     * 
     * @return
     *     possible object is
     *     {@link BehoerdeType }
     *     
     */
    public BehoerdeType getLeser() {
        return leser;
    }

    /**
     * Legt den Wert der leser-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BehoerdeType }
     *     
     */
    public void setLeser(BehoerdeType value) {
        this.leser = value;
    }

    /**
     * Dieses Element enthält Angaben zum Autor der Nachricht, die es dem Leser ermöglichen, bei Bedarf mit dem Autor in Verbindung zu treten. Der Autor ist die fachlich zuständige Behörde / öffentliche Stelle, die die Nachricht erstellt.
     * 
     * @return
     *     possible object is
     *     {@link BehoerdeType }
     *     
     */
    public BehoerdeType getAutor() {
        return autor;
    }

    /**
     * Legt den Wert der autor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BehoerdeType }
     *     
     */
    public void setAutor(BehoerdeType value) {
        this.autor = value;
    }

}

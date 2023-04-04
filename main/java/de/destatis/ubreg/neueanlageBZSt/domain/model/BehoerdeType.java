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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Dieser Typ enthält Angaben zur Identifikation einer Behörde / öffentlichen Stelle in einem Verzeichnisdienst sowie ihrer Erreichbarkeit.
 * 
 * <p>Java-Klasse für BehoerdeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>{@code
 * <complexType name="BehoerdeType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="verzeichnisdienst" type="{http://xoev.de/schemata/basisnachricht/behoerde/1_0}Code.VerzeichnisdienstType"/>
 *         <element name="kennung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
 *         <element name="name" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
 *         <element ref="{http://xoev.de/schemata/basisnachricht/kommunikation/1_0}erreichbarkeit" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BehoerdeType", namespace = "http://xoev.de/schemata/basisnachricht/behoerde/1_0", propOrder = {
    "verzeichnisdienst",
    "kennung",
    "name",
    "erreichbarkeit"
})
public class BehoerdeType {

    @XmlElement(required = true)
    protected CodeVerzeichnisdienstType verzeichnisdienst;
    @XmlElement(required = true)
    protected String kennung;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(namespace = "http://xoev.de/schemata/basisnachricht/kommunikation/1_0")
    protected List<KommunikationType> erreichbarkeit;

    /**
     * Ruft den Wert der verzeichnisdienst-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeVerzeichnisdienstType }
     *     
     */
    public CodeVerzeichnisdienstType getVerzeichnisdienst() {
        return verzeichnisdienst;
    }

    /**
     * Legt den Wert der verzeichnisdienst-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeVerzeichnisdienstType }
     *     
     */
    public void setVerzeichnisdienst(CodeVerzeichnisdienstType value) {
        this.verzeichnisdienst = value;
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
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Angaben zur Erreichbarkeit dieser Behörde per Telefon, Telefax, E-Mail etc.Gets the value of the erreichbarkeit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the erreichbarkeit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErreichbarkeit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KommunikationType }
     * 
     * 
     * @return
     *     The value of the erreichbarkeit property.
     */
    public List<KommunikationType> getErreichbarkeit() {
        if (erreichbarkeit == null) {
            erreichbarkeit = new ArrayList<>();
        }
        return this.erreichbarkeit;
    }

}

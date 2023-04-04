//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package de.destatis.ubreg.neueanlageBZSt.domain.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * In diesem Kontext dürfen aus der Codeliste nur die Codes der amtlichen Gemeinden verwendet werden, nicht die Codes für die Stadtbezirke bzw. Stadtteile.
 * 
 * <p>Java-Klasse für Code.Gemeindeschluessel complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>{@code
 * <complexType name="Code.Gemeindeschluessel">
 *   <complexContent>
 *     <restriction base="{http://xoev.de/schemata/code/1_0}Code">
 *       <sequence>
 *         <element name="code" type="{http://www.w3.org/2001/XMLSchema}token" form="unqualified"/>
 *       </sequence>
 *       <attribute name="listURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" fixed="urn:de:bund:destatis:bevoelkerungsstatistik:schluessel:ags" />
 *       <attribute name="listVersionID" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Code.Gemeindeschluessel", namespace = "urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1")
public class CodeGemeindeschluessel
    extends Code
{


}

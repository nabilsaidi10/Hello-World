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
 * <p>Java-Klasse für Code.Geschaeftfallkenner complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>{@code
 * <complexType name="Code.Geschaeftfallkenner">
 *   <complexContent>
 *     <restriction base="{http://xoev.de/schemata/code/1_0}Code">
 *       <sequence>
 *         <element name="code" form="unqualified">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               <enumeration value="001"/>
 *               <enumeration value="002"/>
 *               <enumeration value="003"/>
 *               <enumeration value="004"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *       </sequence>
 *       <attribute name="listURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" fixed="urn:BZStBasisregisterSST:codeliste:geschaeftsfallkenner" />
 *       <attribute name="listVersionID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" fixed="1" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Code.Geschaeftfallkenner")
public class CodeGeschaeftfallkenner
    extends Code
{


}

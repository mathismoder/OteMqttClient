//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.07.09 um 08:09:08 PM CEST 
//


package de.rc7000.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für listDpResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="listDpResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ref" type="{http://ws01.lom.ch/soap/}DpRef"/&gt;
 *         &lt;element name="dpLst" type="{http://ws01.lom.ch/soap/}DpLst" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listDpResponse", propOrder = {
    "ref",
    "dpLst"
})
public class ListDpResponse {

    @XmlElement(required = true)
    protected DpRef ref;
    protected List<DpLst> dpLst;

    /**
     * Ruft den Wert der ref-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DpRef }
     *     
     */
    public DpRef getRef() {
        return ref;
    }

    /**
     * Legt den Wert der ref-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DpRef }
     *     
     */
    public void setRef(DpRef value) {
        this.ref = value;
    }

    /**
     * Gets the value of the dpLst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dpLst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDpLst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DpLst }
     * 
     * 
     */
    public List<DpLst> getDpLst() {
        if (dpLst == null) {
            dpLst = new ArrayList<DpLst>();
        }
        return this.dpLst;
    }

}

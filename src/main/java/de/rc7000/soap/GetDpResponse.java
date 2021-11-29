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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getDpResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getDpResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ref" type="{http://ws01.lom.ch/soap/}DpRef"/&gt;
 *         &lt;element name="dpCfg" type="{http://ws01.lom.ch/soap/}DpCfg" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDpResponse", propOrder = {
    "ref",
    "dpCfg"
})
@XmlRootElement(name = "getDpResponse")
public class GetDpResponse {

    @XmlElement(required = true)
    protected DpRef ref;
    protected List<DpCfg> dpCfg;

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
     * Gets the value of the dpCfg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dpCfg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDpCfg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DpCfg }
     * 
     * 
     */
    public List<DpCfg> getDpCfg() {
        if (dpCfg == null) {
            dpCfg = new ArrayList<DpCfg>();
        }
        return this.dpCfg;
    }

}

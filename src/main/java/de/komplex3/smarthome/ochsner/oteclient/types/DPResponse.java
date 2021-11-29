package de.komplex3.smarthome.ochsner.oteclient.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Envelope", namespace="http://schemas.xmlsoap.org/soap/envelope/" )
@XmlAccessorType(XmlAccessType.NONE)

/**
 * <?xml version="1.0" encoding="utf-8"?>
<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:ns="http://ws01.lom.ch/soap/" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:SOAP-ENC="http://schemas.xmlsoap.org/soap/encoding/">
 <SOAP-ENV:Body>
  <ns:getDpResponse>
   <ref>
    <oid>/(1) EBusRoot/(2) 517202211/(5) FBH/(119) /(4) 00:02</oid>
    <prop>-r--</prop>
   </ref>
   <dpCfg>
    <index>4</index>
    <name>00:02</name>
    <prop>-r--</prop>
    <desc>Scalar Var</desc>
    <value>31.5</value>
    <unit>°C</unit>
    <type>13</type>
    <step>0.1</step>
    <minValue>0.0</minValue>
    <maxValue>100.0</maxValue>
   </dpCfg>
  </ns:getDpResponse>
 </SOAP-ENV:Body>
</SOAP-ENV:Envelope>
 * @author m.moder
 *
 */

// TODO: not used at the moment, using String for Entity
public class DPResponse {
	@XmlElement(name="value", namespace="\"http://ws01.lom.ch/soap/")
	private String value;

	public String getValue() {
		return value;
	}
}  
package de.komplex3.smarthome.ochsner.oteclient.service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import de.komplex3.smarthome.ochsner.oteclient.ote.OteProperties;
import de.rc7000.soap.DpRef;
import de.rc7000.soap.GetDpRequest;

@Service
public class OteService {

	@Autowired
	private OteProperties properties;
	
	@Autowired
	RestTemplate restTemplate;
	
	JAXBContext context;
	Marshaller marshaller;
	MessageFactory mf;
	SOAPMessage message;
	SOAPBody body;
	ByteArrayOutputStream out;
	String payload;

	Logger logger = LoggerFactory.getLogger(OteService.class);
	
	public OteService(){
		try {
			mf = MessageFactory.newInstance();
			message = mf.createMessage();
			message.setProperty(SOAPMessage.WRITE_XML_DECLARATION, Boolean.TRUE.toString());
			context = JAXBContext.newInstance(GetDpRequest.class);
			marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		} catch (SOAPException | JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
		
	@PostConstruct
	public void outputConfiguration(){
		logger.info("Reading values from OTE at {}",this.properties.getHost());
	}

	public String getDPRequest(String oid) {
		String uri = "http://" + properties.getHost() + "/ws";
		
		HttpHeaders headers = new HttpHeaders();
		
		// construct payload
		DpRef ref = new DpRef();
		ref.setOid(oid);
		
		GetDpRequest req = new GetDpRequest();
		req.setRef(ref);
		req.setCount(10);
		req.setStartIndex(0);
		
		out = new ByteArrayOutputStream();
		
		try {
			// 
			
			body = message.getSOAPBody();	

			marshaller.marshal(req, body);
			message.saveChanges();
			message.writeTo(out);

		} catch (JAXBException | SOAPException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// small hack to change namespace - OTE doesn't like anything besides xmlns:ns
		payload = new String(out.toByteArray()).replace("ns3", "ns");

		HttpEntity<String> reqEntity = new HttpEntity<String>(payload, headers);
		ResponseEntity<String> entity = restTemplate.exchange(uri, HttpMethod.POST, reqEntity, String.class);
	    
	    return entity.getBody();
	}
}

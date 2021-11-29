package de.komplex3.smarthome.ochsner.oteclient;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.ResourceAccessException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import de.komplex3.smarthome.ochsner.oteclient.service.OteService;

@RestController
public class Api {

	Logger logger = LoggerFactory.getLogger(Api.class);
	
	@Autowired
	OteService dp;
	
	@Bean
	public DocumentBuilder getDocumentBuilder() {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true);
		DocumentBuilder builder = null;
		try {
			builder = factory.newDocumentBuilder();
			
		} catch (ParserConfigurationException e) {
			logger.error("parser error {}", e);
		}
		return builder;
	}
	
	
	@RequestMapping("/query")
	public String query(@RequestParam("oid") String oid) {
		String result = "";
		
		try {
			result = dp.getDPRequest(oid);
		} catch (ResourceAccessException rae) {
			logger.error("error accessing SOAP service {}", rae.getMessage());
			System.exit(-1);
		} catch (HttpServerErrorException see){
			logger.error("error accessing SOAP service {}", see.getResponseBodyAsString());
		}
		
		try {
			Document document = getDocumentBuilder().parse(new ByteArrayInputStream(result.getBytes()));
			XPathFactory xPathfactory = XPathFactory.newInstance();
			
			XPath xpath = xPathfactory.newXPath();
			XPathExpression expr = xpath.compile("//value/text()");
			result = expr.evaluate(document, XPathConstants.STRING).toString();
			
		} catch (SAXException | IOException e1) {
			logger.error("error retrieving data {}", e1);
		} catch (XPathExpressionException e) {
			logger.error("parser error {}", e);
		}

		return result;
	}
}

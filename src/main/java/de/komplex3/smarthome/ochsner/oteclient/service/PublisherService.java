package de.komplex3.smarthome.ochsner.oteclient.service;

import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import de.komplex3.smarthome.ochsner.oteclient.Api;
import de.komplex3.smarthome.ochsner.oteclient.mqtt.MQTTProperties;
import de.komplex3.smarthome.ochsner.oteclient.ote.OteProperties;

@Service
public class PublisherService {
	private String oid;
	private List<String> oids;
	private Iterator<String> queryIterator;
	
	@Autowired
	Api api;
	
	@Autowired
	MqttClient mqttclient;
	
	@Autowired
	private MQTTProperties properties;
	
	Logger logger = LoggerFactory.getLogger(PublisherService.class);
	  
	PublisherService(OteProperties properties) {
		this.oids = properties.getOids();
		this.queryIterator = this.oids.iterator();
	}
	
	@PostConstruct
	public void outputConfiguration(){
		logger.info("Publishing to MQTT broker at {}",this.properties.getUri());
	}

	@Scheduled(fixedDelayString ="${ote.delay}")
    public void publishNextOid() {
		if (!mqttclient.isConnected()) return;
		
		if (!this.queryIterator.hasNext()) {
			this.queryIterator = this.oids.iterator();
		}
		this.oid = this.queryIterator.next();
		String result = api.query(oid);
		if (result == ""){
			System.exit(-1);
		}
		logger.info("Got response: {} = {} ", oid , result);
		try {
			MqttMessage msg = new MqttMessage();
			msg.setPayload(result.getBytes());
			mqttclient.publish(properties.getBasetopic()+oid, msg);
		} catch (MqttException e) {
			logger.error("Error While Sending Mqtt Messages to " + mqttclient.getServerURI(), e.getMessage());
			System.exit(-1);
		}
		

    }
 
}

package de.komplex3.smarthome.ochsner.oteclient.mqtt;

import java.util.UUID;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.IntegrationComponentScan;

@Configuration
@IntegrationComponentScan
public class MQTTConfig {

	@Autowired
	private MQTTProperties properties;

	@Bean
	public MqttClient mqttClient() throws MqttException {
		String clientID = UUID.randomUUID().toString();
		MemoryPersistence persistence = new MemoryPersistence();
		MqttClient mqttClient = new MqttClient(properties.getUri(), "ote-client_" + clientID, persistence);
		MqttConnectOptions connOpts = new MqttConnectOptions();
		connOpts.setCleanSession(true);
		connOpts.setAutomaticReconnect(true);
		if (!properties.getUser().isEmpty()) {
			connOpts.setUserName(properties.getUser());
		}
		if (!properties.getPassword().isEmpty()) {
			connOpts.setPassword(properties.getPassword().toCharArray());
		}
		mqttClient.connect(connOpts);
		return mqttClient;
	}
}
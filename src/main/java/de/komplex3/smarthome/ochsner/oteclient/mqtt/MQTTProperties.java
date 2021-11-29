package de.komplex3.smarthome.ochsner.oteclient.mqtt;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "mqtt")
public class MQTTProperties {
	private String uri;
	private String password;
	private String user;
	private String basetopic;
	
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getBasetopic() {
		return basetopic;
	}
	public void setBasetopic(String basetopic) {
		this.basetopic = basetopic;
	}
}

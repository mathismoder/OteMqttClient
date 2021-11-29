package de.komplex3.smarthome.ochsner.oteclient.ote;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "ote")
public class OteProperties {
  
	private List<String> oids = new ArrayList<String>();
    private String host;
    private String user;
    private String password;
    private int delay;
	private int port;
	
    public List<String> getOids() {
        return this.oids;
    }
	
	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getDelay() {
		return delay;
	}

	public void setDelay(int delay) {
		this.delay = delay;
	}

    public int getPort() {
        return this.port;
    }

	public void setPort(int port) {
		this.port = port;
	}


}
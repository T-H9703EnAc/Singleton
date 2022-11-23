package com.app.config;

import java.util.Objects;
import java.util.ResourceBundle;

public class Config {

	private static Config config = new Config();
	
	private String url;
	
	private String user;
	
	private String password;
	

	private Config() {
		ResourceBundle rb = ResourceBundle.getBundle("database");
		this.url = rb.getString("url");
		this.user = rb.getString("user");
		this.password = rb.getString("password");
	}
	
	public static synchronized Config getInstance() {
		return Objects.isNull(config) ? new Config() : config; 
	}
	
	public String getUrl() {
		return this.url;
	}
	
	public String getUser() {
		return this.user;
	}
	
	public String getPassword() {
		return this.password;
	}
}

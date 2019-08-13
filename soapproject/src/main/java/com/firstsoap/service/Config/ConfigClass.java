package com.firstsoap.service.Config;


import javax.xml.ws.Endpoint;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.firstsoap.service.HelloWS;

@Configuration
public class ConfigClass {

	@Autowired
	private Bus bus;
	
	@Bean
	public Endpoint endpoint() {
		Endpoint endpoint = new Endpoint(bus,new HelloWS());
		endpoint.publish("/hello");
		return endpoint;
	}
	
}

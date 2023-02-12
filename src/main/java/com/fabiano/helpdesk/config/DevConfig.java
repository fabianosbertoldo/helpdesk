package com.fabiano.helpdesk.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import com.fabiano.helpdesk.services.DBService;

@Configurable
@Profile("test")
public class DevConfig {
	
	@Autowired
	private DBService dbService;
	
	@Bean
	public void instanciaDB() {
		
		this.dbService.instanciaDB();
	}
	
}

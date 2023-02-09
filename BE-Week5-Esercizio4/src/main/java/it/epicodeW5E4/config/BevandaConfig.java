package it.epicodeW5E4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import it.epicodeW5E4.beans.Bevanda;

@Configuration
@PropertySource("classpath:application.properties")
public class BevandaConfig {

	@Bean
	public Bevanda b1() {
		Bevanda b = new Bevanda(2.50, "Acqua", 0);
		
		return b;
	}
	
}

package it.epicodeW5E4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import it.epicodeW5E4.beans.Franchising;

@Configuration
@PropertySource("classpath:application.properties")
public class FranchisingConfig {

	@Bean
	public Franchising f1() {
		Franchising f = new Franchising(20.00, "Maglietta");
		
		return f;
	}
	
}

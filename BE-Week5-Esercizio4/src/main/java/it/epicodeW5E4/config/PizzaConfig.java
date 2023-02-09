package it.epicodeW5E4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import it.epicodeW5E4.beans.Pizza;

@Configuration
@PropertySource("classpath:application.properties")
public class PizzaConfig {
	
	@Bean
	public Pizza p1() {
		Pizza p = new Pizza(8.00, "Margherita", "mozzarella, pomodoro", 1000);
		return p;
	}

}

package it.epicodeW5E4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.epicodeW5E4.beans.Bevanda;
import it.epicodeW5E4.beans.Franchising;
import it.epicodeW5E4.beans.Pizza;
import it.epicodeW5E4.config.BevandaConfig;
import it.epicodeW5E4.config.FranchisingConfig;
import it.epicodeW5E4.config.PizzaConfig;
import it.epicodeW5E4.dao.BevandaService;
import it.epicodeW5E4.dao.FranchisingService;
import it.epicodeW5E4.dao.PizzaService;

@SpringBootApplication
public class BeWeek5Esercizio4Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BeWeek5Esercizio4Application.class, args);
	}

	@Autowired
	PizzaService ps;
	
	@Autowired
	BevandaService bs;
	
	@Autowired
	FranchisingService fs;
	
	ApplicationContext ctxP = new AnnotationConfigApplicationContext(PizzaConfig.class);
	ApplicationContext ctxB = new AnnotationConfigApplicationContext(BevandaConfig.class);
	ApplicationContext ctxF = new AnnotationConfigApplicationContext(FranchisingConfig.class);
	
	@Override
	public void run(String... args) throws Exception {
		
		//insertPizza();
		insertBevanda();
		//insertFranchising();
	}
	
	public void insertPizza() {
		Pizza p = (Pizza) ctxP.getBean("p1");
		ps.insert(p);
		
		System.out.println("Pizza inserita correttamente");
	}
	
	public void insertBevanda() {
		Bevanda b = (Bevanda) ctxB.getBean("b1");
		bs.insert(b);
		
		System.out.println("Bevanda inserita correttamente");
	}
	
	public void insertFranchising() {
		Franchising f = (Franchising) ctxF.getBean("f1");
		fs.insert(f);
		
		System.out.println("Elemento inserito correttamente");
	}

}

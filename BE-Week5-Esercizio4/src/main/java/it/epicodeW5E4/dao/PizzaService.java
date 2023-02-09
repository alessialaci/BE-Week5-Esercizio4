package it.epicodeW5E4.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.epicodeW5E4.beans.Pizza;

@Service
public class PizzaService {

	@Autowired
	private PizzaRepository pizzaRepo;
	
	public void insert(Pizza p) {
		pizzaRepo.save(p);
	}
	
}

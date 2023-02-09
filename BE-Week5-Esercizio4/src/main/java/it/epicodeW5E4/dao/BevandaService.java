package it.epicodeW5E4.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.epicodeW5E4.beans.Bevanda;

@Service
public class BevandaService {

	@Autowired
	private BevandaRepository bevandaRepo;
	
	public void insert(Bevanda b) {
		bevandaRepo.save(b);
	}
	
}

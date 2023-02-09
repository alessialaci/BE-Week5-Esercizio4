package it.epicodeW5E4.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.epicodeW5E4.beans.Franchising;

@Service
public class FranchisingService {

	@Autowired
	private FranchisingRepository franchisingRepo;
	
	public void insert(Franchising f) {
		franchisingRepo.save(f);
	}

}

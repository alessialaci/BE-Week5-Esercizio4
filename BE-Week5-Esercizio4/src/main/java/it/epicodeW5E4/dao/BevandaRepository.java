package it.epicodeW5E4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import it.epicodeW5E4.beans.Bevanda;

public interface BevandaRepository extends JpaRepository<Bevanda, Integer> {

}

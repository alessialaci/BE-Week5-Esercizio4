package it.epicodeW5E4.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.epicodeW5E4.beans.Pizza;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Integer> {

}

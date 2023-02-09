package it.epicodeW5E4.beans;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "bevande")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Scope("prototype")
public class Bevanda extends Prodotto {

	private int calorie;

	public Bevanda(double prezzo, String nome, int calorie) {
		super(prezzo, nome);
		this.calorie = calorie;
	}
	
}

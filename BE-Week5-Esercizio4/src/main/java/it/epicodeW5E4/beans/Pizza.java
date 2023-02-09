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
@Table(name = "pizze")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Scope("prototype")
public class Pizza extends Prodotto {
	
	private String ingredienti;
	private int calorie;
	
	public Pizza(double prezzo, String nome, String ingredienti, int calorie) {
		super(prezzo, nome);
		this.ingredienti = ingredienti;
		this.calorie = calorie;
	}
	
}

package it.epicodeW5E4.beans;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "franchising")
@NoArgsConstructor
@Getter
@Setter
@ToString
@Scope("prototype")
public class Franchising extends Prodotto {
	
	public Franchising(double prezzo, String nome) {
		super(prezzo, nome);
	}

}

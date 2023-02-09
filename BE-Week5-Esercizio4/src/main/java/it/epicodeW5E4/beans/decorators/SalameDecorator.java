package it.epicodeW5E4.beans.decorators;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.epicodeW5E4.beans.Pizza;
import it.epicodeW5E4.beans.Topping;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Component
@Scope("prototype")
public class SalameDecorator extends Topping {

	public SalameDecorator(Pizza pizza) {
		this.pizza = pizza;
		this.nomeTopping = "salame";
		this.calorie = 110;
		this.prezzo = 0.15;
	}
	
	public SalameDecorator() {
		this.nomeTopping = "salame";
		this.calorie = 110;
		this.prezzo = 0.15;
	}
	
	@Override
	public String getNome() {
		return pizza.getNome() + "salame ";
	}
	
	@Override
	public double getPrezzo() {
		return pizza.getPrezzo() + prezzo;
	}

	@Override
	public int getCalorie() {
		return pizza.getCalorie() + calorie;
	}

	@Override
	public String toString() {
		return "SalameDecorator [nomeTopping=" + nomeTopping + ", prezzo=" + prezzo + ", calorie=" + calorie + "]";
	}
	
}

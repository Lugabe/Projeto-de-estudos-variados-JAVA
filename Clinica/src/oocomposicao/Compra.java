package oocomposicao;

import java.util.ArrayList;

public class Compra {

	String client;

	ArrayList<Item> itens = new ArrayList<Item>();

	
	
	void addItem(String name, int amount, double price) {
		this.addItem(new Item(amount));
	}
	
	
	void addItem (Item item) {
		this.itens.add(item);
		item.compra= this;
		
		
		
	}
	
	
	double getValueTotal() {
		double total = 0;

		for (Item item : itens) {
			
			total += item.amount * item.price;
		}

		return total;

	}

}

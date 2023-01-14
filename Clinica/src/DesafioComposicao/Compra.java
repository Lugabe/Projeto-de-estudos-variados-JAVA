package DesafioComposicao;

import java.util.ArrayList;

public class Compra {

	final ArrayList<Item> itens = new ArrayList<Item>();

	void AddItem(Produtos p, int amount) {
		this.itens.add(new Item(p, amount));
	}
	
	void AddItem(String name, double price, int amount) {
		var produto= new Produtos(name,price);
		this.itens.add(new Item(produto,amount));
		
	}

	double GetValueTotal() {
		double Total = 0;

		for (Item item : itens) {

			Total += item.amount * item.Product.price;
		}
		return Total;
	}
}

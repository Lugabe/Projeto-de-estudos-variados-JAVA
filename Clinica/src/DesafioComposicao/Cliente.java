package DesafioComposicao;

import java.util.ArrayList;

public class Cliente {

	final String name;
	final ArrayList<Compra> Buy = new ArrayList<Compra>();

	Cliente(String name) {
		this.name = name;
	}

	void addCompra(Compra compra) {
		this.Buy.add(compra);

	}

	double GetValueTotal() {
		double Total = 0;

		for (Compra compra : Buy) {
			Total += compra.GetValueTotal();
		}

		return Total;
	}
}

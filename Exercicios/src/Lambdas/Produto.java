package Lambdas;

public class Produto {

	final String name;
	final double price;
	final double discount;

	public Produto(String name, double price, double discount) {

		this.name = name;
		this.price = price;
		this.discount = discount;

	}

	public String toString() {
		double precoFinal = price * (1 - discount);
		return name + "tem preço de R$ " + precoFinal;
	}

}

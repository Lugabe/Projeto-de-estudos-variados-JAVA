package Lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		Produto p = new Produto("ipad", 3235.89, 0.13);

		Function<Produto, Double> precoFinal = produto -> produto.price * (1 - produto.discount);
		
		UnaryOperator<Double> ImpostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;
		
		UnaryOperator<Double> Frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
	
		UnaryOperator<Double> Arredondar = preco -> Double.parseDouble(String.format("%.2f", preco));
	
		Function<Double, String> Formatar = preco -> (" R% " + preco).replace(".", ",");


		String preco = precoFinal
				.andThen(ImpostoMunicipal)
				.andThen(Frete)
				.andThen(Arredondar)
				.andThen(Formatar)
				.apply(p);

		System.out.println("O preço final é: " + preco);

	}
}

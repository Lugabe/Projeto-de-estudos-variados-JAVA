package Lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnitario {

	public static void main(String[] args) {

		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> Quadrado = n -> n * n;

		int resultado1 = (maisDois.andThen(vezesDois).andThen(Quadrado).apply(2));
		System.out.println(resultado1);

		int resultado2 = Quadrado.compose(vezesDois).compose(maisDois).apply(2);
		
		System.out.println(resultado2);

	}

}

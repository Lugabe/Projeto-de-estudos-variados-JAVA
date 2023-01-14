package Lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {

		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;

		System.out.println(media.apply(9.8, 5.7));

		BiFunction<Double, Double, String> Resultado = (n1, n2) -> ((n1 + n2) / 2) >= 7 ? "Aprovado" : "Reprovado";

		System.out.println(Resultado.apply(9.7, 5.1));

		Function<Double, String> Conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";
		
		System.out.println(media.andThen(Conceito).apply(7.5, 7.5));
		
	}
	
}

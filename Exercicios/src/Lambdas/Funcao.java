package Lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {

		Function<Integer, String> ParOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";

		System.out.println(ParOuImpar.apply(6));

		Function<String, String> ResultadoE = valor -> "O resultado é " + valor;

		Function<String, String> Empolgado = valor -> valor + " !!! ";

		String resultadoFinal = ParOuImpar.andThen(ResultadoE).andThen(Empolgado).apply(6);

		System.out.println(resultadoFinal);
		
		
	}
}

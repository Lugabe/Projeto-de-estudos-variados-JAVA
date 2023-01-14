package Lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {

		List<String> Aprovados = Arrays.asList("Ana", "Leo", "Gui");

		System.out.println("Forma Tradicional....");
		for (String nome : Aprovados) {
			System.out.println(nome);

		}

		System.out.println("\nLambda #01");
		Aprovados.forEach(nome -> System.out.println(nome + "!!!"));

		System.out.println("\nMethod Reference...");
		Aprovados.forEach(System.out::println); // :: serve para referenciar

		System.out.println("\nLambda #02");
		Aprovados.forEach(nome -> meuImprimir(nome + "!!!"));

		System.out.println("\nMethod Reference #02...");
		Aprovados.forEach(Foreach::meuImprimir);
	}

	static void meuImprimir(String name) {
		System.out.println("Oi Meu nome é " + name);
	}
}

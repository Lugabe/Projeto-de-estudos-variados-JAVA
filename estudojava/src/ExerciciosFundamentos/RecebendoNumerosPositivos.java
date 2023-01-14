package ExerciciosFundamentos;

import java.util.Scanner;

public class RecebendoNumerosPositivos {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numerospositivos = 0;
		int numero = 0;

		while (numero >= 0) {

			System.out.println("Digite um Numero positivo ou numero negativo para parar");
			numero = entrada.nextInt();

			if (numero >=0) {

				numerospositivos += numero;
				System.out.println("soma dos numeros inseridos: " + numerospositivos);

			}
		}
		entrada.close();
	}
}

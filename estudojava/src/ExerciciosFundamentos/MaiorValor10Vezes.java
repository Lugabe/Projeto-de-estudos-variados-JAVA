package ExerciciosFundamentos;

import java.util.Scanner;

public class MaiorValor10Vezes {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int maiorvalor = 0;
		int contador = 0;

		do {

			System.out.println("Digite um valor");
			int valor = entrada.nextInt();

			if (valor > maiorvalor) {

				maiorvalor = valor;
			}

			contador++;
		} while (contador != 10);
		System.out.println("O maior valor foi: " + maiorvalor);

		entrada.close();
	}
}
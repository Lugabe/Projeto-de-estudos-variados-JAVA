package ExerciciosFundamentos;

import java.util.Scanner;

public class ImprimirLetra {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite uma palavra");
		String nome = entrada.nextLine();

		char letras[] = nome.toCharArray();

		for (int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);

		}

		entrada.close();
	}
}

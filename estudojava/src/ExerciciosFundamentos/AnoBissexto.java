package ExerciciosFundamentos;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Infome o Ano atual");
		int ano = entrada.nextInt();

		if (ano % 4 == 0 || ano % 100 == 0 || ano % 400 == 0) {
			System.out.println("ano é bisesto");
		} else
			System.out.println("ano não é bisesto");

		entrada.close();
	}
}

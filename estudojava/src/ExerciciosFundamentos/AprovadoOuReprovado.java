package ExerciciosFundamentos;

import java.util.Scanner;

public class AprovadoOuReprovado {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a primeira nota");
		double nota = entrada.nextDouble();

		System.out.println("Digite a segunda nota");
		double nota2 = entrada.nextDouble();

		double media = (nota + nota2) / 2;

		if (media >= 7.0) {
			System.out.println("Aprovado: " + media);
		} else if (media < 7.0 && media > 4.0) {
			System.out.println("Recuperação: " + media);
		} else
			System.out.println("Reprovado: " + media);

		entrada.close();
	}
}

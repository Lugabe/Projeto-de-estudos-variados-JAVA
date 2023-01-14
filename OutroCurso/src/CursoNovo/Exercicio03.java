package CursoNovo;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		int A, B, C, D, resultado;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite A");
		A = entrada.nextInt();
		System.out.println("Digite B");
		B = entrada.nextInt();
		System.out.println("Digite C");
		C = entrada.nextInt();
		System.out.println("Digite D");
		D = entrada.nextInt();

		resultado = (A * B) - (C * D);
		System.out.println(resultado);

		entrada.close();
	}
}

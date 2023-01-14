package CursoNovo;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double A, B, C, acalc, bcalc, ccalc, dcalc, ecalc;

		System.out.println("Digite A");
		A = entrada.nextDouble();
		System.out.println("Digite B");
		B = entrada.nextDouble();
		System.out.println("Digite C");
		C = entrada.nextDouble();

		acalc = (A * C) / 2;
		System.out.printf("\nA area do tringulo é %.2f: ", acalc);

		bcalc = 3.14159 * Math.pow(C, 2);
		System.out.printf("\nA area do circulo do raio é %.2f: ", bcalc);

		ccalc = C * (A + B) / 2;
		System.out.printf("\nA área do trapézio %.2f", ccalc);

		dcalc = Math.pow(B, 2);
		System.out.printf("\nArea do quadrado %.2f", dcalc);

		ecalc = (A * B);
		System.out.printf("\nArea do retangulo %.2f", ecalc);
		entrada.close();
	}
}

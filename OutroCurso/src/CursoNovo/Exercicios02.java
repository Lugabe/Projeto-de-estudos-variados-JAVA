package CursoNovo;

import java.util.Scanner;

public class Exercicios02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double r, pi = 3.14159, resultado;

		System.out.println("Digite o valor do raio");
		r = entrada.nextDouble();

		resultado = Math.pow(r, 2) * pi;

		System.out.printf("A area do circulo é %.4f: ",resultado);
		
		entrada.close();

	}
}

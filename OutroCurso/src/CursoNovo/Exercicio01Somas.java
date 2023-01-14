package CursoNovo;

import java.util.Scanner;

public class Exercicio01Somas {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int a, b, soma;
		System.out.println("Digite o primeiro numero para somar");
		a = entrada.nextInt();
		System.out.println("Digite o segundo numero para somar");
		b = entrada.nextInt();

		soma = a + b;

		System.out.println("o valor da soma é: " + soma);

		entrada.close();
	}
}

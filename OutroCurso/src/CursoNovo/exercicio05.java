package CursoNovo;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		@SuppressWarnings("unused")
		int peca1, quantidade1, peca2, quantidade2;
		double valor1, valor2, somatoria;

		System.out.println("Digite o codigo da pe�a:");
		peca1 = entrada.nextInt();
		System.out.println("Quantas pe�as?");
		quantidade1 = entrada.nextInt();
		System.out.println("Valor por pe�a");
		valor1 = entrada.nextDouble();
		System.out.println("Digite o codigo da pe�a");
		peca2 = entrada.nextInt();
		System.out.println("Quantas pe�as?");
		quantidade2 = entrada.nextInt();
		System.out.println("Valor por unidade?");
		valor2 = entrada.nextDouble();

		somatoria = (quantidade1 * valor1) + (quantidade2 * valor2);

		System.out.printf("Valor a pagar � de %.2f", somatoria);
		
		entrada.close();
	}
}

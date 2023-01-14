package Arays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantas notas? ");

		int Quantidade = entrada.nextInt();

		double[] Notas = new double[Quantidade];

		for (int i = 0; i < Notas.length; i++) {

			System.out.print("Digite a Nota " + (i + 1) + ":");
			Notas[i] = entrada.nextDouble();

		}

		double totalnotas = 0;

		for (double media : Notas) {

			totalnotas += media;

		}

		
		double valorFinal = totalnotas / Notas.length;
		System.out.println("A sua media é: "+ valorFinal+ "!");

		entrada.close();
	}
}

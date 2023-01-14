package Arays;

import java.util.Scanner;

public class ExerciciosEntradaArray {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantas Notas?");
		int Quantidade = entrada.nextInt();

		double Indice[] = new double[Quantidade];

		for (int i = 0; i < Indice.length; i++) {
			System.out.println("Digite a Nota " + (i + 1) + ":");
			Indice[i] = entrada.nextDouble();
		}

		double media = 0;

		for (double total : Indice) {
			media += total;
			
			
		}
	
		
		System.out.println("Sua media é: " + media / Indice.length);
		
		entrada.close();
	}
}

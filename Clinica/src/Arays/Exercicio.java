package Arays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {

		double[] notasAlunoA = new double[4]; // modelo mais utilizado do que o explicito

		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;

		System.out.println(Arrays.toString(notasAlunoA));

		double totalAluno = 0;

		for (int i = 0; i < notasAlunoA.length; i++) {

			totalAluno += notasAlunoA[i];

		}

		totalAluno = totalAluno / notasAlunoA.length;

		System.out.println(totalAluno);
		
		// outra forma de fazer array colocando os paramentros no array

		final double amarzenar = 10; // pode guardar variavel dentro de array tbm

		double[] notasAlunoB = { amarzenar, 8.5, 3.5, 4, 1, 2, 5, 6, 7, 8 };// modelo menos usado

		double totalAlunoB = 0;

		for (int i = 0; i < notasAlunoB.length; i++) {

			totalAlunoB += notasAlunoB[i];

		}

		System.out.println(totalAlunoB);

		System.out.println(totalAlunoB / notasAlunoB.length);

	}
}

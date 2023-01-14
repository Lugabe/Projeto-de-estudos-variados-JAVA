package Arays;

import java.util.Arrays;

public class ExerciciosForeach {
	public static void main(String[] args) {

		double[] notasAlunoA = new double[4]; // modelo mais utilizado do que o explicito

		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;

		System.out.println(Arrays.toString(notasAlunoA));

		double totalAluno = 0;

		for (double array : notasAlunoA) { // usando foreach ao inves de for

			totalAluno += array;

		}

		totalAluno = totalAluno / notasAlunoA.length;

		System.out.println(totalAluno);

		// outra forma de fazer array colocando os paramentros no array

		final double armazenar = 10; // pode guardar variavel dentro de array tbm

		double[] notasAlunoB = { armazenar, 8.5, 3.5, 4, 1, 2, 5, 6, 7, 8 };// modelo menos usado

		double totalAlunoB = 0;

		for (double somatorio : notasAlunoB) { // usando foreach ao invés de for

			totalAlunoB += somatorio;

		}


		System.out.println(totalAlunoB / notasAlunoB.length);

	}
}

package Arays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantas alunos serão?: ");

		int quantidadeAlunos = entrada.nextInt();

		System.out.println("Quantas notas serão?: ");

		int quantidadeNotas = entrada.nextInt();

		double[][] notasDaTurma = new double[quantidadeAlunos][quantidadeNotas];

		double notatotal = 0;
		for (int a = 0; a < notasDaTurma.length; a++) {
			for (int n = 0; n < notasDaTurma[a].length; n++) {

				System.out.printf("Informe a nota: %d do aluno %d: ", n + 1, a + 1);
				notasDaTurma[a][n] = entrada.nextDouble();
				notatotal += notasDaTurma[a][n];
				
			}
		}
		double media = notatotal / (quantidadeAlunos * quantidadeNotas);
		System.out.printf("\nna sua media é %s:\n", media);

		for(double[] notasDoAluno: notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
		}
		
		
		entrada.close();
	}
}

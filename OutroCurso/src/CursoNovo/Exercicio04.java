package CursoNovo;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int nfuncionario;
		double horastrab, valor, calc;

		System.out.println("Digite o numero do funcionario: ");
		nfuncionario = entrada.nextInt();
		System.out.println("Digite horas trabalhadas: ");
		horastrab = entrada.nextDouble();
		System.out.println("Valor por Hora");
		valor = entrada.nextDouble();

		calc = valor * horastrab;

		System.out.printf("O numero do funcionario é %d e o seu salario é %.2f ", nfuncionario, calc);

		entrada.close();
	}
}

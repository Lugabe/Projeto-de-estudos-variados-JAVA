package Excecao;

import Streams.Aluno;

public class Basico {

	public static void main(String[] args) {

		Aluno a1 = null;

		try {
			imprimirNomeDoAluno(a1);
		} catch (Exception excecao) {
			System.out.println("Ocorreu um erro no momento de imprimir o nome do usuario");
		}

		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) { // alt+shift+z para aparecer o tratamento de erro
			// TODO Auto-generated catch block
			System.out.println("Ocorreu um erro" + e.getMessage());
			;
		}

		System.out.println("Fim");

	}

	public static void imprimirNomeDoAluno(Aluno aluno) {
		System.out.println(aluno.name);
	}
}

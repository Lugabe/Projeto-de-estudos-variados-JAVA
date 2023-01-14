package Estudos;

import java.util.Scanner;

public class ObjetosComArray {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Classes rh = new Classes("Luis Gabriel", "luis2014gbp@gmail.com", 27, 25);
		System.out.println(rh.Cadastro());
		
		System.out.println("Digite sua idade");
		int idade = entrada.nextInt();
		System.out.println("Digite o seu ID");
		int funcionarios = entrada.nextInt();
		int arrayInt[] = { idade, funcionarios };

		for (int meuFor : arrayInt) {

			System.out.println(meuFor);
		}

		System.out.println("Digite o seu nome");
		String nome = entrada.nextLine();
		System.out.println("Digite o seu email");
		String email = entrada.nextLine();

		String Array[] = { nome, email };

		for (String for2 : Array) {

			System.out.println(for2);
		}

		entrada.close();
	}

}

package Controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
//		if (...) determinar se vai executar ou nao{}
//		while(...) sentença; ou {}
//		for (...;...;...;) sentença; ou {}
		
//		do sentença{} while (...);
		
		Scanner entrada = new Scanner(System.in);
        String texto = "";
		
		do { // do while faz o bloco ser executado pelomenos uma vez
			
System.out.println("Fale as palavras magicas...");
System.out.println("Quer sair?");
texto = entrada.nextLine();

		}while(!texto.equalsIgnoreCase("por favor"));
		System.out.println("Obrigado por ser educado.");
	
				


		entrada.close();
	}
}

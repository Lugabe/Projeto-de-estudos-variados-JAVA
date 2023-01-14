package Controle;

import java.util.Scanner;

public class WhileInderteminado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.println("Você diz: ");
		
			valor= entrada.next();
		}	
		
		
		
		
		
		entrada.close();

	}
}

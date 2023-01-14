package Controle;

import java.util.Scanner;

public class DesafioDaSemana {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Digite o dia da semana");
		
		String dia = entrada.next();

		if(dia.equalsIgnoreCase("domingo")) {
			System.out.println("7");
		}else if(dia.equalsIgnoreCase("Segunda")) {
			System.out.println("1");
		}
		else if("terca".equalsIgnoreCase(dia) ||(dia.equalsIgnoreCase("terça")))  {
			System.out.println("2");
		}
		else if(dia.equalsIgnoreCase("quarta")) {
			System.out.println("3");
		}
		else if(dia.equalsIgnoreCase("quinta")) {
			System.out.println("4");
		}
		else if(dia.equalsIgnoreCase("sexta"))  {
			System.out.println("5");
		}
		else if(dia.equalsIgnoreCase("sabado") 
			 ||(dia.equalsIgnoreCase("sábado"))) {
			System.out.println("6");
		}else {
			System.out.println("Dia invalido!");
		}
		
		entrada.close();
		
	}
}

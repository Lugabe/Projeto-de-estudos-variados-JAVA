package fundamentos.operadores;

import java.util.Scanner;

public class LerAoQuadradoEaoCubo {
	public static void main(String[] args) {
		
//	Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
		
		Scanner valor= new Scanner(System.in);
		
		System.out.println("Digite um valor para multiplicar: ");
		Double digitado1=  valor.nextDouble();
		
		double digitado2= Math.pow(digitado1, 2);
		System.out.println("O valor ao quadrado é: "+digitado2);
		
		double digitado3= Math.pow(digitado1, 3);
		System.out.println("O valor ao cubo é :"+digitado3);
		
		
		valor.close();
		
//		ok
		
		
		
	}

}

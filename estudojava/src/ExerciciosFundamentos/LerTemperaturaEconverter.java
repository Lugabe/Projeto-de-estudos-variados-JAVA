package ExerciciosFundamentos;

import java.util.Scanner;

public class LerTemperaturaEconverter {

	public static void main(String[] args) {
		
//		(F-32) * (5.0/9.0) = C° formula para converter fahrenheit em celsius
		
		Scanner temperatura= new Scanner(System.in);
		
		System.out.println("Digite o valor do Fahrenheit");
		Double ler = temperatura.nextDouble();
		
		final int constante = 32;
		final double formula = (5.0/9.0);
		
		double celsius = (ler-constante) * formula;
		
		System.out.printf("A temperatura em C é %.4s: ",celsius);
		
		temperatura.close();
		
		
		
		//ok
	}
}

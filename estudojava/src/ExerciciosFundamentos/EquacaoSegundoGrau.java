package ExerciciosFundamentos;

import java.util.Scanner;

public class EquacaoSegundoGrau {

	public static void main(String[] args) {
		
		Scanner equacao= new Scanner(System.in);
		
//	Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) 
//utilizando a fórmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta
		
		System.out.println("Digite o valor de A:");
		double a= equacao.nextDouble();
		System.out.println("Digite o valor de B:");
		double b= equacao.nextDouble();		
		System.out.println("Digite o valor de C:");
		double c= equacao.nextDouble();
		
		System.out.printf("O resultado da equação é: %.2f + %.2f+ %.2f =0", a,b,c);		
		double delta = Math.pow(b , 2) - (4 * a * c);
		
	System.out.println("\nValor do delta é: " +delta);
		
	double x1= (-b + (Math.sqrt(delta))) / (2*a);
	System.out.printf("O x1 da equação é: %.2f",x1);
	
	double x2= (-b - (Math.sqrt(delta))) / (2*a);
	System.out.printf("\nO x2 da equação é: %.2f",x2);
	
	
	
		equacao.close();
	}
}

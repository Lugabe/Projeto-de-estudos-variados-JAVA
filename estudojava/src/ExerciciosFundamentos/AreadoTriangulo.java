package ExerciciosFundamentos;

import java.util.Scanner;

public class AreadoTriangulo {

	public static void main(String[] args) {
		
		Scanner triangulo= new Scanner(System.in);
//	Criar um programa que leia o valor da base e da altura de um tri�ngulo e calcule a �rea.
		
		System.out.println("Digite o valor da base do triangulo");
		double base = triangulo.nextDouble();
		
		System.out.println("Digite o valo da altura do triangulo");
		double altura = triangulo.nextDouble();
		
		double calculo = base * altura;
		double area = calculo / 2;
		
		System.out.println("A area do triangulo � " + area);
		
//		ok
	triangulo.close();
	}
}

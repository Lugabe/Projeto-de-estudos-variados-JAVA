package ExerciciosFundamentos;

import java.util.Scanner;

public class LerPesoEAltura {

	public static void main(String[] args) {
		
		//Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
		Scanner pesando= new Scanner(System.in);
		
		System.out.println("Digite o seu peso: ");
		double peso = pesando.nextDouble();
		
		System.out.println("Digite a sua altura: ");
		double altura= pesando.nextDouble();
		
		double alturax2= altura*altura;
		
		double resultado = peso/alturax2;
				
				
		System.out.printf("Seu IMC É: %.4s ",resultado);
		
		pesando.close();
		
//		ok
	}
}

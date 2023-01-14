package ExerciciosFundamentos;

import java.util.Scanner;

public class CelsiusParaFahenheit {

	public static void main(String[] args) {

//		(C°*9/5) +32 = F°
						
				Scanner temperatura= new Scanner(System.in);
				
				System.out.println("Digite o valor do Celsius");
				Double ler = temperatura.nextDouble();
				
				final int constante = 32;
				final double formula = (9.0/5.0);
				
				double celsius = (ler*formula) +constante;
				
				System.out.printf("A temperatura em Fahrenheit é %.4s: ",celsius);
				
				temperatura.close();
				
				//ok
	}
}

package ExerciciosFundamentos;

import java.util.Scanner;

public class Verificarentre0e10Par {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um numero");
		int numero = entrada.nextInt();

		if (numero > 0 && numero < 10) {
			System.out.println("est� entre 0 e 10");
			if (numero % 2 == 0) {
				System.out.println("E � par");
			}else
				System.out.println("E � impar");
			
		} else
			System.out.println("n�o est� entre 0 e 10");

		entrada.close();
	}
}

package Estudos;

import java.util.Scanner;

public class CanetaTest {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o modelo da caneta: ");
		String modelo = entrada.nextLine();

		System.out.println("Digite a cor da caneta: ");
		String cor = entrada.nextLine();

		System.out.println("Digite a ponta da caneta: ");
		float ponta = entrada.nextFloat();

		System.out.println("Digite a carga da caneta: ");
		int carga = entrada.nextInt();

		System.out.println("A ceneta está tampada?");
		boolean tampada = entrada.nextBoolean();
		

		Caneta c1 = new Caneta(modelo, cor, ponta, carga,tampada);

		System.out.println(c1.modelo);
		
		c1.Rabiscar();

		
		entrada.close();
	}
}

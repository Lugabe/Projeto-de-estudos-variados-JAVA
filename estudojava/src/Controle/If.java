package Controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a média: ");
		double media = entrada.nextDouble();
		
		if (media <= 10 && media >=7.0) { // SERVE PARA CONDICIONAR "SE FOR VERDADE"
			//FAÇA TAL FUNÇÃO
		System.out.println("Aprovado, Parabéns!! ");
	
		}
		
		if (media <7 && media >= 4.5) {
		System.out.println("Recuperação");
		}
		
		if (media <4.5 && media >=0){
		System.out.println("Reprovado");
		
		boolean criterioReprovacaoAtingindo = media < 4.5 && media >= 0;
	
		if (criterioReprovacaoAtingindo) {
			System.out.println("Reprovado");
		}
		}
		
		entrada.close();
	}
}

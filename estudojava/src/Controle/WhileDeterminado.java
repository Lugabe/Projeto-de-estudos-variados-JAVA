package Controle;

import java.util.Scanner;

public class WhileDeterminado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int contador = 1;
				
		
				while(contador <= 25) {
				System.out.printf("\ncontador = %d ",contador);
				contador++; // vai somando +1 at� chegar no numero, 
//				pode ser += 2 pra ir de 2 em 2 tamb�m ou qualquer numero
				}
		entrada.close();
	}
}

package fundamentos.operadores;

import java.util.Scanner;

public class TiposStringEquals {

	public static void main(String[] args) {
		System.out.println("2" == "2");
		
		String s = new String("2");
		System.out.println("2" == s);
		System.out.println("2".equals(s));// .equals vai comparar o conteudo dentro do s
		
		Scanner entrada = new Scanner(System.in);
		
		String s2= entrada.nextLine();// next ignora os espaços digitados, Nextline não ignora.
		System.out.println("2" == s2.trim());// tira o espaço digitado pelo usuario
		System.out.println("2".equals (s2.trim()));//sempre usar o .equals para comparar Strings
		
		
		entrada.close();
	}
}

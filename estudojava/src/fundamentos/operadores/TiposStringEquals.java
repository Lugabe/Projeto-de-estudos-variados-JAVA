package fundamentos.operadores;

import java.util.Scanner;

public class TiposStringEquals {

	public static void main(String[] args) {
		System.out.println("2" == "2");
		
		String s = new String("2");
		System.out.println("2" == s);
		System.out.println("2".equals(s));// .equals vai comparar o conteudo dentro do s
		
		Scanner entrada = new Scanner(System.in);
		
		String s2= entrada.nextLine();// next ignora os espa�os digitados, Nextline n�o ignora.
		System.out.println("2" == s2.trim());// tira o espa�o digitado pelo usuario
		System.out.println("2".equals (s2.trim()));//sempre usar o .equals para comparar Strings
		
		
		entrada.close();
	}
}

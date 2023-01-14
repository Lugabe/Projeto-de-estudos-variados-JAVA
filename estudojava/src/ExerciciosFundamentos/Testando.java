package ExerciciosFundamentos;

import java.util.Scanner;

public class Testando {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um dia da semana: ");
		String dia = entrada.next();
		
		
		if(("segunda".equalsIgnoreCase(dia))){
		System.out.println("01");
		}else if (("terça".equalsIgnoreCase(dia)) || ("terca".equalsIgnoreCase(dia))){
		System.out.println("02");
		}else if ("quarta".equalsIgnoreCase(dia)) {
			System.out.println("03");
		}else if ("quinta".equalsIgnoreCase(dia)) {
			System.out.println("04");
		}else if ("sexta".equalsIgnoreCase(dia)) {
			System.out.println("05");
		}else if (("sabado".equalsIgnoreCase(dia)) || ("sábado".equalsIgnoreCase(dia))) {
			System.out.println("06");
		}else if ("domingo".equalsIgnoreCase(dia)) {
			System.out.println("07");
		}else {
			System.out.println("Dia está invalido, favor verifique a escrita.");
		}
	
		entrada.close();
	}
}

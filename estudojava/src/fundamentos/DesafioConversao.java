package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
public static void main(String[] args) {
	

	
	Scanner salario= new Scanner(System.in);
	
	System.out.print("Digite o primeiro salario ");
	String conversao1 =salario.nextLine().replace(",", ".");
	
	System.out.print("Digite o segundo salario ");
	String conversao2 =salario.nextLine().replace(",", ".");
	// o replace vai servir para poder digitar tanto , quanto o . 
	
	System.out.print("Digite o terceiro salario ");
	String conversao3 =salario.nextLine().replace(",", ".");
	
	double numero1= Double.parseDouble(conversao1);
	double numero2= Double.parseDouble(conversao2);
	double numero3= Double.parseDouble(conversao3);
	
	
	Double media= (numero1+numero2+numero3)/3;
	
System.out.println("\nA media do salario é " + media);

	salario.close();
	
}
}

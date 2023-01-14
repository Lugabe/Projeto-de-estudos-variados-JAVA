package fundamentos;

import java.util.Scanner;

public class Console {
	
public static void main(String[] args) {
	System.out.print("BOM ");
	System.out.print("DIA!! \n");
	
	System.out.printf("Mega Sena: %d %d %d %d %d %d \n",1,2,3,4,5,6);
	//print formatado ja coloca os valores e dados
	
	System.out.printf("Salario deste mês: %.1f Reais. Que se chama %s  \n" ,2500.50,"Luis Gabriel");
	
	
Scanner entrada = new Scanner(System.in);// scaneia as entradas do usuario
System.out.print("Digite o seu nome: ");
String nome = entrada.nextLine();// vai escanear oque o usuario digitar proxima linha
	
System.out.print("Digite o seu sobrenome: ");
String sobrenome = entrada.nextLine(); // vai ler a proxima linha que o usuario digitar
	
System.out.print("Digite a sua idade: ");
Integer idade = entrada.nextInt(); // vai ler o proximo numero inteiro digitado
	
System.out.printf("\nNome: %s. \nSobrenome: %s. \nIdade: %d Anos."
		, nome ,sobrenome,idade);
	
entrada.close();// sempre precisa fechar o scanner no final do codigo.
	
}
}

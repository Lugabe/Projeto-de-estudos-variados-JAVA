package ExerciciosFundamentos;

import java.util.Scanner;

public class Aprendendo {
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
    double va1= 10;
    
    System.out.println("Digite o primeiro valor: ");
    double valor =  entrada.nextDouble();
    
    System.out.println(entrada);
    
    if (valor >10 && valor <20) {
    	System.out.println("o valor � entre 10 e 20!");
    }
    	
    else if (valor ==10) {
        System.out.println("O valor � 10 n� ");	
    }else if (valor ==20) {
        System.out.println("O valor � 20 n�");
    }else
    
    	for(valor=1;va1==10; va1++ ) {	
    		System.out.println("Valor menor do que 10 digitado, agora vai valer  10!");
    	}
	

	entrada.close();
}
}

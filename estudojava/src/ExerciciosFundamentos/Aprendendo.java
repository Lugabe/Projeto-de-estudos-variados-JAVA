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
    	System.out.println("o valor é entre 10 e 20!");
    }
    	
    else if (valor ==10) {
        System.out.println("O valor é 10 né ");	
    }else if (valor ==20) {
        System.out.println("O valor é 20 né");
    }else
    
    	for(valor=1;va1==10; va1++ ) {	
    		System.out.println("Valor menor do que 10 digitado, agora vai valer  10!");
    	}
	

	entrada.close();
}
}

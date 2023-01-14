package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		Scanner entrada =  new Scanner(System.in);
		
		//Ler num1
		//Ler num2
		// + - * / %	
		
		System.out.print("Digite o primeiro valor ");
        double num1 = entrada.nextDouble();    
        
        System.out.print("\nDigite o segundo valor ");
        double num2 = entrada.nextDouble();

        System.out.print("\nDigite a opera��o ");
        String op = entrada.next();

        
        //Logica
        double resultado = "+".equals(op)? num1  +  num2 : 0;
        resultado = "-".equals(op)? num1 - num2  :  resultado;
        resultado = "*".equals(op)? num1 * num2  :  resultado;
        resultado = "/".equals(op)? num1 / num2  :  resultado;
        resultado = "%".equals(op)? num1 % num2  :  resultado;
        
    System.out.printf("%.2f %s %.2f = %.2f", num1,op,num2, resultado);
    
              
        entrada.close();
        
		
	}


	}


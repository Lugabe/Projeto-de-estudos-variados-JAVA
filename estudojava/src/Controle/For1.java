package Controle;

public class For1 {

	public static void main(String[] args) {
		
		
		int contador = 1;
				
				while(contador <= 25) { // while repete inderteminada at� condi�ao ser cumprida
				System.out.printf("\ncontador = %d ",contador);
				contador++; // vai somando +1 at� chegar no numero, 
//				pode ser += 2 pra ir de 2 em 2 tamb�m ou qualquer numero
				}
				
				
				for(contador = 1; contador <= 25; contador+=2) { 
					System.out.printf("\ncontador = %d ",contador);
				}
				//for repete uma cerca quantidades determinada de repeti�oes
				
//				for(;;) {   LA�O INFINITO!!
//				System.out.println("fim!!");	
//				}
		
	}
	}


package Controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe o n�mero:");
		int numero = Integer.parseInt(valor);
		
		
		if(numero %2==0) { // se for verdade execute esse comando
			System.out.println("Numero par!");
		} else {// se n�o for verdade vai executar esse comando
				System.out.println("Numero Impar!");
		
				
		}
	}
	
}

package fundamentos;

import javax.swing.JOptionPane;// aparece uma mensagem na tela de input para
// o usuario digitar

public class ConversaoStringParaNumero {
	
  public static void main(String[] args) {
	String valor1 = JOptionPane.showInputDialog("DIGITE O PRIMEIRO NUMERO");
	String valor2 = JOptionPane.showInputDialog("DIGITE O SEGUNDO NUMERO");
	// aparece uma mensagem na tela de input para
	// o usuario digitar
	
	System.out.println(valor1+valor2);
	
	double numero1= Double.parseDouble(valor1);
	double numero2= Double.parseDouble(valor2);
	
	double soma = numero1 + numero2;
	System.out.println("soma é "+soma);
	System.out.println("a media é "+soma/2);
	
	
	
	
}
}

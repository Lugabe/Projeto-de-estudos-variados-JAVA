package bytebankHerdadoContaTestes;

public class TesteString {

	public static void main(String[] args) {

		
		String nome = "Alura"; // object literal, e imutavel
		
		String outro = nome.toLowerCase(); // � necessario criar outra string
										  // para usar a referencia e mudar
		
		System.out.println(nome); 
		System.out.println(outro);
		
//		nome.trim();         * retira o espa�o da string
//		nome.contains(outro);* verifica se cont�m oque voc� digitou
//		charAt(); serve para verificar a posi��o da letra, digitando um numero.
//		indexOf();serve para mostrar em qual posi�ao est� a letra ou pavra digitada 
		
	}

}


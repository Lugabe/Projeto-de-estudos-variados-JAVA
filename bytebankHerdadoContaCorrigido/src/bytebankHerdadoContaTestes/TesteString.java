package bytebankHerdadoContaTestes;

public class TesteString {

	public static void main(String[] args) {

		
		String nome = "Alura"; // object literal, e imutavel
		
		String outro = nome.toLowerCase(); // é necessario criar outra string
										  // para usar a referencia e mudar
		
		System.out.println(nome); 
		System.out.println(outro);
		
//		nome.trim();         * retira o espaço da string
//		nome.contains(outro);* verifica se contém oque você digitou
//		charAt(); serve para verificar a posição da letra, digitando um numero.
//		indexOf();serve para mostrar em qual posiçao está a letra ou pavra digitada 
		
	}

}


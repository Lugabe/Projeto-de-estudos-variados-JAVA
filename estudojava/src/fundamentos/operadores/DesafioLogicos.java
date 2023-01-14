package fundamentos.operadores;

public class DesafioLogicos {
	
     public static void main(String[] args) {
    	 
    	 // Trabalho na terça (v ou F)
    	 // Trabalho na quinta (V OU F)
    	 
    	 //Se os 2 darem certo, comprar tv 50 e tomar soverte
    	 //Se apenas 1 dos 2 der certo, comprar uma tv de 32 e tomar soverte
    	 //Se nenhum dar certo, ficar em casa e sem tv. Mas ficar saudavel por nao doce
    	 
    	 boolean emprego1 = true;
    	 boolean emprego2 = true;
 	 
    	 System.out.printf("\nCaso 1: Os 2 empregos deram certos, pegou TV de 50? %s  Mais saudavel?  %s", emprego1 && emprego2, !emprego1 && !emprego2);
    	 System.out.printf("\nCaso 2: Um emprego deu certo, pegou TV de 32? %s  Mais Saudavel? %s", emprego1 || emprego2, emprego1 ^ emprego2);
    	 System.out.printf("\nCaso 3: Nenhum emprego deu certo sem tv? %s  Mais saudavel? %s", !emprego1 && !emprego2, emprego1 && emprego2);
    	 
    	System.out.printf("\n\nCaso 1: Tomaram soverte mas estão menos saudaveis %s", emprego1 && emprego2);
    	System.out.printf("\nCaso 2: Tomaram soverte mas estão menos saudaveis %s", emprego1 || emprego2);
    	System.out.printf("\nCaso 3: Não tomaram soverte, mas estão mais saudaveis %s", emprego1 && !emprego2);
    	
   
    	 
    	 
    	 
	
	
}
}

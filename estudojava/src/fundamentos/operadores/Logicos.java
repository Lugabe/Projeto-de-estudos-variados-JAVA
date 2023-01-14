package fundamentos.operadores;

public class Logicos {
	
  public static void main(String[] args) {
	  
	 // CTRL +D APAGA A LINHA
	  
	  boolean condicao1 = true;
	  boolean condicao2 = 3>7;
	  System.out.println(condicao1 && !condicao2); // E
	  System.out.println(condicao1 || condicao2); //  || OU
	  System.out.println(condicao1 ^ condicao2); // ou exclusivo
	  System.out.println(!!condicao1); //  não condição
	  System.out.println(!condicao2); //  
	  
	  // É Binario - Tabela Verdade E  (AND)
	  System.out.println(true && true);
	  System.out.println(true && false);
	//System.out.println(false && true);
	//System.out.println(false && false);
	  
	  // É Binario - Tabela Verdade OU (OR)
	//System.out.println(true || true);
	//System.out.println(true || false);
	  System.out.println(false || true);
	  System.out.println(false || false);
	  
	  // É Binario - Tabela Verdade OU Exclusivo (XOR)
	  System.out.println(true ^ true);
	  System.out.println(true ^ false);
	  System.out.println(false ^ true);
	  System.out.println(false ^ false);

      // É Unario - Tabela Verdade NÃO (NOT)
      System.out.println(!true);
	  System.out.println(!false);
	  
	  
}
}

package fundamentos;

public class NotacaoPonto {
	
     public static void main(String[] args) {
	
    	 String s = "bom dia X";
    	 s = s.replace("X", "senhorita"); // .replace substitui a palavra por outra
    	 s = s.toUpperCase();            //  deixa tudo em maiusculo 
    	 s= s.concat("!!!!!");
    	 
    	 System.out.println(s);
    	 
    	 String x = "leo" .toUpperCase();
    	 System.out.println(x);
    	 
    	 // póde se colocar varias strings na mesma linha ou em linhas a baixo Quebradas pelo .(ponto)
    	 
    	 String y = "bom dia y".replace("bom dia y", "boa noite luis").toUpperCase().concat("!!!!!!");
    	 System.out.println(y);
    	 
    	 String gato = "gato" 
    			 .replace("gato", "cachorro")
    			 .toUpperCase()
    			 .concat("!!!!!!");
    	 System.out.println(gato);
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
}
}

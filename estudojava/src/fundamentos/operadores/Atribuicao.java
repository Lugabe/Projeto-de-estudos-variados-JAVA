package fundamentos.operadores;

public class Atribuicao {
    public static void main(String[] args) {
		
    	int a= 3;
    	int b= a;
    	int c= a + b;
    	
    	c += b;//c = c + b;  mesma coisa 
    	c -= a;//c = c - a;  mesma coisa 
    	c *= b;//c = c * b;  mesma coisa 
        c /= a;// c = c /a;  mesma coisa
        
        System.out.println(c);
        
    	c %=2;// c = c % 2;  0 ou 1  se for par 0 se for impa é 1
    	System.out.println(c);
	}
}

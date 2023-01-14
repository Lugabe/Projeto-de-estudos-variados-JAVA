package fundamentos;

public class Wrappers {
public static void main(String[] args) {
	
	//byte 
	Byte b= 100;  // com letra maisculas vira wrappers para chamar string
	Short s= 1000;
	Integer i = 10000; // mesma coisa que o int
	Long maior =100000L;
	
	//Integer.parseInt(entrada.next());
	
	System.out.println(b.byteValue());
	System.out.println(s.toString());
	System.out.println(i*3);
	System.out.println(maior/3);
	
	Float f = 1234.F; // com letra maisculas vira wrappers para chamar string
	System.out.println(f);
	
	Double D = 5454.33; // com letra maisculas vira wrappers para chamar string
	System.out.println(D);
	
	
	Boolean boloeano= Boolean.parseBoolean("true");
	System.out.println(boloeano);
	System.out.println(boloeano.toString().toUpperCase());
	
	Character c= '#' ; // char
	System.out.println(c+"AOBA" .toLowerCase());
	
 	
	
	
}
}

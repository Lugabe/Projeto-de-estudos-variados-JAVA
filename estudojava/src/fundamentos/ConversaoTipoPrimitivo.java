package fundamentos;

public class ConversaoTipoPrimitivo {
public static void main(String[] args) {
	
	double a =1;  // implicita
	System.out.println(a);
	
float b= (float) 1.4444; // Estamos usando Cast pra dizer que pode fazer a conversão
// explicita( float), dizendo que estamos ciente que pode aver perder informação.
	System.out.println(b);
	
	int c= 127;
	byte d =(byte) c; // explicita (CAST)
	System.out.println(c);
	
	double e= 1.99999;
	int f= (int) e;  // explicita (CAST)
	System.out.println(f);
	
	System.out.println(d);
	
	
}
}

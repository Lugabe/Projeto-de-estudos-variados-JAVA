package fundamentos;

public class ConversaoNumeroString {
	
public static void main(String[] args) {
	
	Integer num1 = 10000;
	System.out.println(num1.toString().length());
		//converter numeros para string
	int num2= 100000;
	System.out.println(Integer.toString(num2).length());
	
	// tanto da para fazer usando o .toString, quando usando (" " + num1)
System.out.println((" " + num1).length());
System.out.println((" " + num2).length());
	
// da para fazer a conversao de numero pra string byte, shot, int, double, float..

}
}

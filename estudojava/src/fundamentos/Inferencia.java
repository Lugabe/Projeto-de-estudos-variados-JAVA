package fundamentos;

public class Inferencia 
{
	
public static void main(String[] args) {

double a = 6; // declaraçao da variavel e inicializaçao
System.out.println(a);

a =12.5;
System.out.println(a);

var b = 4.5;     // VAR DEFINE AUTOMATICAMENTE O TIPO DE VARIAVEL
System.out.println(b);

var c = "texto";
System.out.println(c);

c = "outro texto";
System.out.println(c);

double d; //declarei a variavel
d=123.65; // variavel foi inicializada
System.out.println(d); // usada!


var e = 150;  // var vai inferir a variavel, (vai escolher qual o tipo) precisa já inicializar a variavel
System.out.println(e);


var f = "java";
System.out.println(f);

	
}
}

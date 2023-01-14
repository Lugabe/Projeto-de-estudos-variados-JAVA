package fundamentos;

public class Temperatura 
{

	public static void main(String[] args) 
	{
		
	final double temperatura = 32.5;
	final double divisao = 5.0/9.0; // é necessario colocar .0 para o programa saber que é numero real, quando for colocar divisão..
	
	double F =86.5;
	double C = (F-temperatura)* divisao; // sempre separar por () parentes quando tiver calculo soma ou subtração e multiplicaçao.
	System.out.println("A temperatura em celsus é "+ C+ "°"); //segurar alt e escolher onde quer colocar a linha subindo ou descendo 
	
	F= 96;
	C = (F-temperatura)* divisao;
	System.out.println("A temperatura em celsus é "+ C+ "°"); //para duplicar uma linha segurar ctrl alt baixo
	
	
	

		
	}
}

package Desafios;

public class PrimeiroTrauma {

	int a = 3; // nao pode mexer aqui!!
	static int c = 2;

	public static void main(String[] args) {

		PrimeiroTrauma b = new PrimeiroTrauma(); // só é possivel acessar um valor fora
		// da instancia atraves de uma instancia (objetvo) ou estatico atraves de estatico

		System.out.println(b.a);
		System.out.println(c);
		
	}

}

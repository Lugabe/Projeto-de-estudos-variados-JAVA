package Classe;

public class AreaCircTest {

	public static void main(String[] args) {

		AreaCirc a1 = new AreaCirc(10);
//		a1.pi = 10;
		a1.raio = 10; // acessando direto a classe
		System.out.println(a1.area());

		// acessando diretamente a classe porque pi virou static
//		AreaCirc.pi = 3.14;
		System.out.println(AreaCirc.area(100));
		System.out.println(AreaCirc.pi);
		System.out.println(Math.PI);
	}
}

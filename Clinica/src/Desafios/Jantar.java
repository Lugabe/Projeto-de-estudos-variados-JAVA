package Desafios;

public class Jantar {

	public static void main(String[] args) {

		Comida c1 = new Comida("Arroz", 0.200);
		
		Comida c2 = new Comida("Feijao", 0.300);

		Pessoa p = new Pessoa("Joao", 70.5);

		System.out.println(p.Apresentar());
		p.Comer(c1);
		
		System.out.println(p.Apresentar());
		p.Comer(c2);
		
		System.out.println(p.Apresentar());
		
	}
}
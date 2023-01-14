package Encapsulamento.polimorfismo;

public class Jantar {

	public static void main(String[] args) {

		Pessoa convidado = new Pessoa(99.5);

		Arroz ingrediente1 = new Arroz(0.200);
		Feijao ingrediente2 = new Feijao(0.300);
		Soverte ingrediente3 = new Soverte(0.200);

		System.out.println(convidado.getPeso());
		
		convidado.Comer(ingrediente1);
		convidado.Comer(ingrediente2);
		convidado.Comer(ingrediente3);
		
		System.out.println(convidado.getPeso());

	}
}

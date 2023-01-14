package Encapsulamento;

public class PessoaTest {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Luis"," Bernardi", -50);

		p1.setIdade(27);
	//	p1.setName("pedrozo");
		
		System.out.println(p1.getIdade());
		System.out.println(p1);
		System.err.println(p1.getnomeCompleto());

	}
}

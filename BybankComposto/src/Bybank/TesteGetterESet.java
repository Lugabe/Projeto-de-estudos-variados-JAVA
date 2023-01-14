package Bybank;

public class TesteGetterESet {

	public static void main(String[] args) {

		Conta conta = new Conta(1337,24226);

		conta.setNumero(1234);

		System.out.println(conta.getNumero());

		Cliente paulo = new Cliente();

		conta.setTitular(paulo);

		paulo.setName("Paulo silveira");

		System.out.println(paulo.getName());

		System.out.println(conta.getTitular().getName());
		
		conta.getTitular().setProfissao("Programador");
		
		System.out.println(conta.getTitular().getProfissao());

	}
}

package Bybank;

public class TestaContaSemCliente {

	public static void main(String[] args) {

		Conta contaDaMarcela = new Conta(1337,24226);
		System.out.println(contaDaMarcela.getSaldo());

		contaDaMarcela.setTitular(new Cliente());
		contaDaMarcela.getTitular().setName("Marcela");

		System.out.println(contaDaMarcela.getTitular().getName());
	}
}

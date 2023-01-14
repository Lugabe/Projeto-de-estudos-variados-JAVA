package Bybank;

public class TesteReferencia {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();

		primeiraConta.saldo = 300;

		System.out.println("O saldo da primeira: " + primeiraConta.saldo);

		Conta segundaConta = new Conta();

		segundaConta.saldo = 400;
		System.out.println("Saldo da segunda: " + segundaConta.saldo);

	}
}

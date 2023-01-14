package Bybank;

public class TesteSacaNegativo {

	public static void main(String[] args) {

		Conta conta = new Conta(1337,24226);
		
		conta.deposita(100);
		
	System.out.println(conta.getSaldo());
		

	}
}

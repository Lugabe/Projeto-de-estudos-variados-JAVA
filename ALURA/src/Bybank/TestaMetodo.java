package Bybank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaMarcelo = new Conta();
		contaMarcelo.saldo = 100;
		contaMarcelo.deposita(500);

		System.out.println("O seu saldo marcelo é de: " + contaMarcelo.saldo);

		contaMarcelo.saca(100);
		System.out.println("Saldo Atual Marcelo: " + contaMarcelo.saldo);
		System.out.println();
		Conta contaDaMarcela = new Conta();

		contaDaMarcela.deposita(1000);

		if (contaDaMarcela.transfere(300, contaMarcelo)) {
			System.out.println("Transferencia feita com sucesso! ");
		} else {
			System.out.println("Saldo Insuficiente! ");
		}

		System.out.println();
		System.out.println("Saldo Marcelo: " + contaMarcelo.saldo);
		System.out.println("Saldo Marcela: " + contaDaMarcela.saldo);

		contaMarcelo.titular = "Paulo silveira";
		
	}

}

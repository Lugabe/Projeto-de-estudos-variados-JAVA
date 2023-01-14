package bytebankHerdadoContaTestes;

import bytebankHerdadoContaModelo.ContaCorrente;
import bytebankHerdadoContaModelo.SaldoInsufiienteException;

public class TesteSaca {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente(123, 321);
		
		conta.deposita(200);
		try {
		conta.saca(200);
		}catch (SaldoInsufiienteException ex) {
			System.out.println("Saldo insuficiente: " + ex.getMessage());
			ex.printStackTrace();
		}
		System.out.println(conta.getSaldo());
		
	
	}
	
}

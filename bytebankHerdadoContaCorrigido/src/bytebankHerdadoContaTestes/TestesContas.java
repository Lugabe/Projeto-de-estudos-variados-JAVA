package bytebankHerdadoContaTestes;

/**
 * Uma classe de teste para realizar testes em contas criadas 
 * 
 * 
 * @author Luis_Gabriel
 */

import bytebankHerdadoContaModelo.ContaCorrente;
import bytebankHerdadoContaModelo.ContaPoupanca;
import bytebankHerdadoContaModelo.SaldoInsufiienteException;

//Full Qualified name FQN

public class TestesContas {
	
	// java.lang.String
	public static void main(String[] args) throws SaldoInsufiienteException {
		
	
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200);
		
		cc.transfere(10, cp);
		
		System.out.println("CC: "+cc.getSaldo());
		System.out.println("CP: "+cp.getSaldo());
		
	}
}

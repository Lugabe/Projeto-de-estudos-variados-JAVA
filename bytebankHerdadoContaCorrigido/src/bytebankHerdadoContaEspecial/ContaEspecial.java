package bytebankHerdadoContaEspecial;

import bytebankHerdadoContaModelo.Conta;

public class ContaEspecial extends Conta {

	public ContaEspecial(int agencia, int numero) {
		super(agencia, numero);
	}

	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}


	@Override
	public int compareTo(Conta o) {
		// TODO Auto-generated method stub
		return 0;
	}

}

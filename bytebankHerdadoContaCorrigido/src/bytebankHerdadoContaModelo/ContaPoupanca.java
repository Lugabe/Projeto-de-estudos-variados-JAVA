package bytebankHerdadoContaModelo; 

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);

	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

	@Override
	public String toString() {
		return "ContaPoupança, " +super.toString();
	}

	@Override
	public int compareTo(Conta o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

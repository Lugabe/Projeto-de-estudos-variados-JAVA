
public abstract class Conta {

	private int agencia;
	private int NumeroConta;
	private double saldoConta;

	public void Sacar(double valor) {
		if (saldoConta < valor) {
			System.out.println("Saldo insufienciente para o saque!");
		} else {
			this.saldoConta -= valor;
			System.out.println("Você realizou a transferencia com sucesso!");
		}
	}

	public void Depositar(double valor) {
		if (valor >= 1) {
			this.saldoConta += valor;
			System.out.println("Deposito realizado!");
		}else {
			System.out.println("Valor para deposito invalido!");
		}
		

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumeroConta() {
		return NumeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		NumeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldoConta;
	}

	public void setSaldo(double saldo) {
		this.saldoConta = saldo;
	}
	
}

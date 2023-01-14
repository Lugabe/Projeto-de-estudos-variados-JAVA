package Bybank;

public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;

	public Conta(int agencia, int numero){
		this.agencia= agencia;
		this.numero= numero;
	}
	public void deposita(double valor) {
		this.setSaldo(this.getSaldo() + valor);

	}

	public boolean saca(double valor) {
		if (this.getSaldo() >= valor) {
			this.setSaldo(this.getSaldo() - valor);
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.getSaldo() >= valor) {
			this.setSaldo(this.getSaldo() - valor);
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}

	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		if (saldo < 0) {
			System.out.println("Não se pode usar saldo negativo");
			return;
		}
		this.saldo = saldo;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Não se pode usar numero 0 ou negativa");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não se pode usar agencia 0 ou negativa");
			return;
		}
		this.agencia = agencia;
	}

}

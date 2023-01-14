package bytebankHerdadoContaModelo;

public class ContaCorrente extends Conta implements Tributavel{

	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void saca(double valor) throws SaldoInsufiienteException {
		double valorASacar = valor + 0.20;
		super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

	@Override
	public double getValorImposto() {
		return super.saldo *0.01;
	}

		@Override
		public String toString() {
			return "ContaCorrente, " +super.toString();
		}

		@Override
		public int compareTo(Conta o) {
			// TODO Auto-generated method stub
			return 0;
		}
	}

	
	


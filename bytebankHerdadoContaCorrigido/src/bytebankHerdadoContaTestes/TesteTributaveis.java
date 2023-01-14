package bytebankHerdadoContaTestes;

public class TesteTributaveis {

	public static void main(String[] args) {

		bytebankHerdadoContaModelo.ContaCorrente cc = new bytebankHerdadoContaModelo.ContaCorrente(222, 333);
		cc.deposita(100);
		
		bytebankHerdadoContaModelo.ContaCorrente cc1= new bytebankHerdadoContaModelo.ContaCorrente(222, 332);
		cc.deposita(100);
		
		bytebankHerdadoContaModelo.SeguroDeVida seguro = new bytebankHerdadoContaModelo.SeguroDeVida();
		
		bytebankHerdadoContaModelo.CalculadorImposto calc = new bytebankHerdadoContaModelo.CalculadorImposto();
		
		calc.registra(seguro);
		calc.registra(cc);
		calc.registra(cc1);
		
		System.out.println(calc.getTotalImposto());
	}

}

package defaultt;

public class TestaValores {

	public static void main(String[] args) {

		int total = 0;
		Conta conta = new Conta(1337, 24226);
		total++;
		
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1337, 24224);
		
		System.out.println(Conta.getTotal());
		

	}
}

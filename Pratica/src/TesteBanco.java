
public class TesteBanco {

	public static void main(String[] args) {

		Conta c1 = new ContaCorrente();
		c1.Depositar(100);
		System.out.println(c1.getSaldo());
		
		c1.Transferi(100, corrente, poupanca);
		
		Conta c2 = new ContaPoupanca();
		
		Clientes cliente= new Clientes();
		
		cliente.setName("Luis");
		cliente.setConta(null);
		
	}

}

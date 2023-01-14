package Bybank;

public class TestaBanco {

	public static void main(String[] args) {
		Cliente paulo = new Cliente();

		paulo.setName("Paulo Silveira");
		paulo.setCpf("22.222.222-22"); 
		paulo.setProfissao("Programador");

		Conta contaDoPaulo = new Conta(1337, 24226);

		contaDoPaulo.deposita(100);

		contaDoPaulo.setTitular(paulo);
		System.out.println(contaDoPaulo.getTitular().getName());
	}
}

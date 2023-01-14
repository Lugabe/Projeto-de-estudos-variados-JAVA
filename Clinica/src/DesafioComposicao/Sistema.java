package DesafioComposicao;

public class Sistema {

	public static void main(String[] args) {

		Compra compra1 = new Compra();
		compra1.AddItem("Batata Frita", 16.60, 2);
		compra1.AddItem(new Produtos("Kane", 10), 3);

		Compra compra2 = new Compra();
		compra2.AddItem("Batata Frita", 18, 2);
		compra2.AddItem(new Produtos("Whey", 85.50), 4);

		Cliente client = new Cliente("Luis Gabriel");

		client.addCompra(compra2);
		client.addCompra(compra1);

		System.out.println(client.GetValueTotal());
		
	
	}
}

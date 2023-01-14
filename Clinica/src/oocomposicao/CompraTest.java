package oocomposicao;

public class CompraTest {

	
	public static void main(String[] args) {
		
		Compra c1= new Compra();
		
		c1.client= "Luis";
		
		c1.addItem(new Item("caneta", 20, 7.55));
		c1.addItem("Borracha", 10, 9.40); // funciona sem new Item depois de fazer o metodo
		c1.itens.add(new Item("Caderno", 10, 50.50));// mesma sem usar o metodo addItem
		
		System.out.println(c1.itens.size());
		System.out.println(c1.getValueTotal());
		
		// Só para mostrar a relação bidirecional!!!
		double total= c1.itens.get(0).compra.itens.get(1).compra.getValueTotal();
		System.out.println("The Total is: " + total);
		
		
	}
}

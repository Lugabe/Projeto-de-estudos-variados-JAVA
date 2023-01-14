package Classe;

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto p1 = new Produto("Notebook", 4356.89); // construtor

		var p2 = new Produto();
		p2.nome = "Caneta Preta.";
		p2.preco = 12.50;
		
		Produto.desconto = 0.25;

		System.out.println(p1.nome + " " + p1.PrecoComDesconto());
		System.out.println(p2.nome + " " + p2.PrecoComDesconto());

		double precoFinal1 = p1.PrecoComDesconto();
		double precoFinal2 = p2.PrecoComDesconto(0.1);
		double media = (precoFinal1 + precoFinal2) / 2;

		System.out.printf("Media do carrinho = R$:%.2f. ", media);


	}
}

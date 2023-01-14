package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {

		Consumer<Produto> imprimir = p -> System.out.println(p.name);

		Produto p1 = new Produto("Caneta", 12.45, 0.09);
		imprimir.accept(p1);

		Produto p2 = new Produto("caderno", 22.45, 0.1);
		Produto p3 = new Produto("borracha", 12.45, 0.06);
		Produto p4 = new Produto("lapis", 2.45, 0.09);
		Produto p5 = new Produto("notebook", 4542.45, 0.25);

		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

		produtos.forEach(imprimir);
		produtos.forEach(p -> System.out.println(p.price));
		produtos.forEach(System.out::println);

	}
}

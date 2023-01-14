package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {

		Supplier<List<String>> UmaLista = () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
		// é preciso colocar os parenteses  ( )porque não recebe nenhum parametro

		System.out.println(UmaLista.get());
		
	}
}

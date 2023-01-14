package Streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {

		List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");

		// System.out.println("usando For...");
		// for (int i = 0; i < aprovados.size(); i++) {

		System.out.println("Usando o Foreach...");
		for (String name : aprovados) {

			System.out.println(name);
		}

		System.out.println("\n Usando o Interator..");
		Iterator<String> iterator = aprovados.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("\n Usando Stream...");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println); //Laço interno!!
	}

}

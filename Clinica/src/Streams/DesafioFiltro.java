package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFiltro {

	public static void main(String[] args) {

		Carro c1 = new Carro("Honda", 100, false);
		Carro c2 = new Carro("BMW", 150, true);
		Carro c3 = new Carro("TOYOTA", 130, false);

		List<Carro> carros = Arrays.asList(c1, c2, c3);

		Predicate<Carro> Turbo = c -> c.turboLigado = true;
		Function<Carro, String> ligado = c -> c.name + " O turbo está ligado! " + c.velocidade +"KM/H Está correndo!";
		Predicate<Carro> correndo = c -> c.velocidade > 100;

		carros.stream()
		.filter(Turbo)
		.filter(correndo)
		.map(ligado)
		.forEach(System.out::println);

	}
}

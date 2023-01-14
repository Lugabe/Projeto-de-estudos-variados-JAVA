package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce01 {

	public static void main(String[] args) {

		List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		BinaryOperator<Integer> soma = (ac, n) -> ac + n;

		Integer total = number.stream().reduce(soma).get();
		System.out.println(total);

		Integer total2 = number.stream().reduce(100, soma);

		System.out.println(total2);

		number.stream().filter(n -> n > 5).reduce(soma).ifPresent(System.out::println);
	}
}

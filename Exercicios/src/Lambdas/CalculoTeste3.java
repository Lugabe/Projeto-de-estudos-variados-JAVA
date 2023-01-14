package Lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {

		// n�o da int -> Double
		// da double -> Double
		
		BinaryOperator<Double> calc = (x, y) -> {return x + y;};
		System.out.println(calc.apply(2.0, 3.0));

		calc = (x, y) -> x * y;
		System.out.println(calc.apply(8.0, 2.0));
		
		BinaryOperator<Integer> calc2 = (x, y) -> {return x + y;};
		System.out.println(calc2.apply(2, 3));
		
		calc = (x, y) -> x * y;
		System.out.println(calc2.apply(8, 2));
		
		
	}
}

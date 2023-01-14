package CursoNovo;

public class Exercicio1 {

	public static void main(String[] args) {

		String product1 = "computer";
		String product2 = "office desk";

		int age = 30;
		int code = 5290;
		char gender = 'f';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.23456;

		System.out.printf("\n%s, which price is R$: %.2f", product1, price1);
		System.out.printf("\n%s, which price is R$: %.2f", product2, price2);
		System.out.printf("\nRecord: %d years old, code: %d and gender: %s", age, code, gender);
		System.out.printf("\nmeasue witch eight decimal places: %f", measure);
		System.out.printf("\nRouded (three decima places): %.3f", measure);
	}
}

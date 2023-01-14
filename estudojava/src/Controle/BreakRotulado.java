package Controle;

public class BreakRotulado {

	public static void main(String[] args) {

		externo: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				if (i == 1) {
					break externo; // da para escolher em qual vai ser amarrado o break
				}
				System.out.printf("[%d] [%d]", i, j);
			}
			System.out.println();
		}
		System.out.println("fim");
	}
}

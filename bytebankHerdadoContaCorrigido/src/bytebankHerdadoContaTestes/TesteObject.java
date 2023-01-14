package bytebankHerdadoContaTestes;

import bytebankHerdadoContaModelo.ContaCorrente;
import bytebankHerdadoContaModelo.ContaPoupanca;

public class TesteObject extends Object {

	public static void main(String[] args) {

		System.out.println();

		Object cc = new ContaCorrente(123, 321);
		Object cp = new ContaPoupanca(222, 323);

		System.out.println(cc);
		System.out.println(cp);
	}
	
// O METODO " Println " tem sobrecarga para receber qualquer tipo de atributo.
	// EXEMPLOS

	static void println() {
	}

	static void println(int a) {
	}

	static void println(boolean valor) {
	}
	// para cada tipo é necessario criar um novo metodo println com o novo parametro
	}

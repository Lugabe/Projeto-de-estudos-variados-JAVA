package Estudos;

public class Casa {

	String name;
	String cor;
	int quantos;
	boolean gordo;

	Casa() {

	}

	Casa(String name, String cor, int quantos, boolean gordo) {
		this.name = name;
		this.cor = cor;
		this.quantos = quantos;
		this.gordo = gordo;
	}
	void Status() {
		System.out.println(name);
		System.out.println(cor);
		System.out.println(quantos);
		System.out.println(gordo);
	}

	void EstaGordo() {
		if (this.gordo == true) {
			System.out.println("Está gordão");

		} else {
			System.out.println("É magricela");
		}
	}

	void TemGatoNaCasa() {
		if (this.quantos > 0) {
			System.out.println("Tem gato em casa");
		} else {
			System.out.println("Estão vagabundando na rua");
		}

	}

}

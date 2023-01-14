package Classe;

public class UsandoConstrutorEstudo {

	static double placa1 = 1987.76;
	static double placa2;
	double placa3;

	UsandoConstrutorEstudo() {

		placa1 = 1987.76;
		placa2 = 1934.81;
		placa3 = 1038.70;
	}

	UsandoConstrutorEstudo(int placa1Inicial, int placa2Inicial, int placa3Inicial) {
		placa1 = placa1Inicial;
		placa2 = placa2Inicial;
		placa3 = placa3Inicial;

	}

	double Comparacao1() {
		return (placa1 - placa2);

	}

	double Comparacao2() {
		return (placa1 - placa3);
	}

	double Comparacao3() {
		return (placa2 - placa3);
	}

	final double Media() {
		return (Comparacao1() + Comparacao2() + Comparacao3()) / 3;

	}
}

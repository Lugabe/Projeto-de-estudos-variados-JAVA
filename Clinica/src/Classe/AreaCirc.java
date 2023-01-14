package Classe;

public class AreaCirc {

	double raio;
	static final double pi = 3.14; // static transforma em algo global para toda as instancias.

	AreaCirc(double raioInicial) {
		raio = raioInicial;
//		pi = 3.14;
	}

	double area() {
		return raio * raio * pi;
	}

	static double area(double raio) {
		return pi * raio * raio;

	}
}

package Estudos;

public class Caneta {

	String cor;
	String modelo;
	float ponta;
	int carga;
	boolean tampada;

	Caneta(String modelo, String cor, float ponta, int carga, boolean tampada) {

		this.modelo = modelo;
		this.cor = cor;
		this.ponta = ponta;
		this.carga = carga;
		this.tampada = tampada;
	}
 
	void Rabiscar() {
		if (this.tampada == true) {
			System.out.println("Retire a tampa");
		} else {
			System.out.println("Rabiscando");
		}
	}

	void Tampar() {
		this.tampada = true;

	}

	void Destampar() {
		this.tampada = false;

	}

}

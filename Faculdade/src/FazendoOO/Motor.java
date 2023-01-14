package FazendoOO;

public class Motor {

	Carro carro;

	double injecao = 1;
	boolean ligado = false;

	Motor(Carro carro) {

		this.carro = carro;
	}

	int giros() {
		if (!ligado) {
			return 0;
		} else if (carro.abrirPorta == true) {
			return 0;

		} else {
			return (int) Math.round(injecao * 3000);
		}
	}
}

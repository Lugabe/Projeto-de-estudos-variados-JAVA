package FazendoOO;

public class Carro {

	Motor motor;
	boolean abrirPorta = false;

	Carro(Motor motor) {
		this.motor = new Motor(this);
	}

	void acelerar() {
		if (motor.injecao < 2.5) {
			motor.injecao += 0.5;

		}
	}

	void freiar() {
		if (motor.injecao > 0.5) {
			motor.injecao -= 0.5;
		}
	}

	void ligar() {
		motor.ligado = true;
	}

	void desligar() {
		motor.ligado = false;

	}

	boolean EstaLigado() {
		return motor.ligado;
	}

	void AbrirPorta() {
		abrirPorta = true;

	}

	void FecharPorta() {
		abrirPorta = false;
	}
}

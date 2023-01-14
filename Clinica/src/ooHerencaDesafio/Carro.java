package ooHerencaDesafio;

public class Carro {

	public int velocidade = 0;
	final int VELOCIDADE_MAXIMA;
	private int delta = 5;
	

	Carro() { // OPCIONAL
		this.VELOCIDADE_MAXIMA = 180;

	}

	Carro(int VelocidadeMaxima) {
		VELOCIDADE_MAXIMA = VelocidadeMaxima;
	}


	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}


	public void Acelerar() {
		if (velocidade + getDelta() > VELOCIDADE_MAXIMA) {
			velocidade = VELOCIDADE_MAXIMA;
		} else {
			velocidade += getDelta();
		}
	}

	public void Frear() {
		if (velocidade >= 5) {
			velocidade -= 5;

		} else {
			velocidade = 0;
		}
	}
}

package ooHerencaDesafio;

public class Ferrari extends Carro implements Esportivo, Luxo {

	private boolean ligarTurbo;
	private boolean ligarAr;

	public Ferrari() {
		super(300);

	}

	public Ferrari(int VELOCIDADE_MAXIMA) {
		super(VELOCIDADE_MAXIMA);
		setDelta(15);
	}

	public void Acelerar() {
		if (velocidade + getDelta() > VELOCIDADE_MAXIMA) {
			velocidade = VELOCIDADE_MAXIMA;
		} else {
			velocidade += getDelta();
		}
	}

	public void Frear() {
		if (velocidade >= 15) {
			velocidade -= 15;

		} else {
			velocidade = 0;
		}
	}

	@Override
	public void LigarTurbo() {
		ligarTurbo = true;
	}

	@Override
	public void DesligarTurbo() {
		ligarTurbo = false;
	}

	@Override
	public void ligarAr() {
		ligarAr = true;
	}

	@Override
	public void DesligarAr() {
		ligarAr = false;
	}

	@Override
	public int getDelta() {
		if (ligarTurbo && !ligarAr) {
			return 35;
		} else if (ligarTurbo && ligarAr) {
			return 30;
		} else if (!ligarTurbo && !ligarAr) {
			return 20;
		} else {
			return 15;

		}

	}

}

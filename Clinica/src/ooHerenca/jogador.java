package ooHerenca;

public class jogador {

	public int life = 100;
	public int x;
	public int y;

	public boolean atacar(jogador oponente) {

		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);

		if (deltaX == 0 && deltaY == 1) {
			oponente.life -= 10;
		} else if (deltaX == 1 && deltaY == 0) {
			oponente.life -= 10;
			return true;

		} else {
		}
		return false;
	}

	public boolean Andar(Direcao direcao) {

		switch (direcao) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			x--;
			break;
		}

		return true;

	}
}

package ooHerenca;

public class Heroi extends jogador {

//extends serve para heran�a

	public boolean atacar(jogador oponente) {
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		boolean ataque3 = super.atacar(oponente);
		return ataque1 || ataque2 || ataque3;
	}
}

//		int deltaX = Math.abs(x - oponente.x);
//		int deltaY = Math.abs(y - oponente.y);
//
//		if (deltaX == 0 && deltaY == 1) {
//			oponente.life -= 20;
//		} else if (deltaX == 1 && deltaY == 0) {
//			oponente.life -= 20;
//			return true;
//
//		} else {
//		}
//		return false;
//	}

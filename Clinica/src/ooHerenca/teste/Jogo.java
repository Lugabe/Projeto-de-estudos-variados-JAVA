package ooHerenca.teste;

import ooHerenca.Direcao;
import ooHerenca.Heroi;
import ooHerenca.monstro;

public class Jogo {

	public static void main(String[] args) {

		monstro monster = new monstro();

		monster.x = 10;
		monster.y = 10;

		Heroi Hero = new Heroi();
		Hero.x = 11;
		Hero.y = 10;

		System.out.println("Monstro tem => " + monster.life);
		System.out.println("Heroi tem => " + Hero.life);

		monster.atacar(Hero);
		Hero.atacar(monster);

		monster.atacar(Hero);
		Hero.atacar(monster);

		monster.atacar(Hero);
		Hero.atacar(monster);

		monster.Andar(Direcao.NORTE);

		System.out.println("Monstro tem => " + monster.life);
		System.out.println("Heroi tem => " + Hero.life);

	}
}

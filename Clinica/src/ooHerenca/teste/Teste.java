package ooHerenca.teste;

import ooHerencaDesafio.Civic;
import ooHerencaDesafio.Ferrari;

public class Teste {
	public static void main(String[] args) {

		Ferrari c1 = new Ferrari();
		c1.Acelerar();
		c1.LigarTurbo();
		c1.Acelerar();
		c1.Acelerar();
		
		System.out.println("Velocidade Atual da Ferrari: => " + c1.velocidade + " KM/H");
		c1.Frear();
		System.out.println("Velocidade Atual da Ferrari com Freio: => " + c1.velocidade + " KM/H");

		Civic c2 = new Civic();
		c2.Acelerar();
		c2.Acelerar();
		c2.Acelerar();

		System.out.println("Velocidade Atual do Civic: => " + c2.velocidade + " KM/H");
		c2.Frear();
		System.out.println("Velocidade Atual com Freio Civic: => " + c2.velocidade + " KM/H");
	}
}

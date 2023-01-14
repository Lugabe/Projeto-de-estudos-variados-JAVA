package ooHerencaDesafio;

public interface Luxo {

	void ligarAr();

	void DesligarAr();

	default int nivelDoAr() {

		return 1;
	}

}

package CasaB;

import CasaA.Ana;

public class Julia {

	

	void testeAcessos() {
		
		Ana sogra= new Ana();
		
	//	System.out.println(sogra.segredo);
	//	System.out.println(sogra.dentroDeCasa);
	//	System.out.println(sogra.FormaDeFalar);// protected so da pra acessar atraves de herença
		System.out.println(sogra.TodosSabem);
	}
}

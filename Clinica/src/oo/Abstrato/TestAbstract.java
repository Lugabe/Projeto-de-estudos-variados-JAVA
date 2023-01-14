package oo.Abstrato;

public class TestAbstract {

	public static void main(String[] args) {

		Mamifero a = new Cachorro();
		System.out.println(a.Mover());
		System.out.println(a.Mamar());
		System.out.println(a.Respirar());
		
		
		
	} 
}

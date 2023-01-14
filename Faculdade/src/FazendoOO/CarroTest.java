package FazendoOO;

public class CarroTest {

	public static void main(String[] args) {

		Carro c1 = new Carro(null);

		System.out.println(c1.EstaLigado());

		c1.ligar();
		c1.AbrirPorta();
		System.out.println(c1.motor.giros());
		c1.FecharPorta();
		c1.acelerar();
		c1.acelerar();

		System.out.println(c1.motor.giros());

		// c1.freiar();
		// c1.freiar();
		// c1.freiar();

		// System.out.println(c1.motor.giros());

		// System.out.println(c1.motor.carro.motor.carro.motor.giros());

	}
}

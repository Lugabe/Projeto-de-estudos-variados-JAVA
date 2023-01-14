package bytebankHerdadoContaTestes;

import bytebankHerdadoContaModelo.Cliente;
import bytebankHerdadoContaModelo.ContaCorrente;
import bytebankHerdadoContaModelo.ContaPoupanca;

public class TesteArraysDeReferencias {

	public static void main(String[] args) {

		// int idades = new int[5];

		Object referencias[] = new Object[5];

		ContaCorrente cc1 = new ContaCorrente(321, 123);
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(111, 222);
		referencias[1] = cc2;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;

		
		ContaPoupanca ref = (ContaPoupanca)referencias[1]; // type Cast
		
		System.out.println(referencias[0]);
		System.out.println(referencias[1]);
		
		System.out.println(ref.getNumero());
		
	}

}

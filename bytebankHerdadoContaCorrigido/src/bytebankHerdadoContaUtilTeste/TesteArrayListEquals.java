package bytebankHerdadoContaUtilTeste;

import java.util.ArrayList;

import bytebankHerdadoContaModelo.Conta;
import bytebankHerdadoContaModelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
//		Conta cc1 = new ContaCorrente(123, 22);
//		Conta cc2 = new ContaCorrente(123, 22);
//		
//		boolean igual = cc1.ehIgual(cc2);
//		System.out.println(igual);
		

		// <> se chama Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta cc0 = new ContaCorrente(123, 11);
		lista.add(cc0);

		Conta cc1 = new ContaCorrente(22, 321);
		lista.add(cc1);

		Conta cc2 = new ContaCorrente(22, 321);
		boolean existe = lista.equals(cc2);

		System.out.println("J� existe? " + existe);
		
//		for (Conta conta : lista) {
//			if (conta.ehIgual(cc2)) {
//				System.out.println("j� tenho essa conta!");
//			}
//		}

		for (Conta conta : lista) {
			System.out.println(conta);
		}

	}

}


package bytebankHerdadoContaUtilTeste;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import bytebankHerdadoContaModelo.Cliente;
import bytebankHerdadoContaModelo.Conta;
import bytebankHerdadoContaModelo.ContaCorrente;
import bytebankHerdadoContaModelo.ContaPoupanca;

public class TestClasseAnonima {

	public static void main(String[] args) throws Exception {

		Conta cc1 = new ContaCorrente(22, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Nico");
		cc1.setTitular(clienteCC1);
		cc1.deposita(333.0);

		try {
			throw new NullPointerException("Testando uma Exception!");
		} catch (ArithmeticException | NullPointerException ex) {
			ex.getStackTrace();
		} finally {
			System.out.println("Testando um finally");
		}

		Conta cc2 = new ContaPoupanca(22, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNome("Guilherme");
		cc2.setTitular(clienteCC2);
		cc2.deposita(444.0);

		Conta cc3 = new ContaCorrente(22, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNome("Paulo");
		cc3.setTitular(clienteCC3);
		cc3.deposita(111.0);

		Conta cc4 = new ContaPoupanca(22, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNome("Ana");
		cc4.setTitular(clienteCC4);
		cc4.deposita(222.0);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

		lista.sort(new Comparator<Conta>() { // classe anonima

			@Override
			public int compare(Conta c1, Conta c2) {
				return Integer.compare(c1.getNumero(), c2.getNumero());
			}
		});

		
		for (Conta conta : lista) {
			System.out.println(conta);
		}

		
		lista.sort(new Comparator<Conta>() { // classe anonima

			@Override
			public int compare(Conta c1, Conta c2) {

				String nameC1 = c1.getTitular().getName();
				String nameC2 = c2.getTitular().getName();

				return nameC1.compareTo(nameC2);
			}
		});

		
		for (Conta conta : lista) {
			System.out.println(conta + ", " + conta.getTitular().getName());
		}

	}

}

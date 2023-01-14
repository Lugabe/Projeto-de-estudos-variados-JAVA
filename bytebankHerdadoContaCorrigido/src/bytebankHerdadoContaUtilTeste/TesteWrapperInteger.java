package bytebankHerdadoContaUtilTeste;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {

		
		System.out.println(Integer.MIN_VALUE);// mostrao valor que ele pode guardar
		System.out.println(Integer.MAX_VALUE);// mostrao valor que ele pode guardar
		System.out.println(Integer.SIZE); // mostra quantos bits tem no integer
		System.out.println(Integer.BYTES); // mostra quantos bytes tem no integer
		
		
		@SuppressWarnings("unused")
		int idade = 29; // Integer veio para substituir o int
		
		@SuppressWarnings({ "unused", "removal" })
		Integer idadeRef = new Integer(29);// o java faz isso por baixo dos panos

		List<Integer> primitivos = new ArrayList<Integer>();

		Integer idadeReff = Integer.valueOf(29); // Est� � uma maneira de criar objeto
		// AutoBoxing // apatir de um primitivo
		// Embrulhou o primitivo

		@SuppressWarnings("unused")
		int valor = idadeReff.intValue();// aqui esta sendo pedido o primitivo
		// Desembrulhou o primitivo
		// UnBoxing

		primitivos.add(29); // se chama de Autoboxing, a conversao automatica
							// de primitivos para objetos.
							// Acontece por baixo dos panos

		String s = args[0];
		int numero = Integer.parseInt(s); // passando tipo string para inteiro
		System.out.println(numero);

	}

}

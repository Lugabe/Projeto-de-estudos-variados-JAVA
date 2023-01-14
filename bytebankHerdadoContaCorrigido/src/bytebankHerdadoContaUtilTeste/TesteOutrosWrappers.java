package bytebankHerdadoContaUtilTeste;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

	public static void main(String[] args) {
		
		Integer idadeReff = Integer.valueOf(29); // Est� � uma maneira de criar objeto
		// AutoBoxing // apatir de um primitivo
		// Embrulhou o primitivo

		@SuppressWarnings("unused")
		int valor = idadeReff.intValue();// aqui esta sendo pedido o primitivo
		// Desembrulhou o primitivo
		// UnBoxing
		
		
		Double dref = Double.valueOf(32.2);
		System.out.println(dref.doubleValue());
		
		Number refNumero = Float.valueOf(29.9f); // um tipo generico para usar qualquer
												// tipo numerico
		System.out.println(refNumero.floatValue());
		
		List<Number> numeros = new ArrayList<>();
		//posso guardar qualquer tipo primitivo.
		//(Number � uma referencia mais generica)
		numeros.add(22);
		numeros.add(22.5);
		numeros.add(22.5f);
		
	}
}

package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

		// Set<String> listaAprovados =new HashSet <>();// não garante a ordem das
		// informaçoes
		SortedSet<String> listaAprovados = new TreeSet<>(); // garante a ordem das informaçoes
		// pode colocar TreeSet no inicio também

		// é preciso definir entre os <Tipo>
		// pode se colocar o operador diamont <> do lado direito, que o java sabe que
		// vai ser
		// tudo do primeiro tipo digitado na esquerda, no caso String

		// comando para selecionar blocos ALT+SHIFT+A

		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Lucas");
		listaAprovados.add("Pedro");

		for (String candidato : listaAprovados) {
			System.out.println(candidato);

		}

		Set<Integer> nums = new HashSet<>();

		nums.add(1);
		nums.add(2);
		nums.add(160);
		nums.add(6);
		
		for(int n:nums) {
			System.out.println(n);
		}

	}
}

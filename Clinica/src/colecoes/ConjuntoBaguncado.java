package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		HashSet conjunto = new HashSet();

		conjunto.add(1.2); // hashset vai converter do double -> Double
		conjunto.add(true); // hashset vai converter do boolean -> Boolean
		conjunto.add("Teste");// String j� � um objeto
		conjunto.add(1); // hashset vai converter do int -> Integer
		conjunto.add('x'); // hashset vai converter do char -> Chacacter

		// hashset n�o tem .lenght, s� tem o size que � a mesma coisa
		System.out.println("Tamanho � " + conjunto.size()); // size mostra o tamanho, igual o lenght

		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));

		System.out.println("O tamanho � " + conjunto.size());

		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));

		Set nums = new HashSet();

		nums.add(1);
		nums.add(2);
		nums.add(3);

		System.out.println(nums);
		System.out.println(conjunto);

		conjunto.addAll(nums); //uni�o entre dois conjuntos
		conjunto.retainAll(nums); // vai reter oque existe no outro conjunto
		
		System.out.println(conjunto);
		
		conjunto.clear(); //limpa o conjunto
		System.out.println(conjunto);
		

	}
}

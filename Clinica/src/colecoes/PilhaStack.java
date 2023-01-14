package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class PilhaStack {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O pequeno Principe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		for(String livro:livros) {
			System.out.println(livro);
			
		}
		
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		
//		livros.size();
//		livros.clear();
//		livros.contains(...);
//		livros.isEmpty()
		
		

		
	}
}

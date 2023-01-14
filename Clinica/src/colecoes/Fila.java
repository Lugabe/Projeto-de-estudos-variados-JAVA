package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();

		fila.add("Ana");// Offer e add adicionam elementos na fila.
		fila.offer("Bia");// serve para adicionar tbm mas de acordo com o tamanho da fila
		fila.offer("Carlos");// Lan�a uma exce��o ''erro'' se a fila esta cheia
		fila.add("Daniel"); // Add retorna falso se tiver cheia a fila
		fila.offer("Rafaela");
		fila.offer("Gui");

		// Peek e Element -> Obeter o proximo elemento da fila (sem remover)
		// Diferen�a � o comportamento que ocorre quando a fila esta vazia

		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());

		// fila.size(); (mostra o tamanho da fila)
		// fila.clear(); (limpa a fila)
		// fila.isEmpty(); (mostra se a fila est� ou n�o vazia)
		// fila.contains(...); pra saber se contem na fila

		System.out.println(fila.poll());
		// tira o proximo da fila e retorna NULL se n�o tiver ninguem
		System.out.println(fila.poll()); // retorna null 
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove()); // retorna uma exce��o (erro)
	}
}

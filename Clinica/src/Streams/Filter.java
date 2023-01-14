package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("ana", 7.8);
		Aluno a2 = new Aluno("Bia", 5.8);
		Aluno a3 = new Aluno("Daniel", 6.8);
		Aluno a4 = new Aluno("Gui", 3.8);
		Aluno a5 = new Aluno("Luis", 4.8);
		Aluno a6 = new Aluno("Pedro", 9.8);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

		Predicate<Aluno> Aprovado = a -> a.nota >= 7;
		Function<Aluno, String> saudacaoAprovado = a -> " Parabéns " + a.name + " Você foi aprovado(a) !!";

		alunos.stream().filter(Aprovado).map(saudacaoAprovado).forEach(System.out::println);

//			OU pode se fazer assim também

//		alunos.stream().filter(a -> a.nota>=7)
//	    .map(a -> " Parabéns " + a.name +" Você foi aprovada(o) !!!")

	}
}

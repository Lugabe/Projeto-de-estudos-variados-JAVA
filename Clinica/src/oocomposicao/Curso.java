package oocomposicao;

import java.util.ArrayList;

public class Curso {

	final String name;

	final ArrayList<Aluno> alunos = new ArrayList<Aluno>();

	Curso(String name) {
		this.name = name;
	}

	void addStudent(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this);

	}
}

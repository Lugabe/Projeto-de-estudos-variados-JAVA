package oocomposicao;

import java.util.ArrayList;

public class Aluno {

	final String name;

	final ArrayList<Curso> cursos = new ArrayList<Curso>();

	Aluno(String name) {
		this.name = name;
	}

	void AddCourse(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);

	}

	Curso GetCourseByName(String name) {
		
		for(Curso curso:this.cursos) {
			if(curso.name.equalsIgnoreCase(name)) {
				return curso;
			}
		}
		return null;

	}

	public String toString() {
		return name;
	}
}

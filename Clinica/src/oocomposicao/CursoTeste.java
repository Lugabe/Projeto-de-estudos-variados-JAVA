package oocomposicao;

public class CursoTeste {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("Joao");
		Aluno aluno2 = new Aluno("Rodrigo");
		Aluno aluno3 = new Aluno("Luis");

		Curso curso1 = new Curso("Java");
		Curso curso2 = new Curso("Java Script");
		Curso curso3 = new Curso("Html");

		curso1.addStudent(aluno3);
		curso1.addStudent(aluno2);

		curso2.addStudent(aluno1);
		curso2.addStudent(aluno3);

		aluno1.AddCourse(curso3);
		aluno2.AddCourse(curso3);
		aluno3.AddCourse(curso3);

		for (Aluno aluno : curso3.alunos) {

			System.out.println("Estou matriculado no curso " + curso3.name + "...");
			System.out.println("... E o meu nome é: " + aluno.name);
		}
		
		System.out.println(aluno1.cursos.get(0).alunos);

		Curso cursoEncontrado = aluno3.GetCourseByName("Java");

		if (cursoEncontrado != null) {

			System.out.println(cursoEncontrado.name);

			System.out.println(cursoEncontrado.alunos);
		}

	}
}

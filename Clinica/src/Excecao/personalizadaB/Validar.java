package Excecao.personalizadaB;

public class Validar {

	private Validar() {
	}
	// TODO Auto-generated constructor stub

	public static void usuario(Aluno aluno) {

		if (aluno == null) {
			throw new IllegalArgumentException("O aluno está nulo!");
		}
		if (aluno.name == null || aluno.name.trim().isEmpty()) {
			throw new StringVaziaException("Nome");
		}
		if (aluno.nota < 0 || aluno.nota > 10) {
			throw new NumeroForaIntervaloException("nota");
		}
	}
}

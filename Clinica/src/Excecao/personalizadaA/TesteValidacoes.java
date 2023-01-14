package Excecao.personalizadaA;

public class TesteValidacoes {

	public static void main(String[] args) {

		Aluno aluno;
		try {
			aluno = new Aluno("Ana", 7);
			Validar.usuario(aluno);
			
			Validar.usuario(null);
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		}catch (NumeroForaIntervaloException 
				| IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("FIM");
		
		
	}
}

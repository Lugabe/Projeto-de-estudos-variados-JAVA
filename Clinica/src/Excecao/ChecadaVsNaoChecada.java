package Excecao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {

		try {
			GeraErro1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		try {
			GeraErro2();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			;
		}

		System.out.println("FIM :) ");
	}

	// EXE��O N�O CHECADA OU N�O VERIFICADA
	public static void GeraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01! ");
	}

	// EXCE��O CHEGADA OU VERIFICADA
	public static void GeraErro2() throws Exception {
		throw new Exception("Ocorreu um erro bem legal #02! ");

	}
}

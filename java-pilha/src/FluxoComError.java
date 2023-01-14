
public class FluxoComError {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException ex) {
			String msg = ex.getMessage();
			System.out.println("Exception" + msg);
			ex.printStackTrace();
			
		}
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		
		//Um metodo de resolver a excecao
		try {
		metodo2();
		}catch( MinhaExcecao ex) {
			String msg = ex.getMessage();
			System.out.println("Menssagem de excecao");
			
			
		}
		System.out.println("Fim do metodo1");
		
	}
	
	private static void metodo2() throws MinhaExcecao{
		// outro metodo de resolver a excecao
		
		System.out.println("chamando metodo 2");
		metodo2();
		System.out.println("Inicio do metodo 2");
		 
		
		
		
		System.out.println("Fim do metodo2");
	}
}


public class TestaContaComExcecaoChecked {

	public static void main(String[] args) {
		
		Conta c = new Conta();
		try {
		c.deposita();
		}catch(MinhaExcecao ex) {
			String msg = ex.getMessage();
			System.out.println(msg + "Deu ruim!");
			
		}
	}
}

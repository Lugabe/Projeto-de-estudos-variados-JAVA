
public class TesteGerente  {

	public static void main(String[] args) {
	
		Autenticavel gerente = new Gerente();
		
		Gerente g1 = new Gerente();
		g1.setName("Luis");
		g1.setCpf("3434343");
		g1.setSalario(5000.0);
		
		System.out.println(g1.getName());
		System.out.println(g1.getSalario());
		
		g1.setSenha(2222);
		boolean autenticou = g1.autentica(2222);
		
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificao());
	}

}

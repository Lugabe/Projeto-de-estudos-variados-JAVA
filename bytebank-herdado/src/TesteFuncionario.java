
public class TesteFuncionario  {

	public static void main(String[] args) {
		
		Funcionario nico = new Gerente();
		nico.setName("Nico Steppat");
		nico.setCpf("385 485 98 05");
		nico.setSalario(2600.00);
		
		System.out.println(nico.getName());
		System.out.println(nico.getBonificao());
		

	}

}

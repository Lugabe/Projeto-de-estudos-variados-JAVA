
public class TestesReferencias {

	public static void main(String[] args) {

		Funcionario g1 = new Gerente();

		g1.setName("Luis");
		g1.setSalario(5000);
		System.out.println(g1.getName());

		//Funcionario f = new Funcionario(); // parou de funcionar porque
		//                                    o funcionario é algo abstrato
		g1.setSalario(2000);

		Funcionario ev = new EditorVideo();
		g1.setSalario(2500);

		Designer d = new Designer();
		d.setSalario(2500);
		
		ControleBoneficacao controle = new ControleBoneficacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
		

	}

}

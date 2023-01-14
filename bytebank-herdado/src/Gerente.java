
// GERENTE EH UM FUNCIONARIO AUTENTICAVEL, gerente herda da class FuncionarioAutenticavel
public class Gerente extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autenticador;
	
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	
	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}


	public double getBonificao() {
		return super.getSalario() +500 ;
	}
}

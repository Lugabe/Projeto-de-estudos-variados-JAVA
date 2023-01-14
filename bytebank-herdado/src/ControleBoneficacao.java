
public class ControleBoneficacao {

	private double soma;
	
	
	public void registra(Funcionario f) {
		double boni = f.getBonificao();
		this.soma= this.soma + boni;
		
	}
	
	public double getSoma() {
		return soma;
	}
	
	public void setSoma(double soma) {
		this.soma = soma;
	}
}

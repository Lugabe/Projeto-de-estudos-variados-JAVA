
// não pode instaciar esta classe, porque é abstrata 
public abstract class Funcionario {

	private String name;
	private String cpf;
	private double salario;

	public Funcionario() {

	}

	// metodo sem corpo, não há implementação
	public abstract double getBonificao();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	
}

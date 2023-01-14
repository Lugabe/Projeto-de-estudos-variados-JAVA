package Encapsulamento;

public class Pessoa {
	private String name;
	private int idade;
	private String sobrenome;

	public Pessoa(String name, String sobrenome, int idade) {
		setIdade(idade);
		setName(name);
		setSobrenome(sobrenome);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getnomeCompleto() {
		return getName() + "" + getSobrenome();
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if (novaIdade >= 0 && novaIdade <= 120)
			this.idade = novaIdade;
	}

	public String toString() {
		return "Ola eu sou o " + getName() + " e tenho " + getIdade() + " anos.";

	}

}

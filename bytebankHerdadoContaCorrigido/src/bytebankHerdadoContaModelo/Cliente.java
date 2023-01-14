package bytebankHerdadoContaModelo;

public class Cliente {

	/**
	 * Classe que representa um cliente do bytebank
	 * 
	 * @author Luis_Gabriel_Bernardi
	 * @version 0.1
	 * 
	 */

	private String name;
	private String cpf;
	private String profissao;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public void setNome(String string) {
		this.name = string;
	}

}

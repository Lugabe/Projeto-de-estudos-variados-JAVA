package Excecao.personalizadaB;

@SuppressWarnings("serial")
public class StringVaziaException extends Exception {

	private String nameAtributo;

	public StringVaziaException(String nameAtributo) {
		this.nameAtributo = nameAtributo;

	}

	public String getMessage() {
		return String.format("O atributo '%s' está Vazio ", nameAtributo);
	}
}

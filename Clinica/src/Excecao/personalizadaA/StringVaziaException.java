package Excecao.personalizadaA;

@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException {

	private String nameAtributo;

	public StringVaziaException(String nameAtributo) {
		this.nameAtributo = nameAtributo;

	}

	public String getMessage() {
		return String.format("O atributo '%s' está Vazio ", nameAtributo);
	}
}

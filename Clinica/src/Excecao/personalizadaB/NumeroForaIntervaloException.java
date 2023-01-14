package Excecao.personalizadaB;

@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends Exception {

	private String nameAtributo;

	public NumeroForaIntervaloException(String nameAtributo) {
		this.nameAtributo = nameAtributo;

	}

	public String getMessage() {
		return String.format("O atributo '%s' está negativo ", nameAtributo);
	}
}

package Excecao.personalizadaA;

@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends RuntimeException {

	private String nameAtributo;

	public NumeroForaIntervaloException(String nameAtributo) {
		this.nameAtributo = nameAtributo;

	}

	public String getMessage() {
		return String.format("O atributo '%s' está negativo ", nameAtributo);
	}
}

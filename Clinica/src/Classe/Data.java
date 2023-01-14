package Classe;

public class Data {

	int dia;
	int mes;
	int ano;

	Data() {
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		this(1,1,1970);  // para chamar outro construtor se usa this();
	}

	Data(int dia, int mes, int ano) {
		this.dia = dia; // serve para referenciar a instancia ao parametro
		this.mes = mes;
		this.ano = ano;

	}

	String DataFormatada() {
		return String.format("Hoje é dia %d do mes %d do ano %d", dia, mes, ano);

	}
	// void serve para quando não tem retorno
}

package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// informações do funcionario
		
		// Tipos numericos Inteiros
		byte anosDeEmpresa = 23;  // byte suporta 127
		short numeroDeVoos = 542; // short suporta 30k
		int id= 56789;            // int suporta 2 147 483 647
		long PontosAcumulados = 3_234_845_223L; //colocar o L no final para indicar que é do tipo LONG
		
		//tipos numericos reais
		float salario = 11_445.44F;
		double VendasAcumuladas = 2_991_797_103.01;
		
		//Tipo Booleano
		boolean estaDeFerias= false; //true
		
		//Tipo Caractere
		char status = 'A'; // Ativo
		
		// Dias de empresa
		
		System.out.println("dias na empresa " + anosDeEmpresa*365);
		
		//numero de viagens
		System.out.println("numeros de voos " + numeroDeVoos/2);
		
		// pontos por real
		System.out.println("pontoas acumulados das vendas = " + PontosAcumulados / VendasAcumuladas );
		
		System.out.println(id+ " ganha ->"+ salario+ " mil");
		System.out.println("ferias? " + estaDeFerias);
		
		System.out.println("status " + status);
		
		
	}
}

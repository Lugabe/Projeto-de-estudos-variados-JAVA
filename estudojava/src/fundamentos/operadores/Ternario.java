package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		
		double media = 7.6;
		String Reprovado = media >= 5.0 ? "Em Recupera��o" : "Reprovado";
		
		String resultadoFinal = media >= 7.0 ? "Aprovado" : Reprovado;
	 //? para perguntar pro sistema ,  e : para outra a��o caso seja falso a primeira
		
		System.out.println("O Aluno est� "+ resultadoFinal);
		
		
		   double nota = 7.9;
		   boolean BomComportamento =true;
		   boolean passouPorMedia = nota >=7;
		   boolean temDesconto = BomComportamento && passouPorMedia;
		   String resultado = temDesconto? "Sim!" : "N�o!";
		   
		   System.out.println("Tem desconto? "+ resultado);
		   
		
	}
}

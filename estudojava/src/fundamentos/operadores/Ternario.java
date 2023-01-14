package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		
		double media = 7.6;
		String Reprovado = media >= 5.0 ? "Em Recuperação" : "Reprovado";
		
		String resultadoFinal = media >= 7.0 ? "Aprovado" : Reprovado;
	 //? para perguntar pro sistema ,  e : para outra ação caso seja falso a primeira
		
		System.out.println("O Aluno está "+ resultadoFinal);
		
		
		   double nota = 7.9;
		   boolean BomComportamento =true;
		   boolean passouPorMedia = nota >=7;
		   boolean temDesconto = BomComportamento && passouPorMedia;
		   String resultado = temDesconto? "Sim!" : "Não!";
		   
		   System.out.println("Tem desconto? "+ resultado);
		   
		
	}
}

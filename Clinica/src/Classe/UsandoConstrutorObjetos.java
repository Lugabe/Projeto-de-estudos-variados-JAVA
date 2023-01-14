package Classe;

public class UsandoConstrutorObjetos {

	public static void main(String[] args) {

		UsandoConstrutorEstudo placas = new UsandoConstrutorEstudo();

		System.out.println("\nPlaca gráfica de mllse rtx 3070 ");
		System.out.println("preço " + UsandoConstrutorEstudo.placa1);

		System.out.println("\nJieshuo 100% nova placa gráfica rtx3070 ");
		System.out.println("preço " + UsandoConstrutorEstudo.placa2);

		System.out.println("\nJieshuo 100% novo rtx 2060 super");
		System.out.println("preço " + placas.placa3);

		System.out.println(" \nmllse 3070 - jienshuo 3070 " + placas.Comparacao1());
		System.out.println(" \nmllse 3070 - jienshuo 2060 super " + placas.Comparacao2());
		System.out.println(" \njienshuo 3070 - jienshuo 2060 " + placas.Comparacao3());

		System.out.println("\nMedia de preços " + placas.Media());

	}
}

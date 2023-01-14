package Controle;

public class SwitchSemBreak {

	public static void main(String[] args) {

		String faixa = "preta";

		switch (faixa.toLowerCase()) { // faz uma sequencia de comandos serem executados
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei O Heian Sanda");
		case "Vermelha":
			System.out.println("Sei o Heain Nidan");
		case "amarela":
			System.out.println("Sei o Heian Shodan");
			break;// para a sequencia de comandos neste ponto
			default:
				System.out.println("Sabe de nada inocente");
		}
System.out.println("FIM!");
	}
}

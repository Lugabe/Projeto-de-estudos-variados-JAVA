package Controle;

public class Continue {

	public static void main(String[] args) {
		
		for (int i = 0; i <10; i++) {
			if(i % 2 == i) {
				continue;
			}
			System.out.println(i);
		}
	}
}

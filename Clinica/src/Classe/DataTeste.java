package Classe;

public class DataTeste {

	public static void main(String[] args) {

		Data d1 = new Data();
		

		System.out.println(d1.DataFormatada());

		Data d2 = new Data(13, 10, 2022);

		System.out.println(d2.DataFormatada());
	}
}

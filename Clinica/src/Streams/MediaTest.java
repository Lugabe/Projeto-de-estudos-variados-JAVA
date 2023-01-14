package Streams;

public class MediaTest {

	public static void main(String[] args) {
		
		Media m1= new Media().adicionar(8.3).adicionar(9.7);
		Media m2= new Media().adicionar(5.5).adicionar(7.5);
	
		System.err.println(m1.getValor());
		System.err.println(m2.getValor());
		
		System.out.println(Media.combinar(m1, m2).getValor());
	}
}

package bytebankHerdadoContaTestes;

public class TesteArrayDePrimitivos {

	// Array [ ]
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {

		int idades[] = new int[5];// inicializa o array com 0

		idades[0] = 29;
		idades[1] = 39;
		idades[2] = 49;
		idades[3] = 59;
		idades[4] = 69;

		// try {
		int idade1 = idades[4];
		System.out.println(idade1);
		// }catch(Exception ex) {
		// System.out.println("deu erro"+ex);
		// }

		for (int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
			System.out.println(idades[i]);
		}

		for (int b = 0; b < idades.length; b++) {
			idades[b]= b+b; // � necessario criar outra atribui�ao para mudar
							// o for, se n�o vai repetir o primeiro for.
		System.out.println(idades[b]);
		}
		
	}
}

package Estudos;

public class CasaTest {

	public static void main(String[] args) {

		Casa casa1 = new Casa();

		casa1.name = "panda";
		casa1.cor = "preto e branco";
		casa1.quantos = 1;
        casa1.gordo=true;
        
        casa1.TemGatoNaCasa();
        casa1.EstaGordo();
        System.out.println();

        casa1.Status();
        
        Casa casa2= new Casa("negao","preto",1,false);
        
        System.out.println();
        
        casa2.TemGatoNaCasa();
        casa2.EstaGordo();
        System.out.println();
        
        casa2.Status();
	}
}

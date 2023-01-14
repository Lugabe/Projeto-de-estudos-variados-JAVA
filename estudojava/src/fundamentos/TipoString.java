package fundamentos;

public class TipoString {
	
public static void main(String[] args) {
	System.out.println("Olá Pessoal".charAt(2)); 
	// serve para mostrar qual letra nesta na possição 2
	
String s= "Boa Tarde";
System.out.println(s.concat("!!!"));
System.out.println(s+ "!!!");
System.out.println(s.startsWith("Boa")); // verifica se o valor iniciado e verdadeiro
System.out.println(s.toLowerCase().startsWith("boa"));
System.out.println(s.toUpperCase().endsWith("TARDE")); //ver se o valor final e verdade
System.out.println(s.length()); // mostra o comprimento da palavra
System.out.println(s.toLowerCase().equals("boa tarde"));
//compara se a palavra e igual 
System.out.println(s.equalsIgnoreCase("boa tarde")); 
//compara se a palavra é igual ignorando letra maiusculas e minusculas
	

	var nome = "Luis";
	var sobrenome = "Gabriel";
	var idade = 27;	
	var salario = 3500.50;
	
	
	System.out.println("Nome: "
	+nome+ "\nSobrenome: " +sobrenome+ "\nIdade: " +idade+ "\nSalario: " +salario+ "\n");
	//  \n serve para quebrar a linha e escrever em baixo
	
System.out.printf("O senhor %s %s tem %d anos, e ganha R$%.2f reais por mês."
			, nome, sobrenome, idade, salario);
	//%s É de caracter    %d de numeros inteiros  %f de numeros float( reais)
	
String frase = String.format("\nO senhor %s %s tem %d anos, e ganha R$%.2f reais por mês."
			, nome, sobrenome, idade, salario);
System.out.println(frase);
	
	//Podemos usar string para otimizar o codigo e torna lo mais flexivel 
	//e usar tanto letras, numeros ou false, true.

String maisUmaFrase= ("Nome: "
+nome+ "\nSobrenome: " +sobrenome+ "\nIdade: " +idade+ "\nSalario: " +salario+ "\n");
	
System.out.println("\n"+maisUmaFrase);
    //Podemos usar String para fazer o primeiro comando a cima.
	
System.out.println("Frase Qualquer".contains("quer"));//verifica se contém
System.out.println("Frase Qualquer".indexOf("Qual"));// mostra qual posição se encontra
System.out.println("Frase Qualquer".substring(6,10));// inclui de acordo com a posição
System.out.println("Frase Qualquer".substring(6));// inclui de acordo com a posição

	

System.out.printf("\n"+"O rapaz %s %s tem apenas %d anos e recebe só %.2f reis ", 
		nome ,sobrenome ,idade ,salario);

String x = "ola mundo".toUpperCase().substring(0).concat("!!!!").replace("ola", "Oiee");
System.out.println("\n"+ x);













































	
	
	
}
}

package Estudos;

public class Classes {

	String nome;
	String email;
	int idade;
	int funcionarios;

	
	Classes(){
		
	}
	
	Classes(String nome, String email, int idade, int funcionarios) {
		
		this.email = email;
		this.nome = nome;
		this.idade= idade;
		this.funcionarios= funcionarios;
	}
		
 String Cadastro (){
	return String.format("O Usuario %s possui o email: %s e idade: %d e id do funcionario é: %d",nome,email,idade,funcionarios);
 
}

}

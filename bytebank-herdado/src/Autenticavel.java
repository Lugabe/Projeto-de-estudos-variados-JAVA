
//contrato autenticavel
//quem assina o contrato precisa implementar, precisa cumprir as obriga��es
//metodo set senha
//metodo autenticavel

public abstract interface Autenticavel {

	
	public abstract  boolean autentica(int senha);


	public abstract void setSenha(int senha);
	
	

}

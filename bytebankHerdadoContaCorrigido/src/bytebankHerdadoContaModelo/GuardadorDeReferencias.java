package bytebankHerdadoContaModelo;

public class GuardadorDeReferencias {

	private Conta referencias[];
	private int posicaoLivre;
	private Object TodasRef[];
	private int posicaoLivreObject;

	public GuardadorDeReferencias() {
		this.referencias = new Conta[10];
		posicaoLivre = 0;
	}

	public GuardadorDeReferencias(Object ref) {
		this.TodasRef = new Object[10];
		posicaoLivreObject = 0;
	}

	public void adicionar(Conta ref) {
		this.referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	
	}
	public void adicionar2 (Object ref2) {
		this.TodasRef[this.posicaoLivreObject]= ref2;
		this.posicaoLivreObject++;
	}

	public int getQuantidadeElementos() {
		return this.posicaoLivre;
	}
	
	public int getQuantidadeElementosObject() {
		return this.posicaoLivreObject;
	}

	public Conta getReferecia(int posicao) {
		return referencias[posicao];
	}
	
	public Object getObjetos(int posicao) {
		return this.TodasRef[posicao];
}
}

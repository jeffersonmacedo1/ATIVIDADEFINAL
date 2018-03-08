
public abstract class Arma implements ComportamentooArma {
	protected int danoMax;
	protected int durabilidade;
	protected static String nome;
	private  boolean maoDireita;
	private  boolean maoEsquerda;
	
	
	
	
	
		
	public Arma(int danoMax, int durabilidade, String nome) {
		super();
		this.danoMax = danoMax;
		this.durabilidade = durabilidade;
		this.nome = nome;
	}

	
	
	
	

	public  abstract boolean usarApenasUmaMao();
	

	public String examinar(){
		
	


		return "Arma [danoMax=" + danoMax + ", durabilidade=" + durabilidade + ", maoDireita=" + maoDireita
				+ ", maoEsquerda=" + maoEsquerda + "]";
	}






	public int getDanoMax() {
		return danoMax;
	}

	public void setDanoMax(int danoMax) {
		this.danoMax = danoMax;
	}

	public int getDurabilidade() {
		return durabilidade;
	}

	public void setDurabilidade(int durabilidade) {
		this.durabilidade = durabilidade;
	}


	

	public int atacar() {
		
		return 0;
	}

	public String usarArma() {
		if (usarArma == "AtaqueADistancia"){
			
		
		}
		return ("avançando em direção ao inimigo");
		
		
	}
	
	
		else if   (usarArma() == "CorpoaCorpo"){
			
			
		
		
		return("preparar apontar fogo");

	}






	public boolean isMaoDireita() {
		return true;
	}






	public void setMaoDireita(boolean maoDireita) {
		this.maoDireita = maoDireita;
	}






	public boolean isMaoEsquerda() {
		return false;
	}






	public void setMaoEsquerda(boolean maoEsquerda) {
		this.maoEsquerda = maoEsquerda;
	}
	

	
		
	}
	




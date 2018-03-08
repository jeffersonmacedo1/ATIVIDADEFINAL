
public class AtaqueADistancia extends Arma {


	public AtaqueADistancia(int danoMax, int durabilidade) {
	
		super(durabilidade, durabilidade, nome);
		this.danoMax = danoMax;
		this.durabilidade = durabilidade;
		this.nome = nome;
	}
	

	public boolean usarApenasUmaMao() {
		
		return false;
	}

}

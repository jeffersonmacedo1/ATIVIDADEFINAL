
public class CorpoaCorpo extends Arma {

	
	public CorpoaCorpo(int danoMax, int durabilidade, String nome) {
		super(durabilidade, durabilidade, nome);
		this.danoMax = danoMax;
		this.durabilidade = durabilidade;
		this.nome = nome;
	}
		
	

	

	public boolean usarApenasUmaMao() {
	
		return true;
	}

}

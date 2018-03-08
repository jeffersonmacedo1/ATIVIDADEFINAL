
public class Personagem {
	
	private String nome;
	private int maxHp;
	private int HPAtual;
	
	
	
	
	
	
	public Personagem(String nome, int maxHp, int HPAtual) {
		super();
		this.nome = nome;
		this.maxHp = maxHp;
	    this.HPAtual = HPAtual;
	}

	public Personagem (String nome, int maxHP){
		
	}
	
	public void  equiparArma( Arma a){
		
		
		
		
		
	}
	
	public  void sofrerDano(int dano){
		
		
		
	}
	public int getHp(){
		return HPAtual;
		
		
	}
	
   public String Status(){
	 
	   
 
	return "Personagem [nome=" + nome + ", maxHp=" + maxHp + ", HPAtual=" + HPAtual + "]";
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getMaxHp() {
	return maxHp;
}

public void setMaxHp(int maxHp) {
	this.maxHp = maxHp;
}

public int getHPAtual() {
	return HPAtual;
}

public void setHPAtual(int hPAtual) {
	HPAtual = hPAtual;
}
   
}

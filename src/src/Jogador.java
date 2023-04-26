package src;

public class Jogador extends Pessoa{

	private String posicao;
	private String melhorPerna;
	
	public Jogador() {};
	
	public Jogador(String posicao, String melhorPerna, String nome, String idade, String altura) {
		super(nome, idade, altura);
		this.posicao = posicao;
		this.melhorPerna = melhorPerna;
	}

	public String getMelhorPerna() {
		return melhorPerna;
	}

	public void setMelhorPerna(String melhorPerna) {
		this.melhorPerna = melhorPerna;
	}
	
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
}

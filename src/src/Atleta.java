package src;

public class Atleta extends Pessoa{

	private String posicao;
	private String melhorPerna;
	
	public Atleta() {};
	
	public Atleta(String posicao, String melhorPerna, String nome, String idade, String altura) {
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
	
	public void mostrarAtleta(){
		System.out.println(super.getNome());
		System.out.println(super.getIdade());
		System.out.println(super.getAltura());
		System.out.println(this.getPosicao());
		System.out.println(this.getMelhorPerna());
	}
}

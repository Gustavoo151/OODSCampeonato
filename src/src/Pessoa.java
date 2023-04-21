package src;

public abstract class Pessoa {
	
	private String nome;
	private String idade;
	private String altura;
	
	public Pessoa() {
		super();
	}
	
	public Pessoa(String nome, String idade, String altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getAltura() {
		return altura;
	}
	public void setAltura(String altura) {
		this.altura = altura;
	}
}


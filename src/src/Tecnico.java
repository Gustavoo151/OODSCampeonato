package src;

public class Tecnico extends Pessoa{
	
	private String estiloTatico;

	public Tecnico() {
		super();
	}

	public Tecnico(String nome, String idade, String altura, String estiloTatico) {
		super(nome, idade, altura);
		this.estiloTatico = estiloTatico;
	}

	public String getEstiloTatico() {
		return estiloTatico;
	}

	public void setEstiloTatico(String estiloTatico) {
		this.estiloTatico = estiloTatico;
	}	
}
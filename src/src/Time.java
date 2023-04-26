package src;

import java.util.ArrayList;

public class Time {
	private String nome;
	private Tecnico tecnico;
        private ArrayList<Jogador> atletas = new ArrayList<>();
        public Time(){}
        
        public Time(String nome, Tecnico tecnico){
            this.nome = nome;
            this.tecnico = tecnico;
        }
        
	public String getNome() {
            return nome;
	}
	public void setNome(String nome) {
            this.nome = nome;
	}
	public Tecnico getTecnico() {
            return tecnico;
	}
	public void setTecnico(Tecnico tecnico) {
            this.tecnico = tecnico;
	}
	
        public void setAtleta(Jogador atleta){
            this.atletas.add(atleta);
        }

        public ArrayList<Jogador> getAtletas(){
            return this.atletas;
        }
        
        public void mostraTime(){
            System.out.println(this.tecnico.getNome() + this.tecnico.getAltura());
            System.out.println(this.nome);
        }
}

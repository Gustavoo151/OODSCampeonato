package Controle;

import src.Campeonato;
import src.Tecnico;
import src.Time;

public class gerenciadorCadastro {
    
    private Campeonato campeonato;
    private Time time;
    private Tecnico tecnico;
    
    public void setCampeonato(Campeonato campeonato){
        this.campeonato = campeonato;
    }
    
    public Campeonato getCampeonato(){
        return this.campeonato;
    }
    
    public void setTime(Time time){
        this.time = time;
    }
    
    public Time getTime(){
        return this.time;
    }
    
    public void setTecnico(Tecnico tecnico){
        this.tecnico = tecnico;
    }
    
    public Tecnico getTecnico(){
        return this.tecnico;
    }
    
}

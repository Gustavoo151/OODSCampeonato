package src;

public class ListaVaziaException extends Exception{
    
    public ListaVaziaException(){
        super("Tabela Vázia");
    }

    @Override
    public String toString(){
        return "Tentativa abri uma lista de jogadores vázia!";
        
    }
}

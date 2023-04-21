package interfaces;

import src.Cadastro;
import java.util.ArrayList;
import src.Time;

public interface InterfaceListarTimes {
    
    public void setTela(Cadastro cadastro);
    
    public void setTimes(ArrayList<Time> time);
    
    public void mostrarTimes();
}

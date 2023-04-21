package src;

import interfaces.InterfaceListarTimes;
import java.util.ArrayList;
import visao.ListaTime;

        
public class ListarTimes extends ListaTime implements InterfaceListarTimes{

    private Cadastro cadastro;
    private ArrayList<Time> time;
    
    @Override
    public void times() {
    }

    @Override
    public void telaCadastro() {
        this.dispose();
        cadastro.setVisible(true);
    }

    @Override
    public void setTela(Cadastro cadastro) {
        this.cadastro = cadastro;
    }

    @Override
    public void setTimes(ArrayList<Time> time) {
        this.time = time;
    }

    @Override
    public void mostrarTimes() {
        for (int i = 0; i< time.size();i++){
            System.out.println(time.get(i).getNome() + "\n" + 
                    time.get(i).getTecnico().getNome() + "\n" + 
                    time.get(i).getAtletas().get(1).getNome());
        }
    }
    
}

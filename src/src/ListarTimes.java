package src;

import interfaces.InterfaceListarTimes;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import visao.ListaTime;

        
public class ListarTimes extends ListaTime implements InterfaceListarTimes{

    private DefaultTableModel modelo = new DefaultTableModel();
    private Cadastro cadastro;
    private ArrayList<Time> times;
    
    public ListarTimes(){
    }
    
    
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
    public void setTimes(ArrayList<Time> times) {
        this.times = times;
    }

    @Override
    public void mostrarTimes() {
        
        if(this.times.isEmpty()){
            this.modelo.addRow(new String[] {"sem informações", "sem informações"});
        }
        else{
            for(int i = 0; i < this.times.size(); i++){
                 modelo.addRow(new String[] {this.times.get(i).getNome(),
                     this.times.get(i).getTecnico().getNome()});
            }
        }
        jTableListaTimes.setModel(modelo);
    }

    @Override
    public void configModelo() {
        this.modelo.addColumn("Nome Time");
        this.modelo.addColumn("Tecnico");
    }

    @Override
    public void RemoverTime() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}

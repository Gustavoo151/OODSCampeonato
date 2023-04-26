package src;

import static java.awt.Frame.ICONIFIED;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static src.LogGenerator.generateLog;
import visao.ListaTime;

        
public class ListarTimes extends ListaTime implements InterfaceListarTimes{

    private Cadastro cadastro;
    private ArrayList<Time> times;
    
    public ListarTimes(){
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
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("Nome Time");
        modelo.addColumn("Tecnico");
        
        if(this.times.isEmpty()){
            modelo.addRow(new String[] {"sem informações", "sem informações"});
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
    public void removerTime() {
         for(int i = 0; i < times.size(); i++){
            if(jTextRemoverTime.getText().equals(times.get(i).getNome())){
                times.remove(i);
                JOptionPane.showMessageDialog(this, "Time Removido","Remover", ICONIFIED);
            }
        }
    }

    public ArrayList<Jogador> acessaJogadores(){
        for(Time time: times){
            if(jTextPesquisaTimesJogadores.getText().equals(time.getNome())){
                return time.getAtletas();
                }
                
            }
        return null;
    }
    
    @Override
    public void setTextoBarraPesquisarJog() {
        jTextPesquisaTimesJogadores.setText("Nome do Time");
    }

    @Override
    public void removerTextoBarraPesquisarJog() {
        jTextPesquisaTimesJogadores.setText("");
    }

    @Override
    public void setTextoBarraPequisarTime() {
        jTextRemoverTime.setText("Nome do Time");
    }

    @Override
    public void removerTextoBarraPesquisaTime() {
        jTextRemoverTime.setText("");
    }

    @Override
    public void atualizarTabela() {
        this.mostrarTimes();
    }

    @Override
    public void listarJogadores() {
           
        try{
            ListaJogadores listarJogadores = new ListaJogadores();
            listarJogadores.setAtletas(acessaJogadores());
            listarJogadores.mostraTable();  // Exception vai vim daqui co mo thoews
            listarJogadores.setTelaListarTimes(this);
            this.dispose();
            listarJogadores.setVisible(true);
        }
        catch (ListaVaziaException l){
            JOptionPane.showMessageDialog(this, "Time não encontrado!","Time inexistente", ICONIFIED);
            
            try {
                generateLog(l.toString(), l.getStackTrace());
            } catch (IOException ex) {
                Logger.getLogger(ListarTimes.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        catch (Exception ex) {
            Logger.getLogger(ListarTimes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

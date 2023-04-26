package src;

import static java.awt.Frame.ICONIFIED;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static src.LogGenerator.generateLog;
import visao.ListarJogadores;

public class ListaJogadores extends ListarJogadores implements InterfaceListaJogadores{
    
    private ArrayList<Jogador> jogadores;
    ListarTimes listarTimes;     
    
    public void setAtletas(ArrayList<Jogador> atletas){
        this.jogadores = atletas;
    }
    
    @Override
    public void mostraTable() throws Exception{
        DefaultTableModel modeloTable = new DefaultTableModel();

        modeloTable.addColumn("Nome");
        modeloTable.addColumn("Idade");
        modeloTable.addColumn("Altura");
        modeloTable.addColumn("Posição");
        modeloTable.addColumn("Melhor Perna");

        if(this.jogadores == null){
           modeloTable.addRow(new String[] {"sem informações", "sem informações"});
           jTableListaJogadores.setModel(modeloTable);
           
           throw new ListaVaziaException();
       }
       else{
            for (Jogador atleta : jogadores){
   
                modeloTable.addRow(new String[] {
                    atleta.getNome(),
                    atleta.getIdade(),
                    atleta.getAltura(),
                    atleta.getPosicao(),
                    atleta.getMelhorPerna()});
           }
       jTableListaJogadores.setModel(modeloTable);
        }
    }
    
    public void setTelaListarTimes(ListarTimes listarTimes){
        this.listarTimes = listarTimes;
    }

    @Override
    public void TelaListarTimes() {
        this.dispose();
        this.listarTimes.setVisible(true);
    }

    @Override
    public void removerJogador() {
        for(int i = 0; i < jogadores.size(); i++){
            if(jTextFieldNomeJog.getText().equals(jogadores.get(i).getNome())){   
                JOptionPane.showMessageDialog(this, "Atleta " + jogadores.get(i).getNome() + " removido","Remover jogador", ICONIFIED);
                jogadores.remove(i);
            }  
        }
        jTextFieldNomeJog.setText("Nome Jogador");
    }

    @Override
    public void removerTextJfildRemoverJog() {
        jTextFieldNomeJog.setText("");
    }

    @Override
    public void atualizarTabela() {
        try{
            mostraTable();
        }
        catch(ListaVaziaException l){
            JOptionPane.showMessageDialog(this, "Tabela Vázia!","Remover", ICONIFIED);
            
            try {
                generateLog(l.toString());
                generateLog(l.getMessage());
            } catch (IOException ex) {
                Logger.getLogger(ListaJogadores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }   
        catch (Exception ex) {
                Logger.getLogger(ListaJogadores.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

}


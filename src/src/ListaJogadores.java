package src;

import static java.awt.Frame.ICONIFIED;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import visao.ListarJogadores;

public class ListaJogadores extends ListarJogadores implements InterfaceListaJogadores{
    
    private ArrayList<Jogador> jogadores;
    ListarTimes listarTimes;     
    
    public void setAtletas(ArrayList<Jogador> atletas){
        this.jogadores = atletas;
    }
    
    @Override
    public void mostraTable() {
        DefaultTableModel modeloTable = new DefaultTableModel();

        modeloTable.addColumn("Nome");
        modeloTable.addColumn("Idade");
        modeloTable.addColumn("Altura");
        modeloTable.addColumn("Posição");
        modeloTable.addColumn("Melhor Perna");

        if(this.jogadores.isEmpty()){
           modeloTable.addRow(new String[] {"sem informações", "sem informações"});
           jTableListaJogadores.setModel(modeloTable);
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
                jogadores.remove(i);
                JOptionPane.showMessageDialog(this, "Atleta removido","Remover", ICONIFIED);
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
        mostraTable();
    }
}


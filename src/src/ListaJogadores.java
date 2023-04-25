package src;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import visao.ListarJogadores;

public class ListaJogadores extends ListarJogadores{
    
    private ArrayList<Atleta> atletas = new ArrayList<>();
         
    public void setAtletas(ArrayList<Atleta> atletas){
        this.atletas = atletas;
    }
    
    @Override
    public void mostraTable() {
     /*   for(Atleta atleta: atletas){
            atleta.getNome();
        }*/
   
      /*  DefaultTableModel modeloTable = new DefaultTableModel();

        modeloTable.addColumn("Nome");
        modeloTable.addColumn("Idade");
        modeloTable.addColumn("Altura");
        modeloTable.addColumn("Posição");
        modeloTable.addColumn("Melhor Perna");

        if(this.atletas.isEmpty()){
           modeloTable.addRow(new String[] {"sem informações", "sem informações"});
       }
       else{
            for (Atleta atleta : atletas){
   
                modeloTable.addRow(new String[] {
                    atleta.getNome(),
                    atleta.getIdade(),
                    atleta.getAltura(),
                    atleta.getPosicao(),
                    atleta.getMelhorPerna()});
           }
       jTableListaJogadores.setModel(modeloTable);
       }*/
   }
}


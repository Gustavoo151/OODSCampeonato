package src;

import javax.swing.JOptionPane;
import visao.TelaCadastroTimes;

public class Cadastro extends TelaCadastroTimes{

    Atleta atleta;
    Tecnico tecnico;
    Time time;
    Campeonato campeonato = new Campeonato();
    
   // gerenciadorCadastro geranciarCadastro = new gerenciadorCadastro();

    @Override
    public void criarTime() {
               
        if (!jTextNomeTime.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Time Criado.");

            this.time = new Time();
            this.time.setNome(jTextNomeTime.getText());
            
            jButtonCriarTime.setEnabled(false);
            jButtonAdicionarTecnico.setEnabled(true);
            jTextNomeTime.setEditable(false);
        }
        else
            JOptionPane.showMessageDialog(this, "Preencha o campo!");
     }

    @Override
    public void salvarAtleta() {
        
           if(!jTextNomeJogador.getText().isEmpty() && 
                !jTextIdadeJogador.getText().isEmpty() &&
                !jTextPosicaoJogador.getText().isEmpty() &&
                !jTextAlturaJogador.getText().isEmpty() &&
                !jTextMelhorPe.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Atleta cadastrado.");
            
            this.atleta = new Atleta();
            this.atleta.setNome(jTextNomeJogador.getText());
            this.atleta.setAltura(jTextAlturaJogador.getText());
            this.atleta.setIdade(jTextIdadeJogador.getText());
            this.atleta.setPosicao(jTextPosicaoJogador.getText());
            this.atleta.setMelhorPerna(jTextMelhorPe.getText());
            this.time.setAtleta(this.atleta);
            
            System.out.println(this.atleta.getNome());
            
            this.time.setAtleta(this.atleta);
            
            limparCamposAtleta();
 
            jButtonAdicionarTime.setEnabled(true);
        }
        else
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
    }

    public void limparCamposAtleta(){
        jTextNomeJogador.setText("");
        jTextIdadeJogador.setText("");
        jTextAlturaJogador.setText("");
        jTextMelhorPe.setText("");
        jTextPosicaoJogador.setText("");
    }
    
    public void limparCamposTecnicoETime(){
        limparCamposAtleta();
        jTextNomeTecnico.setText("");
        jTextNomeTime.setText("");
        jTextEstiloTecnico.setText("");
        jTextAlturaTecnico.setText("");
        jTextIdadeTecnico.setText("");
    }
    
    
    public void acessiblidadeDosCampos(boolean estado){
        jTextNomeTecnico.setEditable(estado);
        jTextIdadeTecnico.setEditable(estado);
        jTextEstiloTecnico.setEditable(estado);
        jTextAlturaTecnico.setEditable(estado);
    }
    
    @Override
    public void salvarTecnico() {
        
        if(!jTextIdadeTecnico.getText().isEmpty() &&
                !jTextNomeTecnico.getText().isEmpty() &&
                !jTextAlturaTecnico.getText().isEmpty() &&
                !jTextEstiloTecnico.getText().isEmpty())
        {   
            JOptionPane.showMessageDialog(this, "Técnico adicionado.");
            
            this.tecnico = new Tecnico();
            this.tecnico.setNome(jTextNomeTecnico.getText());
            this.tecnico.setAltura(jTextAlturaTecnico.getText());
            this.tecnico.setIdade(jTextIdadeTecnico.getText());
            this.tecnico.setEstiloTatico(jTextEstiloTecnico.getText());
      
            jButtonAdicionarTecnico.setEnabled(false);
            jButtonAdicionarJogador.setEnabled(true);
            
            acessiblidadeDosCampos(false);  
        }
        else
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
    }

    @Override
    public void salvarTime() {
        this.time.setTecnico(this.tecnico);
        this.campeonato.setTimes(this.time);
        
        limparCamposTecnicoETime();
        acessiblidadeDosCampos(true);
        limparCamposAtleta();
        jButtonAdicionarJogador.setEnabled(false);
        jButtonCriarTime.setEnabled(true);
        jButtonAdicionarTime.setEnabled(false);
        jTextNomeTime.setEditable(true);
    } 

    @Override
    public void telaListaTime() {
        this.dispose();
        ListarTimes listarTimes = new ListarTimes();
        listarTimes.setVisible(true);
        listarTimes.setTela(this);
        listarTimes.setTimes(this.campeonato.getTimes());
        listarTimes.mostrarTimes();
    }

    @Override
    public void confgBottons() {
        jButtonAdicionarTecnico.setEnabled(false);
        jButtonAdicionarTime.setEnabled(false);
        jButtonAdicionarJogador.setEnabled(false);
    }
}

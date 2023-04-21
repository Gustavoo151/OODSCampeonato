package src;

import static java.awt.Frame.ICONIFIED;
import javax.swing.JOptionPane;
import visao.TelaInicio;

public class TelaPrincipal  extends TelaInicio{

    public TelaPrincipal(){
        this.setVisible(true);
    }
    
    @Override
    public void sobre() {
        JOptionPane.showMessageDialog(this, "\tProjeto desenvolvido para disciplina de Orientação a \n"
                + "Objetos no Desenvolvimento de Software.\n\n"
                + " \tEsse projeto foi desenvolvido para simular um sistema\n"
                + " de cadastro de times em um campeonato de futebol, usando \n"
                + "conceitos de orientação a objetos com java.", "Sobre", ICONIFIED);
    }

    @Override
    public void telaCadastro() {
        this.dispose();
        Cadastro telaCadastro = new Cadastro();
        telaCadastro.setVisible(true);
    }
    
    
}

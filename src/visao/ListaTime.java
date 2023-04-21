package visao;
import src.Campeonato;
import java.util.ArrayList;
import src.Time;

public class ListaTime extends javax.swing.JFrame {

    private TelaCadastroTimes telaCadastro;
    private Campeonato campeonato;
    
    public ListaTime() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVoltaTelaCastro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Times");
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonVoltaTelaCastro.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jButtonVoltaTelaCastro.setText("Voltar");
        jButtonVoltaTelaCastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltaTelaCastroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltaTelaCastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 500, -1, -1));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel1.setText("Times cadastrados");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void setTelaCastro(TelaCadastroTimes telaCadastro){
        this.telaCadastro = telaCadastro;
    }
    
    private void jButtonVoltaTelaCastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltaTelaCastroActionPerformed
        telaCadastro.setVisible(true);
        this.dispose();
                
    }//GEN-LAST:event_jButtonVoltaTelaCastroActionPerformed

    public void setCampeonato(Campeonato campeonato){
        this.campeonato = campeonato;
    }
    
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVoltaTelaCastro;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

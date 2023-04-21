package visao;

public class ListarJogadores extends javax.swing.JFrame {

    public ListarJogadores() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonRemoverJogador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de jogadores");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName("frameListarJogadores"); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel1.setText("Jogadores");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 90, -1));

        jButtonRemoverJogador.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jButtonRemoverJogador.setText("Voltar");
        jButtonRemoverJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverJogadorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRemoverJogador, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRemoverJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverJogadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRemoverJogadorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRemoverJogador;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

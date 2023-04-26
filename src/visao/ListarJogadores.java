package visao;

abstract public class ListarJogadores extends javax.swing.JFrame {

    abstract public void mostraTable();
    
    public ListarJogadores() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonRemoverJogador = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListaJogadores = new javax.swing.JTable();
        jButtonRemverJog = new javax.swing.JButton();
        jTextFieldNomeJog = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de jogadores");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName("frameListarJogadores"); // NOI18N
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
        getContentPane().add(jButtonRemoverJogador, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, -1, -1));

        jTableListaJogadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableListaJogadores);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jButtonRemverJog.setText("Remover");
        jButtonRemverJog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemverJogActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRemverJog, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, -1, -1));

        jTextFieldNomeJog.setText("Nome Jogador");
        getContentPane().add(jTextFieldNomeJog, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 170, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRemoverJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverJogadorActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonRemoverJogadorActionPerformed

    private void jButtonRemverJogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemverJogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRemverJogActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRemoverJogador;
    private javax.swing.JButton jButtonRemverJog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTableListaJogadores;
    private javax.swing.JTextField jTextFieldNomeJog;
    // End of variables declaration//GEN-END:variables
}

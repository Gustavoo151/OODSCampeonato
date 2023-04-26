package visao;

abstract public class ListarJogadores extends javax.swing.JFrame {

    abstract public void mostraTable();
    abstract public void TelaListarTimes();
    abstract public void removerJogador();
    abstract public void removerTextJfildRemoverJog();
    abstract public void atualizarTabela();
    
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
        jButtonAtualizar = new javax.swing.JButton();

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
        getContentPane().add(jButtonRemoverJogador, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, -1, -1));

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

        jTextFieldNomeJog.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jTextFieldNomeJog.setText("Nome Jogador");
        jTextFieldNomeJog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldNomeJogMouseClicked(evt);
            }
        });
        getContentPane().add(jTextFieldNomeJog, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 170, -1));

        jButtonAtualizar.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRemoverJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverJogadorActionPerformed
        TelaListarTimes();
    }//GEN-LAST:event_jButtonRemoverJogadorActionPerformed

    private void jButtonRemverJogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemverJogActionPerformed
        removerJogador();
    }//GEN-LAST:event_jButtonRemverJogActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        atualizarTabela();
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jTextFieldNomeJogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldNomeJogMouseClicked
        removerTextJfildRemoverJog();
    }//GEN-LAST:event_jTextFieldNomeJogMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonRemoverJogador;
    public javax.swing.JButton jButtonRemverJog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTableListaJogadores;
    public javax.swing.JTextField jTextFieldNomeJog;
    // End of variables declaration//GEN-END:variables
}

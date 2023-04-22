package visao;

abstract public class ListaTime extends javax.swing.JFrame {

    abstract public void telaCadastro();
    abstract public void configModelo();
    abstract public void removerTime();   
    abstract public void setTextoBarraPesquisarJog();
    abstract public void removerTextoBarraPesquisarJog();
    abstract public void setTextoBarraPequisarTime();
    abstract public void removerTextoBarraPesquisaTime();
    
    public ListaTime() {
        initComponents();
    }   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVoltaTelaCastro = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListaTimes = new javax.swing.JTable();
        jButtonVerJogadores = new javax.swing.JButton();
        jTextPesquisaTimesJogadores = new javax.swing.JTextField();
        jTextRemoverTime = new javax.swing.JTextField();
        jButtonRemoverTime = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();

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
        getContentPane().add(jButtonVoltaTelaCastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 490, -1, -1));

        jLabelTitulo.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabelTitulo.setText("Times cadastrados");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        jTableListaTimes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Time", "Técnico"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableListaTimes.setMinimumSize(new java.awt.Dimension(45, 80));
        jTableListaTimes.setName(""); // NOI18N
        jTableListaTimes.setShowGrid(false);
        jScrollPane1.setViewportView(jTableListaTimes);
        if (jTableListaTimes.getColumnModel().getColumnCount() > 0) {
            jTableListaTimes.getColumnModel().getColumn(0).setResizable(false);
            jTableListaTimes.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 340, -1));

        jButtonVerJogadores.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jButtonVerJogadores.setText("Ver Jogadores");
        jButtonVerJogadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerJogadoresActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVerJogadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 130, 30));

        jTextPesquisaTimesJogadores.setText("Nome do Time");
        jTextPesquisaTimesJogadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextPesquisaTimesJogadoresMouseClicked(evt);
            }
        });
        jTextPesquisaTimesJogadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisaTime(evt);
            }
        });
        getContentPane().add(jTextPesquisaTimesJogadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 200, 30));

        jTextRemoverTime.setText("Nome do Time");
        jTextRemoverTime.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextRemoverTimeMouseClicked(evt);
            }
        });
        jTextRemoverTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRemoverTimeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextRemoverTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 200, 30));

        jButtonRemoverTime.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jButtonRemoverTime.setText("Remover");
        jButtonRemoverTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverTimeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRemoverTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 130, 30));

        jButtonAtualizar.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jButtonVoltaTelaCastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltaTelaCastroActionPerformed
        telaCadastro();          
    }//GEN-LAST:event_jButtonVoltaTelaCastroActionPerformed

    private void jButtonVerJogadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerJogadoresActionPerformed
        setTextoBarraPesquisarJog();
    }//GEN-LAST:event_jButtonVerJogadoresActionPerformed

    private void jTextFieldPesquisaTime(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaTime
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisaTime

    private void jTextPesquisaTimesJogadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextPesquisaTimesJogadoresMouseClicked
        removerTextoBarraPesquisarJog();
    }//GEN-LAST:event_jTextPesquisaTimesJogadoresMouseClicked

    private void jTextRemoverTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRemoverTimeActionPerformed
 
    }//GEN-LAST:event_jTextRemoverTimeActionPerformed

    private void jButtonRemoverTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverTimeActionPerformed
        removerTime();
        setTextoBarraPequisarTime();
    }//GEN-LAST:event_jButtonRemoverTimeActionPerformed

    private void jTextRemoverTimeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextRemoverTimeMouseClicked
        removerTextoBarraPesquisaTime();
    }//GEN-LAST:event_jTextRemoverTimeMouseClicked

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAtualizarActionPerformed
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonRemoverTime;
    private javax.swing.JButton jButtonVerJogadores;
    private javax.swing.JButton jButtonVoltaTelaCastro;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTableListaTimes;
    public javax.swing.JTextField jTextPesquisaTimesJogadores;
    public javax.swing.JTextField jTextRemoverTime;
    // End of variables declaration//GEN-END:variables
}

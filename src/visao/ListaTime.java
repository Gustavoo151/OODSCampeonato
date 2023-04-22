package visao;

abstract public class ListaTime extends javax.swing.JFrame {

    abstract public void times(); 
    abstract public void telaCadastro();
    abstract public void configModelo();
       
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
        jTextPesquisaTimes = new javax.swing.JTextField();

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 340, -1));

        jButtonVerJogadores.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jButtonVerJogadores.setText("Ver Jogadores");
        jButtonVerJogadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerJogadoresActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVerJogadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, -1, -1));

        jTextPesquisaTimes.setText("Nome do Time");
        jTextPesquisaTimes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextPesquisaTimesMouseClicked(evt);
            }
        });
        jTextPesquisaTimes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisaTime(evt);
            }
        });
        getContentPane().add(jTextPesquisaTimes, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 200, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jButtonVoltaTelaCastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltaTelaCastroActionPerformed
        telaCadastro();          
    }//GEN-LAST:event_jButtonVoltaTelaCastroActionPerformed

    private void jButtonVerJogadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerJogadoresActionPerformed
        
    }//GEN-LAST:event_jButtonVerJogadoresActionPerformed

    private void jTextFieldPesquisaTime(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaTime
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisaTime

    private void jTextPesquisaTimesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextPesquisaTimesMouseClicked
        jTextPesquisaTimes.setText("");
    }//GEN-LAST:event_jTextPesquisaTimesMouseClicked
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVerJogadores;
    private javax.swing.JButton jButtonVoltaTelaCastro;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTableListaTimes;
    private javax.swing.JTextField jTextPesquisaTimes;
    // End of variables declaration//GEN-END:variables
}

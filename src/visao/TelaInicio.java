package visao;

abstract public class TelaInicio extends javax.swing.JFrame {
    
    public TelaInicio(){
        initComponents();
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        sobreButton = new javax.swing.JButton();
        addTimeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Campeoanato");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        jLabel1.setText("Champ Manager");
        jDesktopPane2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 350, 120));

        sobreButton.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        sobreButton.setMnemonic('S');
        sobreButton.setText("Sobre");
        sobreButton.setMaximumSize(new java.awt.Dimension(800, 600));
        sobreButton.setMinimumSize(new java.awt.Dimension(800, 600));
        sobreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobreButtonActionPerformed(evt);
            }
        });
        jDesktopPane2.add(sobreButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 183, 52));

        addTimeButton.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        addTimeButton.setMnemonic('A');
        addTimeButton.setText("Iniciar Cadastro");
        addTimeButton.setMaximumSize(new java.awt.Dimension(30, 30));
        addTimeButton.setMinimumSize(new java.awt.Dimension(30, 30));
        addTimeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTimeButtonActionPerformed(evt);
            }
        });
        jDesktopPane2.add(addTimeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 183, 52));

        getContentPane().add(jDesktopPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    abstract public void sobre();
    abstract public void telaCadastro();
    
    private void addTimeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTimeButtonActionPerformed
        telaCadastro();
    }//GEN-LAST:event_addTimeButtonActionPerformed

    private void sobreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobreButtonActionPerformed
        sobre();
    }//GEN-LAST:event_sobreButtonActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTimeButton;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JButton sobreButton;
    // End of variables declaration//GEN-END:variables
}

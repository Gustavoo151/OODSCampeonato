package visao;

abstract public class ListaTime extends javax.swing.JFrame {

    abstract public void times(); 
    abstract public void telaCadastro();
    
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
  
 /*   public void teste(){
        jListTimes = new javax.swing.JList<>();
        jListTimes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListTimes);
    }*/
    
    
    private void jButtonVoltaTelaCastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltaTelaCastroActionPerformed
        telaCadastro();          
    }//GEN-LAST:event_jButtonVoltaTelaCastroActionPerformed
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVoltaTelaCastro;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

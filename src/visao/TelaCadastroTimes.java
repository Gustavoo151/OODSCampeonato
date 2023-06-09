package visao;

/**
 *
 * @author joseg
 */
abstract public class TelaCadastroTimes extends javax.swing.JFrame {
    
    /**
     *
     */
    public TelaCadastroTimes() {
        initComponents();
        confgBottons();

    }
   
    /**
     *
     */
    abstract public void salvarTecnico();

    /**
     *
     */
    abstract public void salvarAtleta();

    /**
     *
     */
    abstract public void criarTime();

    /**
     *
     */
    abstract public void salvarTime();

    /**
     *
     */
    abstract public void telaListaTime();

    /**
     *
     */
    abstract public void confgBottons();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbTitulo = new javax.swing.JLabel();
        jlbNomeTime = new javax.swing.JLabel();
        jTextNomeTime = new javax.swing.JTextField();
        jlbTecnico = new javax.swing.JLabel();
        jlbNomeTecnico = new javax.swing.JLabel();
        jTextNomeTecnico = new javax.swing.JTextField();
        jlbIdadeTecnico = new javax.swing.JLabel();
        jTextIdadeTecnico = new javax.swing.JTextField();
        jlbAlturaTecnico = new javax.swing.JLabel();
        jTextAlturaTecnico = new javax.swing.JTextField();
        jlbEstilo = new javax.swing.JLabel();
        jTextEstiloTecnico = new javax.swing.JTextField();
        jlbJogador = new javax.swing.JLabel();
        jTextNomeJogador = new javax.swing.JTextField();
        jlbNomeJogador = new javax.swing.JLabel();
        jButtonAdicionarJogador = new javax.swing.JButton();
        jlbIdadeJoegador = new javax.swing.JLabel();
        jTextIdadeJogador = new javax.swing.JTextField();
        jlbPosicaoJogador = new javax.swing.JLabel();
        jTextPosicaoJogador = new javax.swing.JTextField();
        jlbAltura = new javax.swing.JLabel();
        jTextAlturaJogador = new javax.swing.JTextField();
        jlbMelhorPerna = new javax.swing.JLabel();
        jTextMelhorPe = new javax.swing.JTextField();
        jButtonListarCadastros = new javax.swing.JButton();
        jButtonAdicionarTime = new javax.swing.JButton();
        jButtonAdicionarTecnico = new javax.swing.JButton();
        jButtonCriarTime = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Time");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName("Cadastro Time"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbTitulo.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jlbTitulo.setText("Cadastro Time");
        getContentPane().add(jlbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 260, -1));

        jlbNomeTime.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jlbNomeTime.setText("Nome time:");
        getContentPane().add(jlbNomeTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 100, 20));

        jTextNomeTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNomeTimeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextNomeTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 68, 270, -1));

        jlbTecnico.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jlbTecnico.setText("Técnico:");
        getContentPane().add(jlbTecnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        jlbNomeTecnico.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jlbNomeTecnico.setText("Nome:");
        getContentPane().add(jlbNomeTecnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        jTextNomeTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNomeTecnicoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextNomeTecnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 130, 270, -1));

        jlbIdadeTecnico.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jlbIdadeTecnico.setText("Idade:");
        getContentPane().add(jlbIdadeTecnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));
        getContentPane().add(jTextIdadeTecnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 160, 270, -1));

        jlbAlturaTecnico.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jlbAlturaTecnico.setText("Altura:");
        getContentPane().add(jlbAlturaTecnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 191, -1, -1));
        getContentPane().add(jTextAlturaTecnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 270, -1));

        jlbEstilo.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jlbEstilo.setText("Estilo:");
        getContentPane().add(jlbEstilo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 60, -1));

        jTextEstiloTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEstiloTecnicoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextEstiloTecnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 270, -1));

        jlbJogador.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jlbJogador.setText("Jogador:");
        getContentPane().add(jlbJogador, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));
        getContentPane().add(jTextNomeJogador, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 310, 270, -1));

        jlbNomeJogador.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jlbNomeJogador.setText("Nome:");
        getContentPane().add(jlbNomeJogador, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 311, -1, -1));

        jButtonAdicionarJogador.setText("Add Jogador");
        jButtonAdicionarJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarJogadorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAdicionarJogador, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 370, -1, -1));

        jlbIdadeJoegador.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jlbIdadeJoegador.setText("Idade:");
        getContentPane().add(jlbIdadeJoegador, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 341, -1, -1));

        jTextIdadeJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdadeJogadorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextIdadeJogador, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 340, 270, -1));

        jlbPosicaoJogador.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jlbPosicaoJogador.setText("Posição:");
        getContentPane().add(jlbPosicaoJogador, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 371, -1, -1));

        jTextPosicaoJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPosicaoJogadorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextPosicaoJogador, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 370, 270, -1));

        jlbAltura.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jlbAltura.setText("Altura:");
        getContentPane().add(jlbAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 401, -1, -1));

        jTextAlturaJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextAlturaJogadorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextAlturaJogador, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 270, -1));

        jlbMelhorPerna.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jlbMelhorPerna.setText("Melhor Pé:");
        getContentPane().add(jlbMelhorPerna, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 431, 90, -1));
        getContentPane().add(jTextMelhorPe, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 270, -1));

        jButtonListarCadastros.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jButtonListarCadastros.setText("Listar Cadastros");
        jButtonListarCadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarCadastrosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonListarCadastros, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 500, -1, -1));

        jButtonAdicionarTime.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jButtonAdicionarTime.setText("Adicionar Time");
        jButtonAdicionarTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarTimeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAdicionarTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, -1, -1));

        jButtonAdicionarTecnico.setText("Add Técnico");
        jButtonAdicionarTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarTecnicoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAdicionarTecnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 130, -1));

        jButtonCriarTime.setText("Criar Time");
        jButtonCriarTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCriarTimeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCriarTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 67, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNomeTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNomeTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNomeTimeActionPerformed

    private void jTextNomeTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNomeTecnicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNomeTecnicoActionPerformed

    private void jTextEstiloTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEstiloTecnicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEstiloTecnicoActionPerformed

    private void jTextIdadeJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIdadeJogadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIdadeJogadorActionPerformed

    private void jTextPosicaoJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPosicaoJogadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPosicaoJogadorActionPerformed

    private void jTextAlturaJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextAlturaJogadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAlturaJogadorActionPerformed

    
    private void jButtonAdicionarJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarJogadorActionPerformed
        salvarAtleta();
    }//GEN-LAST:event_jButtonAdicionarJogadorActionPerformed

    private void jButtonListarCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarCadastrosActionPerformed
        telaListaTime();
    }//GEN-LAST:event_jButtonListarCadastrosActionPerformed

    private void jButtonAdicionarTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarTimeActionPerformed
        salvarTime();
    }//GEN-LAST:event_jButtonAdicionarTimeActionPerformed

    private void jButtonAdicionarTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarTecnicoActionPerformed
        salvarTecnico();
    }//GEN-LAST:event_jButtonAdicionarTecnicoActionPerformed

    private void jButtonCriarTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCriarTimeActionPerformed
        criarTime();
    }//GEN-LAST:event_jButtonCriarTimeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonAdicionarJogador;
    public javax.swing.JButton jButtonAdicionarTecnico;
    public javax.swing.JButton jButtonAdicionarTime;
    public javax.swing.JButton jButtonCriarTime;
    public javax.swing.JButton jButtonListarCadastros;
    public javax.swing.JTextField jTextAlturaJogador;
    public javax.swing.JTextField jTextAlturaTecnico;
    public javax.swing.JTextField jTextEstiloTecnico;
    public javax.swing.JTextField jTextIdadeJogador;
    public javax.swing.JTextField jTextIdadeTecnico;
    public javax.swing.JTextField jTextMelhorPe;
    public javax.swing.JTextField jTextNomeJogador;
    public javax.swing.JTextField jTextNomeTecnico;
    public javax.swing.JTextField jTextNomeTime;
    public javax.swing.JTextField jTextPosicaoJogador;
    private javax.swing.JLabel jlbAltura;
    private javax.swing.JLabel jlbAlturaTecnico;
    private javax.swing.JLabel jlbEstilo;
    private javax.swing.JLabel jlbIdadeJoegador;
    private javax.swing.JLabel jlbIdadeTecnico;
    private javax.swing.JLabel jlbJogador;
    private javax.swing.JLabel jlbMelhorPerna;
    private javax.swing.JLabel jlbNomeJogador;
    private javax.swing.JLabel jlbNomeTecnico;
    private javax.swing.JLabel jlbNomeTime;
    private javax.swing.JLabel jlbPosicaoJogador;
    private javax.swing.JLabel jlbTecnico;
    private javax.swing.JLabel jlbTitulo;
    // End of variables declaration//GEN-END:variables
}

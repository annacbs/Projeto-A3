/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package locadora.locadoraapp;

import javax.swing.JOptionPane;

/**
 *
 * @author rodrigo
 */
public class CadastroTela extends javax.swing.JFrame {

    /**
     * Creates new form CursosTela
     */
    public CadastroTela() {
        super("Locadora");
        initComponents();
        this.setLocationRelativeTo(null);//centraliza
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        generosFilme2ComboBox = new javax.swing.JComboBox<>();
        emailUsuarioTextField = new javax.swing.JTextField();
        voltarButton = new javax.swing.JButton();
        concluirButton = new javax.swing.JButton();
        RepitaSenha = new javax.swing.JPasswordField();
        Senha = new javax.swing.JPasswordField();
        nomeUsuarioTextField = new javax.swing.JTextField();
        generosFilme1ComboBox = new javax.swing.JComboBox<>();
        idadeUsuarioSpinner = new javax.swing.JSpinner();
        generoUsuarioComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(540, 714));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(60, 27, 134));
        jPanel1.setLayout(null);

        generosFilme2ComboBox.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        generosFilme2ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um segundo gênero de filme favorito", "Romance", "Comédia", "Terror", "Suspense", "Ação" }));
        generosFilme2ComboBox.setBorder(null);
        generosFilme2ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generosFilme2ComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(generosFilme2ComboBox);
        generosFilme2ComboBox.setBounds(50, 350, 330, 35);

        emailUsuarioTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        emailUsuarioTextField.setName(""); // NOI18N
        emailUsuarioTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailUsuarioTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(emailUsuarioTextField);
        emailUsuarioTextField.setBounds(180, 420, 340, 35);
        emailUsuarioTextField.getAccessibleContext().setAccessibleName("Nome");

        voltarButton.setText("Voltar");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(voltarButton);
        voltarButton.setBounds(60, 590, 170, 50);

        concluirButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        concluirButton.setText("Concluir Cadastro");
        concluirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concluirButtonActionPerformed(evt);
            }
        });
        jPanel1.add(concluirButton);
        concluirButton.setBounds(330, 590, 190, 50);
        concluirButton.getAccessibleContext().setAccessibleName("concluir");

        RepitaSenha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RepitaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RepitaSenhaActionPerformed(evt);
            }
        });
        jPanel1.add(RepitaSenha);
        RepitaSenha.setBounds(180, 520, 340, 35);

        Senha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenhaActionPerformed(evt);
            }
        });
        jPanel1.add(Senha);
        Senha.setBounds(180, 470, 340, 35);

        nomeUsuarioTextField.setToolTipText("");
        nomeUsuarioTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nomeUsuarioTextField.setName(""); // NOI18N
        nomeUsuarioTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeUsuarioTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(nomeUsuarioTextField);
        nomeUsuarioTextField.setBounds(40, 140, 461, 35);

        generosFilme1ComboBox.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        generosFilme1ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione seu gênero de filme favorito", "Romance", "Comédia", "Terror", "Suspense", "Ação" }));
        generosFilme1ComboBox.setBorder(null);
        generosFilme1ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generosFilme1ComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(generosFilme1ComboBox);
        generosFilme1ComboBox.setBounds(50, 300, 330, 35);

        idadeUsuarioSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 120, 1));
        idadeUsuarioSpinner.setToolTipText("");
        idadeUsuarioSpinner.setBorder(null);
        jPanel1.add(idadeUsuarioSpinner);
        idadeUsuarioSpinner.setBounds(130, 200, 111, 35);

        generoUsuarioComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Masculino", "Feminino", "Masculino(trans)", "Feminino(trans)", "Não-Binário", "Prefiro não responder" }));
        generoUsuarioComboBox.setBorder(null);
        generoUsuarioComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generoUsuarioComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(generoUsuarioComboBox);
        generoUsuarioComboBox.setBounds(352, 200, 150, 35);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastrar Usuário");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 50, 340, 20);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Gêneros preferidos:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 260, 160, 30);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 110, 37, 20);

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Confirmar Senha");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 530, 110, 20);

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gênero");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(290, 210, 60, 20);

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Idade");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 210, 34, 20);

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("E-mail");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(60, 430, 60, 20);

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Senha");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(60, 480, 60, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Aviso", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            LoginTela lt = new LoginTela();
            lt.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void concluirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concluirButtonActionPerformed
        String nome = nomeUsuarioTextField.getText();
        String generoUsuario = generoUsuarioComboBox.getSelectedItem().toString();
        int idade = Integer.parseInt(idadeUsuarioSpinner.getValue().toString());
        String generoFilmeFavorito1 = generosFilme1ComboBox.getSelectedItem().toString();
        String generoFilmeFavorito2 = generosFilme2ComboBox.getSelectedItem().toString();
        String email = emailUsuarioTextField.getText();
        String senha = new String(Senha.getPassword());
        String repitaSenha = new String(RepitaSenha.getPassword());

        if (generoFilmeFavorito2.equals("Selecione um segundo gênero de filme favorito")) {
            generoFilmeFavorito2 = null;
        }

        var usuario = new Usuario(nome, generoUsuario, idade, email, senha, generoFilmeFavorito1, generoFilmeFavorito2);
        var dao = new DAO();

        if (nome.isEmpty() || nome.isBlank() || email.isEmpty() || email.isBlank() || senha.isEmpty() || senha.isBlank()) {
            JOptionPane.showMessageDialog(null, "Os campos Nome, Email e Senha não podem estar vazios");
        } else if (generoFilmeFavorito1.equals(generoFilmeFavorito2)) {
            JOptionPane.showMessageDialog(null, "Os campos de gênero de filme favoritos não podem ser iguais");
        } else {
            if (senha.equals(repitaSenha)) {
                try {
                    dao.cadastrarUsuario(usuario);
                    JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
                    AdmTela at = new AdmTela();
                    at.setVisible(true);
                    dispose();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro");
                    e.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(null, "As senhas não batem");
            }
        }
    }//GEN-LAST:event_concluirButtonActionPerformed

    private void generosFilme2ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generosFilme2ComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generosFilme2ComboBoxActionPerformed

    private void emailUsuarioTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailUsuarioTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailUsuarioTextFieldActionPerformed

    private void RepitaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RepitaSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RepitaSenhaActionPerformed

    private void SenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SenhaActionPerformed

    private void nomeUsuarioTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeUsuarioTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeUsuarioTextFieldActionPerformed

    private void generosFilme1ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generosFilme1ComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generosFilme1ComboBoxActionPerformed

    private void generoUsuarioComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generoUsuarioComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generoUsuarioComboBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField RepitaSenha;
    private javax.swing.JPasswordField Senha;
    private javax.swing.JButton concluirButton;
    private javax.swing.JTextField emailUsuarioTextField;
    private javax.swing.JComboBox<String> generoUsuarioComboBox;
    private javax.swing.JComboBox<String> generosFilme1ComboBox;
    private javax.swing.JComboBox<String> generosFilme2ComboBox;
    private javax.swing.JSpinner idadeUsuarioSpinner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nomeUsuarioTextField;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}

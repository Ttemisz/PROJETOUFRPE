/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author Temis juninho
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CaixaUsuario = new javax.swing.JTextField();
        CaixaSenha = new javax.swing.JPasswordField();
        BotaoLogin = new javax.swing.JButton();
        BotaoPRegistro = new javax.swing.JButton();
        SenhaText = new javax.swing.JLabel();
        UsuarioText = new javax.swing.JLabel();
        TexladeLoginText = new javax.swing.JLabel();
        ImagemTelaLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CaixaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaixaUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(CaixaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 170, 30));

        CaixaSenha.setText("jPasswordField1");
        getContentPane().add(CaixaSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 170, 30));

        BotaoLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BotaoLogin.setText("Entrar");
        BotaoLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLoginActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 100, -1));

        BotaoPRegistro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BotaoPRegistro.setText("Cadastrar");
        getContentPane().add(BotaoPRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 100, -1));

        SenhaText.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        SenhaText.setForeground(new java.awt.Color(255, 255, 255));
        SenhaText.setText("Senha");
        getContentPane().add(SenhaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        UsuarioText.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        UsuarioText.setForeground(new java.awt.Color(255, 255, 255));
        UsuarioText.setText("Usuario");
        getContentPane().add(UsuarioText, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        TexladeLoginText.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        TexladeLoginText.setForeground(new java.awt.Color(255, 255, 255));
        TexladeLoginText.setText("TELA DE LOGIN");
        getContentPane().add(TexladeLoginText, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 130, 20));

        ImagemTelaLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dados/TheWitcherTelaLogin.jpeg"))); // NOI18N
        ImagemTelaLogin.setToolTipText("");
        getContentPane().add(ImagemTelaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 730, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CaixaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaixaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CaixaUsuarioActionPerformed

    private void BotaoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoLoginActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoLogin;
    private javax.swing.JButton BotaoPRegistro;
    private javax.swing.JPasswordField CaixaSenha;
    private javax.swing.JTextField CaixaUsuario;
    private javax.swing.JLabel ImagemTelaLogin;
    private javax.swing.JLabel SenhaText;
    private javax.swing.JLabel TexladeLoginText;
    private javax.swing.JLabel UsuarioText;
    // End of variables declaration//GEN-END:variables
}
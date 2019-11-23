/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Dimension;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author 93580843087
 */
public class Login extends javax.swing.JInternalFrame {
    
    private String perfil;
    private String usuario;
    private String senha;

    /**
     * Creates new form login
     */
    public Login() {
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

        rbg_acessar = new javax.swing.ButtonGroup();
        logo_IF = new javax.swing.JLabel();
        l_senha = new javax.swing.JLabel();
        l_usuario = new javax.swing.JLabel();
        input_usuario = new javax.swing.JTextField();
        input_senha = new javax.swing.JPasswordField();
        btn_logar = new javax.swing.JButton();
        l_acessar = new javax.swing.JLabel();
        rb_aluno = new javax.swing.JRadioButton();
        rb_professor = new javax.swing.JRadioButton();

        setTitle("Login");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icone_if@2x.png"))); // NOI18N
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        logo_IF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo-instituto.png"))); // NOI18N

        l_senha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l_senha.setForeground(new java.awt.Color(102, 102, 102));
        l_senha.setText("Senha:");

        l_usuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l_usuario.setForeground(new java.awt.Color(102, 102, 102));
        l_usuario.setText("Usuário:");

        btn_logar.setText("Logar");
        btn_logar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logarActionPerformed(evt);
            }
        });

        l_acessar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l_acessar.setForeground(new java.awt.Color(102, 102, 102));
        l_acessar.setText("Acessar como:");

        rbg_acessar.add(rb_aluno);
        rb_aluno.setForeground(new java.awt.Color(102, 102, 102));
        rb_aluno.setText("Aluno(a)");

        rbg_acessar.add(rb_professor);
        rb_professor.setForeground(new java.awt.Color(102, 102, 102));
        rb_professor.setText("Professor(a)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logo_IF))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(l_usuario)
                                            .addComponent(l_senha))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(input_usuario)
                                            .addComponent(input_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(btn_logar)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l_acessar)
                                .addGap(18, 18, 18)
                                .addComponent(rb_aluno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb_professor)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo_IF)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_aluno)
                    .addComponent(rb_professor)
                    .addComponent(l_acessar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_usuario)
                    .addComponent(input_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_senha)
                    .addComponent(input_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_logar)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logarActionPerformed
        // 
        if (
            !rb_aluno.isSelected() && !rb_professor.isSelected() || 
            input_usuario.getText() == null || input_usuario.getText().trim().isEmpty() ||
            input_senha.getPassword().length == 0) { // Emite alerta caso haja algum campo em branco
            JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos!", "Erro", JOptionPane.ERROR_MESSAGE);
        } else { // Continua validação para o login
            
            if (rb_aluno.isSelected()) {
                perfil = "Aluno";
            } else if (rb_professor.isSelected()) {
                perfil = "Professor";
            }
            
            usuario = input_usuario.getText();
            senha = String.valueOf(input_senha.getPassword());
            
            if (perfil.equals("Aluno") && usuario.equals("admin") && senha.equals("admin")) {
                JOptionPane.showMessageDialog(this, "Logado com sucesso no perfil " + perfil, "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            } else if (perfil.equals("Professor") && usuario.equals("1234") && senha.equals("1234")) {
                JOptionPane.showMessageDialog(this, "Logado com sucesso no perfil " + perfil, "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Usuário ou senha incorreta!", "Erro!", JOptionPane.ERROR_MESSAGE);
            }       
            
        }
                
    }//GEN-LAST:event_btn_logarActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        PainelPrincipal.closeLogin(this.perfil, this.usuario, this.senha);
    }//GEN-LAST:event_formInternalFrameClosed

    /**
     * Método para centralizar JInternalFrame na classe principal
     */
    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_logar;
    private javax.swing.JPasswordField input_senha;
    private javax.swing.JTextField input_usuario;
    private javax.swing.JLabel l_acessar;
    private javax.swing.JLabel l_senha;
    private javax.swing.JLabel l_usuario;
    private javax.swing.JLabel logo_IF;
    private javax.swing.JRadioButton rb_aluno;
    private javax.swing.JRadioButton rb_professor;
    private javax.swing.ButtonGroup rbg_acessar;
    // End of variables declaration//GEN-END:variables
}

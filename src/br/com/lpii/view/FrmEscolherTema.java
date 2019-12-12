/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lpii.view;

import br.com.lpii.dao.ProfessorDAO;
import br.com.lpii.dao.PropostaDAO;
import br.com.lpii.model.Aluno;
import br.com.lpii.model.Professor;
import br.com.lpii.model.Proposta;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alexandre Lima
 */
public class FrmEscolherTema extends javax.swing.JFrame {

    private Aluno aluno;
    private Proposta proposta;

    /**
     * Creates new form FrmGerenciarPropostas
     */
    public FrmEscolherTema() {
        initComponents();
        gerenciaBotoes(false, false, false, false);
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void gerenciaCampos(String action) {
        switch (action) {
            case "block":
                break;
            case "unblock":
                break;
            case "clean":
                break;
        }
    }

    public void gerenciaBotoes(boolean escolherTema, boolean verTema, boolean verDetalhes, boolean verNota) {
        btn_escolherTema.setEnabled(escolherTema);
        btn_verMeuTema.setEnabled(verTema);
        btn_verDetalhes.setEnabled(verDetalhes);
        btn_verMinhaNota.setEnabled(verNota);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_escolherTema = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_propostas = new javax.swing.JTable();
        btn_verMeuTema = new javax.swing.JButton();
        btn_verDetalhes = new javax.swing.JButton();
        btn_verMinhaNota = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciar Propostas de TC");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 153, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Escolher tema para projeto");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo-instituto.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btn_escolherTema.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_escolherTema.setForeground(new java.awt.Color(0, 102, 51));
        btn_escolherTema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/accept.png"))); // NOI18N
        btn_escolherTema.setText("Escolher Tema");
        btn_escolherTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_escolherTemaActionPerformed(evt);
            }
        });

        tbl_propostas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod.", "Título", "Orientador(a)", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_propostas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_propostasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_propostas);
        if (tbl_propostas.getColumnModel().getColumnCount() > 0) {
            tbl_propostas.getColumnModel().getColumn(0).setPreferredWidth(40);
            tbl_propostas.getColumnModel().getColumn(1).setPreferredWidth(200);
            tbl_propostas.getColumnModel().getColumn(2).setPreferredWidth(60);
            tbl_propostas.getColumnModel().getColumn(3).setPreferredWidth(50);
        }

        btn_verMeuTema.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_verMeuTema.setForeground(new java.awt.Color(0, 102, 51));
        btn_verMeuTema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/layout_content.png"))); // NOI18N
        btn_verMeuTema.setText("Ver meu tema");
        btn_verMeuTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verMeuTemaActionPerformed(evt);
            }
        });

        btn_verDetalhes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_verDetalhes.setForeground(new java.awt.Color(0, 102, 51));
        btn_verDetalhes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/zoom.png"))); // NOI18N
        btn_verDetalhes.setText("Ver Detalhes");
        btn_verDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verDetalhesActionPerformed(evt);
            }
        });

        btn_verMinhaNota.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_verMinhaNota.setForeground(new java.awt.Color(0, 102, 51));
        btn_verMinhaNota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/application_form_edit.png"))); // NOI18N
        btn_verMinhaNota.setText("Ver minha nota");
        btn_verMinhaNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verMinhaNotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_escolherTema, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btn_verMeuTema, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btn_verDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_verMinhaNota, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btn_verDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_verMeuTema, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_escolherTema, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_verMinhaNota, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_escolherTema, btn_verDetalhes, btn_verMeuTema});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_escolherTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_escolherTemaActionPerformed
        if (aluno.getProposta() == null) {

            // Atualiza proposta incluindo o id do aluno que irá realizar o trabalho
            PropostaDAO dao = new PropostaDAO();
            // identifica qual o id da linha selecionada
            if (proposta.getPropostaStatus().equals("Em aberto")) {
                // incluo o número de matrícula
                proposta.setPropostaAlunoMatricula(aluno.getMatricula());
                // Altero status para aguardando aprovação do orientador
                proposta.setPropostaStatus("Aguardando aprovação");
                // Realiza o update do objeto
                dao.alterarProposta(proposta);
                // Mensagem
                JOptionPane.showMessageDialog(null, "Prezado(a) aluno(a):\n"
                        + "Sua escolha de tema será enviada para o professor orientador.\n"
                        + "Este deverá realizar a aprovação, momento em que não mais será\n"
                        + "possível realizar a alteração de tema"
                );

                FrmLoading loading = new FrmLoading();
                loading.setLabel("Salvando sua escolha...");
                loading.setVisible(true);

                Thread t = new Thread() {
                    public void run() {
                        // Atualizo a lista
                        toList();
                        loading.dispose();
                    }

                };

                t.start();
            } else {
                JOptionPane.showMessageDialog(null, "Este tema não pode mais ser escolhido.");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Não é possível selecionar o tema. Você já possui um tema escolhido.\n Caso deseje trocar"
                    + ", entre em contato com o professor orientador.");
        }


    }//GEN-LAST:event_btn_escolherTemaActionPerformed

    private void btn_verMeuTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verMeuTemaActionPerformed
        // Ação para abrir detalhes do tema escolhido pelo aluno
        FrmVerDetalhesMeuTema tela = new FrmVerDetalhesMeuTema();
        tela.setVisible(true);
        tela.setAluno(aluno);
    }//GEN-LAST:event_btn_verMeuTemaActionPerformed

    private void btn_verDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verDetalhesActionPerformed
        // Ação para abrir detalhes da proposta
        FrmVerDetalhesTema tela = new FrmVerDetalhesTema();
        tela.setVisible(true);
        tela.setAluno(aluno);
        tela.setProposta(proposta);
    }//GEN-LAST:event_btn_verDetalhesActionPerformed

    private void btn_verMinhaNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verMinhaNotaActionPerformed
        FrmVerNota tela = new FrmVerNota();
        tela.setNota(aluno.getNota());
        tela.setVisible(true);
    }//GEN-LAST:event_btn_verMinhaNotaActionPerformed

    private void tbl_propostasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_propostasMouseClicked

        FrmLoading loading = new FrmLoading();
        loading.setLabel("Carregando dados da proposta.");
        loading.setVisible(true);

        Thread t = new Thread() {

            public void run() {

                // Ao clicar com o mouse em alguma ocorrência da tabela
                // Crio objeto PropostaDAO
                PropostaDAO dao = new PropostaDAO();

                // identifica qual o id da linha selecionada
                int temaId = Integer.parseInt(tbl_propostas.getValueAt(tbl_propostas.getSelectedRow(), 0).toString());

                // obtém o objeto selecionado
                proposta = dao.getProposta(temaId);

                if (proposta.getPropostaStatus().equals("Em aberto")) {
                    // Libera botões para escolher o tema ou ver detalhes
                    gerenciaBotoes(true, false, true, false);
                } else {
                    // Libera botões para escolher o tema ou ver detalhes
                    gerenciaBotoes(false, false, true, false);
                }

                loading.dispose();
            }

        };

        t.start();


    }//GEN-LAST:event_tbl_propostasMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Carrega dados na tabela ao abrir a janela
        /**
         * Evento responsável por carregar os dados para a tabela. O método é
         * disparado no momento em que o JFrame é aberto
         */
        FrmLoading loading = new FrmLoading();
        loading.setLabel("Carregando propostas.");

        loading.setVisible(true);

        Thread t = new Thread() {

            public void run() {
                // Carregamento dos projeto
                toList();
                // Verifica se nota do aluno está disponível
                try {
                    if (Integer.parseInt(aluno.getNota()) != 0) {
                        btn_verMinhaNota.setEnabled(true);
                    }
                } catch (NullPointerException erro) {
                    btn_verMinhaNota.setEnabled(false);
                } catch (NumberFormatException error) {
                    btn_verMinhaNota.setEnabled(false);
                }
                loading.dispose();
            }

        };

        t.start();
    }//GEN-LAST:event_formWindowOpened

    // Método responável por carregar dados para a tabela de propostas
    public void toList() {

        // Instancia um objeto DAO
        PropostaDAO dao = new PropostaDAO();

        // Armazena em uma lista o retorno do método
        List<Proposta> lista = dao.listarPropostas();

        // Cria o DefaultTableModel para armazenar os dados que serão exibidos na tabela
        DefaultTableModel dados = (DefaultTableModel) tbl_propostas.getModel();

        // limpa dados da tabela
        dados.setNumRows(0);

        // cada ocorrência em lista irá para um objeto professor
        for (Proposta p : lista) {

            if (p.getPropostaAlunoMatricula() == aluno.getMatricula()) {
                aluno.setProposta(p);
                btn_escolherTema.setEnabled(false);
                btn_verMeuTema.setEnabled(true);
            }

            ProfessorDAO daoProf = new ProfessorDAO();
            Professor professor = daoProf.buscaProfessor(p.getPropostaIdProfessor());

            // E agora será adicionado a lista na tabela. Linha a linha
            dados.addRow(new Object[]{
                p.getPropostaId(),
                p.getPropostaTitulo(),
                professor.getNome(),
                p.getPropostaStatus()
            });

        }

    }

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmEscolherTema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEscolherTema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEscolherTema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEscolherTema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEscolherTema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_escolherTema;
    private javax.swing.JButton btn_verDetalhes;
    private javax.swing.JButton btn_verMeuTema;
    private javax.swing.JButton btn_verMinhaNota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tbl_propostas;
    // End of variables declaration//GEN-END:variables
}

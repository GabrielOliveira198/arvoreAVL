/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import structures.Student;

/**
 *
 * @author olive
 */
public class FrmCadastroTurma extends javax.swing.JFrame {

    static int mat = 0;
    Turma turmaSI = new Turma();
    Turma turma = new Turma();
    /**
     * Creates new form FrmCadastroTurma
     */
    public FrmCadastroTurma() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfFaltas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        bInserir = new javax.swing.JButton();
        bGravar = new javax.swing.JButton();
        bCarregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfPrimeiraNota = new javax.swing.JTextField();
        tfMatricula = new javax.swing.JTextField();
        tfSegundaNota = new javax.swing.JTextField();
        tfTerceiraNota = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        bAtualizar = new javax.swing.JButton();
        jBuscar = new javax.swing.JButton();
        tfBuscar = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Nome: ");

        jLabel2.setText("Faltas:");

        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });

        tfFaltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFaltasActionPerformed(evt);
            }
        });

        jTable.setModel(turmaSI);
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        bInserir.setText("Inserir");
        bInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInserirActionPerformed(evt);
            }
        });

        bGravar.setText("Gravar Arquivo");
        bGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGravarActionPerformed(evt);
            }
        });

        bCarregar.setText("Carregar Arquivo");
        bCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCarregarActionPerformed(evt);
            }
        });

        jLabel3.setText("Primeira Nota:");

        jLabel4.setText("Matricula:");

        jLabel5.setText("Segunda Nota:");

        jLabel6.setText("Terceira Nota:");

        tfPrimeiraNota.setText(" ");

        tfSegundaNota.setText(" ");

        tfTerceiraNota.setText(" ");

        jButton1.setText("Remover");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        bAtualizar.setText("Atualizar");
        bAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtualizarActionPerformed(evt);
            }
        });

        jBuscar.setText("Buscar");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        tfBuscar.setText("Matrícula - Inteiro");
        tfBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfBuscarMouseClicked(evt);
            }
        });
        tfBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBuscarActionPerformed(evt);
            }
        });

        jButton2.setText("Resetar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNome)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTerceiraNota)
                            .addComponent(tfPrimeiraNota)
                            .addComponent(tfSegundaNota)
                            .addComponent(tfFaltas)))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(bGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bCarregar)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfBuscar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfPrimeiraNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfSegundaNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfTerceiraNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(tfFaltas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jBuscar))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bInserir)
                    .addComponent(bAtualizar)
                    .addComponent(jButton1)
                    .addComponent(bCarregar)
                    .addComponent(bGravar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfFaltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFaltasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFaltasActionPerformed

    private void bInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInserirActionPerformed
        Student aluno = new Student();
        aluno.setKey(tfMatricula.getText());
        aluno.setNomeAluno(tfNome.getText());
        aluno.setFaltas(Integer.parseInt(tfFaltas.getText()));
        aluno.setPrimeiraNota(Double.parseDouble(tfPrimeiraNota.getText()));
        aluno.setSegundaNota(Double.parseDouble(tfSegundaNota.getText()));
        aluno.setTerceiraNota(Double.parseDouble(tfTerceiraNota.getText()));
        turmaSI.insereAluno(aluno);
        tfMatricula.requestFocus();

    }//GEN-LAST:event_bInserirActionPerformed

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        atualizaCampos(jTable.getSelectedRow());


    }//GEN-LAST:event_jTableMouseClicked
    private void atualizaCampos(int index) {
        Student aluno = turmaSI.getAlunoAt(index);
        tfNome.setText(aluno.getNomeAluno());
        tfFaltas.setText("" + aluno.getFaltas());
        tfMatricula.setText("" + aluno.getKey());
        tfPrimeiraNota.setText("" + aluno.getPrimeiraNota());
        tfSegundaNota.setText("" + aluno.getSegundaNota());
        tfTerceiraNota.setText("" + aluno.getTerceiraNota());
    }
    private void jTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableKeyReleased
        if (evt.isActionKey()) {
            if ((evt.getKeyCode() == KeyEvent.VK_UP) || (evt.getKeyCode() == KeyEvent.VK_DOWN)) {
                atualizaCampos(jTable.getSelectedRow());
            }
        }
    }//GEN-LAST:event_jTableKeyReleased

    private void bGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGravarActionPerformed
        try {
            turmaSI.saveToFile();
        } catch (IOException ex) {
            Logger.getLogger(FrmCadastroTurma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bGravarActionPerformed

    private void bCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCarregarActionPerformed
        
        try {
            turmaSI.loadFromFile();
        } catch (IOException ex) {
            Logger.getLogger(FrmCadastroTurma.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FrmCadastroTurma.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_bCarregarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        turmaSI.removeAluno(jTable.getSelectedRow());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtualizarActionPerformed
        Student aluno = new Student();
        int index = jTable.getSelectedRow();
        aluno.setKey(tfMatricula.getText());
        aluno.setNomeAluno(tfNome.getText());
        aluno.setFaltas(Integer.parseInt(tfFaltas.getText()));
        aluno.setPrimeiraNota(Double.parseDouble(tfPrimeiraNota.getText()));
        aluno.setSegundaNota(Double.parseDouble(tfSegundaNota.getText()));
        aluno.setTerceiraNota(Double.parseDouble(tfTerceiraNota.getText()));
        turmaSI.removeAluno(jTable.getSelectedRow());
        turmaSI.insereAluno(index, aluno);
        tfMatricula.requestFocus();
    }//GEN-LAST:event_bAtualizarActionPerformed

    private void tfBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBuscarActionPerformed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        for (int i = 0; i < turmaSI.getRowCount(); i++) {
            int x = (int) turmaSI.getAlunoAt(i).getKey();
            if (x == Integer.parseInt(tfBuscar.getText())) {
                jTable.getValueAt(1, 0);
                //jTable.print(JTable.PrintMode.NORMAL, mf, mf1)
                
                Student st = new Student();
                st.setKey(turmaSI.getAlunoAt(i).getKey());
                st.setNomeAluno(turmaSI.getAlunoAt(i).getNomeAluno());
                st.setPrimeiraNota(turmaSI.getAlunoAt(i).getPrimeiraNota());
                st.setSegundaNota(turmaSI.getAlunoAt(i).getSegundaNota());
                st.setTerceiraNota(turmaSI.getAlunoAt(i).getTerceiraNota());
                st.setMedia(turmaSI.getAlunoAt(i).getMedia());
                st.setFaltas(turmaSI.getAlunoAt(i).getFaltas());
                turma.insereAluno(st);
                jTable.setModel(turma);
                break;
            }
        }
    }//GEN-LAST:event_jBuscarActionPerformed

    private void tfBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfBuscarMouseClicked
        tfBuscar.setText("");
    }//GEN-LAST:event_tfBuscarMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        for (int i = 0; i < turma.getRowCount(); i++) {
            turma.removeAluno(i);
        }
        jTable.setModel(turmaSI);
        tfBuscar.setText("Matrícula - Inteiro");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            turmaSI.saveToFile();
        } catch (IOException ex) {
            Logger.getLogger(FrmCadastroTurma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(FrmCadastroTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadastroTurma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAtualizar;
    private javax.swing.JButton bCarregar;
    private javax.swing.JButton bGravar;
    private javax.swing.JButton bInserir;
    private javax.swing.JButton jBuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField tfBuscar;
    private javax.swing.JTextField tfFaltas;
    private javax.swing.JTextField tfMatricula;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfPrimeiraNota;
    private javax.swing.JTextField tfSegundaNota;
    private javax.swing.JTextField tfTerceiraNota;
    // End of variables declaration//GEN-END:variables
}

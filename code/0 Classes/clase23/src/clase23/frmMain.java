/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase23;

import javax.swing.JOptionPane;

/**
 *
 * @author Elías González <eliasgonzalezugalde@gmail.com>
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    public frmMain() {
        initComponents();
        
        //lblTitulo.setAlignmentX(frmMain.getWindows()[0].WIDTH-lblTitulo.getAlignmentX()/2);
        
        buttonGroup1.add(rbMasculino);
        buttonGroup1.add(rbFemenino);
        //setUndecorated(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenuItem1 = new javax.swing.JMenuItem();
        lblTitulo = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtValor2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        labelResultado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEmails = new javax.swing.JTextArea();
        txtValor1 = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        comboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        chkEspañol = new javax.swing.JCheckBox();
        chkIngles = new javax.swing.JCheckBox();
        btnIdioma = new javax.swing.JButton();
        rbMasculino = new javax.swing.JRadioButton();
        rbFemenino = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lblTitulo.setText("Mundial 2014.");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 59, -1, -1));

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 87, 286, -1));

        txtValor2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(txtValor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 87, 90, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton1.setText("Sumar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(671, 86, -1, -1));

        labelResultado.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelResultadoActionPerformed(evt);
            }
        });
        getContentPane().add(labelResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(754, 87, 77, -1));

        txtEmails.setColumns(20);
        txtEmails.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtEmails.setRows(5);
        jScrollPane1.setViewportView(txtEmails);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 126, -1, -1));

        txtValor1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtValor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValor1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtValor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 87, 90, -1));

        btnAgregar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 243, 286, -1));

        comboBox1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        comboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Costa Rica", "Alemania", "Panama", "España" }));
        comboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(comboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 126, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Suma.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 60, -1, -1));

        chkEspañol.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        chkEspañol.setText("Español");
        chkEspañol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkEspañolActionPerformed(evt);
            }
        });
        getContentPane().add(chkEspañol, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 279, -1, -1));

        chkIngles.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        chkIngles.setText("Ingles");
        getContentPane().add(chkIngles, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 311, -1, -1));

        btnIdioma.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnIdioma.setText("Idioma");
        btnIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIdiomaActionPerformed(evt);
            }
        });
        getContentPane().add(btnIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 342, -1, -1));

        rbMasculino.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        rbMasculino.setText("Masculino");
        rbMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMasculinoActionPerformed(evt);
            }
        });
        getContentPane().add(rbMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 159, -1, -1));

        rbFemenino.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        rbFemenino.setText("Femenino");
        getContentPane().add(rbFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 191, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton2.setText("Validar sexo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 130, -1));

        fondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\ideli_000\\Desktop\\mundial.jpg")); // NOI18N
        fondo.setText("jLabel2");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int resultado = Integer.valueOf(txtValor1.getText()) + Integer.valueOf(txtValor2.getText());
        labelResultado.setText(String.valueOf(resultado));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void labelResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelResultadoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        txtEmails.append(txtEmail.getText() + "\n");
        txtEmail.setText("");
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void comboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox1ActionPerformed
        String value=comboBox1.getSelectedItem().toString();
        if (!value.equals("Seleccione")) {
            JOptionPane.showMessageDialog(null, comboBox1.getSelectedItem());
        }
        
        
    }//GEN-LAST:event_comboBox1ActionPerformed

    private void chkEspañolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkEspañolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkEspañolActionPerformed

    private void btnIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIdiomaActionPerformed

        if (chkEspañol.isSelected()) {
            JOptionPane.showMessageDialog(null, "Has seleccionado español.");
        }
        if (chkIngles.isSelected()) {
            JOptionPane.showMessageDialog(null, "Has seleccionado inglés.");
        }

    }//GEN-LAST:event_btnIdiomaActionPerformed

    private void rbMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMasculinoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (rbFemenino.isSelected()) {
            JOptionPane.showMessageDialog(null, "Has seleccionado femenino.");
        }
        if (rbMasculino.isSelected()) {
            JOptionPane.showMessageDialog(null, "Has seleccionado masculino.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtValor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValor1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnIdioma;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkEspañol;
    private javax.swing.JCheckBox chkIngles;
    private javax.swing.JComboBox comboBox1;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField labelResultado;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rbFemenino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextArea txtEmails;
    private javax.swing.JTextField txtValor1;
    private javax.swing.JTextField txtValor2;
    // End of variables declaration//GEN-END:variables
}

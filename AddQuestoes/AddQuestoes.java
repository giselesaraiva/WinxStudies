/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

/**
 *
 * @author Gisele Vieira
 */
public class AddQuestoes extends javax.swing.JFrame {

    /**
     * Creates new form AddQuestoes
     */
    public AddQuestoes() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoEnunciado = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        radioA1 = new javax.swing.JRadioButton();
        radioA2 = new javax.swing.JRadioButton();
        radioA3 = new javax.swing.JRadioButton();
        radioA4 = new javax.swing.JRadioButton();
        radioA5 = new javax.swing.JRadioButton();
        A1 = new javax.swing.JTextField();
        A2 = new javax.swing.JTextField();
        A3 = new javax.swing.JTextField();
        A4 = new javax.swing.JTextField();
        A5 = new javax.swing.JTextField();
        btnFinalizar = new javax.swing.JButton();
        SAIR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(214, 255, 245));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\Adicionar Questões (2).png")); // NOI18N

        jPanel2.setBackground(new java.awt.Color(229, 255, 249));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\Enunciado_ (1).png")); // NOI18N

        campoEnunciado.setColumns(20);
        campoEnunciado.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        campoEnunciado.setForeground(new java.awt.Color(0, 102, 102));
        campoEnunciado.setRows(2);
        campoEnunciado.setCaretColor(new java.awt.Color(0, 102, 102));
        campoEnunciado.setFocusCycleRoot(true);
        campoEnunciado.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        campoEnunciado.setSelectionColor(new java.awt.Color(217, 252, 252));
        jScrollPane1.setViewportView(campoEnunciado);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\Alternativas_.png")); // NOI18N

        radioA1.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        radioA1.setForeground(new java.awt.Color(0, 73, 73));
        radioA1.setContentAreaFilled(false);
        radioA1.setFocusable(false);
        radioA1.setMaximumSize(new java.awt.Dimension(150, 21));

        radioA2.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        radioA2.setForeground(new java.awt.Color(0, 73, 73));
        radioA2.setContentAreaFilled(false);
        radioA2.setFocusable(false);
        radioA2.setMaximumSize(new java.awt.Dimension(150, 21));

        radioA3.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        radioA3.setForeground(new java.awt.Color(0, 73, 73));
        radioA3.setContentAreaFilled(false);
        radioA3.setFocusable(false);
        radioA3.setMaximumSize(new java.awt.Dimension(150, 21));

        radioA4.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        radioA4.setForeground(new java.awt.Color(0, 73, 73));
        radioA4.setContentAreaFilled(false);
        radioA4.setFocusable(false);
        radioA4.setMaximumSize(new java.awt.Dimension(150, 21));

        radioA5.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        radioA5.setForeground(new java.awt.Color(0, 73, 73));
        radioA5.setContentAreaFilled(false);
        radioA5.setFocusable(false);
        radioA5.setMaximumSize(new java.awt.Dimension(150, 21));

        A1.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        A1.setForeground(new java.awt.Color(1, 68, 68));
        A1.setCaretColor(new java.awt.Color(0, 102, 102));
        A1.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        A1.setSelectionColor(new java.awt.Color(175, 211, 211));
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });

        A2.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        A2.setForeground(new java.awt.Color(1, 68, 68));
        A2.setCaretColor(new java.awt.Color(0, 102, 102));
        A2.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        A2.setSelectionColor(new java.awt.Color(175, 211, 211));
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });

        A3.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        A3.setForeground(new java.awt.Color(1, 68, 68));
        A3.setCaretColor(new java.awt.Color(0, 102, 102));
        A3.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        A3.setSelectionColor(new java.awt.Color(175, 211, 211));
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });

        A4.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        A4.setForeground(new java.awt.Color(1, 68, 68));
        A4.setCaretColor(new java.awt.Color(0, 102, 102));
        A4.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        A4.setSelectionColor(new java.awt.Color(175, 211, 211));
        A4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });

        A5.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        A5.setForeground(new java.awt.Color(1, 68, 68));
        A5.setCaretColor(new java.awt.Color(0, 102, 102));
        A5.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        A5.setSelectionColor(new java.awt.Color(175, 211, 211));
        A5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(radioA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(A1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(radioA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(radioA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(radioA4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(radioA5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 1262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 1262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(A4, javax.swing.GroupLayout.PREFERRED_SIZE, 1262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(A5, javax.swing.GroupLayout.PREFERRED_SIZE, 1262, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(radioA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(A2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(radioA2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(A3)
                    .addComponent(radioA3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(A4)
                    .addComponent(radioA4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(A5)
                    .addComponent(radioA5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        btnFinalizar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\finalizar (1).png")); // NOI18N
        btnFinalizar.setContentAreaFilled(false);
        btnFinalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        SAIR.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\SAIRR.png")); // NOI18N
        SAIR.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(491, 491, 491)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SAIR))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(656, 656, 656)
                        .addComponent(btnFinalizar)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SAIR)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnFinalizar)
                .addGap(81, 81, 81))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A1ActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A2ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A3ActionPerformed

    private void A4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A4ActionPerformed

    private void A5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A5ActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFinalizarActionPerformed

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
            java.util.logging.Logger.getLogger(AddQuestoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddQuestoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddQuestoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddQuestoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddQuestoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A1;
    private javax.swing.JTextField A2;
    private javax.swing.JTextField A3;
    private javax.swing.JTextField A4;
    private javax.swing.JTextField A5;
    private javax.swing.JButton SAIR;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JTextArea campoEnunciado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioA1;
    private javax.swing.JRadioButton radioA2;
    private javax.swing.JRadioButton radioA3;
    private javax.swing.JRadioButton radioA4;
    private javax.swing.JRadioButton radioA5;
    // End of variables declaration//GEN-END:variables
}

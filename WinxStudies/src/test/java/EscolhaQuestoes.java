/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author Gisele Vieira
 */
public class EscolhaQuestoes extends javax.swing.JFrame {

    /**
     * Creates new form EscolhaQuestoes
     */
    public EscolhaQuestoes() {
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
        MATEMATICA = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PORTUGUES = new javax.swing.JLabel();
        LITERATURA = new javax.swing.JLabel();
        FISICA = new javax.swing.JLabel();
        HISTORIA = new javax.swing.JLabel();
        GEOGRAFIA = new javax.swing.JLabel();
        QUIMICA = new javax.swing.JLabel();
        BIOLOGIA = new javax.swing.JLabel();
        REDAÇÃO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        MATEMATICA.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\Frame 15.png")); // NOI18N
        MATEMATICA.setText("jLabel1");
        MATEMATICA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MATEMATICAMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(70, 136, 136));
        jLabel2.setText("SELECIONE A MATÉRIA:");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        PORTUGUES.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\Portugues.png")); // NOI18N
        PORTUGUES.setText("jLabel3");
        PORTUGUES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PORTUGUESMouseClicked(evt);
            }
        });

        LITERATURA.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\Literatura.png")); // NOI18N
        LITERATURA.setText("jLabel4");
        LITERATURA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LITERATURAMouseClicked(evt);
            }
        });

        FISICA.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\Fisica.png")); // NOI18N
        FISICA.setText("jLabel5");

        HISTORIA.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\Historia.png")); // NOI18N
        HISTORIA.setText("jLabel6");
        HISTORIA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HISTORIAMouseClicked(evt);
            }
        });

        GEOGRAFIA.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\Geografia.png")); // NOI18N
        GEOGRAFIA.setText("jLabel7");
        GEOGRAFIA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GEOGRAFIAMouseClicked(evt);
            }
        });

        QUIMICA.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\Quimica.png")); // NOI18N
        QUIMICA.setText("jLabel8");
        QUIMICA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QUIMICAMouseClicked(evt);
            }
        });

        BIOLOGIA.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\Biologia.png")); // NOI18N
        BIOLOGIA.setText("jLabel9");
        BIOLOGIA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BIOLOGIAMouseClicked(evt);
            }
        });

        REDAÇÃO.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\Redação.png")); // NOI18N
        REDAÇÃO.setText("jLabel10");
        REDAÇÃO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                REDAÇÃOMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(558, 558, 558)
                                        .addComponent(FISICA, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(MATEMATICA, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(GEOGRAFIA, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(HISTORIA, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PORTUGUES, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LITERATURA, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(183, 183, 183)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(QUIMICA, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BIOLOGIA, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(REDAÇÃO, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(179, 179, 179)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MATEMATICA)
                    .addComponent(FISICA)
                    .addComponent(GEOGRAFIA))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PORTUGUES)
                    .addComponent(QUIMICA)
                    .addComponent(HISTORIA))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LITERATURA)
                    .addComponent(BIOLOGIA)
                    .addComponent(REDAÇÃO))
                .addContainerGap(222, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MATEMATICAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MATEMATICAMouseClicked
       /*NewJFrame1 loga=new NewJFrame1();
       loga.setVisible(true); */
    }//GEN-LAST:event_MATEMATICAMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
         
    }//GEN-LAST:event_jLabel2MouseClicked

    private void PORTUGUESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PORTUGUESMouseClicked
       
    }//GEN-LAST:event_PORTUGUESMouseClicked

    private void LITERATURAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LITERATURAMouseClicked
       
    }//GEN-LAST:event_LITERATURAMouseClicked

    private void QUIMICAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QUIMICAMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_QUIMICAMouseClicked

    private void BIOLOGIAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BIOLOGIAMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BIOLOGIAMouseClicked

    private void GEOGRAFIAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GEOGRAFIAMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_GEOGRAFIAMouseClicked

    private void HISTORIAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HISTORIAMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_HISTORIAMouseClicked

    private void REDAÇÃOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REDAÇÃOMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_REDAÇÃOMouseClicked

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
            java.util.logging.Logger.getLogger(EscolhaQuestoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EscolhaQuestoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EscolhaQuestoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EscolhaQuestoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EscolhaQuestoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BIOLOGIA;
    private javax.swing.JLabel FISICA;
    private javax.swing.JLabel GEOGRAFIA;
    private javax.swing.JLabel HISTORIA;
    private javax.swing.JLabel LITERATURA;
    private javax.swing.JLabel MATEMATICA;
    private javax.swing.JLabel PORTUGUES;
    private javax.swing.JLabel QUIMICA;
    private javax.swing.JLabel REDAÇÃO;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

package telas;

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
        jLabel2 = new javax.swing.JLabel();
        MATEMATICA = new javax.swing.JButton();
        PORTUGUES = new javax.swing.JButton();
        LITERATURA = new javax.swing.JButton();
        FISICA = new javax.swing.JButton();
        QUIMICA = new javax.swing.JButton();
        BIOLOGIA = new javax.swing.JButton();
        GEOGRAFIA = new javax.swing.JButton();
        HISTORIA = new javax.swing.JButton();
        REDACAO = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(70, 136, 136));
        jLabel2.setText("SELECIONE A MATÉRIA:");

        MATEMATICA.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\Mat.png")); // NOI18N
        MATEMATICA.setContentAreaFilled(false);
        MATEMATICA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MATEMATICAMouseClicked(evt);
            }
        });

        PORTUGUES.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\Portugues.png")); // NOI18N
        PORTUGUES.setContentAreaFilled(false);

        LITERATURA.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\Literatura.png")); // NOI18N
        LITERATURA.setContentAreaFilled(false);
        LITERATURA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LITERATURAMouseClicked(evt);
            }
        });

        FISICA.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\Fisica.png")); // NOI18N
        FISICA.setContentAreaFilled(false);
        FISICA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FISICAMouseClicked(evt);
            }
        });

        QUIMICA.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\Quimica.png")); // NOI18N
        QUIMICA.setContentAreaFilled(false);
        QUIMICA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QUIMICAMouseClicked(evt);
            }
        });

        BIOLOGIA.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\Biologia.png")); // NOI18N
        BIOLOGIA.setContentAreaFilled(false);
        BIOLOGIA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BIOLOGIAMouseClicked(evt);
            }
        });

        GEOGRAFIA.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\Geografia.png")); // NOI18N
        GEOGRAFIA.setContentAreaFilled(false);
        GEOGRAFIA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GEOGRAFIAMouseClicked(evt);
            }
        });

        HISTORIA.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\Historia.png")); // NOI18N
        HISTORIA.setContentAreaFilled(false);
        HISTORIA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HISTORIAMouseClicked(evt);
            }
        });

        REDACAO.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\Redação.png")); // NOI18N
        REDACAO.setActionCommand("");
        REDACAO.setContentAreaFilled(false);
        REDACAO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                REDACAOMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LITERATURA)
                    .addComponent(MATEMATICA)
                    .addComponent(PORTUGUES))
                .addGap(98, 98, 98)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FISICA)
                    .addComponent(BIOLOGIA)
                    .addComponent(QUIMICA, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 254, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HISTORIA)
                    .addComponent(GEOGRAFIA)
                    .addComponent(REDACAO))
                .addGap(78, 78, 78))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(121, 121, 121)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MATEMATICA)
                    .addComponent(FISICA)
                    .addComponent(GEOGRAFIA))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QUIMICA)
                            .addComponent(PORTUGUES))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LITERATURA)
                            .addComponent(BIOLOGIA)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(HISTORIA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(REDACAO)))
                .addContainerGap(295, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MATEMATICAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MATEMATICAMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_MATEMATICAMouseClicked

    private void LITERATURAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LITERATURAMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LITERATURAMouseClicked

    private void FISICAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FISICAMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_FISICAMouseClicked

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

    private void REDACAOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REDACAOMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_REDACAOMouseClicked

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
    private javax.swing.JButton BIOLOGIA;
    private javax.swing.JButton FISICA;
    private javax.swing.JButton GEOGRAFIA;
    private javax.swing.JButton HISTORIA;
    private javax.swing.JButton LITERATURA;
    private javax.swing.JButton MATEMATICA;
    private javax.swing.JButton PORTUGUES;
    private javax.swing.JButton QUIMICA;
    private javax.swing.JButton REDACAO;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

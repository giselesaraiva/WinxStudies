package telas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author Gisele Vieira
 */
public class EscolhaPS extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public EscolhaPS() {
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
        menu2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SIS = new javax.swing.JLabel();
        ENEM = new javax.swing.JLabel();
        PSC = new javax.swing.JLabel();
        MACRO = new javax.swing.JLabel();
        escolheEtapaSIS = new javax.swing.JPanel();
        closeMenuSIS = new javax.swing.JLabel();
        etapa1SIS = new javax.swing.JLabel();
        etapa3SIS = new javax.swing.JLabel();
        etapa2SIS = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        escolheEtapaPSC = new javax.swing.JPanel();
        closeMenuPSC = new javax.swing.JLabel();
        etapa1PSC = new javax.swing.JLabel();
        etapa3PSC = new javax.swing.JLabel();
        etapa2PSC = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        sair = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu2.setBackground(new java.awt.Color(248, 254, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(70, 136, 136));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\SELECIONE O PROCESSO SELETIVO_ (1).png")); // NOI18N
        jLabel1.setRequestFocusEnabled(false);

        SIS.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\SISsfundo.png")); // NOI18N
        SIS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SISMouseClicked(evt);
            }
        });

        ENEM.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Documents\\ENEMsfundo.png")); // NOI18N
        ENEM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ENEMMouseClicked(evt);
            }
        });

        PSC.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\PSCsfundo.png")); // NOI18N
        PSC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PSCMouseClicked(evt);
            }
        });

        MACRO.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Documents\\MACROsfundo.png")); // NOI18N
        MACRO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MACROMouseClicked(evt);
            }
        });

        escolheEtapaSIS.setBackground(new java.awt.Color(236, 252, 232));

        closeMenuSIS.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        closeMenuSIS.setForeground(new java.awt.Color(0, 102, 51));
        closeMenuSIS.setText("                              X ");
        closeMenuSIS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMenuSISMouseClicked(evt);
            }
        });

        etapa1SIS.setBackground(new java.awt.Color(236, 252, 232));
        etapa1SIS.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        etapa1SIS.setForeground(new java.awt.Color(0, 98, 33));
        etapa1SIS.setText("Etapa 1");
        etapa1SIS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etapa1SISMouseClicked(evt);
            }
        });

        etapa3SIS.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        etapa3SIS.setForeground(new java.awt.Color(0, 98, 33));
        etapa3SIS.setText("Etapa 3");
        etapa3SIS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etapa3SISMouseClicked(evt);
            }
        });

        etapa2SIS.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        etapa2SIS.setForeground(new java.awt.Color(0, 98, 33));
        etapa2SIS.setText("Etapa 2");
        etapa2SIS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etapa2SISMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout escolheEtapaSISLayout = new javax.swing.GroupLayout(escolheEtapaSIS);
        escolheEtapaSIS.setLayout(escolheEtapaSISLayout);
        escolheEtapaSISLayout.setHorizontalGroup(
            escolheEtapaSISLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escolheEtapaSISLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(closeMenuSIS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escolheEtapaSISLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(escolheEtapaSISLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escolheEtapaSISLayout.createSequentialGroup()
                        .addComponent(etapa1SIS)
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escolheEtapaSISLayout.createSequentialGroup()
                        .addComponent(etapa3SIS)
                        .addGap(84, 84, 84))))
            .addGroup(escolheEtapaSISLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(escolheEtapaSISLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, escolheEtapaSISLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(etapa2SIS))
                    .addComponent(jSeparator1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        escolheEtapaSISLayout.setVerticalGroup(
            escolheEtapaSISLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escolheEtapaSISLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(closeMenuSIS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etapa1SIS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etapa2SIS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etapa3SIS)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        escolheEtapaPSC.setBackground(new java.awt.Color(225, 239, 229));

        closeMenuPSC.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        closeMenuPSC.setForeground(new java.awt.Color(0, 102, 102));
        closeMenuPSC.setText("                             X ");
        closeMenuPSC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMenuPSCMouseClicked(evt);
            }
        });

        etapa1PSC.setBackground(new java.awt.Color(236, 252, 232));
        etapa1PSC.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        etapa1PSC.setForeground(new java.awt.Color(58, 115, 94));
        etapa1PSC.setText("Etapa 1");

        etapa3PSC.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        etapa3PSC.setForeground(new java.awt.Color(58, 115, 94));
        etapa3PSC.setText("Etapa 3");
        etapa3PSC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etapa3PSCMouseClicked(evt);
            }
        });

        etapa2PSC.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        etapa2PSC.setForeground(new java.awt.Color(58, 115, 94));
        etapa2PSC.setText("Etapa 2");
        etapa2PSC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etapa2PSCMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout escolheEtapaPSCLayout = new javax.swing.GroupLayout(escolheEtapaPSC);
        escolheEtapaPSC.setLayout(escolheEtapaPSCLayout);
        escolheEtapaPSCLayout.setHorizontalGroup(
            escolheEtapaPSCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escolheEtapaPSCLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(etapa3PSC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(escolheEtapaPSCLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(etapa2PSC))
            .addGroup(escolheEtapaPSCLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(etapa1PSC)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(escolheEtapaPSCLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(escolheEtapaPSCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(closeMenuPSC, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(escolheEtapaPSCLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(escolheEtapaPSCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(jSeparator4))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        escolheEtapaPSCLayout.setVerticalGroup(
            escolheEtapaPSCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escolheEtapaPSCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(closeMenuPSC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etapa1PSC)
                .addGap(12, 12, 12)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etapa2PSC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etapa3PSC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sair.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\SAIRR.png")); // NOI18N
        sair.setContentAreaFilled(false);
        sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sairMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menu2Layout = new javax.swing.GroupLayout(menu2);
        menu2.setLayout(menu2Layout);
        menu2Layout.setHorizontalGroup(
            menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu2Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PSC, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SIS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(escolheEtapaSIS, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(escolheEtapaPSC, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ENEM, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MACRO, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(168, 168, 168))
            .addGroup(menu2Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        menu2Layout.setVerticalGroup(
            menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menu2Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SIS, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ENEM, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menu2Layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(MACRO, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PSC, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(menu2Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(escolheEtapaSIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)
                        .addComponent(escolheEtapaPSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(231, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SISMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SISMouseClicked
        openMenuBar();
    }//GEN-LAST:event_SISMouseClicked

    private void closeMenuPSCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMenuPSCMouseClicked
        closeMenuBar2();
    }//GEN-LAST:event_closeMenuPSCMouseClicked

    private void PSCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PSCMouseClicked
        openMenuBar2();
    }//GEN-LAST:event_PSCMouseClicked

    private void etapa1SISMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etapa1SISMouseClicked
      
    }//GEN-LAST:event_etapa1SISMouseClicked

    private void closeMenuSISMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMenuSISMouseClicked
        closeMenuBar();
    }//GEN-LAST:event_closeMenuSISMouseClicked

    private void etapa2SISMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etapa2SISMouseClicked
      // TODO add your handling code here:
    }//GEN-LAST:event_etapa2SISMouseClicked

    private void etapa3SISMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etapa3SISMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_etapa3SISMouseClicked

    private void etapa2PSCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etapa2PSCMouseClicked
      // TODO add your handling code here:
    }//GEN-LAST:event_etapa2PSCMouseClicked

    private void etapa3PSCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etapa3PSCMouseClicked
     // TODO add your handling code here:
    }//GEN-LAST:event_etapa3PSCMouseClicked

    private void ENEMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ENEMMouseClicked
       // TODO add your handling code here:
    }//GEN-LAST:event_ENEMMouseClicked

    private void MACROMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MACROMouseClicked
       // TODO add your handling code here:
    }//GEN-LAST:event_MACROMouseClicked

    private void sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_sairMouseClicked

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
            java.util.logging.Logger.getLogger(EscolhaPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EscolhaPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EscolhaPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EscolhaPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EscolhaPS().setVisible(true);
            }
        });
    }

     int w=255;
    int h=214;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ENEM;
    private javax.swing.JLabel MACRO;
    private javax.swing.JLabel PSC;
    private javax.swing.JLabel SIS;
    private javax.swing.JLabel closeMenuPSC;
    private javax.swing.JLabel closeMenuSIS;
    private javax.swing.JPanel escolheEtapaPSC;
    private javax.swing.JPanel escolheEtapaSIS;
    private javax.swing.JLabel etapa1PSC;
    private javax.swing.JLabel etapa1SIS;
    private javax.swing.JLabel etapa2PSC;
    private javax.swing.JLabel etapa2SIS;
    private javax.swing.JLabel etapa3PSC;
    private javax.swing.JLabel etapa3SIS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPanel menu2;
    private javax.swing.JButton sair;
    // End of variables declaration//GEN-END:variables

      private void openMenuBar(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<w;i++){
                    escolheEtapaSIS.setSize(w, h);
                   
                }
            }
        }).start();
}
       private void closeMenuBar(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=w;i>0;i--){
                    escolheEtapaSIS.setSize(i, h);
                }
            }
        }).start();
}

             private void openMenuBar2(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<w;i++){
                    escolheEtapaPSC.setSize(w, h);
                   
                }
            }
        }).start();
}
       private void closeMenuBar2(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=w;i>0;i--){
                    escolheEtapaPSC.setSize(i, h);
                }
            }
        }).start();
}
}

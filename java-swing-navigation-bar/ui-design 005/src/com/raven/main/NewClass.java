package com.raven.main;

import com.raven.form.Form1;
import com.raven.form.Form2;
import com.raven.form.Form3;
import com.raven.form.Form4;
import com.raven.form.Form5;
import com.raven.swing.EventNavigationBar;
import com.raven.swing.NavigationBackgroundColor;
import java.awt.Color;
import javax.swing.ImageIcon;

public class NewClass extends javax.swing.JFrame {

    public NewClass() {
        
        
        
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        getContentPane().setBackground(new Color(240, 240, 240));
        navigationBar1.addItem(new ImageIcon(getClass().getResource("/com/raven/icon/item1.png")));
        navigationBar1.addItem(new ImageIcon(getClass().getResource("/com/raven/icon/item2.png")));
        navigationBar1.addItem(new ImageIcon(getClass().getResource("/com/raven/icon/item3.png")));
        navigationBar1.addItem(new ImageIcon(getClass().getResource("/com/raven/icon/item4.png")));
        navigationBar1.addItem(new ImageIcon(getClass().getResource("/com/raven/icon/item5.png")));
        navigationBar1.addEvent(new EventNavigationBar() {
            @Override
            public void beforeSelected(int index) {
                if (index == 0) {
                    panelTransaction1.display(new Form1(), navigationBar1.getAnimator());
                } else if (index == 1) {
                    panelTransaction1.display(new Form2(), navigationBar1.getAnimator());
                } else if (index == 2) {
                    panelTransaction1.display(new Form3(), navigationBar1.getAnimator());
                } else if (index == 3) {
                    panelTransaction1.display(new Form4(), navigationBar1.getAnimator());
                } else if (index == 4) {
                    panelTransaction1.display(new Form5(), navigationBar1.getAnimator());
                }
            }

            @Override
            public void afterSelected(int index) {

            }
        });
        NavigationBackgroundColor nb = new NavigationBackgroundColor();
        nb.apply(getContentPane());
        nb.addColor(0, new Color(245, 255, 253));
        nb.addColor(1, new Color(245, 255, 253));
        nb.addColor(2, new Color(245, 255, 253));
        nb.addColor(3, new Color(245, 255, 253));
        nb.addColor(4, new Color(245, 255, 253));

// Substituir a cor do índice 2 pela cor F5FFFD
        nb.addColor(2, new Color(245, 255, 253));
        navigationBar1.setnavigationBackgroundColor(nb);
    }

      @SuppressWarnings("unchecked")
      
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        navigationBar1 = new com.raven.swing.NavigationBar();
        try {
            panelTransaction1 =(com.raven.transitions.PanelTransitions)java.beans.Beans.instantiate(getClass().getClassLoader(), "com/raven/main.Main_panelTransaction1");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        sair6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout navigationBar1Layout = new javax.swing.GroupLayout(navigationBar1);
        navigationBar1.setLayout(navigationBar1Layout);
        navigationBar1Layout.setHorizontalGroup(
            navigationBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        navigationBar1Layout.setVerticalGroup(
            navigationBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 125, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(200, 222, 217));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\Winx Studies.png")); // NOI18N
        jLabel9.setText(" ");

        sair6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\SAIRR (2).png")); // NOI18N
        sair6.setToolTipText("Sair");
        sair6.setBorder(null);
        sair6.setContentAreaFilled(false);
        sair6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sair6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1116, Short.MAX_VALUE)
                .addComponent(sair6)
                .addGap(17, 17, 17))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sair6)
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navigationBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTransaction1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTransaction1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(navigationBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        navigationBar1.initSelectedIndex(2);
    }                                 

    private void sair6ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewClass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private com.raven.swing.NavigationBar navigationBar1;
    private com.raven.transitions.PanelTransitions panelTransaction1;
    private javax.swing.JButton sair;
    private javax.swing.JButton sair1;
    private javax.swing.JButton sair2;
    private javax.swing.JButton sair3;
    private javax.swing.JButton sair4;
    private javax.swing.JButton sair5;
    private javax.swing.JButton sair6;
    // End of variables declaration                   
}

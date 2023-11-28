/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package conteudoProgramatico;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Gisele Vieira
 */
public class provasAnterioresEstudante extends javax.swing.JFrame {

    /**
     * Creates new form provasAnterioresEstudante
     */
    public provasAnterioresEstudante() {
        initComponents();
        customizeTableHeader(jTable1);
        setExtendedState(MAXIMIZED_BOTH);
    }
    
    private void customizeTableHeader(JTable table) {
        JTableHeader tableHeader = table.getTableHeader();
        tableHeader.setDefaultRenderer(new CustomHeaderRenderer(tableHeader.getDefaultRenderer()));
    }
    
    private static class CustomHeaderRenderer implements TableCellRenderer {
        DefaultTableCellRenderer defaultRenderer;

        public CustomHeaderRenderer(TableCellRenderer renderer) {
            this.defaultRenderer = (DefaultTableCellRenderer) renderer;
            defaultRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        }
        
         public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component comp = defaultRenderer.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            // Define a fonte personalizada para o cabeçalho da tabela
            Font font = comp.getFont();
            font = font.deriveFont(Font.BOLD, 18); // Altere o tamanho e o estilo da fonte conforme desejado
            comp.setFont(font);
            comp.setForeground(new Color(64, 108, 98));

            return comp;
        }
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
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        sair = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        tituloProvaA = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        imprimir = new javax.swing.JButton();
        sair1 = new javax.swing.JButton();
        verQuestão1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(230, 246, 243));

        jPanel2.setBackground(new java.awt.Color(200, 222, 217));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\Winx Studies.png")); // NOI18N
        jLabel3.setText(" ");

        sair.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\SAIRR (2).png")); // NOI18N
        sair.setToolTipText("Sair");
        sair.setBorder(null);
        sair.setContentAreaFilled(false);
        sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sair)
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sair)
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(230, 246, 243));

        tituloProvaA.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\Provas Anteriores (1).png")); // NOI18N

        jScrollPane2.setBorder(null);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 102, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "     titulo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setGridColor(new java.awt.Color(175, 203, 207));
        jTable1.setOpaque(false);
        jTable1.setRowHeight(30);
        jTable1.setRowMargin(2);
        jTable1.setSelectionBackground(new java.awt.Color(154, 190, 186));
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(jTable1);

        imprimir.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\print.png")); // NOI18N
        imprimir.setText(" ");
        imprimir.setToolTipText("imprimir");
        imprimir.setContentAreaFilled(false);
        imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirActionPerformed(evt);
            }
        });

        sair1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\VOLTARR (3).png")); // NOI18N
        sair1.setToolTipText("Sair");
        sair1.setBorder(null);
        sair1.setContentAreaFilled(false);
        sair1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair1ActionPerformed(evt);
            }
        });

        verQuestão1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\VER (1).png")); // NOI18N
        verQuestão1.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 1288, Short.MAX_VALUE)
                .addComponent(verQuestão1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(sair1)
                        .addGap(563, 563, 563)
                        .addComponent(tituloProvaA)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sair1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(tituloProvaA, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(imprimir))
                    .addComponent(verQuestão1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sairActionPerformed

    private void imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imprimirActionPerformed

    private void sair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sair1ActionPerformed

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
            java.util.logging.Logger.getLogger(provasAnterioresEstudante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(provasAnterioresEstudante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(provasAnterioresEstudante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(provasAnterioresEstudante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new provasAnterioresEstudante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton imprimir;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable1;
    private javax.swing.JButton sair;
    private javax.swing.JButton sair1;
    private javax.swing.JLabel tituloProvaA;
    private javax.swing.JButton verQuestão1;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;

import static java.awt.SystemColor.menu;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gisele Vieira
 */
public class TELAINICIALDOESTUDANTE extends javax.swing.JFrame {

    /**
     * Creates new form TELAINICIALDOESTUDANTE
     */
    public TELAINICIALDOESTUDANTE() {
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
        jPanel2 = new javax.swing.JPanel();
        Usuario = new javax.swing.JButton();
        menuestudante = new javax.swing.JButton();
        ChecklistAtalho = new javax.swing.JButton();
        rankingAtalho = new javax.swing.JButton();
        questoesAtalho1 = new javax.swing.JButton();
        progressoAtalho = new javax.swing.JButton();
        menuESTUDANTE = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        conteudopMenu = new javax.swing.JButton();
        agendaMenu = new javax.swing.JButton();
        notacMenu = new javax.swing.JButton();
        estudanteMenu = new javax.swing.JButton();
        questoesMenu = new javax.swing.JButton();
        checklistMenu = new javax.swing.JButton();
        redacaoMenu = new javax.swing.JButton();
        rankingMenu = new javax.swing.JButton();
        sobrenosMenu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        xMenuESTUDANTE = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        checklistPrincipal = new javax.swing.JButton();
        redacaoPrincipal = new javax.swing.JButton();
        questoesPrincipal = new javax.swing.JButton();
        agendaPrincipal = new javax.swing.JButton();
        agendaPrincipal1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(242, 252, 252));

        jPanel2.setBackground(new java.awt.Color(192, 228, 220));

        Usuario.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\Usuario.png")); // NOI18N
        Usuario.setContentAreaFilled(false);
        Usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsuarioMouseClicked(evt);
            }
        });

        menuestudante.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\menu.png")); // NOI18N
        menuestudante.setContentAreaFilled(false);
        menuestudante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuestudanteMouseClicked(evt);
            }
        });

        ChecklistAtalho.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\TelaInicialEstudante\\Checklist (3).png")); // NOI18N
        ChecklistAtalho.setContentAreaFilled(false);
        ChecklistAtalho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChecklistAtalhoMouseClicked(evt);
            }
        });

        rankingAtalho.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\Ranking (6).png")); // NOI18N
        rankingAtalho.setContentAreaFilled(false);
        rankingAtalho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rankingAtalhoMouseClicked(evt);
            }
        });
        rankingAtalho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rankingAtalhoActionPerformed(evt);
            }
        });

        questoesAtalho1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\TelaInicialEstudante\\Questões (2).png")); // NOI18N
        questoesAtalho1.setContentAreaFilled(false);
        questoesAtalho1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                questoesAtalho1MouseClicked(evt);
            }
        });

        progressoAtalho.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\TelaInicialEstudante\\Progresso (1).png")); // NOI18N
        progressoAtalho.setContentAreaFilled(false);
        progressoAtalho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                progressoAtalhoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(menuestudante)
                .addGap(103, 103, 103)
                .addComponent(questoesAtalho1)
                .addGap(49, 49, 49)
                .addComponent(ChecklistAtalho)
                .addGap(65, 65, 65)
                .addComponent(progressoAtalho)
                .addGap(67, 67, 67)
                .addComponent(rankingAtalho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuestudante, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rankingAtalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ChecklistAtalho)
                            .addComponent(questoesAtalho1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(progressoAtalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        menuESTUDANTE.setBackground(new java.awt.Color(185, 215, 208));
        menuESTUDANTE.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                menuESTUDANTEAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jPanel3.setBackground(new java.awt.Color(219, 242, 246));

        conteudopMenu.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\Tela Inicial Adm\\CONTEUDO PROGRAMÁTICO.png")); // NOI18N
        conteudopMenu.setContentAreaFilled(false);
        conteudopMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                conteudopMenuMouseClicked(evt);
            }
        });

        agendaMenu.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\Tela Inicial Adm\\AGENDA.png")); // NOI18N
        agendaMenu.setContentAreaFilled(false);
        agendaMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agendaMenuMouseClicked(evt);
            }
        });

        notacMenu.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\Tela Inicial Adm\\NOTA DE CORTE.png")); // NOI18N
        notacMenu.setContentAreaFilled(false);
        notacMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notacMenuMouseClicked(evt);
            }
        });

        estudanteMenu.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\Tela Inicial Adm\\ESTUDANTES.png")); // NOI18N
        estudanteMenu.setContentAreaFilled(false);
        estudanteMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                estudanteMenuMouseClicked(evt);
            }
        });

        questoesMenu.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\Tela Inicial Adm\\QUESTÕES.png")); // NOI18N
        questoesMenu.setContentAreaFilled(false);
        questoesMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                questoesMenuMouseClicked(evt);
            }
        });

        checklistMenu.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\TelaInicialEstudante\\CHECKLIST (1).png")); // NOI18N
        checklistMenu.setContentAreaFilled(false);
        checklistMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checklistMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checklistMenuMouseClicked(evt);
            }
        });
        checklistMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checklistMenuActionPerformed(evt);
            }
        });

        redacaoMenu.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\Tela Inicial Adm\\REDAÇÃO (1).png")); // NOI18N
        redacaoMenu.setContentAreaFilled(false);
        redacaoMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                redacaoMenuMouseClicked(evt);
            }
        });
        redacaoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redacaoMenuActionPerformed(evt);
            }
        });

        rankingMenu.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\RANKING (4).png")); // NOI18N
        rankingMenu.setContentAreaFilled(false);
        rankingMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rankingMenuMouseClicked(evt);
            }
        });
        rankingMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rankingMenuActionPerformed(evt);
            }
        });

        sobrenosMenu.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\SOBRE NÓS.png")); // NOI18N
        sobrenosMenu.setContentAreaFilled(false);
        sobrenosMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sobrenosMenuMouseClicked(evt);
            }
        });
        sobrenosMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobrenosMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(conteudopMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 361, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(estudanteMenu)
                                    .addComponent(agendaMenu)
                                    .addComponent(notacMenu)
                                    .addComponent(questoesMenu)
                                    .addComponent(checklistMenu))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sobrenosMenu)
                            .addComponent(rankingMenu)
                            .addComponent(redacaoMenu))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(agendaMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checklistMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(conteudopMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(estudanteMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(notacMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(questoesMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(redacaoMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rankingMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sobrenosMenu)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel3.setText("                                                                                                       ");

        xMenuESTUDANTE.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\Tela Inicial Adm\\X.png")); // NOI18N
        xMenuESTUDANTE.setContentAreaFilled(false);
        xMenuESTUDANTE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xMenuESTUDANTEMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menuESTUDANTELayout = new javax.swing.GroupLayout(menuESTUDANTE);
        menuESTUDANTE.setLayout(menuESTUDANTELayout);
        menuESTUDANTELayout.setHorizontalGroup(
            menuESTUDANTELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuESTUDANTELayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xMenuESTUDANTE, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(menuESTUDANTELayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuESTUDANTELayout.setVerticalGroup(
            menuESTUDANTELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuESTUDANTELayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(menuESTUDANTELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(xMenuESTUDANTE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\TelaInicialEstudante\\tonton+winxstudies (4).png")); // NOI18N
        jLabel2.setText("                                                                      ");

        checklistPrincipal.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\TelaInicialEstudante\\CHECKLISTESTUDANTE.png")); // NOI18N
        checklistPrincipal.setContentAreaFilled(false);
        checklistPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checklistPrincipalMouseClicked(evt);
            }
        });

        redacaoPrincipal.setContentAreaFilled(false);
        redacaoPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                redacaoPrincipalMouseClicked(evt);
            }
        });

        questoesPrincipal.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\TelaInicialEstudante\\QUESTOESESTUDANTE (4).png")); // NOI18N
        questoesPrincipal.setContentAreaFilled(false);
        questoesPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                questoesPrincipalMouseClicked(evt);
            }
        });

        agendaPrincipal.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\TelaInicialEstudante\\AGENDAESTUDANTE.png")); // NOI18N
        agendaPrincipal.setContentAreaFilled(false);
        agendaPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agendaPrincipalMouseClicked(evt);
            }
        });

        agendaPrincipal1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\TelaInicialEstudante\\REDACAOESTUDANTE (1).png")); // NOI18N
        agendaPrincipal1.setContentAreaFilled(false);
        agendaPrincipal1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agendaPrincipal1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuESTUDANTE, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(questoesPrincipal)
                                .addGap(82, 82, 82)
                                .addComponent(checklistPrincipal)
                                .addGap(57, 57, 57)
                                .addComponent(agendaPrincipal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(redacaoPrincipal))
                            .addComponent(jLabel1))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(agendaPrincipal1))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1414, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(agendaPrincipal))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(redacaoPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(agendaPrincipal1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(questoesPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(checklistPrincipal, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(143, 143, 143))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(menuESTUDANTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuarioMouseClicked
       
    }//GEN-LAST:event_UsuarioMouseClicked

    private void menuestudanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuestudanteMouseClicked
        openMenuBar();
    }//GEN-LAST:event_menuestudanteMouseClicked

    private void xMenuESTUDANTEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMenuESTUDANTEMouseClicked
        closeMenuBar();
    }//GEN-LAST:event_xMenuESTUDANTEMouseClicked

    private void menuESTUDANTEAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_menuESTUDANTEAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_menuESTUDANTEAncestorMoved

    private void redacaoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redacaoMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_redacaoMenuActionPerformed

    private void redacaoMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redacaoMenuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_redacaoMenuMouseClicked

    private void checklistMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checklistMenuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_checklistMenuMouseClicked

    private void questoesMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_questoesMenuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_questoesMenuMouseClicked

    private void estudanteMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estudanteMenuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_estudanteMenuMouseClicked

    private void notacMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notacMenuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_notacMenuMouseClicked

    private void agendaMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agendaMenuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_agendaMenuMouseClicked

    private void conteudopMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conteudopMenuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_conteudopMenuMouseClicked

    private void questoesAtalho1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_questoesAtalho1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_questoesAtalho1MouseClicked

    private void ChecklistAtalhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChecklistAtalhoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ChecklistAtalhoMouseClicked

    private void rankingAtalhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rankingAtalhoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rankingAtalhoMouseClicked

    private void questoesPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_questoesPrincipalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_questoesPrincipalMouseClicked

    private void checklistPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checklistPrincipalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_checklistPrincipalMouseClicked

    private void agendaPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agendaPrincipalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_agendaPrincipalMouseClicked

    private void redacaoPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redacaoPrincipalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_redacaoPrincipalMouseClicked

    private void checklistMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checklistMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checklistMenuActionPerformed

    private void agendaPrincipal1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agendaPrincipal1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_agendaPrincipal1MouseClicked

    private void rankingMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rankingMenuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rankingMenuMouseClicked

    private void rankingMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankingMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rankingMenuActionPerformed

    private void sobrenosMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sobrenosMenuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_sobrenosMenuMouseClicked

    private void sobrenosMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobrenosMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sobrenosMenuActionPerformed

    private void progressoAtalhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_progressoAtalhoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_progressoAtalhoMouseClicked

    private void rankingAtalhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankingAtalhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rankingAtalhoActionPerformed

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
            java.util.logging.Logger.getLogger(TELAINICIALDOESTUDANTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TELAINICIALDOESTUDANTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TELAINICIALDOESTUDANTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TELAINICIALDOESTUDANTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TELAINICIALDOESTUDANTE().setVisible(true);
            }
        });
    }
    
    int w=425;
    int h=485;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChecklistAtalho;
    private javax.swing.JButton Usuario;
    private javax.swing.JButton agendaMenu;
    private javax.swing.JButton agendaPrincipal;
    private javax.swing.JButton agendaPrincipal1;
    private javax.swing.JButton checklistMenu;
    private javax.swing.JButton checklistPrincipal;
    private javax.swing.JButton conteudopMenu;
    private javax.swing.JButton estudanteMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel menuESTUDANTE;
    private javax.swing.JButton menuestudante;
    private javax.swing.JButton notacMenu;
    private javax.swing.JButton progressoAtalho;
    private javax.swing.JButton questoesAtalho1;
    private javax.swing.JButton questoesMenu;
    private javax.swing.JButton questoesPrincipal;
    private javax.swing.JButton rankingAtalho;
    private javax.swing.JButton rankingMenu;
    private javax.swing.JButton redacaoMenu;
    private javax.swing.JButton redacaoPrincipal;
    private javax.swing.JButton sobrenosMenu;
    private javax.swing.JButton xMenuESTUDANTE;
    // End of variables declaration//GEN-END:variables

     private void openMenuBar(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<w;i++){
                    menuESTUDANTE.setSize(w, h);
                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(TELAINICIALDOESTUDANTE.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();
}
       private void closeMenuBar(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=w;i>0;i--){
                    menuESTUDANTE.setSize(i, h);
                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(TELAINICIALDOESTUDANTE.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();
}
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

/**
 *
 * @author Gisele Vieira
 */
public class editarNotadeCorte extends javax.swing.JFrame {

    /**
     * Creates new form editarNotadeCorte
     */
    public editarNotadeCorte() {
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

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        sair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        lblNomeCurso = new javax.swing.JLabel();
        lblFaleCurso = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lblNomeUniversidade = new javax.swing.JLabel();
        lblFaleUniversidade = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblNotaMedia = new javax.swing.JLabel();
        notaCorteMedia = new javax.swing.JTextField();
        editarNotaCorteMedia = new javax.swing.JButton();
        salvar = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        sobreCurso = new javax.swing.JTextArea();
        editarSobreCurso = new javax.swing.JButton();
        nomeCurso = new javax.swing.JTextField();
        editarNomeCurso = new javax.swing.JButton();
        nomeUniversidade = new javax.swing.JTextField();
        editarUniversidade = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        sobreUniversidade = new javax.swing.JTextArea();
        editarSobreUniversidade = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(229, 255, 249));

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

        jPanel1.setBackground(new java.awt.Color(229, 255, 249));

        titulo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\Acicionar Notas de Corte (1).png")); // NOI18N

        lblNomeCurso.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\Nome do Curso_.png")); // NOI18N

        lblFaleCurso.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\Escreva um pouco sobre o curso_.png")); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        lblNomeUniversidade.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\Nome da Universidade_.png")); // NOI18N

        lblFaleUniversidade.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\Escreva um pouco sobre o curso_.png")); // NOI18N

        jPanel4.setBackground(new java.awt.Color(216, 245, 238));

        lblNotaMedia.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\Nota de Corte média_ (1).png")); // NOI18N

        notaCorteMedia.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        notaCorteMedia.setForeground(new java.awt.Color(1, 68, 68));
        notaCorteMedia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        notaCorteMedia.setCaretColor(new java.awt.Color(0, 102, 102));
        notaCorteMedia.setEnabled(false);
        notaCorteMedia.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        notaCorteMedia.setSelectionColor(new java.awt.Color(175, 211, 211));
        notaCorteMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notaCorteMediaActionPerformed(evt);
            }
        });

        editarNotaCorteMedia.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\editor.png")); // NOI18N
        editarNotaCorteMedia.setToolTipText("Editar");
        editarNotaCorteMedia.setContentAreaFilled(false);
        editarNotaCorteMedia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarNotaCorteMedia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarNotaCorteMediaMouseClicked(evt);
            }
        });
        editarNotaCorteMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarNotaCorteMediaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(lblNotaMedia)
                .addGap(18, 18, 18)
                .addComponent(notaCorteMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editarNotaCorteMedia)
                .addContainerGap(211, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNotaMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(editarNotaCorteMedia)
                        .addComponent(notaCorteMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(66, 66, 66))
        );

        salvar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\ver sobre (2).png")); // NOI18N
        salvar.setBorder(null);
        salvar.setBorderPainted(false);
        salvar.setContentAreaFilled(false);
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        sobreCurso.setColumns(20);
        sobreCurso.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        sobreCurso.setForeground(new java.awt.Color(0, 102, 102));
        sobreCurso.setRows(2);
        sobreCurso.setCaretColor(new java.awt.Color(0, 102, 102));
        sobreCurso.setEnabled(false);
        sobreCurso.setFocusCycleRoot(true);
        sobreCurso.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        sobreCurso.setSelectionColor(new java.awt.Color(217, 252, 252));
        jScrollPane5.setViewportView(sobreCurso);

        editarSobreCurso.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\editor.png")); // NOI18N
        editarSobreCurso.setBorder(null);
        editarSobreCurso.setContentAreaFilled(false);
        editarSobreCurso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarSobreCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarSobreCursoMouseClicked(evt);
            }
        });
        editarSobreCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarSobreCursoActionPerformed(evt);
            }
        });

        nomeCurso.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        nomeCurso.setForeground(new java.awt.Color(1, 68, 68));
        nomeCurso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        nomeCurso.setCaretColor(new java.awt.Color(0, 102, 102));
        nomeCurso.setEnabled(false);
        nomeCurso.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        nomeCurso.setSelectionColor(new java.awt.Color(175, 211, 211));
        nomeCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeCursoActionPerformed(evt);
            }
        });

        editarNomeCurso.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\editor.png")); // NOI18N
        editarNomeCurso.setToolTipText("Editar");
        editarNomeCurso.setBorder(null);
        editarNomeCurso.setContentAreaFilled(false);
        editarNomeCurso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarNomeCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarNomeCursoMouseClicked(evt);
            }
        });
        editarNomeCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarNomeCursoActionPerformed(evt);
            }
        });

        nomeUniversidade.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        nomeUniversidade.setForeground(new java.awt.Color(1, 68, 68));
        nomeUniversidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        nomeUniversidade.setCaretColor(new java.awt.Color(0, 102, 102));
        nomeUniversidade.setEnabled(false);
        nomeUniversidade.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        nomeUniversidade.setSelectionColor(new java.awt.Color(175, 211, 211));
        nomeUniversidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeUniversidadeActionPerformed(evt);
            }
        });

        editarUniversidade.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\editor.png")); // NOI18N
        editarUniversidade.setToolTipText("Editar");
        editarUniversidade.setBorder(null);
        editarUniversidade.setBorderPainted(false);
        editarUniversidade.setContentAreaFilled(false);
        editarUniversidade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarUniversidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarUniversidadeMouseClicked(evt);
            }
        });
        editarUniversidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarUniversidadeActionPerformed(evt);
            }
        });

        sobreUniversidade.setColumns(20);
        sobreUniversidade.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        sobreUniversidade.setForeground(new java.awt.Color(0, 102, 102));
        sobreUniversidade.setRows(2);
        sobreUniversidade.setCaretColor(new java.awt.Color(0, 102, 102));
        sobreUniversidade.setEnabled(false);
        sobreUniversidade.setFocusCycleRoot(true);
        sobreUniversidade.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        sobreUniversidade.setSelectionColor(new java.awt.Color(217, 252, 252));
        jScrollPane6.setViewportView(sobreUniversidade);

        editarSobreUniversidade.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gisele Vieira\\Downloads\\editor.png")); // NOI18N
        editarSobreUniversidade.setToolTipText("Editar");
        editarSobreUniversidade.setContentAreaFilled(false);
        editarSobreUniversidade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarSobreUniversidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarSobreUniversidadeMouseClicked(evt);
            }
        });
        editarSobreUniversidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarSobreUniversidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(565, 565, 565)
                        .addComponent(titulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(editarSobreUniversidade))
                            .addComponent(lblFaleCurso)
                            .addComponent(lblFaleUniversidade)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblNomeUniversidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(nomeUniversidade))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblNomeCurso)
                                        .addGap(18, 18, 18)
                                        .addComponent(nomeCurso))
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(editarUniversidade)
                                    .addComponent(editarNomeCurso)
                                    .addComponent(editarSobreCurso))))))
                .addGap(0, 814, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(620, 620, 620)
                        .addComponent(salvar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(titulo)
                .addGap(101, 101, 101)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeCurso)
                    .addComponent(editarNomeCurso)
                    .addComponent(nomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(lblFaleCurso)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editarSobreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNomeUniversidade)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(nomeUniversidade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(editarUniversidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(lblFaleUniversidade)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editarSobreUniversidade, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(salvar)
                .addGap(55, 55, 55))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1105, Short.MAX_VALUE)
                .addComponent(sair)
                .addGap(31, 31, 31))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sair))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 883, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sairActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salvarActionPerformed

    private void editarSobreCursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarSobreCursoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_editarSobreCursoMouseClicked

    private void editarSobreCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarSobreCursoActionPerformed
        sobreCurso.setEnabled(true);
    }//GEN-LAST:event_editarSobreCursoActionPerformed

    private void nomeCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeCursoActionPerformed

    private void editarNomeCursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarNomeCursoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_editarNomeCursoMouseClicked

    private void editarNomeCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarNomeCursoActionPerformed
       
        nomeCurso.setEnabled(true);
    }//GEN-LAST:event_editarNomeCursoActionPerformed

    private void nomeUniversidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeUniversidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeUniversidadeActionPerformed

    private void editarUniversidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarUniversidadeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_editarUniversidadeMouseClicked

    private void editarUniversidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarUniversidadeActionPerformed
        // TODO add your handling code here:
        nomeUniversidade.setEnabled(true);
    }//GEN-LAST:event_editarUniversidadeActionPerformed

    private void editarSobreUniversidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarSobreUniversidadeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_editarSobreUniversidadeMouseClicked

    private void editarSobreUniversidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarSobreUniversidadeActionPerformed
        // TODO add your handling code here:
         sobreUniversidade.setEnabled(true);
    }//GEN-LAST:event_editarSobreUniversidadeActionPerformed

    private void notaCorteMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notaCorteMediaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_notaCorteMediaActionPerformed

    private void editarNotaCorteMediaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarNotaCorteMediaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_editarNotaCorteMediaMouseClicked

    private void editarNotaCorteMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarNotaCorteMediaActionPerformed
        // TODO add your handling code here:
        notaCorteMedia.setEnabled(true);
    }//GEN-LAST:event_editarNotaCorteMediaActionPerformed

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
            java.util.logging.Logger.getLogger(editarNotadeCorte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editarNotadeCorte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editarNotadeCorte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editarNotadeCorte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editarNotadeCorte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editarNomeCurso;
    private javax.swing.JButton editarNotaCorteMedia;
    private javax.swing.JButton editarSobreCurso;
    private javax.swing.JButton editarSobreUniversidade;
    private javax.swing.JButton editarUniversidade;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblFaleCurso;
    private javax.swing.JLabel lblFaleUniversidade;
    private javax.swing.JLabel lblNomeCurso;
    private javax.swing.JLabel lblNomeUniversidade;
    private javax.swing.JLabel lblNotaMedia;
    private javax.swing.JTextField nomeCurso;
    private javax.swing.JTextField nomeUniversidade;
    private javax.swing.JTextField notaCorteMedia;
    private javax.swing.JButton sair;
    private javax.swing.JButton salvar;
    private javax.swing.JTextArea sobreCurso;
    private javax.swing.JTextArea sobreUniversidade;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}

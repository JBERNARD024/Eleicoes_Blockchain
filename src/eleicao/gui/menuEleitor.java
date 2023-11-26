/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package eleicao.gui;

import eleicao.core.Eleitor;
import eleicao.utils.Recursos;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
/**
 *
 * @author menuInicial
 */
public class menuEleitor extends javax.swing.JDialog {

    menuInicial menu;
    DefaultListModel dList;
    String getSexo[] = {"Masculino", "Feminino"};
    int index;
    int tamanho;
    File f;

    /**
     * Creates new form menuEleitor
     *
     * @param parent
     * @param menu
     * @param model
     */
    public menuEleitor(JDialog parent, menuInicial menu, boolean model) {
        super(parent, model);
        this.menu = menu;
        initComponents();
        if (menu.eleitores != null) {
            dList = Recursos.listaEleitores(menu.eleitores);
            tamanho = dList.getSize();
            if(tamanho == 0){
                index = -1;
            }else{
                index = 0;
            }
            listEleitores.setModel(dList);
            listEleitores.setSelectedIndex(0);
        }
        panelEleitor.setVisible(dList.size() > 0);
        btnEliminaEleitor.setEnabled(dList.size() > 0);
        panelBtns.setVisible(dList.size() > 0);
        lblRegisto.setEnabled(dList.size() > 0);
        btnEditarEleitor.setEnabled(dList.size() > 0);     
        btnPrimeiro.setEnabled(index > 1);
        btnAnterior.setEnabled(index > 1);
        btnAvancar.setEnabled(index < dList.getSize() - 1);
        btnUltimo.setEnabled(index < dList.getSize() - 1);
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
        btnSair = new javax.swing.JButton();
        panelEleitor = new javax.swing.JPanel();
        panelFoto = new javax.swing.JPanel();
        labelFoto = new javax.swing.JLabel();
        labelSexo = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        txtSexo = new javax.swing.JTextField();
        txtIdade = new javax.swing.JTextField();
        labelNumAluno = new javax.swing.JLabel();
        txtCC = new javax.swing.JTextField();
        labelIdade = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelData = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txtDataNasc = new javax.swing.JTextField();
        labelAbrir = new javax.swing.JLabel();
        btnOpen = new javax.swing.JButton();
        labelGuardar = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        panelBtns = new javax.swing.JPanel();
        btnPrimeiro = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnAvancar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnNovoEleitor = new javax.swing.JButton();
        btnEditarEleitor = new javax.swing.JButton();
        btnEliminaEleitor = new javax.swing.JButton();
        lblRegisto = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        listEleitores = new javax.swing.JList<>();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu Eleitor");
        setMinimumSize(new java.awt.Dimension(500, 350));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(637, 598, 112, 52));

        labelFoto.setForeground(new java.awt.Color(242, 242, 242));
        labelFoto.setMaximumSize(new java.awt.Dimension(175, 175));

        javax.swing.GroupLayout panelFotoLayout = new javax.swing.GroupLayout(panelFoto);
        panelFoto.setLayout(panelFotoLayout);
        panelFotoLayout.setHorizontalGroup(
            panelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFotoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(labelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelFotoLayout.setVerticalGroup(
            panelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        labelSexo.setText("Sexo");

        labelPassword.setText("  Password");

        txtSexo.setEditable(false);

        txtIdade.setEditable(false);

        labelNumAluno.setText("Número de Aluno");
        labelNumAluno.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        labelNumAluno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtCC.setEditable(false);
        txtCC.setPreferredSize(new java.awt.Dimension(100, 30));

        labelIdade.setText("Idade");

        labelNome.setText("                                          Nome");

        labelData.setText(" Data de Nascimento");

        txtNome.setEditable(false);
        txtNome.setPreferredSize(new java.awt.Dimension(290, 40));

        txtPassword.setEditable(false);

        txtDataNasc.setEditable(false);
        txtDataNasc.setPreferredSize(new java.awt.Dimension(100, 30));

        javax.swing.GroupLayout panelEleitorLayout = new javax.swing.GroupLayout(panelEleitor);
        panelEleitor.setLayout(panelEleitorLayout);
        panelEleitorLayout.setHorizontalGroup(
            panelEleitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEleitorLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(panelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelEleitorLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelEleitorLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelEleitorLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(labelNumAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(labelSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelEleitorLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(txtCC, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelEleitorLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(labelData, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(labelIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelEleitorLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelEleitorLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelEleitorLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelEleitorLayout.setVerticalGroup(
            panelEleitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEleitorLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(panelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(panelEleitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNumAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panelEleitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCC, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEleitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelData)
                    .addComponent(labelIdade))
                .addGap(6, 6, 6)
                .addGroup(panelEleitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(labelPassword)
                .addGap(6, 6, 6)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(panelEleitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 6, -1, 475));

        labelAbrir.setText("      Abrir");
        getContentPane().add(labelAbrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 85, 70, -1));

        btnOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eleicao/images/abrir.png"))); // NOI18N
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });
        getContentPane().add(btnOpen, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 70, 70));

        labelGuardar.setText("     Guardar");
        getContentPane().add(labelGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 85, 70, -1));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eleicao/images/guardarFicheiro.png"))); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 70));

        btnPrimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eleicao/images/Primeiro.png"))); // NOI18N
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });

        btnUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eleicao/images/Ultimo.png"))); // NOI18N
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eleicao/images/Anterior.png"))); // NOI18N
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnAvancar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eleicao/images/Proximo.png"))); // NOI18N
        btnAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBtnsLayout = new javax.swing.GroupLayout(panelBtns);
        panelBtns.setLayout(panelBtnsLayout);
        panelBtnsLayout.setHorizontalGroup(
            panelBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtnsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelBtnsLayout.setVerticalGroup(
            panelBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtnsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelBtns, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 593, -1, -1));

        btnNovoEleitor.setText("Adicionar Eleitor");
        btnNovoEleitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoEleitorActionPerformed(evt);
            }
        });

        btnEditarEleitor.setText("Editar Eleitor");
        btnEditarEleitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEleitorActionPerformed(evt);
            }
        });

        btnEliminaEleitor.setText("Eliminar Eleitor");
        btnEliminaEleitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaEleitorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnNovoEleitor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditarEleitor, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminaEleitor, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarEleitor, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovoEleitor, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminaEleitor, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 487, -1, -1));

        lblRegisto.setBackground(new java.awt.Color(0, 0, 0));
        lblRegisto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(lblRegisto, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 552, 200, 30));
        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 120, -1, 426));

        listEleitores.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listEleitoresValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(listEleitores);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 120, 392, 426));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminaEleitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaEleitorActionPerformed
        tamanho = dList.size();
        index = listEleitores.getSelectedIndex();
        dList = Recursos.listaEleitores(menu.eleitores);
        if (tamanho >= 0) {
            dList.remove(index);
            menu.eleitores.remove(index);
            int indice = 0;
            if (index - 1 > 0) {
                index -= 1;
                indice = index;
            } else {
                index = -1;
                indice = index;
            }
            dList.clear();
            listEleitores.setModel(dList);
            dList = Recursos.listaEleitores(menu.eleitores);
            listEleitores.setModel(dList);
            listEleitores.setSelectedIndex(indice);
            lblRegisto.setText("Registo " + (indice + 1) + "/" + dList.size());
        }
        btnEliminaEleitor.setEnabled(dList.size() > 0);
        panelEleitor.setVisible(dList.size() > 0);
        btnPrimeiro.setEnabled(index > 1);
        btnAnterior.setEnabled(index > 1);
        btnAvancar.setEnabled(index < dList.getSize() - 1);
        btnUltimo.setEnabled(index < dList.getSize() - 1);
    }//GEN-LAST:event_btnEliminaEleitorActionPerformed

    private void btnNovoEleitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoEleitorActionPerformed
        this.dispose();
        new adicionaEleitor(this, f, menu, true).setVisible(true);
    }//GEN-LAST:event_btnNovoEleitorActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
        new configEleicaoMenu(menu, true).setVisible(true);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser("../Eleicao_Blockchain_Teste/eleitores");
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            try {
                f = fc.getSelectedFile();
                menu.eleitores = (ArrayList<Eleitor>) Recursos.readObject(f.getAbsolutePath());
                dList = Recursos.listaEleitores(menu.eleitores);
                tamanho = dList.getSize();
                listEleitores.setModel(dList);
                index = 0;
                listEleitores.setSelectedIndex(index);
                lblRegisto.setText("Registo " + 1 + "/" + tamanho);
                panelEleitor.setVisible(dList.size() > 0);
                btnEliminaEleitor.setEnabled(dList.size() > 0);
                panelBtns.setVisible(dList.size() > 0);
                btnPrimeiro.setEnabled(index > 1);
                btnAnterior.setEnabled(index > 1);
                btnAvancar.setEnabled(index < dList.getSize() - 1);
                btnUltimo.setEnabled(index < dList.getSize() - 1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnOpenActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser("../Eleicao_Blockchain_Teste/eleitores");
        if (fc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            try {
                f = fc.getSelectedFile();
                if (!f.getName().endsWith(".elect")) {
                    f = new File(f.getAbsolutePath() + ".elect");
                }
                Recursos.writeObject(menu.eleitores, f.getAbsolutePath());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEditarEleitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEleitorActionPerformed
        // TODO add your handling code here:
        index = listEleitores.getSelectedIndex();
        Eleitor e = menu.eleitores.get(index);
        this.dispose();
        new editaEleitor(this, e, index,f, menu, true).setVisible(true);
    }//GEN-LAST:event_btnEditarEleitorActionPerformed

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        // TODO add your handling code here:
        index = 0;
        listEleitores.setSelectedIndex(index);
        lblRegisto.setText("Registo " + (index + 1) + "/" + dList.size());
        btnPrimeiro.setEnabled(index > 0);
        btnAnterior.setEnabled(index > 0);
        btnAvancar.setEnabled(index < dList.getSize() - 1);
        btnUltimo.setEnabled(index < dList.getSize() - 1);
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        // TODO add your handling code here:
        index = dList.size() - 1;
        listEleitores.setSelectedIndex(index);
        lblRegisto.setText("Registo " + dList.size() + "/" + dList.size());
        btnPrimeiro.setEnabled(index > 0);
        btnAnterior.setEnabled(index > 0);
        btnAvancar.setEnabled(index < dList.getSize() - 1);
        btnUltimo.setEnabled(index < dList.getSize() - 1);
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        // TODO add your handling code here:
        tamanho = dList.size();
        index -= 1;
        if (tamanho > index) {
            listEleitores.setSelectedIndex(index);
            lblRegisto.setText("Registo " + (index + 1) + "/" + tamanho);
            btnPrimeiro.setEnabled(index > 0);
            btnAnterior.setEnabled(index > 0);
            btnAvancar.setEnabled(index < tamanho - 1);
            btnUltimo.setEnabled(index < tamanho - 1);
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancarActionPerformed
        // TODO add your handling code here:
        tamanho = dList.size();
        index += 1;
        if (tamanho > index) {
            listEleitores.setSelectedIndex(index);
            lblRegisto.setText("Registo " + (index + 1) + "/" + tamanho);
            btnPrimeiro.setEnabled(index > 0);
            btnAnterior.setEnabled(index > 0);
            btnAvancar.setEnabled(index < tamanho - 1);
            btnUltimo.setEnabled(index < tamanho - 1);
        }
    }//GEN-LAST:event_btnAvancarActionPerformed

    private void listEleitoresValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listEleitoresValueChanged
        // TODO add your handling code here:
        tamanho = dList.size();
        index = listEleitores.getSelectedIndex();
        lblRegisto.setText("Registo " + (index + 1) + "/" + tamanho);
        if (index >= 0) {
            mostraPanelEleitor();
            Eleitor e = (Eleitor) listEleitores.getSelectedValues()[0];
            menu.eleitores.get(index);
            txtNome.setText(e.getNome());
            txtCC.setText(e.getCC());
            if (e.getSexo() == 'M') {
                txtSexo.setText(getSexo[0]);
            } else {
                txtSexo.setText(getSexo[1]);
            }
            txtDataNasc.setText(e.getDatatoString());
            txtIdade.setText(String.valueOf(e.idadeEleitor()));
            txtPassword.setText(e.getPassword().toString());
            ImageIcon icon = new ImageIcon(e.getImagem());
            Image imagem = icon.getImage().getScaledInstance(labelFoto.getWidth(), labelFoto.getHeight(), Image.SCALE_SMOOTH);
            panelFoto.setBackground(Color.white);
            labelFoto.setBackground(Color.white);
            labelFoto.setIcon(new ImageIcon(imagem));
        }
        btnPrimeiro.setEnabled(index > 1);
        btnAnterior.setEnabled(index > 1);
        btnAvancar.setEnabled(index < dList.getSize() - 1);
        btnUltimo.setEnabled(index < dList.getSize() - 1);
    }//GEN-LAST:event_listEleitoresValueChanged

    /**
     * Mostra o Painel do Eleitor
     */
    public void mostraPanelEleitor() {
        panelFoto.setVisible(true);
        labelFoto.setVisible(true);
        panelEleitor.setVisible(true);
        txtNome.setVisible(true);
        txtCC.setVisible(true);
        txtDataNasc.setVisible(true);
        txtIdade.setVisible(true);
        txtPassword.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnAvancar;
    private javax.swing.JButton btnEditarEleitor;
    private javax.swing.JButton btnEliminaEleitor;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNovoEleitor;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelAbrir;
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel labelFoto;
    private javax.swing.JLabel labelGuardar;
    private javax.swing.JLabel labelIdade;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNumAluno;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelSexo;
    private javax.swing.JLabel lblRegisto;
    private javax.swing.JList<String> listEleitores;
    private javax.swing.JPanel panelBtns;
    private javax.swing.JPanel panelEleitor;
    private javax.swing.JPanel panelFoto;
    private javax.swing.JTextField txtCC;
    private javax.swing.JTextField txtDataNasc;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtSexo;
    // End of variables declaration//GEN-END:variables
}
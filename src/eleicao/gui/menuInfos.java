/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package eleicao.gui;

import eleicao.core.Eleicao;
import eleicao.core.Eleitor;
import eleicao.utils.Recursos;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;

/**
 *
 * @author joaob
 */
public class menuInfos extends javax.swing.JDialog {

    File f;
    menuInicial menu;

    /**
     * Creates new form menuInfos
     */
    public menuInfos(JDialog parent, menuInicial menu, boolean model) {
        super(parent, model);
        this.menu = menu;
        initComponents();
        if (!(menu.eleicao.getNome() == null)) {
            txtNome.setText(menu.eleicao.getNome());
            txtNome.setText(menu.eleicao.getNome());
            txtDescricao.setText(menu.eleicao.getDescricao());
            dataPickerInic.datePicker.setDate(menu.eleicao.getDataInic());
            dataPickerInic.timePicker.setTime(menu.eleicao.getHoraInic());
            dataPickerFim.datePicker.setDate(menu.eleicao.getDataFim());
            dataPickerFim.timePicker.setTime(menu.eleicao.getHoraFim());
            txtNome.setEnabled(true);
            txtNome.setEditable(false);
            txtDescricao.setEnabled(true);
            txtDescricao.setEditable(false);
            dataPickerInic.setEnabled(true);
            dataPickerInic.setBackground(Color.WHITE);
            dataPickerFim.setEnabled(true);
            dataPickerFim.setBackground(Color.WHITE);
            ImageIcon icon = new ImageIcon(menu.eleicao.getImagem());
            Image imagem = icon.getImage().getScaledInstance(labelFoto.getWidth(), labelFoto.getHeight(), Image.SCALE_SMOOTH);
            panelFoto.setBackground(Color.white);
            labelFoto.setBackground(Color.white);
            labelFoto.setIcon(new ImageIcon(imagem));
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

        labelAbrir = new javax.swing.JLabel();
        btnOpen = new javax.swing.JButton();
        labelGuardar = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        labelNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        labelDataInic = new javax.swing.JLabel();
        labelDataFim = new javax.swing.JLabel();
        dataPickerInic = new com.github.lgooddatepicker.components.DateTimePicker();
        dataPickerFim = new com.github.lgooddatepicker.components.DateTimePicker();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        panelFoto = new javax.swing.JPanel();
        labelFoto = new javax.swing.JLabel();
        btnNovoEleicao = new javax.swing.JButton();
        btnEditarEleicao = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(675, 350));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        labelNome.setText("Nome:");
        labelNome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelNome.setMaximumSize(new java.awt.Dimension(40, 25));
        labelNome.setMinimumSize(new java.awt.Dimension(40, 25));
        labelNome.setPreferredSize(new java.awt.Dimension(40, 20));
        getContentPane().add(labelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 60, 30));

        txtNome.setEnabled(false);
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 320, 30));

        labelDataInic.setText("Data Início:");
        labelDataInic.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelDataInic.setMaximumSize(new java.awt.Dimension(40, 25));
        labelDataInic.setMinimumSize(new java.awt.Dimension(40, 25));
        labelDataInic.setPreferredSize(new java.awt.Dimension(40, 20));
        getContentPane().add(labelDataInic, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 60, 30));

        labelDataFim.setText("Data Fim:");
        labelDataFim.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelDataFim.setMaximumSize(new java.awt.Dimension(40, 25));
        labelDataFim.setMinimumSize(new java.awt.Dimension(40, 25));
        labelDataFim.setPreferredSize(new java.awt.Dimension(40, 20));
        getContentPane().add(labelDataFim, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 60, 30));

        dataPickerInic.setEnabled(false);
        getContentPane().add(dataPickerInic, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 320, 30));

        dataPickerFim.setEnabled(false);
        getContentPane().add(dataPickerFim, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 320, 30));

        jLabel2.setText("Descrição:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 60, 50));

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        txtDescricao.setEnabled(false);
        jScrollPane1.setViewportView(txtDescricao);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 320, 50));

        labelFoto.setForeground(new java.awt.Color(242, 242, 242));
        labelFoto.setMinimumSize(new java.awt.Dimension(150, 150));
        labelFoto.setPreferredSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout panelFotoLayout = new javax.swing.GroupLayout(panelFoto);
        panelFoto.setLayout(panelFotoLayout);
        panelFotoLayout.setHorizontalGroup(
            panelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFotoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelFotoLayout.setVerticalGroup(
            panelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFotoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(panelFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        btnNovoEleicao.setText("Adicionar Eleição");
        btnNovoEleicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoEleicaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovoEleicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 130, 30));

        btnEditarEleicao.setText("Editar Eleição");
        btnEditarEleicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEleicaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditarEleicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, -1, 30));

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, -1, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser("../Eleicao_Blockchain_Teste/eleicao");
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            try {
                f = fc.getSelectedFile();
                menu.eleicao = (Eleicao) Recursos.readObject(f.getAbsolutePath());
                menu.eleitores = menu.eleicao.getEleitores();
                menu.candidatos = menu.eleicao.getCandidatos();
                menu.votos = menu.eleicao.getVotos();
                menu.resultados = menu.eleicao.getResultados();
                txtNome.setText(menu.eleicao.getNome());
                txtDescricao.setText(menu.eleicao.getDescricao());
                dataPickerInic.datePicker.setDate(menu.eleicao.getDataInic());
                dataPickerInic.timePicker.setTime(menu.eleicao.getHoraInic());
                dataPickerFim.datePicker.setDate(menu.eleicao.getDataFim());
                dataPickerFim.timePicker.setTime(menu.eleicao.getHoraFim());
                txtNome.setEnabled(true);
                txtNome.setEditable(false);
                txtDescricao.setEnabled(true);
                txtDescricao.setEditable(false);
                dataPickerInic.setEnabled(true);
                dataPickerInic.setBackground(Color.WHITE);
                dataPickerFim.setEnabled(true);
                dataPickerFim.setBackground(Color.WHITE);
                ImageIcon icon = new ImageIcon(menu.eleicao.getImagem());
                Image imagem = icon.getImage().getScaledInstance(labelFoto.getWidth(), labelFoto.getHeight(), Image.SCALE_SMOOTH);
                panelFoto.setBackground(Color.white);
                labelFoto.setBackground(Color.white);
                labelFoto.setIcon(new ImageIcon(imagem));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnOpenActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser("../Eleicao_Blockchain_Teste/eleicao");
        if (fc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            try {
                f = fc.getSelectedFile();
                if (!f.getName().endsWith(".elect")) {
                    f = new File(f.getAbsolutePath() + ".elect");
                }
                Recursos.writeObject(menu.eleicao, f.getAbsolutePath());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNovoEleicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoEleicaoActionPerformed
        this.dispose();
        new adicionaEleicao(this, f, menu, true).setVisible(true);
    }//GEN-LAST:event_btnNovoEleicaoActionPerformed

    private void btnEditarEleicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEleicaoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new editaEleicao(this, menu, true).setVisible(true);
    }//GEN-LAST:event_btnEditarEleicaoActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new configEleicaoMenu(menu, true).setVisible(true);
    }//GEN-LAST:event_btnSairActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarEleicao;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNovoEleicao;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnSair;
    private com.github.lgooddatepicker.components.DateTimePicker dataPickerFim;
    private com.github.lgooddatepicker.components.DateTimePicker dataPickerInic;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAbrir;
    private javax.swing.JLabel labelDataFim;
    private javax.swing.JLabel labelDataInic;
    private javax.swing.JLabel labelFoto;
    private javax.swing.JLabel labelGuardar;
    private javax.swing.JLabel labelNome;
    private javax.swing.JPanel panelFoto;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}

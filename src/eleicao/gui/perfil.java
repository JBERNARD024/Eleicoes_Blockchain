/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package eleicao.gui;

import eleicao.core.Eleitor;
import javax.swing.JDialog;

/**
 *
 * @author joaob
 */
public class perfil extends javax.swing.JDialog {

    menuInicial menu;
    Eleitor e;
    int indiceElect;

    /**
     * Creates new form perfil
     * @param parent
     * @param menu
     * @param e
     * @param indiceElect
     * @param model
     */
    public perfil(JDialog parent, menuInicial menu, Eleitor e, int indiceElect, boolean model) {
        super(parent, model);
        this.menu = menu;
        this.e = e;
        this.indiceElect = indiceElect;
        initComponents();
        txtNome.setText(e.getNome());
        if (e.isVoted()) {
            txtVoto.setText("Já exerceu o direito de voto.");
            btnVoto.setText("Ver Voto");
        } else {
            txtVoto.setText("Não exerceu o direito de voto.");
            btnVoto.setText("Votar");
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

        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtVoto = new javax.swing.JLabel();
        btnVoto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Perfil");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(400, 350));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNome.setLabelFor(txtNome);
        lblNome.setText("Nome: ");
        lblNome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 50, 25));

        txtNome.setEditable(false);
        txtNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 200, 25));

        txtVoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtVoto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtVoto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtVoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 250, 30));

        btnVoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVotoActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVotoActionPerformed
        // TODO add your handling code here:
        if (e.isVoted()) {
            //Mostrar em que em votou
        } else {
            new menuVotar(this, menu, e, indiceElect, true).setVisible(true);
        }
    }//GEN-LAST:event_btnVotoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoto;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTextField txtNome;
    private javax.swing.JLabel txtVoto;
    // End of variables declaration//GEN-END:variables
}
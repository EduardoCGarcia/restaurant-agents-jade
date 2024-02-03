package com.edc.restaurant.views;

import com.edc.restaurant.models.ConfigFile;
import com.edc.restaurant.models.Product;
import com.edc.restaurant.tools.FondoImagen;
import java.awt.BorderLayout;

public class InfoProductView extends javax.swing.JDialog {
    private Product product;
    private ConfigFile configFile;

    public InfoProductView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public InfoProductView(java.awt.Frame parent, boolean modal, Product product, ConfigFile configFile) {
        super(parent, modal);
        
        this.product = product;
        this.configFile = configFile;
        
        initComponents();
        
        this.lblNombre.setText(this.product.getNombre());
        this.lblPrecio.setText("$ " + this.product.getPrecio() + " UDS");
        this.txtPaneDescripcion.setText(this.product.getDescripcion());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContainer = new javax.swing.JPanel();
        pnlImage = (this.product != null) ?
        new FondoImagen(this.configFile.getRutaImagenes(),this.product.getIcon()) :
        new javax.swing.JPanel();
        pnlInfo = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPaneDescripcion = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlContainer.setMinimumSize(new java.awt.Dimension(750, 250));
        pnlContainer.setPreferredSize(new java.awt.Dimension(750, 250));
        pnlContainer.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout pnlImageLayout = new javax.swing.GroupLayout(pnlImage);
        pnlImage.setLayout(pnlImageLayout);
        pnlImageLayout.setHorizontalGroup(
            pnlImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        pnlImageLayout.setVerticalGroup(
            pnlImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        pnlContainer.add(pnlImage, java.awt.BorderLayout.LINE_END);

        pnlInfo.setBackground(new java.awt.Color(255, 255, 255));
        pnlInfo.setLayout(new java.awt.GridLayout(3, 1));

        lblNombre.setFont(new java.awt.Font("FiraCode Nerd Font SemBd", 1, 24)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 102));
        lblNombre.setText("Nombre del producto seleccionado");
        pnlInfo.add(lblNombre);

        lblPrecio.setFont(new java.awt.Font("FiraCode Nerd Font SemBd", 3, 36)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(0, 102, 0));
        lblPrecio.setText("$ Precio");
        pnlInfo.add(lblPrecio);

        txtPaneDescripcion.setEditable(false);
        txtPaneDescripcion.setFont(new java.awt.Font("FiraCode Nerd Font Mono SemBd", 0, 18)); // NOI18N
        jScrollPane2.setViewportView(txtPaneDescripcion);

        pnlInfo.add(jScrollPane2);

        pnlContainer.add(pnlInfo, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlContainer, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(InfoProductView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InfoProductView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InfoProductView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfoProductView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InfoProductView dialog = new InfoProductView(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlImage;
    private javax.swing.JPanel pnlInfo;
    private javax.swing.JTextPane txtPaneDescripcion;
    // End of variables declaration//GEN-END:variables
}

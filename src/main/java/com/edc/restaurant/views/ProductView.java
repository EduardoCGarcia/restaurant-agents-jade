package com.edc.restaurant.views;

import com.edc.restaurant.models.Product;
import com.edc.restaurant.tools.FondoImagen;
import java.awt.BorderLayout;

public class ProductView extends javax.swing.JPanel {

    private Product product;

    public ProductView() {
        initComponents();
    }

    public ProductView(Product product) {
        this.product = product;
        initComponents();

        pnlImage = new FondoImagen(product.getIcon());
        lblNombre.setText(product.getLabel());
        lblPrecio.setText("$ " + product.getPrecio() + " UDS");
        this.pnlContainerProductInfo.add(pnlImage, BorderLayout.CENTER);
        this.pnlContainerProductInfo.add(pnlNombre, BorderLayout.NORTH);
        this.pnlContainerProductInfo.add(pnlPrecio, BorderLayout.SOUTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContainerProductInfo = new javax.swing.JPanel();
        pnlNombre = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        pnlPrecio = new javax.swing.JPanel();
        lblPrecio = new javax.swing.JLabel();
        pnlImage = new javax.swing.JPanel();
        pnlBotones = new javax.swing.JPanel();
        btnOrdenar = new javax.swing.JButton();
        btnVerDescripcion = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setMinimumSize(new java.awt.Dimension(250, 250));
        setPreferredSize(new java.awt.Dimension(250, 250));
        setLayout(new java.awt.BorderLayout());

        pnlContainerProductInfo.setBackground(new java.awt.Color(153, 255, 153));
        pnlContainerProductInfo.setMinimumSize(new java.awt.Dimension(248, 193));
        pnlContainerProductInfo.setLayout(new java.awt.BorderLayout());

        pnlNombre.setBackground(new java.awt.Color(255, 255, 255));
        pnlNombre.setForeground(new java.awt.Color(0, 0, 0));
        pnlNombre.setLayout(new java.awt.BorderLayout());

        lblNombre.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("Nombre");
        pnlNombre.add(lblNombre, java.awt.BorderLayout.CENTER);

        pnlContainerProductInfo.add(pnlNombre, java.awt.BorderLayout.PAGE_START);

        pnlPrecio.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrecio.setLayout(new java.awt.BorderLayout());

        lblPrecio.setBackground(new java.awt.Color(153, 255, 153));
        lblPrecio.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(0, 102, 0));
        lblPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecio.setText("$ Precio del producto $");
        pnlPrecio.add(lblPrecio, java.awt.BorderLayout.CENTER);

        pnlContainerProductInfo.add(pnlPrecio, java.awt.BorderLayout.PAGE_END);

        pnlImage.setMaximumSize(new java.awt.Dimension(248, 184));
        pnlImage.setMinimumSize(new java.awt.Dimension(248, 184));
        pnlImage.setPreferredSize(new java.awt.Dimension(248, 184));
        pnlContainerProductInfo.add(pnlImage, java.awt.BorderLayout.CENTER);

        add(pnlContainerProductInfo, java.awt.BorderLayout.CENTER);

        pnlBotones.setLayout(new java.awt.GridLayout(1, 0));

        btnOrdenar.setBackground(new java.awt.Color(0, 204, 255));
        btnOrdenar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnOrdenar.setForeground(new java.awt.Color(0, 51, 51));
        btnOrdenar.setText("Ver");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });
        pnlBotones.add(btnOrdenar);

        btnVerDescripcion.setBackground(new java.awt.Color(51, 255, 51));
        btnVerDescripcion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVerDescripcion.setForeground(new java.awt.Color(0, 51, 51));
        btnVerDescripcion.setText("Pedir");
        btnVerDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerDescripcionActionPerformed(evt);
            }
        });
        pnlBotones.add(btnVerDescripcion);

        add(pnlBotones, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerDescripcionActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOrdenarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnVerDescripcion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlContainerProductInfo;
    private javax.swing.JPanel pnlImage;
    private javax.swing.JPanel pnlNombre;
    private javax.swing.JPanel pnlPrecio;
    // End of variables declaration//GEN-END:variables
}

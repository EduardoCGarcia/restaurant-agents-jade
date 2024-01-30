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
        add(pnlImage, BorderLayout.CENTER);
        add(pnlNombre, BorderLayout.NORTH);
        pnlImage.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlNombre = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        pnlImage = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnOrdenar = new javax.swing.JButton();
        btnVerDescripcion = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setMinimumSize(new java.awt.Dimension(150, 86));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(new java.awt.BorderLayout());

        pnlNombre.setBackground(new java.awt.Color(255, 255, 255));
        pnlNombre.setForeground(new java.awt.Color(0, 0, 0));
        pnlNombre.setLayout(new java.awt.BorderLayout());

        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("Nombre");
        pnlNombre.add(lblNombre, java.awt.BorderLayout.CENTER);

        jPanel1.add(pnlNombre, java.awt.BorderLayout.PAGE_START);

        lblPrecio.setBackground(new java.awt.Color(153, 255, 153));
        lblPrecio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(0, 102, 0));
        lblPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecio.setText("$ Precio del producto $");
        jPanel1.add(lblPrecio, java.awt.BorderLayout.PAGE_END);

        pnlImage.setMaximumSize(new java.awt.Dimension(150, 86));
        pnlImage.setMinimumSize(new java.awt.Dimension(150, 86));
        pnlImage.setPreferredSize(new java.awt.Dimension(150, 86));
        jPanel1.add(pnlImage, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        btnOrdenar.setBackground(new java.awt.Color(0, 204, 255));
        btnOrdenar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnOrdenar.setForeground(new java.awt.Color(0, 51, 51));
        btnOrdenar.setText("Ver");
        jPanel4.add(btnOrdenar);

        btnVerDescripcion.setBackground(new java.awt.Color(51, 255, 51));
        btnVerDescripcion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVerDescripcion.setForeground(new java.awt.Color(0, 51, 51));
        btnVerDescripcion.setText("Pedir");
        btnVerDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerDescripcionActionPerformed(evt);
            }
        });
        jPanel4.add(btnVerDescripcion);

        add(jPanel4, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerDescripcionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnVerDescripcion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JPanel pnlImage;
    private javax.swing.JPanel pnlNombre;
    // End of variables declaration//GEN-END:variables
}

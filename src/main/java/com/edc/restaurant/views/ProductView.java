package com.edc.restaurant.views;

import com.edc.restaurant.models.ConfigFile;
import com.edc.restaurant.models.Product;
import com.edc.restaurant.models.ProductoCantidad;
import com.edc.restaurant.tools.FondoImagen;
import com.edc.restaurant.tools.Observable;
import com.edc.restaurant.tools.Observer;
import java.awt.BorderLayout;
import java.util.ArrayList;

public class ProductView extends javax.swing.JPanel implements Observable {

    private ArrayList<Observer> observers;

    private Product product;

    public ProductView() {
        observers = new ArrayList<>();

        initComponents();
    }

    public ProductView(Product product, ConfigFile configFile) {
        observers = new ArrayList<>();

        this.product = product;
        initComponents();

        pnlImage = new FondoImagen(configFile.getRutaImagenes(),product.getIcon());
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
        btnVerDescripcion = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();

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

        btnVerDescripcion.setBackground(new java.awt.Color(0, 204, 255));
        btnVerDescripcion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVerDescripcion.setForeground(new java.awt.Color(0, 51, 51));
        btnVerDescripcion.setText("Ver");
        btnVerDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerDescripcionActionPerformed(evt);
            }
        });
        pnlBotones.add(btnVerDescripcion);

        btnOrdenar.setBackground(new java.awt.Color(51, 255, 51));
        btnOrdenar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnOrdenar.setForeground(new java.awt.Color(0, 51, 51));
        btnOrdenar.setText("Pedir");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });
        pnlBotones.add(btnOrdenar);

        add(pnlBotones, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        notifyObservables(new ProductoCantidad(product, 1));
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void btnVerDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerDescripcionActionPerformed
        notifyObservables(this.product);
    }//GEN-LAST:event_btnVerDescripcionActionPerformed


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

    @Override
    public void addObservable(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObservable(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservables() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    @Override
    public void notifyObservables(Object arg) {
        for (Observer observer : observers) {
            observer.update(arg);
        }
    }
}

package com.edc.restaurant.views;

import com.edc.restaurant.models.Product;
import com.edc.restaurant.tools.FondoImagen;
import com.edc.restaurant.tools.Observable;
import com.edc.restaurant.tools.Observer;
import java.awt.BorderLayout;
import java.util.ArrayList;

public class CamareroMenuView extends javax.swing.JPanel implements Observable, Observer {

    private ArrayList<Observer> observers;

    public CamareroMenuView() {
        observers = new ArrayList<>();

        initComponents();
        this.pnlCamareroImage = new FondoImagen("camarero_agente.jpg");
        this.pnlCamareroContainer.add(pnlCamareroImage, BorderLayout.CENTER);
        
        this.menuProductsView1.addObservable(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlCamareroContainer = new javax.swing.JPanel();
        pnlCamareroImage = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        orderSlipTable1 = new com.edc.restaurant.views.OrderSlipTable();
        menuProductsView1 = new com.edc.restaurant.views.MenuProductsView();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.BorderLayout());

        pnlCamareroContainer.setLayout(new java.awt.BorderLayout());

        pnlCamareroImage.setMinimumSize(new java.awt.Dimension(350, 400));

        javax.swing.GroupLayout pnlCamareroImageLayout = new javax.swing.GroupLayout(pnlCamareroImage);
        pnlCamareroImage.setLayout(pnlCamareroImageLayout);
        pnlCamareroImageLayout.setHorizontalGroup(
            pnlCamareroImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        pnlCamareroImageLayout.setVerticalGroup(
            pnlCamareroImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        pnlCamareroContainer.add(pnlCamareroImage, java.awt.BorderLayout.CENTER);

        jPanel3.setMinimumSize(new java.awt.Dimension(350, 350));
        jPanel3.setPreferredSize(new java.awt.Dimension(350, 350));
        jPanel3.setLayout(new java.awt.BorderLayout());
        jPanel3.add(orderSlipTable1, java.awt.BorderLayout.CENTER);

        pnlCamareroContainer.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jPanel1.add(pnlCamareroContainer, java.awt.BorderLayout.LINE_START);
        jPanel1.add(menuProductsView1, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private com.edc.restaurant.views.MenuProductsView menuProductsView1;
    private com.edc.restaurant.views.OrderSlipTable orderSlipTable1;
    private javax.swing.JPanel pnlCamareroContainer;
    private javax.swing.JPanel pnlCamareroImage;
    // End of variables declaration//GEN-END:variables
// Inicio Observer
    @Override
    public void update(Object args) {
        if (args instanceof Product) {
            Product product = (Product) args;
            notifyObservables(args);
        }
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    // Fin Observer

    // Inicio Observable
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
    // Fin Observable
}
package com.edc.restaurant.views;

import com.edc.restaurant.models.Product;
import com.edc.restaurant.tools.FondoImagen;
import com.edc.restaurant.tools.Observable;
import com.edc.restaurant.tools.Observer;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.util.ArrayList;

public class CamareroMenuView extends javax.swing.JPanel implements Observable, Observer {

    private ArrayList<Observer> observers;

    public CamareroMenuView() {
        observers = new ArrayList<>();

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlCamareroImage = new FondoImagen("camarero_agente.jpg");
        pnlTable = new javax.swing.JPanel();
        orderSlipTable1 = new com.edc.restaurant.views.OrderSlipTable();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(350, 750));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 750));
        jPanel1.setLayout(new java.awt.GridLayout(2, 1));

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

        jPanel1.add(pnlCamareroImage);

        pnlTable.setMinimumSize(new java.awt.Dimension(350, 350));
        pnlTable.setPreferredSize(new java.awt.Dimension(350, 350));
        pnlTable.setLayout(new java.awt.BorderLayout());
        pnlTable.add(orderSlipTable1, java.awt.BorderLayout.CENTER);

        jPanel1.add(pnlTable);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private com.edc.restaurant.views.OrderSlipTable orderSlipTable1;
    private javax.swing.JPanel pnlCamareroImage;
    private javax.swing.JPanel pnlTable;
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

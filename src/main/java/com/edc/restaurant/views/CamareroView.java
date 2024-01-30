package com.edc.restaurant.views;

public class CamareroView extends javax.swing.JPanel {

    public CamareroView() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlCamareroContainer = new javax.swing.JPanel();
        menuProductsView1 = new com.edc.restaurant.views.MenuProductsView();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout pnlCamareroContainerLayout = new javax.swing.GroupLayout(pnlCamareroContainer);
        pnlCamareroContainer.setLayout(pnlCamareroContainerLayout);
        pnlCamareroContainerLayout.setHorizontalGroup(
            pnlCamareroContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        pnlCamareroContainerLayout.setVerticalGroup(
            pnlCamareroContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 454, Short.MAX_VALUE)
        );

        jPanel1.add(pnlCamareroContainer, java.awt.BorderLayout.LINE_START);
        jPanel1.add(menuProductsView1, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private com.edc.restaurant.views.MenuProductsView menuProductsView1;
    private javax.swing.JPanel pnlCamareroContainer;
    // End of variables declaration//GEN-END:variables
}

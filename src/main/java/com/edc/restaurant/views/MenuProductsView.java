package com.edc.restaurant.views;

import com.edc.restaurant.data.DataImplements;
import com.edc.restaurant.data.IData;
import com.edc.restaurant.models.Product;
import java.awt.GridLayout;
import java.util.ArrayList;

public class MenuProductsView extends javax.swing.JPanel {

    private ArrayList<Product> products;
    private IData data;

    public MenuProductsView() {
        data = new DataImplements();
        this.products = data.readData("productos.dat");

        initComponents();

        this.createProductViewComponents();
    }

    public void createProductViewComponents() {
        if (products == null) return;
        
        for (Product product : products) {
            this.pnlProducts.add(new ProductView(product));
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

        pnlProducts = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(600, 450));
        setLayout(new java.awt.BorderLayout());

        pnlProducts.setMinimumSize(new java.awt.Dimension(600, 450));
        pnlProducts.setLayout(new java.awt.GridLayout(3, 4));
        add(pnlProducts, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnlProducts;
    // End of variables declaration//GEN-END:variables
}

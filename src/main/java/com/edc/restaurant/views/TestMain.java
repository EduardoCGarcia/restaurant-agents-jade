package com.edc.restaurant.views;

import com.edc.restaurant.models.ConfigFile;
import com.edc.restaurant.models.Product;
import com.edc.restaurant.tools.Observer;

public class TestMain extends javax.swing.JFrame implements Observer {

    private ConfigFile configFile;
    
    public TestMain(ConfigFile configFile) {
        this.configFile = configFile;
        initComponents();
        
        this.menuProductsView1.addObservable(this);
        this.menuProductsView1.addObservable(this.camareroMenuView1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMenuContainer = new javax.swing.JPanel();
        menuProductsView1 = new com.edc.restaurant.views.MenuProductsView(this.configFile);
        camareroMenuView1 = new com.edc.restaurant.views.CamareroMenuView(this.configFile);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 750));

        pnlMenuContainer.setLayout(new java.awt.BorderLayout());
        pnlMenuContainer.add(menuProductsView1, java.awt.BorderLayout.CENTER);
        pnlMenuContainer.add(camareroMenuView1, java.awt.BorderLayout.LINE_START);

        getContentPane().add(pnlMenuContainer, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(TestMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TestMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TestMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TestMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new TestMain().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.edc.restaurant.views.CamareroMenuView camareroMenuView1;
    private com.edc.restaurant.views.MenuProductsView menuProductsView1;
    private javax.swing.JPanel pnlMenuContainer;
    // End of variables declaration//GEN-END:variables
// Inicio Observer
    @Override
    public void update(Object args) {
        if (args instanceof Product) {
            Product product = (Product) args;
            InfoProductView infoProductView = new InfoProductView(this, true, product, this.configFile);
            infoProductView.setVisible(true);
        }
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    // Fin Observer
}

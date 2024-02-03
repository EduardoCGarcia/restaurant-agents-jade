package com.edc.restaurant.views;

import com.edc.restaurant.models.ConfigFile;
import com.edc.restaurant.tools.FondoImagen;

public class SousChef extends javax.swing.JFrame {

    private ConfigFile configFile;

    public SousChef(ConfigFile configFile) {
        this.configFile = configFile;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContainer = new javax.swing.JPanel();
        pnlChefImage = new FondoImagen(this.configFile.getRutaImagenes(),"souschef.jpg");
        pnlContainerOrders = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPaneOrders = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlContainer.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout pnlChefImageLayout = new javax.swing.GroupLayout(pnlChefImage);
        pnlChefImage.setLayout(pnlChefImageLayout);
        pnlChefImageLayout.setHorizontalGroup(
            pnlChefImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );
        pnlChefImageLayout.setVerticalGroup(
            pnlChefImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
        );

        pnlContainer.add(pnlChefImage);

        pnlContainerOrders.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setViewportView(txtPaneOrders);

        pnlContainerOrders.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pnlContainer.add(pnlContainerOrders);

        getContentPane().add(pnlContainer, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    /**
//     * @param args the command line arguments
//     */
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
//            java.util.logging.Logger.getLogger(SousChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SousChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SousChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SousChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SousChef().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlChefImage;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlContainerOrders;
    private javax.swing.JTextPane txtPaneOrders;
    // End of variables declaration//GEN-END:variables
}

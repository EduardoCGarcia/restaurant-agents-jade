package com.edc.restaurant.views;

public class InfoProductView extends javax.swing.JDialog {

    public InfoProductView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlInfoContainer = new javax.swing.JPanel();
        pnlLabelNombre = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        pnlLabelPrecio = new javax.swing.JPanel();
        lblPrecio = new javax.swing.JLabel();
        pnlTextArea = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaProductDescription = new javax.swing.JTextArea();
        pnlProductImage = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlInfoContainer.setLayout(new java.awt.GridLayout(3, 1));

        pnlLabelNombre.setLayout(new java.awt.BorderLayout());

        lblNombre.setText("jLabel1");
        pnlLabelNombre.add(lblNombre, java.awt.BorderLayout.CENTER);

        pnlInfoContainer.add(pnlLabelNombre);

        pnlLabelPrecio.setLayout(new java.awt.BorderLayout());

        lblPrecio.setText("jLabel2");
        pnlLabelPrecio.add(lblPrecio, java.awt.BorderLayout.CENTER);

        pnlInfoContainer.add(pnlLabelPrecio);

        pnlTextArea.setLayout(new java.awt.BorderLayout());

        txaProductDescription.setColumns(20);
        txaProductDescription.setRows(5);
        jScrollPane1.setViewportView(txaProductDescription);

        pnlTextArea.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pnlInfoContainer.add(pnlTextArea);

        getContentPane().add(pnlInfoContainer, java.awt.BorderLayout.CENTER);

        pnlProductImage.setMinimumSize(new java.awt.Dimension(250, 250));
        pnlProductImage.setPreferredSize(new java.awt.Dimension(250, 250));

        javax.swing.GroupLayout pnlProductImageLayout = new javax.swing.GroupLayout(pnlProductImage);
        pnlProductImage.setLayout(pnlProductImageLayout);
        pnlProductImageLayout.setHorizontalGroup(
            pnlProductImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        pnlProductImageLayout.setVerticalGroup(
            pnlProductImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 262, Short.MAX_VALUE)
        );

        getContentPane().add(pnlProductImage, java.awt.BorderLayout.LINE_END);

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JPanel pnlInfoContainer;
    private javax.swing.JPanel pnlLabelNombre;
    private javax.swing.JPanel pnlLabelPrecio;
    private javax.swing.JPanel pnlProductImage;
    private javax.swing.JPanel pnlTextArea;
    private javax.swing.JTextArea txaProductDescription;
    // End of variables declaration//GEN-END:variables
}

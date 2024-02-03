package com.edc.restaurant.views;

import com.edc.restaurant.data.DataImplements;
import com.edc.restaurant.data.IData;
import com.edc.restaurant.models.ConfigFile;
import java.io.File;
import javax.swing.JFileChooser;


public class ConfigurationView extends javax.swing.JFrame {

    public ConfigurationView() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnImportar = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        btnImportar.setBackground(new java.awt.Color(0, 0, 51));
        btnImportar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnImportar.setForeground(new java.awt.Color(204, 204, 255));
        btnImportar.setText("Importar");
        btnImportar.setMaximumSize(new java.awt.Dimension(150, 150));
        btnImportar.setMinimumSize(new java.awt.Dimension(150, 150));
        btnImportar.setPreferredSize(new java.awt.Dimension(150, 150));
        btnImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarActionPerformed(evt);
            }
        });
        jPanel1.add(btnImportar);

        btnCrear.setBackground(new java.awt.Color(0, 102, 0));
        btnCrear.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCrear.setForeground(new java.awt.Color(204, 255, 204));
        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrear);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Selecciona tu configuración");
        jPanel2.add(jLabel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarActionPerformed
        TestMain m = new TestMain(showFileChooser());
        m.setLocationRelativeTo(null);
        this.dispose();
        m.setVisible(true);
    }//GEN-LAST:event_btnImportarActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnImportar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    private ConfigFile showFileChooser() {
        JFileChooser fileChooser = new JFileChooser();

        // Configuración opcional del file chooser 
        fileChooser.setCurrentDirectory(new File("C:/"));

        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            // Seleccionar un archivo
            IData configFile = new DataImplements();
            return configFile.readConfigFile(fileChooser.getSelectedFile().getAbsolutePath());
            
        }
        return null;
    }

}

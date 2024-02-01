package com.edc.restaurant.views;

import com.edc.restaurant.models.Product;
import com.edc.restaurant.models.ProductoCantidad;
import com.edc.restaurant.tools.Observer;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.swing.table.DefaultTableModel;

public class OrderSlipTable extends javax.swing.JPanel implements Observer {

    private Set<ProductoCantidad> productosOrden;
    private Set<Product> productos;

    public OrderSlipTable() {

        productosOrden = new HashSet<>();
        productos = new HashSet<>();

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(350, 350));
        setPreferredSize(new java.awt.Dimension(350, 350));
        setLayout(new java.awt.BorderLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Precio", "Cantidad", "SubTotal"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.GridLayout());

        jButton5.setBackground(new java.awt.Color(255, 0, 51));
        jButton5.setText("Cancelar Orden");
        jPanel2.add(jButton5);

        jButton6.setBackground(new java.awt.Color(102, 255, 102));
        jButton6.setForeground(new java.awt.Color(0, 51, 51));
        jButton6.setText("Terminar Orden");
        jPanel2.add(jButton6);

        add(jPanel2, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.println(jTable2.getSelectedRow());
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Object args) {
        if (args instanceof ProductoCantidad) {

            ProductoCantidad productoCantidad = (ProductoCantidad) args;

            if (productos.add(productoCantidad.getProducto())) {
                productosOrden.add(productoCantidad);
                addRowToTable(productoCantidad);

            } else {
                modifyExistingProduct(productosOrden, productoCantidad);
                repaintTable();
            }
        }
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    //Inicio de metodos de clase
    private static void modifyExistingProduct(Set<ProductoCantidad> productosCantidadSet, ProductoCantidad existingObject) {
        // Obtener el objeto existente del conjunto
        ProductoCantidad producto = productosCantidadSet.stream()
                .filter(obj -> obj.getProducto().equals(existingObject.getProducto()))
                .findFirst()
                .orElse(null);

        // Modificar el objeto existente (en este caso, cambiar el id)
        if (producto != null) {
            producto.setCantidad(producto.getCantidad() + 1);
            System.out.println("Objeto modificado: " + producto);
        }
    }

    private void addRowToTable(ProductoCantidad productoCantidad) {
        DefaultTableModel modelo = (DefaultTableModel) this.jTable2.getModel();
        BigDecimal subTotal = productoCantidad.getProducto().getPrecio()
                .multiply(BigDecimal.valueOf(productoCantidad.getCantidad()));

        Object[] rowData = {productoCantidad.getProducto().getNombre(), productoCantidad.getProducto().getPrecio(), productoCantidad.getCantidad(), subTotal};

        modelo.addRow(rowData);
        this.jTable2.repaint();
    }

    public void repaintTable() {
        DefaultTableModel modelo = (DefaultTableModel) this.jTable2.getModel();
        modelo.setRowCount(0); // Limpiar filas existentes

        for (ProductoCantidad productoCantidad : productosOrden) {
            BigDecimal subTotal = productoCantidad.getProducto().getPrecio()
                    .multiply(BigDecimal.valueOf(productoCantidad.getCantidad()));

            Object[] rowData = {productoCantidad.getProducto().getNombre(), productoCantidad.getProducto().getPrecio(), productoCantidad.getCantidad(), subTotal};

            modelo.addRow(rowData);
        }
        this.jTable2.repaint();
    }
    //Fin de metodos de clase
}

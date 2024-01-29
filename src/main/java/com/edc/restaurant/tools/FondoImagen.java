package com.edc.restaurant.tools;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class FondoImagen extends JPanel {

    private Image imagen;
    private String nombreImagen;

    public FondoImagen() {
    }

    public FondoImagen(String nombreImagen) {
        this.nombreImagen = nombreImagen;
    }

    @Override
    public void paint(Graphics g) {
        cargarImagen();
        if (imagen != null) {
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        }
        setOpaque(false);
        super.paint(g);
    }

    public void setNombreImagen(String nombreImagen) {
        this.nombreImagen = nombreImagen;
        repaint();
    }

    private void cargarImagen() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            imagen = new ImageIcon(classLoader.getResource("images/" + nombreImagen)).getImage();
        } catch (Exception e) {
            System.out.println("Error al cargar la imagen: " + e.getMessage());
        }
    }
}

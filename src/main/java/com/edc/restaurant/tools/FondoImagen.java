package com.edc.restaurant.tools;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class FondoImagen extends JPanel {

    private Image imagen;
    private String nombreImagen;
    private String rutaImagen;

    public FondoImagen(String rutaImagen,String nombreImagen) {
        this.rutaImagen = rutaImagen;
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
            imagen = new ImageIcon(rutaImagen + nombreImagen).getImage();
            System.out.println(rutaImagen + nombreImagen);
        } catch (Exception e) {
            System.out.println("Error al cargar la imagen: " + e.getMessage());
        }
    }
}

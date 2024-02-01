package com.edc.restaurant.tools;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class ImageFrame extends JFrame {
public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Prueba FondoImagen");
            frame.setSize(400, 300);

            FondoImagen fondo = new FondoImagen("imagen_1.jpg");

            // Puedes cambiar la imagen en tiempo de ejecución
            // fondo.setNombreImagen("otra_imagen.jpg");

            frame.setContentPane(fondo);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
    
}

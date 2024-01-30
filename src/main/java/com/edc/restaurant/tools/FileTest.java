package com.edc.restaurant.tools;

import com.edc.restaurant.models.Product;
import com.edc.restaurant.tools.ObjectArrayListSerializerDeserializer;

import java.math.BigDecimal;
import java.util.ArrayList;

public class FileTest {
    public static void main(String[] args) {
        // Crear productos
        Product hamburguesaClasica = new Product("Hamburguesa Clásica",
                new BigDecimal("8.99"),
                "Carne de res, lechuga, tomate, cebolla, queso cheddar y salsa especial.",
                "hamburguesa_clasica.jpg");

        Product hamburguesaBBQBacon = new Product("Hamburguesa BBQ Bacon",
                new BigDecimal("10.99"),
                "Carne de res, queso suizo, bacon crujiente, cebolla caramelizada y salsa barbacoa.",
                "hamburguesa_bbq_bacon.jpg");

        Product hamburguesaVegetariana = new Product("Hamburguesa Vegetariana",
                new BigDecimal("9.99"),
                "Hamburguesa de garbanzos, lechuga, tomate, aguacate, queso feta y mayonesa de ajo.",
                "hamburguesa_vegetariana.jpg");

        Product hamburguesaPicanteMexicana = new Product("Hamburguesa Picante Mexicana",
                new BigDecimal("11.49"),
                "Carne de res, jalapeños, queso pepper jack, guacamole, lechuga y salsa picante.",
                "hamburguesa_picante_mexicana.jpg");

        Product hamburguesaPolloTeriyaki = new Product("Hamburguesa de Pollo Teriyaki",
                new BigDecimal("9.99"),
                "Pechuga de pollo a la parrilla, piña, queso provolone, cebolla morada y salsa teriyaki.",
                "hamburguesa_pollo_teriyaki.jpg");

        Product hamburguesaDobleQueso = new Product("Hamburguesa Doble Queso",
                new BigDecimal("12.99"),
                "Doble carne de res, doble queso cheddar, lechuga, tomate y mayonesa.",
                "hamburguesa_doble_queso.jpg");

        // Acompañamientos
        Product papasFritas = new Product("Papas Fritas Tradicionales",
                new BigDecimal("3.49"),
                "",
                "Papas fritas crujientes.");

        Product arosCebolla = new Product("Aros de Cebolla Crujientes",
                new BigDecimal("4.99"),
                "",
                "Aros de cebolla rebozados y fritos hasta obtener una textura crujiente.");

        Product ensaladaAguacateTomate = new Product("Ensalada de Aguacate y Tomate",
                new BigDecimal("5.99"),
                "",
                "Ensalada fresca con aguacate, tomate y aderezo ligero.");

        // Bebidas
        Product refrescosVariados = new Product("Refrescos Variados (500 ml)",
                new BigDecimal("1.99"),
                "",
                "Refrescos en diferentes sabores.");

        Product batidosHelado = new Product("Batidos de Helado (Vainilla, Chocolate, Fresa)",
                new BigDecimal("4.49"),
                "",
                "Batidos cremosos de helado en vainilla, chocolate o fresa.");

        // Crear lista de productos
        ArrayList<Product> productos = new ArrayList<>();
        productos.add(hamburguesaClasica);
        productos.add(hamburguesaBBQBacon);
        productos.add(hamburguesaVegetariana);
        productos.add(hamburguesaPicanteMexicana);
        productos.add(hamburguesaPolloTeriyaki);
        productos.add(hamburguesaDobleQueso);
        productos.add(papasFritas);
        productos.add(arosCebolla);
        productos.add(ensaladaAguacateTomate);
        productos.add(refrescosVariados);
        productos.add(batidosHelado);

        // Crear y usar el serializador/deserializador
        ObjectArrayListSerializerDeserializer<Product> serializerDeserializer =
                new ObjectArrayListSerializerDeserializer<>();

        // Guardar la lista de productos en un archivo
        serializerDeserializer.guardarArrayListEnArchivo(productos, "productos.dat");

        // Leer la lista de productos desde el archivo
        ArrayList<Product> productosLeidos = serializerDeserializer.leerArrayListDeArchivo("productos.dat");

        // Imprimir productos leídos (solo para verificar)
        if (productosLeidos != null) {
            for (Product producto : productosLeidos) {
                System.out.println("Nombre: " + producto.getNombre());
                System.out.println("Precio: " + producto.getPrecio());
                System.out.println("Descripción: " + producto.getDescripcion());
                System.out.println("Icono: " + producto.getIcon());
                System.out.println("------------------------");
            }
        }
    }
}

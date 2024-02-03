package com.edc.restaurant.models;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConfigFile implements Serializable{
    // Modos permitidos
    public static final String MODO_CAMARERO = "Camarero";
    public static final String MODO_CHEF_SOUS_CHEF = "ChefSousChef";

    private String usuario;
    private String modo;
    private String ipPropia;
    private String ipDestino;
    private int puerto;
    private String rutaArchivoProductos;
    private String rutaImagenes;
}

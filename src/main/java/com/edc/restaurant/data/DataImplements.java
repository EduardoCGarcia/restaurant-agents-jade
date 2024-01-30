package com.edc.restaurant.data;

import com.edc.restaurant.models.Product;
import com.edc.restaurant.tools.ObjectArrayListSerializerDeserializer;
import java.util.ArrayList;

public class DataImplements implements IData {

    @Override
    public ArrayList<Product> readData(String fileName) {
        // Crear y usar el serializador/deserializador
        ObjectArrayListSerializerDeserializer<Product> serializerDeserializer
                = new ObjectArrayListSerializerDeserializer<>();

        // Leer la lista de productos desde el archivo
        return serializerDeserializer.leerArrayListDeArchivo("productos.dat");
    }

}

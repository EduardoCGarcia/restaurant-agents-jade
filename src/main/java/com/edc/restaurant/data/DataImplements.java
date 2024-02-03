package com.edc.restaurant.data;

import com.edc.restaurant.models.ConfigFile;
import com.edc.restaurant.models.Product;
import com.edc.restaurant.tools.ObjectArrayListSerializerDeserializer;
import java.util.ArrayList;

public class DataImplements implements IData {

    @Override
    public ArrayList<Product> readData(String ruta) {
        // Crear y usar el serializador/deserializador
        ObjectArrayListSerializerDeserializer<Product> serializerDeserializer
                = new ObjectArrayListSerializerDeserializer<>(ruta);

        // Leer la lista de productos desde el archivo
        return serializerDeserializer.leerArrayListDeArchivo();
    }

    @Override
    public ConfigFile readConfigFile(String path) {
        // Crear y usar el serializador/deserializador
        ObjectArrayListSerializerDeserializer<ConfigFile> serializerDeserializer
                = new ObjectArrayListSerializerDeserializer<>(path);
        
        return serializerDeserializer.leerUnicoObjetoDeArchivo();

    }

}

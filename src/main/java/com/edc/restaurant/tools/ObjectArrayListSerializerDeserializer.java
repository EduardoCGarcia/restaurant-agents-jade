package com.edc.restaurant.tools;

import java.io.*;
import java.util.ArrayList;

public class ObjectArrayListSerializerDeserializer<T> {

    private String rutaDestino = "C:/restaurant_agents_files/db/";

    public void guardarArrayListEnArchivo(ArrayList<T> arrayList, String nombreArchivo) {
        try {
            File archivo = new File(rutaDestino + nombreArchivo);
            if (!archivo.getParentFile().exists()) {
                archivo.getParentFile().mkdirs();
            }
            try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(archivo))) {
                objectOutputStream.writeObject(arrayList);
                System.out.println("ArrayList guardado en el archivo: " + archivo.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("Error al guardar el ArrayList en el archivo: " + e.getMessage());
        }
    }

    public ArrayList<T> leerArrayListDeArchivo(String nombreArchivo) {
        ArrayList<T> arrayList = null;
        try {
            File archivo = new File(rutaDestino + nombreArchivo);
            if (archivo.exists()) {
                try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(archivo))) {
                    arrayList = (ArrayList<T>) objectInputStream.readObject();
                    System.out.println("ArrayList leído del archivo: " + archivo.getAbsolutePath());
                }
            } else {
                System.out.println("El archivo no existe: " + archivo.getAbsolutePath());
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer el ArrayList del archivo: " + e.getMessage());
        }
        return arrayList;
    }

    // Resto del código...
}

package com.edc.restaurant.tools;

import java.io.*;
import java.util.ArrayList;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ObjectArrayListSerializerDeserializer<T> {

    private String rutaDestino;

    public void guardarArrayListEnArchivo(ArrayList<T> arrayList) {
        try {
            File archivo = new File(rutaDestino);
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

    public ArrayList<T> leerArrayListDeArchivo() {
        ArrayList<T> arrayList = null;
        try {
            File archivo = new File(rutaDestino);
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

    public T leerUnicoObjetoDeArchivo() {
        T objeto = null;
        try {
            File archivo = new File(rutaDestino);
            if (archivo.exists()) {
                try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(archivo))) {
                    objeto = (T) objectInputStream.readObject();
                    System.out.println("Objeto leído del archivo: " + archivo.getAbsolutePath());
                }
            } else {
                System.out.println("El archivo no existe: " + archivo.getAbsolutePath());
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer el objeto del archivo: " + e.getMessage());
        }
        return objeto;
    }
    
    public void guardarObjetoEnArchivo(T objeto) {
        try {
            File archivo = new File(rutaDestino);
            if (!archivo.getParentFile().exists()) {
                archivo.getParentFile().mkdirs();
            }
            try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(archivo))) {
                objectOutputStream.writeObject(objeto);
                System.out.println("Objeto guardado en el archivo: " + archivo.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("Error al guardar el objeto en el archivo: " + e.getMessage());
        }
    }
}

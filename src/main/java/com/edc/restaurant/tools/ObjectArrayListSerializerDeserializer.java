package com.edc.restaurant.tools;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

public class ObjectArrayListSerializerDeserializer<T> {

    private final String rutaDestino = "src/main/resources/files/";

    /**
     * Guarda un ArrayList en un archivo.
     *
     * @param arrayList      El ArrayList que se desea guardar.
     * @param nombreArchivo  El nombre del archivo donde se guardará el ArrayList.
     */
    public void guardarArrayListEnArchivo(ArrayList<T> arrayList, String nombreArchivo) {
        try {
            File archivo = new File(rutaDestino + File.separator + nombreArchivo);
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
        // Intenta obtener el recurso desde el classpath directamente
        InputStream input = getClass().getClassLoader().getResourceAsStream(nombreArchivo);
        if (input != null) {
            try (ObjectInputStream objectInputStream = new ObjectInputStream(input)) {
                arrayList = (ArrayList<T>) objectInputStream.readObject();
                System.out.println("ArrayList leído del archivo: " + nombreArchivo);
            }
        } else {
            System.out.println("No se pudo encontrar el archivo en el classpath: " + nombreArchivo);

            // Si no se encuentra en el classpath, intenta cargarlo desde el sistema de archivos
            input = new FileInputStream("src/main/resources/files/" + nombreArchivo);
            try (ObjectInputStream objectInputStream = new ObjectInputStream(input)) {
                arrayList = (ArrayList<T>) objectInputStream.readObject();
                System.out.println("ArrayList leído del archivo: " + nombreArchivo);
            }
        }
    } catch (IOException | ClassNotFoundException e) {
        System.out.println("Error al leer el ArrayList del archivo: " + e.getMessage());
    }
    return arrayList;
}


    private String getRutaArchivo(String nombreArchivo) {
        String rutaArchivo = rutaDestino + nombreArchivo;
        try {
            File file = new File(rutaArchivo);
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("Se ha creado un nuevo archivo: " + rutaArchivo);
            }
        } catch (IOException e) {
            System.out.println("Error al obtener la ruta del archivo: " + e.getMessage());
        }
        return rutaArchivo;
    }

    public String formatDate(Date fecha) {
        LocalDate localDate = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        int dia = localDate.getDayOfMonth();
        int mes = localDate.getMonthValue();
        int año = localDate.getYear();

        return dia + "-" + mes + "-" + año;
    }
}

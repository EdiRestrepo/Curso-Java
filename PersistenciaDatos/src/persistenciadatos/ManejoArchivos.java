
package persistenciadatos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ManejoArchivos {
    
    public static void crearArchivo(String nombreArchivo){
        
        File archivo = new File(nombreArchivo);
        
        PrintWriter salida;
        try {
            salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se creo el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
        
        
    }
    
        public static void escribirArchivo(String nombreArchivo, String contenido){
        
        File archivo = new File(nombreArchivo);
        
        PrintWriter salida;
        try {
            salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(contenido);
            salida.close();
            System.out.println("Se escribió el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        
        
    }
    
     public static void leerArchivo(String nombreArchivo){
        
        File archivo = new File(nombreArchivo);
        
        PrintWriter salida;
        try {
            
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            while(lectura != null){
                System.out.println(lectura);
                lectura = entrada.readLine();
            }
            
            entrada.close();
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        
        
    }
     
        public static void eliminarArchivo(String nombreArchivo){
        
        File archivo = new File(nombreArchivo);
        
            System.out.println(archivo.exists());
        archivo.delete();
        
            System.out.println("Se elemino el archivo");
        
        
    }
}

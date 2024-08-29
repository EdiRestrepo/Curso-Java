
import java.util.Scanner;

public class TiposDeDatos {
    
    public static void main(String[] args) {
        
      //byte edad = -128;
      
      int a = 10;
      
      long numeroGrande = 45846314L;
      
      float numeroDecimales = 3.5f;
            
      double numerosDecimales = 3.55d;
      
      char letra = 'a';
      
      char codigoAsicc = 65;
      
      boolean opcion = true;
      
      opcion = false;
      
      String nombreCompleto = "Edison Restrepo";
      
      Scanner leer = new Scanner(System.in);
      
      System.out.print("Ingrese su Nombre");
      String nombre = leer.nextLine();
      System.out.println("Nombre: "+ nombre);
      
       System.out.print("Ingrese su  Edad");
      int edad = leer.nextInt();
      System.out.println("Edad: "+ edad);
      
       System.out.print("Ingrese un caracter:");
      char c = leer.next().charAt(0);
      System.out.println("C: "+ c);
      
        System.out.printf("Nombre: %s, Edad: %d años \n ", nombre, edad);
        
        System.out.println(" \" ");
      
      
    }
    
}

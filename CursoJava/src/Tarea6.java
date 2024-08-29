
import java.util.Scanner;

public class Tarea6 {
   
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese número del 0 al 9: ");
        int numero = leer.nextInt();
        
         String resultado = null;
         
         switch(numero){
             case 0 -> resultado = "CERO";
             case 1 -> resultado = "UNO";
             case 2 -> resultado = "DOS";
             case 3 -> resultado = "TRES";
             case 4 -> resultado = "CUATRO";
             case 5 -> resultado = "CINCO";
             case 6 -> resultado = "SEIS";
             case 7 -> resultado = "SIETE";
             case 8 -> resultado = "OCHO";
             case 9 -> resultado = "NUEVE";
             default -> System.out.println("El número ingresado esta fuera de rango");
         }
         
         System.out.println("El numero ingresado es "+resultado);
    }
}

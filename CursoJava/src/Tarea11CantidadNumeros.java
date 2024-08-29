
import java.util.Scanner;

public class Tarea11CantidadNumeros {
        public static void main(String[] srgs){
        // Variables
        int num1, num2, cantidad;
        cantidad = 0;

        // Crear Objeto de la Clase Scanner
        Scanner leer = new Scanner(System.in);

        // Ingresar Datos
        System.out.print("Número1: ");
        num1 = leer.nextInt();
         System.out.print("Número2: ");
        num2 = leer.nextInt();

        // Solución
        for (int i = num1; i <= num2; i++){
            cantidad += 1;
        }

        // Mostrar Datos
        System.out.println("");
        System.out.println("Cantidad: " + cantidad);
    }
}

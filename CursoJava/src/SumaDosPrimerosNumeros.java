
import java.util.Scanner;


public class SumaDosPrimerosNumeros  {
    public static void main(String[] srgs){
        // Variables
        int num, resultado;
        resultado = 0;

        // Crear Objeto de la Clase Scanner
        Scanner leer = new Scanner(System.in);

        // Ingresar Datos
        System.out.print("Número: ");
        num = leer.nextInt();

        // Solución
        for (int i = 1; i <= num; i++){
            resultado += i;
        }

        // Mostrar Datos
        System.out.println("");
        System.out.println("Suma: " + resultado);
    }
}

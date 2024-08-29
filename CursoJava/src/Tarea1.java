
import java.util.Scanner;

public class Tarea1 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese número 01: ");
        var n1 = leer.nextInt();
        System.out.print("Ingrese número 02: ");
        var n2 = leer.nextInt();
        
        int suma = n1 + n2;
        int resta = n1 -n2;
        
        System.out.printf("La suma es = %d \n",suma);
        System.out.printf("La resta es = %d", resta );
    }
    
}

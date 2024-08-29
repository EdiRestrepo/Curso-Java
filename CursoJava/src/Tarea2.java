
import java.util.Scanner;

public class Tarea2 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese número 01: ");
        var n1 = leer.nextInt();
        System.out.print("Ingrese número 02: ");
        var n2 = leer.nextInt();
        
        int cociente = n1 / n2;
        int residuo = n1 % n2;
        
        System.out.printf("Cociente = %d \n",cociente);
        System.out.printf("Residuo = %d", residuo );
    }
    
}

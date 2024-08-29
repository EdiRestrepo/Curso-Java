
import java.util.Scanner;

public class Tarea3 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese número1: ");
        int n1 = leer.nextInt();
        
        System.out.print("Ingrese número2: ");
        int n2 = leer.nextInt();
        
        if (n1 > n2) {
            
            System.out.println("El numero1  es mayor");
            
        }else{
            System.out.println("El numero2 es mayor");
        }
    }
    
}

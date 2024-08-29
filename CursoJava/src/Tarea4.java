
import java.util.Scanner;

public class Tarea4 {
    
       public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int n1;
        
        System.out.print("Ingrese número: ");
         n1 = leer.nextInt();
       
        
        if ((n1 % 3 == 0) && (n1 % 5 == 0)) {
            
            System.out.println("El numero  es multiplo de 3 y 5");
            
        }else{
            System.out.println("El numero no es multiplo de 3 y 5");
        }
    }
}

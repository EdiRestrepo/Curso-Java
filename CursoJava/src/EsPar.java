
import java.util.Scanner;

public class EsPar {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese número: ");
        int n1 = leer.nextInt();
        
        if(n1 % 2 == 0 ){
            System.out.println("Es Par");
        }else{
            System.out.println("Es impar");
        }
    }
    
}

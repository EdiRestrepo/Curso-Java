
import java.util.Scanner;

public class Tarea9While {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int ni, nf, c = 0;
        
        System.out.print("Numero inicial: ");
        ni = leer.nextInt();
        System.out.print("Numero final: ");
        nf = leer.nextInt();
        
        
        while(ni <= nf){
            c++;
            ni++;
        }
        
        System.out.println(" ");
        System.out.println("Cantidad: "+c);
    }
}

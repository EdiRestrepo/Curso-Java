
import java.util.Scanner;

public class Tarea8While {
    
    public static void main(String[] args) {
        
        //Obtener la suma de los primeros números naturales positivos
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese un numero ");
        int n =  leer.nextInt();
        int suma = 0;
        int contador = 0;
        
        while(contador < n){
            
            contador++;
            suma += contador;
            // System.out.println("Contador "+ contador);
           // System.out.println("Suma "+suma);
            
        }
        
        System.out.println(" ");
        System.out.println("Suma de los primeros números naturales positivos: "+suma);
    }
}

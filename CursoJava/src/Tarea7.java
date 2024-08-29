
import java.util.Scanner;

public class Tarea7 {
    
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         
         float n1, n2, resultado = 0;
         char op;
        
        System.out.print("Numero 1: ");
         n1 = leer.nextFloat();
         System.out.println("Ingrese el operador +, −, * ó /,");
         op = leer.next().charAt(0);
         
         leer.nextLine();
        System.out.print("Numero 2: ");
         n2 = leer.nextFloat();
        
         switch(op){
             
             case '+':
                 resultado = n1 +n2;
                 break;
             case '-':
                 resultado = n1 -n2;
                 break;
             case '*':
                 resultado = n1 * n2;
                 break;
             case '/':
                 if(n2 == 0){
                     resultado = 0;
                     System.out.println("la división por cero es una operación matemáticamente indefinida.");
                 }else{
                     resultado = n1 / n2;
                 }
                 break;
             default:
                 System.out.println("El operador ingresado no es valido");
         }
         
         System.out.println("Resultado: "+resultado);
    }
    
}

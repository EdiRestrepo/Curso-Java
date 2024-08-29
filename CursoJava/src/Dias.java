
import java.util.Scanner;

public class Dias {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número de la semana: ");
       
        int dia = leer.nextInt();
        
        String nombreDia = null;
        
        switch(dia){
            case 1 -> nombreDia = "Domingo";
            case 2 -> nombreDia = "Lunes";
            case 3 -> nombreDia = "Martes";
             case 4 -> nombreDia = "Miercoles";
             case 5 -> nombreDia = "Jueves";
             case 6 -> nombreDia = "Viernes";
             case 7 -> nombreDia = "Sabado";
             default -> System.out.println("El número ingresado es Incorrecto");
        }
        
        
        System.out.println("El dia es: "+nombreDia);
        
    }
}

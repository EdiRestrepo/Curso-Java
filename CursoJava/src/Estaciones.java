
import java.util.Scanner;

public class Estaciones {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Por favor ingrese el número de la estación del año: ");
        
        int estacion = leer.nextInt();
        
        String nombreEstacion = null;
        
        switch(estacion){
            case 1:
                nombreEstacion = "Verano";
                break;
            case 2:
                nombreEstacion = "Otoño";
                break;
            case 3:
                nombreEstacion = "Invierno";
                break;
            case 4:
                nombreEstacion = "Primavera";
                break;
            default:
                break;   
        }
        
        if(estacion <= 4 && estacion >= 1){
            System.out.println("La estación ingresada es: "+nombreEstacion);
        }else{
            System.out.println("La estación ingresada no existe");
        }
    }  
}


import java.util.Scanner;


public class main {
   
    public static void main(String[] args) {
        
        OUTER:
        while(true){
            
            System.out.println("JUEGO ADIVINA NÚMERO \n");
            System.out.println("1 - Nivel Facil\n"
                               +"2 - Nivel Intermedio \n"
                               +"3 - Nivel Dificil \n"
                               +"4 - Salir");
         Scanner leer = new Scanner(System.in);
            System.out.print("INGRESE UNA OPCIÓN: ");
            int opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    jugar(10);
                    break;
                case 2:
                    jugar(7);
                    break;
                case 3:
                    jugar(5);
                    break; 
                case 4:
                    System.out.println("CERRANDO PROGRAMA");
                    break OUTER;
                default:
                    System.out.println("OPCION INCORRECTA");
            }
        }
        
    }
    
    static void jugar(int vidas){
        
        int numeroRandom = (int)(Math.random()*101);
        int numeroElegido = -1;
        
        Scanner leer = new Scanner(System.in);
        
        while(numeroElegido != numeroRandom){
            
            System.out.println("Ingrese un número entre 1 y 100: ");
            numeroElegido = leer.nextInt();
            
            if(numeroRandom < numeroElegido){
                
                System.out.println("El número mas pequeño ");
                vidas--;
            }else if(numeroRandom > numeroElegido){
                
                System.out.println("El número mas grande");
                vidas--;
            }
            
            if(vidas == 0){
                System.out.println("---------------------");
                System.out.println("      GAME OVER");
                System.out.println("---------------------");
                break;
            }
            System.out.println("-----------------------------");
            System.out.printf("Te quedan %d vidas \n", vidas);
            System.out.println("-----------------------------");
            
        }
        
        if(numeroElegido == numeroRandom){
            System.out.println("-----------------------------");
            System.out.println("     FELICIDADES GANASTE");
            System.out.println("-----------------------------");
        }
    }
    
}

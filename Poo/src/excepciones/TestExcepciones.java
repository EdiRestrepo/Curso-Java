package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestExcepciones {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        boolean continuarEjecucion = true;

        do {

            try {
                System.out.println("Ingrese N1: ");
                int n1 = leer.nextInt();
                System.out.println("Ingrese N2: ");
                int n2 = leer.nextInt();

                int resultado = dividir(n1, n2);

                System.out.println("Resultado " + resultado);
                
                continuarEjecucion = false;
                
            } catch (InputMismatchException e) {

                System.err.println("Ocurrio un error: Ingrese solo números enteros");
                e.printStackTrace(System.out);
                leer.nextLine();
            } catch (ExcepcionPersonalizada e) {

                System.err.println("Error: "+ e.getMessage());
                e.printStackTrace(System.out);
            } catch (Exception e) {
                e.printStackTrace(System.out);
            } finally {
                System.out.println("Se reviso la división");
            }

        } while (continuarEjecucion);

    }
    
    
    static int dividir(int numerador, int denominador) throws ExcepcionPersonalizada{
        
        if( denominador == 0){
            
            throw new ExcepcionPersonalizada("No se puede Dividir entre cero");
        }
        
        return numerador / denominador;
    }

}

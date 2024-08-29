
import java.util.Arrays;
import java.util.Scanner;


public class EsNumeroPrimo {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número");
        int numero = leer.nextInt();
        
        if(esPrimo(numero)){
            System.out.println(numero+" Es numero primo");
        }else{
            System.out.println(numero+" No es numero primo");
        }
        
    }
    
    /**
     * <h1>Funcion esPrimo</h1>
     * Descripción: Detecta si un número es primo ó no.
     * @param numero Recibe un número entero
     * @return Retorna un valor booleano indicando si el numero recibido es primo ó no
     */
    static boolean esPrimo(int numero){
        
        int contador = 0;
        
        int[] numeros = new int[numero];
        
        
        System.out.println(Arrays.toString(numeros));
        for (int i = 0; i < numeros.length; i++) {
            
            numeros[i] = i+1;
            System.out.println(numeros[i]);
        }
        
        for (int i : numeros) {
            
            if (i == 1 || i == numero) {
                continue;
                
            }
            
            if(numero % i == 0){
                contador++;
            }
        }
        return contador == 0;
    }
}


import java.util.Scanner;


public class EsPalindromo {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra: ");
        
        String cadena = leer.nextLine();
        
        if(esPalindromo(cadena)){
            
            System.out.println("Es Palindromo");
        }else{
            System.out.println("No es Palindromo");
        }
        
        
    }
    
    static boolean esPalindromo(String cadena){
        
        cadena = cadena.replace(" ","");
        cadena = cadena.toLowerCase();
        
        StringBuilder cadenaInvertida = new StringBuilder();
        
        for( int i = cadena.length()-1; i >= 0; i--){
            
            cadenaInvertida.append(cadena.charAt(i));
        }
        
        return cadena.equals(cadenaInvertida.toString());
    }
    
}

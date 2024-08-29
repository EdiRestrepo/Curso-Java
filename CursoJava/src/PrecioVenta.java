
import java.util.Scanner;

public class PrecioVenta {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese valor de Venta: ");
        
        double valorVenta = leer.nextDouble();
        
        //IVA 18%
        double iva = valorVenta * 0.18;
        
        double precioVenta = valorVenta + iva;
        
        System.out.println("Valor venta: "+valorVenta);
        System.out.println("IVA: "+iva);
        System.out.println("Precio de Venta: "+precioVenta);
        
    }
    
}

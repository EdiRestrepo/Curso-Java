
import clases.Persona;
import clases.Calculadora;
import clases.Rectangulos;
import static java.lang.Math.*;


public class Main {

   
    public static void main(String[] args) {
        
        Persona persona1 = new Persona();
        
        Persona persona2 = new Persona("Alex");
        
        System.out.println(persona1.toString());
        persona1.nombre = "Edison";
        persona1.edad = 25;
        persona1.mostrarDatos();
        
        System.out.println(Calculadora.PI);
        System.out.println(Calculadora.sumar(40, 50));

        System.out.println(Calculadora.sumar(40.5, 50.5));        
        System.out.println(PI);
        System.out.println(pow(4,3));
        
        
        Calculadora calcular = new Calculadora();
        
        System.out.println(calcular.restar(10, 20));
        
        Rectangulos r1 = new Rectangulos();
        
        System.out.println(r1.area(5,6));
        
        
        
        
       
    }
    
}

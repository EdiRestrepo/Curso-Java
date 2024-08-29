
package test;

import herencia.*;
import java.util.Date;
public class TestHerencia {
    
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Edison",'M',25,"Dominica");
        
        //System.out.println(persona1.obtenerDetalle());
        imprimir(persona1);
        
        Empleado empleado1 = new Empleado(3000, "Edison");
        //System.out.println(empleado1.obtenerDetalle());
        
       // System.out.println(empleado1);
       imprimir(empleado1);
        
        var fecha = new Date(); //fecha actual
        
        Cliente cliente1 = new Cliente(fecha, true,"Edison",'M',25,"Dominica" );
        
       // System.out.println(cliente1.obtenerDetalle());
       imprimir(cliente1);
       
       String nombre = "Edsion";
       
       determinarTipo(nombre);
       
       //Conversion de Objetos
       
       Persona persona = new Empleado(2000,"Edison");
       Empleado empleado2 = (Empleado)persona;
        System.out.println(empleado2.obtenerDetalle());
       
       //
       Persona persona2 = empleado2;
        System.out.println(persona2.obtenerDetalle());
        
        
        
        Persona p1 = new Persona("Edison",'M',25,"Dominica");
        Persona p2 = new Persona("Edison",'M',25,"Dominica");
        
        
        System.out.println(p1 == p2);
        
        System.out.println(p1.equals(p2));
        
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        
        if(p1.hashCode() == p2.hashCode()){
            System.out.println("Los objetos son iguales");
            
        }else{
            System.out.println("los objetos no son iguales");
        }
        
        
       
        
    }
    
    public static void imprimir(Persona persona){
        System.out.println(persona.obtenerDetalle());
    }
    
    public static void determinarTipo(Object objecto){
        
        if(objecto instanceof Empleado){
            System.out.println("Es de tipo Empleado");
        }else if(objecto instanceof Cliente){
            System.out.println("Es de tipo Cliente");
        }else if(objecto instanceof Persona){
            System.out.println("Es de tipo Persona");
        }else if(objecto instanceof Object){
            System.out.println("Es de tipo Object");
        }
        
    }
    
}

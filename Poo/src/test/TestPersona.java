
package test;
import encapsulamiento. *;

public class TestPersona {
    
    public static void main(String[] args) {
        
        Persona2 persona1 = new Persona2("Edison",36,false);
        String estado = persona1.toString();
        
        System.out.println(estado);
        System.out.println(persona1.getNombre());
        persona1.setNombre("Estvial");
        System.out.println(persona1.getNombre());
        
        System.out.println(persona1);
        
    }
}

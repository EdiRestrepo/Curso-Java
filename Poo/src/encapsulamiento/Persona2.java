
package encapsulamiento;


public class Persona2 {
    
    private String nombre;
    private int edad;
    private boolean eliminado;

    public Persona2(String nombre, int edad, boolean eliminado) {
        this.nombre = nombre;
        this.edad = edad;
        this.eliminado = eliminado;
    }
    
    
    public String getNombre(){
        
        return this.nombre;
        
    }
    
    public void setNombre(String nombre){
        
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    @Override
    public String toString() {
        return "Persona: [Nombre: %s, Edad: %d, Eliminado: %b]"
                .formatted(this.nombre, this.edad, this.eliminado); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
    
}

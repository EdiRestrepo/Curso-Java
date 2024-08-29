
package test;

import interfaces.*;
public class TestInterface  {
    
    public static void main(String[] args) {
        
        IBaseDatos datos = new ImplementarMySQL();
        
        datos.insertar();
        
    }
    
}


package excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class ExcepcionVerificada {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        readFile1();
        
    }
    
    public static void readFile1()
        //Lanzar una Excepción en el método
        
        throws FileNotFoundException{
        File file = new File("C://file.txt");
        FileReader fr = new FileReader(file);
    }
    
}

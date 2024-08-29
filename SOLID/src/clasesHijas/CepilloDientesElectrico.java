
package clasesHijas;

import clasesPadre.*;

public class CepilloDientesElectrico extends CepilloDientes {

    @Override
    public String limpiar() {
        return super.limpiar()+" con cepillo Electrico"; 
    }
    
   
    
}

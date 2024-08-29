
package clasesPadre;

import interfaces.ILimpiar;


public class AseoPersonal {
    
    ILimpiar limpiar;
    
    AseoPersonal(ILimpiar limpiar){
        this.limpiar = limpiar;
    }
    
    String cepillarDientes(){
        return limpiar.limpiar();
    }
    
}

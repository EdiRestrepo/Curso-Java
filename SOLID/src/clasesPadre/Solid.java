
package clasesPadre;

import clasesHijas.CepilloDientesElectrico;
import clasesHijas.CepilloDientesManual;

public class Solid {

    public static void main(String[] args) {
        
        CepilloDientes cepilloDientes = new CepilloDientes();
        
        //System.out.println(cepilloDientes.limpiar());
        
        CepilloDientesElectrico cepilloElectrico = new CepilloDientesElectrico();
        
        //System.out.println(cepilloElectrico.limpiar());
        
        CepilloDientesManual cepilloManual = new CepilloDientesManual();
        
        //System.out.println(cepilloManual.limpiar());
        
        AseoPersonal aseoPersonal = new AseoPersonal(cepilloDientes);
        AseoPersonal aseoPersonal1 = new AseoPersonal(cepilloElectrico);
        AseoPersonal aseoPersonal2 = new AseoPersonal(cepilloManual);
        
        
        System.out.println(aseoPersonal.cepillarDientes());
        System.out.println(aseoPersonal1.cepillarDientes());
        System.out.println(aseoPersonal2.cepillarDientes());
    }
    
}

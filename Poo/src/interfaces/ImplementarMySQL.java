
package interfaces;


public class ImplementarMySQL implements IBaseDatos {

    @Override
    public void insertar() {
        System.out.println("Se inserto un dato");
    }
    @Override
    public void listar() {
        System.out.println("Listando datos");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando un dato");
    }

    @Override
    public void eliminar() {
        System.out.println("Se elimino un dato");
    }
    
}

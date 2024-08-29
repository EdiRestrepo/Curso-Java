package interfaces;

public interface IBaseDatos {
    
    int MAXIMO_DATOS = 10;
    
    void insertar();
    void listar();
    void actualizar();
    void eliminar();
    
}

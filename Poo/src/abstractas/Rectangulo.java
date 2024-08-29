
package abstractas;


public class Rectangulo extends FiguraGeometrica {

    public Rectangulo(String tipoFigura) {
        super(tipoFigura);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un:  "+ getClass().getSimpleName());
    }
    
}

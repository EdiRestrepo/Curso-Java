
package abstractas;


public class Cuadrado extends FiguraGeometrica {

    public Cuadrado(String tipoFigura) {
        super(tipoFigura);
    }

    @Override
    public void dibujar() {
        
        System.out.println("Dibujando un: "+this.getClass().getSimpleName());
    }
    
}

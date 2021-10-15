
package VistaEjercicio3;
import ModeloEjercicio3.*;
public class Test {
    public static void main(String[] args) {
        
        IColoreable figura = new Figura("Cuadrado");
        imprimirFigura(figura);
        System.out.println("---------------------------------");

    }
    private static void imprimirFigura(IColoreable f) {
        System.out.println("Mensaje: " + f.dibujar());
        System.out.println("Borrando: " + f.borrar());
        
       }
    
}

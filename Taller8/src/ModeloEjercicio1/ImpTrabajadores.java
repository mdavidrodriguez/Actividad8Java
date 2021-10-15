
package ModeloEjercicio1;

public class ImpTrabajadores implements ITrabajadores {
    @Override
    public double coordinador(double a){
    double bono = (100 * a)/100 ;
    double Total = a + bono;
    return Total;
    }

    @Override
    public double Asistente(double b) {
    double bono = (100 * b)/100 ;
    double Total = b + bono;
    return Total;
    }

    @Override
    public double Secretaria(double c) {
    double bono = (100 * c)/100 ;
    double Total = c + bono;
    return Total;
    }

    @Override
    public double Docente(double d) {
    double sal = d * 120;
    double bono = (70 *sal)/100;
    double Total = sal + bono;
    return Total;
    }
        
    
}

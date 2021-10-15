package VistaEjercicio1;

import ModeloEjercicio1.*;

public class Test {

    public static void main(String[] args) {
        ImpTrabajadores trabajadores = new ImpTrabajadores();
        System.out.println("Sueldo de los Trabajadores con 100 % de Bonificacion de su Sueldo");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Sueldo del Coordinador: " + trabajadores.coordinador(5000));
        System.out.println("Sueldo del Asistente: " + trabajadores.Asistente(4000));
        System.out.println("Sueldo de la Secretaria: " + trabajadores.Secretaria(3000));
        System.out.println("\nSueldo del docente con 70 % de bonificacion de su sueldo");
        System.out.println("---------------------------------------------------------");
        System.out.println("Sueldo del Docente: " + trabajadores.Docente(15));
        
        
        
        
        

    }

}

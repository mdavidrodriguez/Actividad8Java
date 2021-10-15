
package ModeloEjercicio2;

import ModeloEjercicio2.IPersona.Persona;
import static ModeloEjercicio2.IPersona.imprimeArrayPersonas;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Persona[] arrayPersonas = new Persona[7];
        arrayPersonas[0] = new Persona("Juan", 24, 160);
        arrayPersonas[1] = new Persona("Carlos", 42, 189);
        arrayPersonas[2] = new Persona("Jose", 32, 150);
        arrayPersonas[3] = new Persona("Mateo", 47, 164);
        arrayPersonas[4] = new Persona("Juancho", 18, 167);
        arrayPersonas[5] = new Persona("Sofia", 90, 170);
        arrayPersonas[6] = new Persona("Gabriel", 77, 175);

        System.out.println("Array sin ordenar por altura");
        System.out.println("------------------------------");
        imprimeArrayPersonas(arrayPersonas);
        Arrays.sort(arrayPersonas);
        System.out.println("\nArray ordenado por altura");
        System.out.println("-------------------------------");
        imprimeArrayPersonas(arrayPersonas);
    
}
}

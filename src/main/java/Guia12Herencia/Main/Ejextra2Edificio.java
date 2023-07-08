
package Guia12Herencia.Main;

import Guia12Herencia.Entity.Edificio;
import Guia12Herencia.Entity.EdificioDeOficinas;
import Guia12Herencia.Entity.Polideportivo;
import java.util.ArrayList;


public class Ejextra2Edificio {

  
    public static void main(String[] args) {
          ArrayList<Edificio> edificios = new ArrayList<>();

        Polideportivo polideportivo1 = new Polideportivo(20, 30, 40, "Polideportivo 1", "Techado");
        Polideportivo polideportivo2 = new Polideportivo(25, 35, 45, "Polideportivo 2", "Abierto");
        EdificioDeOficinas edificioOficinas1 = new EdificioDeOficinas(50, 60, 70, 10, 5, 5);
        EdificioDeOficinas edificioOficinas2 = new EdificioDeOficinas(60, 70, 80, 20, 4, 7);

        edificios.add(polideportivo1);
        edificios.add(polideportivo2);
        edificios.add(edificioOficinas1);
        edificios.add(edificioOficinas2);

        for (Edificio edificio : edificios) {
            System.out.println("Superficie: " + edificio.calcularSuperficie());
            System.out.println("Volumen: " + edificio.calcularVolumen());

            if (edificio instanceof Polideportivo) {
                Polideportivo polideportivo = (Polideportivo) edificio;
                if (polideportivo.getTipoDeInstalacion().equals("Techado")) {
                    System.out.println("Polideportivo techado.");
                } else {
                    System.out.println("Polideportivo abierto.");
                }
            } else if (edificio instanceof EdificioDeOficinas) {
                EdificioDeOficinas edificioOficinas = (EdificioDeOficinas) edificio;
                edificioOficinas.cantPersonas();
            }

            System.out.println();
        }
    }
}

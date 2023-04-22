
package Guia9Utilidades.main;

import Guia9Utilidades.Entity.Cadena;
import Guia9Utilidades.Service.CadenaService;


public class ej1Cadena {

  
    public static void main(String[] args) {
       
        CadenaService cadena = new CadenaService();
        Cadena cadenaobj = new Cadena("anana");
        
        System.out.println(cadena.mostrarVocales(cadenaobj));
        cadena.invertirFrase(cadenaobj);
        System.out.println(cadena.vecesRepetido("a", cadenaobj));
        cadena.compararLongitud("pepinoo", cadenaobj);
        cadena.unirFrases("grande", cadenaobj);
        cadena.reemplazar("y", cadenaobj);
        System.out.println(cadena.contiene("g", cadenaobj));
    }
    
}

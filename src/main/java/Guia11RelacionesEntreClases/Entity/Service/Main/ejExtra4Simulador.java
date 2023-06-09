
package Guia11RelacionesEntreClases.Entity.Service.Main;

import Guia11RelacionesEntreClases.Entity.Simulador;


public class ejExtra4Simulador {

    
    public static void main(String[] args) {
      
        Simulador simulador = new Simulador();
        
        simulador.generarListaAlumnos(3);
        simulador.generarListadoAlumnosConDNI(3, 1, 1000000);
        simulador.generarObjetosAlumno();
        simulador.imprimirPorPantalla();
        
    }
    
}

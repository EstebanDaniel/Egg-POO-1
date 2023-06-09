
package Guia11RelacionesEntreClases.Entity.Service.Main;


import Guia11RelacionesEntreClases.Entity.Cine;
import Guia11RelacionesEntreClases.Entity.Espectador;
import Guia11RelacionesEntreClases.Entity.Pelicula;



public class ejExtra2Cine {

    
    public static void main(String[] args) {
        
        Pelicula pelicula = new Pelicula("La película", 120, "Director X",18);
        Cine cine = new Cine(pelicula, 10);

        cine.mostrarSala();

        // Generar espectadores aleatorios
        Espectador[] espectadores = {
                new Espectador("Espectador 1", 5, 15.0),
                new Espectador("Espectador 2", 30, 18.0),
                new Espectador("Espectador 3", 18, 12.0),
                new Espectador("Espectador 4", 22, 8.0),
                new Espectador("Espectador 5", 19, 15.0)
        };

        for (Espectador espectador : espectadores) {
            cine.agregarEspectador(espectador);
        }

        cine.mostrarSala();
   } 
    }
    


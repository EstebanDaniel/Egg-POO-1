
package Guia10Colleciones.Entity.Service.Main;

import Guia10Colleciones.Entity.Pelicula;
import Guia10Colleciones.Entity.Service.PeliculaService;


public class ej4Pelicula {

  
    public static void main(String[] args) {
       
        PeliculaService peliServ = new PeliculaService();
        Pelicula peli = peliServ.crearPelicula();
        peliServ.agregarYPreguntar(peli);
        peliServ.mostrarTodasLasPelis();
        peliServ.mostrarPelisMasUnaHora();
        peliServ.ordenarPeliculasPorDirector();
        peliServ.ordenarPeliculasPorTitulo();
        peliServ.ordenarPeliculasPorDuracionAscendente();
        peliServ.ordenarPeliculasPorDuracionDescendente();
        
    }
    
}

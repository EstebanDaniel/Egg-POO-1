/*
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario todos sus datos y guardándolos
en el objeto Pelicula. Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere crear otra Pelicula o no. 
Después de ese bucle realizaremos las siguientes acciones:  
 
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora. 
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla. 
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla. 
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla. 
 */
package Guia10Colleciones.Entity.Service;

import Guia10Colleciones.Entity.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class PeliculaService {
    
     private ArrayList<Pelicula>listaPeliculas = new ArrayList<>();;
    Scanner leer = new Scanner(System.in);
    
   
    
    public Pelicula crearPelicula(){
        System.out.println("Ingrese el titulo de la pelicula");
        String titulo = leer.next();
        System.out.println("Ingrese el director de la pelicula");
        String director = leer.next();
        System.out.println("Ingrese la duracion de la pelicula");
        int duracion = leer.nextInt();
        return new Pelicula(titulo,director,duracion);
    }
    
     public void agregarYPreguntar(Pelicula pelicula){
       String bandera = "";
       listaPeliculas.add(pelicula);
       
       while(!bandera.equals("n")){
       
           System.out.println("Desea crear y agregar otra pelicula? s/n");
           bandera = leer.next();
           if(!bandera.equals("n")){
           Pelicula peli = crearPelicula();
           listaPeliculas.add(peli);
           } 
           
       }
        
    }
    // • Mostrar en pantalla todas las películas.
     public void mostrarTodasLasPelis(){
          System.out.println("Todas las pelis: ");
         for (Pelicula pelicula : listaPeliculas) {
             System.out.println(pelicula.toString());
         }
     }
     
    // • Mostrar en pantalla todas las películas con una duración mayor a 1 hora. 
     public void mostrarPelisMasUnaHora(){
              System.out.println("Pelis de mas de una hora: ");
             for (Pelicula pelicula : listaPeliculas) {
              if (pelicula.getDuracionHoras()>1){
                  System.out.println(pelicula.toString());
              }
         }
     }
     
     public void ordenarPeliculasPorDuracionDescendente() {
    Collections.sort(listaPeliculas, (Pelicula pelicula1, Pelicula pelicula2) -> 
            Integer.compare(pelicula2.getDuracionHoras(), pelicula1.getDuracionHoras()));

    System.out.println("Lista de películas ordenadas por duración (de mayor a menor):");
    for (Pelicula pelicula : listaPeliculas) {
      System.out.println(pelicula);
    }
  }
     
     public void ordenarPeliculasPorDuracionAscendente() {
    Collections.sort(listaPeliculas, (Pelicula pelicula1, Pelicula pelicula2) ->
            Integer.compare(pelicula1.getDuracionHoras(), pelicula2.getDuracionHoras()));

    System.out.println("Lista de películas ordenadas por duración (de menor a mayor");
     
             for (Pelicula pelicula : listaPeliculas) {
                   System.out.println(pelicula);
         }
     
     }
     
      public void ordenarPeliculasPorTitulo() {
        Collections.sort(listaPeliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return p1.getTitulo().compareTo(p2.getTitulo());
            }
        });
        System.out.println("Lista de películas ordenada por título:");
        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula);
        }
    }
      
       public void ordenarPeliculasPorDirector() {
        Collections.sort(listaPeliculas, (Pelicula p1, Pelicula p2) -> 
                p1.getDirector().compareTo(p2.getDirector()));
        System.out.println("Lista de películas ordenada por director:");
        for (Pelicula pelicula : listaPeliculas) {  
               System.out.println(pelicula);
               }
       }  

}
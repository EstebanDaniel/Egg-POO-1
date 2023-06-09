/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto, tendremos una clase Pelicula con el título,
director y duración de la película (en horas). Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta 
lo que se pide a continuación: 
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
package Guia10Colleciones.Entity;

/**
 *
 * @author USURIO
 */
public class Pelicula {
    
    private String titulo;
    private String director;
    private int duracionHoras;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, int duracionHoras) {
        this.titulo = titulo;
        this.director = director;
        this.duracionHoras = duracionHoras;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracionHoras=" + duracionHoras + '}';
    }
    
    
    
}

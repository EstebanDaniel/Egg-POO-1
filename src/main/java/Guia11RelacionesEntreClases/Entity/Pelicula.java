
package Guia11RelacionesEntreClases.Entity;


public class Pelicula {
    
    private String titulo;
    private int duracion;
    private String director;
    private int edadMin;

    public Pelicula(String titulo, int duracion, String director, int edadMin) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.director = director;
        this.edadMin = edadMin;
    }

    public Pelicula() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(int edadMin) {
        this.edadMin = edadMin;
    }
    
    
}

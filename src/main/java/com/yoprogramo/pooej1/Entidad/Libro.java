
package com.yoprogramo.pooej1.Entidad;

//clase 15

import java.util.Scanner;

public class Libro {
    
    private int ISBN;
    private String titulo;
    private String autor;
    private int numeroPag;

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int numeroPag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPag = numeroPag;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPag() {
        return numeroPag;
    }

    public void setNumeroPag(int numeroPag) {
        this.numeroPag = numeroPag;
    }
    
    
    public void cargarLibro(Libro libro){
     Scanner leer = new Scanner(System.in);
        System.out.println("ingrese ISBN, titulo, autor y num de paginas");
         libro.setISBN(leer.nextInt());
        libro.setTitulo(leer.next());
        libro.setAutor(leer.next());
         libro.setNumeroPag(leer.nextInt()); 
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numeroPag=" + numeroPag + '}';
    }
    
    
}

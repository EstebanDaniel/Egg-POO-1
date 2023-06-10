
package Guia12Herencia.Entity;

import java.util.Scanner;


public class Alquiler {
    
    private String nombre;
    private int dni;
    private int fechaAlquiler;
    private int fechaDevolucion;
    private int posicionAmarre;
    private Barco barcoPosicionado;
    private Scanner leer = new Scanner(System.in);

    public Alquiler() {
        crearAlquiler();
    }

    public Alquiler(int fechaAlquiler, int fechaDevolucion) {
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
    }
    
    

    public Alquiler(String nombre, int dni, int fechaAlquiler, int fechaDevolucion, int posicionAmarre, Barco barcoPosicionado) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barcoPosicionado = barcoPosicionado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(int fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public int getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(int fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarcoPosicionado() {
        return barcoPosicionado;
    }

    public void setBarcoPosicionado(Barco barcoPosicionado) {
        this.barcoPosicionado = barcoPosicionado;
    }
    
    public void crearAlquiler(){
    
        System.out.println("ingrese fecha de inicio");
        setFechaAlquiler(leer.nextInt());
        System.out.println("Ingrese fecha de entrega");
        setFechaDevolucion(leer.nextInt());
        
        
        
    }
    
}

/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
*/
package com.yoprogramo.pooej1.Entidad;

import java.util.Scanner;


public class Cafetera {
    
    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    public void llenarCafetera(){
    
        cantidadActual = capacidadMaxima;
    }
    
    public void servirTaza(int cantidad){
    
       
        System.out.println("El tamano de la taza es: "+cantidad);
        System.out.println("Sirviendo la taza...");

             if (cantidad <= cantidadActual){
                 cantidadActual-=cantidad;
                 System.out.println("Se lleno la taza. Gracias por elegirnos!!");
             } else if(cantidad > cantidadActual && cantidadActual != 0){
                 cantidad = cantidadActual;
                 cantidadActual = 0;
                 System.out.println("Se lleno la taza con lo que quedaba: "+cantidad+" gracias!!");
             } else if (cantidadActual == 0){
                 System.out.println("La cafetera esta vacia, lo siento...");
             }
     
    }
    
    public void vaciarCafetera(){
    
        cantidadActual = 0;
    }
    
    public void agregarCafe(){
         Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de cafe a cargar");
        int cantidad = leer.nextInt();
        if (cantidad <= capacidadMaxima && cantidadActual <= capacidadMaxima){
            cantidadActual+=cantidad;
            System.out.println("La cafetera ha sido cargada...");
        } else{
            System.out.println("La cantidad supera el maximo de capacidad");
        }
        
    }
    
    
    
}

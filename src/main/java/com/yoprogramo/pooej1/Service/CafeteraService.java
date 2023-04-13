
package com.yoprogramo.pooej1.Service;

import com.yoprogramo.pooej1.Entidad.CafeteraDos;

public class CafeteraService {
       
       private CafeteraDos cafetera;
       

    public CafeteraService() {
        this.cafetera = new CafeteraDos();
    }

    public CafeteraService(int capacidadMax, int cantidadActual) {
        this.cafetera = new CafeteraDos(capacidadMax, cantidadActual);
    }

    public void llenarCafetera() {
        cafetera.setCantidadActual(cafetera.getCapacidadMax());
    }

    
    public void servirTaza(int tamanoTaza) {
        if (cafetera.getCantidadActual() >= tamanoTaza) {
            System.out.println("Se llenó la taza.");
            cafetera.setCantidadActual(cafetera.getCantidadActual() - tamanoTaza);
        } else if (tamanoTaza > cafetera.getCantidadActual() && cafetera.getCantidadActual()!=0) {
            System.out.println("No alcanzó para llenar la taza. Se sirvió lo que quedó.");
            int cantidadServida = cafetera.getCantidadActual();
            cafetera.setCantidadActual(0);
            System.out.println("La taza quedó con " + cantidadServida + " ml de café.");
        } else if (cafetera.getCantidadActual() == 0){
                 System.out.println("La cafetera esta vacia, lo siento...");
           
        
    }
        
    }

    public void vaciarCafetera() {
        cafetera.setCantidadActual(0);
    }

    public void agregarCafe(int cantidad) {
        cafetera.setCantidadActual(cafetera.getCantidadActual() + cantidad);
    }
    
    public void mostrarCantidad(){
    
        System.out.println(cafetera.getCantidadActual());
    }
}
    
   
    



package com.yoprogramo.pooej1;

import com.yoprogramo.pooej1.Service.CafeteraService;


public class ej2Dia20CafeteraDos {

   
    public static void main(String[] args) {
        
        CafeteraService servicio = new CafeteraService(800, 500);

        // llenar la cafetera
        servicio.llenarCafetera();
        servicio.mostrarCantidad();
        // servir una taza de 200 ml
        servicio.servirTaza(200);
        servicio.mostrarCantidad();

        // agregar 300 ml de café
        servicio.agregarCafe(300);
        servicio.mostrarCantidad();
        // servir otra taza de 400 ml
        servicio.servirTaza(400);
        servicio.mostrarCantidad();
        // vaciar la cafetera
        servicio.vaciarCafetera();
        servicio.mostrarCantidad();
        
        servicio.servirTaza(400);
    }
    
}

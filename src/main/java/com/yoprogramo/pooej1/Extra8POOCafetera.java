
package com.yoprogramo.pooej1;

import com.yoprogramo.pooej1.Entidad.Cafetera;


public class Extra8POOCafetera {

   
    public static void main(String[] args) {
        
        Cafetera cafe = new Cafetera(1000,0);
        
        cafe.llenarCafetera();
        System.out.println(cafe.getCantidadActual());
        cafe.servirTaza(500);
        System.out.println("--------------");
        cafe.servirTaza(600);
        cafe.servirTaza(500);
        System.out.println(cafe.getCantidadActual());
        cafe.agregarCafe();
        
        
    }
    
}

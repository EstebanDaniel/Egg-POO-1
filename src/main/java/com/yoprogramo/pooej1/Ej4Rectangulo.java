
package com.yoprogramo.pooej1;

import com.yoprogramo.pooej1.Entidad.Rectangulo;


public class Ej4Rectangulo {

   
    public static void main(String[] args) {
        
        Rectangulo rec = new Rectangulo();
        rec.crearRectangulo(rec);
        System.out.println(rec.superficie());
        System.out.println(rec.perimetro());
        rec.dibujarRectangulo();
             
    }
    
}

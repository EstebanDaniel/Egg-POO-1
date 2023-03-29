
package com.yoprogramo.pooej1;

import com.yoprogramo.pooej1.Entidad.Circurferencia;


public class POOej2Circurferencia {

   
    public static void main(String[] args) {
        Circurferencia circ = new Circurferencia();
        
        circ.crearCircurferencia(2); 
        System.out.println(circ.area());
        System.out.println(circ.perimetro());
    }
    
}


package com.yoprogramo.pooej1;

import com.yoprogramo.pooej1.Entidad.Operacion;


public class POOej3Operacion {

  
    public static void main(String[] args) {
        
        Operacion ope = new Operacion();
        
        ope.crearOperacion();
        
        ope.sumar();
        ope.restar();
        ope.multiplicar();
        ope.dividir();
        System.out.println(ope.toString());
        
    }
    
}

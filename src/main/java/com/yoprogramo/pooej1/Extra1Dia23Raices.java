package com.yoprogramo.pooej1;

import com.yoprogramo.pooej1.Entidad.Raices;
import com.yoprogramo.pooej1.Service.RaicesService;


public class Extra1Dia23Raices {

   
    public static void main(String[] args) {
        
        RaicesService raiz = new RaicesService();
        Raices raiz1 = new Raices(1, -5, 6); //Las raices son: x1=3.0, x2=2.0
        Raices raiz2 = new Raices(1, -4, 4); // La raiz es: x=2.0
        Raices raiz3 = new Raices(1, 2, 3); // No tiene solucion real.

        
        System.out.println("discriminante: "+raiz.getDiscriminante(raiz2));
        System.out.println("tiene raices? "+raiz.tieneRaices(raiz2));
        System.out.println("tiene raiz? "+raiz.tieneRaiz(raiz2));
        raiz.obtenerRaices(raiz2);
        raiz.obtenerRaiz(raiz2); 
        raiz.calcular(raiz2); 

    }
    
}


package com.yoprogramo.pooej1;

import com.yoprogramo.pooej1.Entidad.NIF;
import com.yoprogramo.pooej1.Service.NIFService;


public class Extra3dia23NIF {

   
    public static void main(String[] args) {
        
        NIFService nif = new NIFService();
        NIF nif1 = new NIF();
        
        nif.crearNIF(nif1);
        nif.mostrar(nif1);
        
    }
    
}

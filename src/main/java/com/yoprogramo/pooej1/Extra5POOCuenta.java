
package com.yoprogramo.pooej1;

import com.yoprogramo.pooej1.Entidad.Cuenta;


public class Extra5POOCuenta {

    
    public static void main(String[] args) {
        
        Cuenta cuenta = new Cuenta(500,"Esteban");
        System.out.println(cuenta.getSaldo());
        cuenta.retirar_dinero(300);
        System.out.println(cuenta.getSaldo());
         cuenta.retirar_dinero(300);
        System.out.println(cuenta.getSaldo());
        cuenta.retirar_dinero(200);
        System.out.println(cuenta.getSaldo());
        cuenta.retirar_dinero(200);
        System.out.println(cuenta.getSaldo());
        
    }
    
}

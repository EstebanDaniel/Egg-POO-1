/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.yoprogramo.pooej1;

import com.yoprogramo.pooej1.Entidad.CuentaDos;


public class Extra8PooCuentaDos {

    
    public static void main(String[] args) {
       
        CuentaDos cuenta = new CuentaDos();
        
        cuenta.crearCuenta(cuenta);
        cuenta.depositarCuenta(100);
        System.out.println(cuenta.consultarSaldo());
        cuenta.extraccionRapida();
        System.out.println(cuenta.consultarSaldo());
        cuenta.retirarCuenta(80);
        System.out.println(cuenta.consultarSaldo());
        System.out.println(cuenta.consultarDatos());
        cuenta.extraccionRapida();
        System.out.println(cuenta.consultarSaldo());
       
        
        
    }
    
}

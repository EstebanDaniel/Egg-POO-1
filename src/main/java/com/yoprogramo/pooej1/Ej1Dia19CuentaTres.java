/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.yoprogramo.pooej1;

import com.yoprogramo.pooej1.Service.CuentaBancariaService;


public class Ej1Dia19CuentaTres {

    
    public static void main(String[] args) {
      
        CuentaBancariaService cbn = new CuentaBancariaService();
        cbn.crearCuenta();
        cbn.ingresarDinero(100);
        cbn.mostrarDinero();
        
    }
    
}

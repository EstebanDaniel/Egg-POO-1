
package com.yoprogramo.pooej1;

import com.yoprogramo.pooej1.Entidad.Empleado;


public class Extra6POOEmpleado {

    
    public static void main(String[] args) {
        
        Empleado empleado = new Empleado("dani",35,10000);
        Empleado empleado2 = new Empleado("pepe",25,10000);
        
        empleado.calcular_aumento();
        empleado2.calcular_aumento();
        
        System.out.println(empleado.getSalario());
        System.out.println(empleado2.getSalario());
        
    }
    
}


package Guia9Utilidades.main;

import Guia9Utilidades.Entity.ParDeNumeros;
import Guia9Utilidades.Service.ParDeNumerosService;


public class ej2ParDeNumeros {

    
    public static void main(String[] args) {
        
        ParDeNumerosService parDe = new ParDeNumerosService();
        ParDeNumeros par = new ParDeNumeros();
        
        parDe.mostrarValores(par);
        System.out.println("el mayor es: "+parDe.devolverMayor(par));   
        
        System.out.println(parDe.calcularPotencia(par));
        
        parDe.calcularRaiz(par);
    }
    
}

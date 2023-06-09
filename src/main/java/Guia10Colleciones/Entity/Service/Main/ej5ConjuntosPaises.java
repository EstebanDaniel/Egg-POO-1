
package Guia10Colleciones.Entity.Service.Main;

import Guia10Colleciones.Entity.Service.PaisesService;


public class ej5ConjuntosPaises {

   
    public static void main(String[] args) {
        
        PaisesService paisesServ = new PaisesService();
        paisesServ.crearPaises();
        paisesServ.mostrarAlfabeticamente();
        paisesServ.recorrerConjunto();
        paisesServ.mostrarAlfabeticamente();
    }
    
}

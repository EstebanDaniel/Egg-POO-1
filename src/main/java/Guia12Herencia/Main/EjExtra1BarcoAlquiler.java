
package Guia12Herencia.Main;

import Guia12Herencia.Entity.Alquiler;
import Guia12Herencia.Entity.BarcoAMotor;
import Guia12Herencia.Entity.Velero;
import Guia12Herencia.Entity.YateDeLujo;


public class EjExtra1BarcoAlquiler {

   
    public static void main(String[] args) {
       
        Alquiler alquiler = new Alquiler();
    
        Velero velero = new Velero(3,2020,5,1900);
        BarcoAMotor barcoM = new BarcoAMotor(200,2020,5,1930);
        YateDeLujo yate = new YateDeLujo(2,200,20023,5,1540);
        
        System.out.println(velero.calcularAlquiler(alquiler)); 
        System.out.println(barcoM.calcularAlquiler(alquiler));  
        System.out.println(yate.calcularAlquiler(alquiler)); 
        
        
        
        
    }
    
}

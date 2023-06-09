
package Guia12Herencia.Main;

import Guia12Herencia.Entity.Animal;
import Guia12Herencia.Entity.Caballo;
import Guia12Herencia.Entity.Gato;
import Guia12Herencia.Entity.Perro;


public class Ej1Animal {

    
    public static void main(String[] args) {
       
        Animal perro1 = new Perro("Stich","Carne",15,"Doberman");
         perro1.alimentarse();
         Animal perro2 = new Perro("Teddy","Croquetas",10,"Chihuahua");
         perro2.alimentarse();
          Animal gato1 = new Gato("Pelusa","Galletas",15,"Siamés");
          gato1.alimentarse();
           Animal caballo1= new Caballo("Spark","pasto",25,"Fino");
           caballo1.alimentarse();
         
        
    }
    
}

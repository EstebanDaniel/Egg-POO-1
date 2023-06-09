//Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El programa 
//pedirá una raza de perro en un bucle, el mismo se guardará en la lista y después se le preguntará al usuario si quiere 
//guardar otro perro o si quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList.  
 
package Guia10Colleciones.Entity.Service.Main;

import java.util.ArrayList;
import java.util.Scanner;

public class ej1Raza {

 
    public static void main(String[] args) {
        
      Scanner leer = new Scanner(System.in);
      ArrayList<String> mascotas = new ArrayList<>();  
      String bandera = "";
            while(!bandera.equals("n")){
            System.out.println("Ingrese la raza de la mascota");
            String raza = leer.next();
            mascotas.add(raza);
            
                System.out.println("Desea agregar mas razas?");
                bandera = leer.next(); 
}
            for (String mascota : mascotas) {
                 System.out.println("Razas: "+mascota);
        }
            
}
    
}
//Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá un perro y se recorrerá la lista 
//con un Iterator, se buscará el perro en la lista. Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
//la lista ordenada. Si el perro 
//no se encuentra en la lista, se le informará al usuario y se mostrará la lista ordenada. 
package Guia10Colleciones.Entity.Service.Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


public class ej2IteratorRaza {

   
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
            
            //----------------------------------ej2
        System.out.println("Ingrese otra raza de perro");
          String raza = leer.next();
          
          if(mascotas.contains(raza)){
          
          Iterator<String> it = mascotas.iterator();
          while (it.hasNext()) {
            String aux = it.next();
            if (aux.equals(raza)){
               it.remove();          
                }
        } 
              System.out.println("eliminando mascota...y ordenando");
          Collections.sort(mascotas);
              System.out.println("Lista de mascotas ordenada: ");
              for (String mascota : mascotas) {
                    System.out.println(mascota);
              }
          } else{
              System.out.println("No contiene la mascota. ordenando...");
              Collections.sort(mascotas);
              System.out.println("Lista de mascotas ordenada: ");
              for (String mascota : mascotas) {
                  System.out.println(mascota);
              }
          }
          
    } 
}

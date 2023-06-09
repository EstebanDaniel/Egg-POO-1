/*
 Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos usaremos un conjunto. El programa pedirá 
un país en un bucle, se guardará el país en el conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar cómo se ordena un conjunto. Por último, al usuario 
se le pedirá un país y se recorrerá el conjunto con un Iterator, se buscará el país en el conjunto y si está en el conjunto se eliminará el 
país que ingresó el usuario yse mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará al usuario. 
 */
package Guia10Colleciones.Entity.Service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class PaisesService {
    
    private HashSet<String>hashSetPais;
    Scanner leer = new Scanner(System.in);
    
    public PaisesService() {
        this.hashSetPais = new HashSet<>();
    }
    
    public void crearPaises(){
        String bandera = "";
        while(!bandera.equals("n")){
        System.out.println("Ingrese pais a agregar");
        String pais = leer.next();
        hashSetPais.add(pais);
            System.out.println("Desea agregar otro pais? s/n");  
            bandera = leer.next();
        }
        
        for (String Pais : hashSetPais) {
              System.out.println(Pais);
        }     
    }
    
    public void mostrarAlfabeticamente(){
      // crear un TreeSet a partir del HashSet existente
   Set<String> treeSetPais = new TreeSet<>(hashSetPais);
// imprimir los elementos del TreeSet (ordenados alfabéticamente)
        System.out.println("Paises ordenados alfabeticamente: ");
    for (String elemento : treeSetPais) {
       System.out.println(elemento);
    }
    
}
    
    public void recorrerConjunto(){
         boolean bandera = true;
         System.out.println("Ingrese un Pais a buscar");
          String pais = leer.next();
          
          if(hashSetPais.contains(pais)){
          
          Iterator<String> it = hashSetPais.iterator();
          while (it.hasNext()) {
            String aux = it.next();
            if (aux.equals(pais)){
               it.remove();          
                }
        } 
        
    } else {
              bandera = false;
          }
          
          if (bandera){
              System.out.println("Eliminado...");
          }else{
              System.out.println("No se encontro el pais a eliminar");
          }

}
    
}
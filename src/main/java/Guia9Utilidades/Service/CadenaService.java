
package Guia9Utilidades.Service;

import Guia9Utilidades.Entity.Cadena;
import java.util.Scanner;


public class CadenaService {
    
    Scanner leer = new Scanner(System.in);
    
    //Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
    public int mostrarVocales(Cadena cadena){
         int cont = 0;
         String frase;
        for (int i = 0; i < cadena.getLongFrase(); i++) {       
                frase = cadena.getFrase().substring(i, i+1);
            if (frase.equalsIgnoreCase("a") || frase.equalsIgnoreCase("e") || frase.equalsIgnoreCase("i")||
                    frase.equalsIgnoreCase("o") || frase.equalsIgnoreCase("u")){
                    cont+=1;
            }
        }
        return cont;
    }
    
  //  Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
    //Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    
    public void invertirFrase(Cadena cadena){
        //permite modificar los strings
        StringBuilder builder = new StringBuilder(cadena.getFrase());
        String fraseInvertida = builder.reverse().toString();
        System.out.println(fraseInvertida);
    }
    
//    Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
//            contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
       public int vecesRepetido(String letra,Cadena cadena){
           int cont = 0;
           for (int i = 0; i < cadena.getLongFrase(); i++) {
                 if(letra.contains(cadena.getFrase().substring(i,i+1))){
                    cont++;
                 }
               
           }
           return cont;
       }
       
//       Método compararLongitud(String frase), deberá comparar la longitud de la frase que 
//               compone la clase con otra nueva frase ingresada por el usuario.
             public void compararLongitud(String frase,Cadena cadena){
                
                 if (cadena.getLongFrase() == frase.length()){
                      System.out.println("Tienen la misma longitud");
                 } else{
                     System.out.println("No tienen la misma longitud");
                 }
             
             }
             
//             Método unirFrases(String frase), deberá unir la frase contenida en la clase 
//                     Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
          public void unirFrases(String frase,Cadena cadena){
          
             String concat = cadena.getFrase().concat(frase);
              
              System.out.println(concat);
          }
    
//          Método reemplazar(String letra), deberá reemplazar todas las letras “a”
//                  que se encuentren en la frase, por algún otro carácter seleccionado por
//                  el usuario y mostrar la frase resultante.
             public void reemplazar(String letra, Cadena cadena ){
             
               String fraseRemplazada = cadena.getFrase().replace("a", letra).replace("A", letra);
                     System.out.println(fraseRemplazada);
 
             }
    
//             Método contiene(String letra), deberá comprobar si la frase contiene
//                     una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.
            public boolean contiene(String letra,Cadena cadena){
        
                return (cadena.getFrase().contains(letra));
                   
            }
    
    
}

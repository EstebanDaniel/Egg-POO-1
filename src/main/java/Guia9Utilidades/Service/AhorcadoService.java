
package Guia9Utilidades.Service;

import Guia9Utilidades.Entity.Ahorcado;

import java.util.Scanner;


public class AhorcadoService {
    
//    ● Metodo crearJuego(): le pide la palabra al usuario y cantidad de
//jugadas máxima. Con la palabra del usuario, pone la longitud de la
//palabra, como la longitud del vector. Después ingresa la palabra en el
//vector, letra por letra, quedando cada letra de la palabra en un índice
//del vector. Y también, guarda la cantidad de jugadas máximas y el
//valor que ingresó el usuario.
    
    Scanner leer = new Scanner(System.in);
    
    public String[] crearJuego(Ahorcado ahorcado){
        System.out.println("Ingrese la palabra");
        String palabra = leer.next();
        String vector[] = new String[palabra.length()];
        
        System.out.println("ingrese cantidad de jugadas maximas");
          ahorcado.setJugadasMax(leer.nextInt());
            
        for (int i = 0; i < palabra.length(); i++) {
            vector[i] = palabra.substring(i, i+1);        
        }
        ahorcado.setPalabraABuscar(vector);
        return vector;
              
    }
    
//    ● Método longitud(): muestra la longitud de la palabra que se debe
//encontrar. Nota: buscar como se usa el vector.length. no necesita los parentesis en los vectores
    public void longitud(Ahorcado ahorcado){ 
        System.out.println("longitud: "+ahorcado.getPalabraABuscar().length);
    }
    
//    ● Método buscar(letra): este método recibe una letra dada por el
//usuario y busca si la letra ingresada es parte de la palabra o no.
//También informará si la letra estaba o no.
    public void buscarLetra(Ahorcado ahorcado, String letra){
          boolean bandera = false;
          
        for (String palabraABuscar : ahorcado.getPalabraABuscar()) {
            if (letra.equalsIgnoreCase(palabraABuscar)){
                  bandera = true;
                  
            }
        }
           if(bandera){
               System.out.println("La letra esta en la palabra");
           } else{
               System.out.println("La letra no esta en la palabra");
           }
        
    }
    
//    ● Método encontradas(letra): que reciba una letra ingresada por el
//usuario y muestre cuantas letras han sido encontradas y cuántas le
//faltan. Este método además deberá devolver true si la letra estaba y
//false si la letra no estaba, ya que, cada vez que se busque una letra
//que no esté, se le restará uno a sus oportunidades.
    public boolean encontradas(Ahorcado ahorcado){
           int encontradas = ahorcado.getLetrasEncontradas(); //mantiene el valor al ser por referencia
           int faltantes = 0; //acumulado que si alcanza la long de la palabra resta 1 intento
           boolean bandera = false; //el ej pide que retorne un booleano
           int intentos= ahorcado.getJugadasMax(); //mantiene el valor al ser por referencia, que inicia con el valor que ingresa el usuario
          
           System.out.println("Ingrese letra a buscar en la palabra");
           String letra = leer.next();
           buscarLetra(ahorcado, letra); //funcion que recibe el objeto, lo itera y verifica si posee dicha letra
           
        for (String palabraABuscar : ahorcado.getPalabraABuscar()) { //iteramos la palabra secreta
            if(letra.equalsIgnoreCase(palabraABuscar)){ //verificamos si la letra del usuario es igual a algun elemento en el for
               encontradas+=1; //al ser asi encontradas se incrementa
               ahorcado.setLetrasEncontradas(encontradas); //guardamos por referencia las letras encontradas
               bandera = true; //valor de retorno
            } else {     
              faltantes+=1;  //vuelve a cero, cada vez que finaliza la funcion, debido a que sirve de comparativa, si no hay ningun acierto
              //de esta manera faltantes tendria la misma long que la palabra secreta en cada llamada a la funcion, lo que resta intentos para
              //romper el bucle en la funcion juego()
            }
            
              ahorcado.setLetrasRestantes(ahorcado.getPalabraABuscar().length - ahorcado.getLetrasEncontradas());
              //no pide dicho atributo el ej, pero me parecio apropiado para llevar la cuenta correcta de las letras restantes
              //que salen de la long de la palabra secreta, menos las letras encontradas, que a medida que crecen decrementan automaticamente las
              //la long de la palabra secreta.
            
            if(faltantes == ahorcado.getPalabraABuscar().length){
                intentos -=1; //lo dicho anteriormente si llega a la long de la palabra secreta
                System.out.println("le quedan "+intentos+" intentos");
                ahorcado.setJugadasMax(intentos); //seteamos el nuevo valor por referencia
            } else if (ahorcado.getLetrasEncontradas() == (ahorcado.getPalabraABuscar().length)){//letrasEncontradas tendra la misma long que la
                //palabra secreta si encontramos todas, lo que finaliza el juego
                System.out.println("Has ganado!!");
                intentos = 0;
                ahorcado.setJugadasMax(intentos);//seteamos en cero para que se rompa el bucle de juego()
            }
        }
           System.out.println("Encontradas: "+encontradas);
           System.out.println("Restantes: "+ahorcado.getLetrasRestantes());
           return bandera;
    }
    
//    ● Método intentos(): para mostrar cuántas oportunidades le queda al
//jugador.
    public int intentos(Ahorcado ahorcado){
        return ahorcado.getJugadasMax();
    }
    
//    ● Método juego(): el método juego se encargará de llamar todos los
//métodos previamente mencionados e informará cuando el usuario
//descubra toda la palabra o se quede sin intentos. Este método se
//llamará en el main.
    public void juego(Ahorcado ahorcado){
      while(intentos(ahorcado)!=0){
          longitud(ahorcado);
           System.out.println(encontradas(ahorcado));
           intentos(ahorcado);
      }
    }
    
    public void mostrarPalabra(Ahorcado ahorcado){
        
              for (String elemento : ahorcado.getPalabraABuscar()) {
               System.out.println(elemento);
        }
    }
    
    
    
}



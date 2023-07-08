

package Guia13Exceptions.Main;

public class ej8Exceptions {
    
    /*
    Indique que se mostrará por pantalla cuando se ejecute cada una de estas clases:
class Uno{
private static int metodo() {
int valor=0;
try {
valor = valor+1;
valor = valor + Integer.parseInt (”42”);
valor = valor +1;
System.out.println(”Valor final del try:” + valor) ;
} catch (NumberFormatException e) {
Valor = valor + Integer.parseInt(”42”);
System.out.println(“Valor final del catch:” + valor);
} finally {
valor = valor + 1;
System.out.println(”Valor final del finally: ” + valor) ;
}
valor = valor +1;
System.out.println(”Valor antes del return: ” + valor) ;
return valor;
}
public static void main (String[] args) {
try {
System.out.println (metodo()) ;
}catch(Exception e) {
System.err.println(”Excepcion en metodo() ”) ;
e.printStackTrace();
}
}
}
class Dos{
private static int metodo() {
int valor=0;
try{
valor = valor + 1;
valor = valor + Integer.parseInt (”W”);
valor = valor + 1;
System.out.println(”Valor final del try: ” + valor) ;
} catch ( NumberFormatException e ) {
valor = valor + Integer.parseInt (”42”);
System.out.println(”Valor final del catch: ” + valor) ;
} finally {
valor = valor + 1;
System.out.println(”Valor final del finally: ” + valor) ;
}
valor = valor + 1;
System.out.println(”Valor antes del return: ” + valor) ;
return valor;
}
public static void main (String[] args) {
try{
System.out.println ( metodo ( ) ) ;
} catch(Exception e) {
System.err.println ( ” Excepcion en metodo ( ) ” ) ;
e.printStackTrace();
}
}
 }

class Tres{
private static int metodo( ) {
int valor=0;
try{
valor = valor + 1;
valor = valor + Integer.parseInt (”W”);
valor = valor + 1;
System.out.println(”Valor final del try: ” + valor);
} catch(NumberFormatException e) {
valor = valor + Integer.parseInt (”W”);
System.out.println(”Valor final del catch: ” + valor);
} finally{
valor = valor + 1;
System.out.println(”Valor final del finally:” + valor);
}
valor = valor + 1;
System.out.println(”Valor antes del return: ” + valor) ;
return valor;
}
public static void main (String[] args) {
try{
System.out.println( metodo ( ) ) ;
} catch(Exception e) {
System.err.println(”Excepcion en metodo ( ) ” ) ;
e.printStackTrace();
}
}
}  

La ejecución y los resultados por pantalla para cada una de las clases serían los siguientes:

Clase Uno:

kotlin
Copy code
Valor final del try: 44
Valor final del finally: 45
Valor antes del return: 46
46
En este caso, el bloque try se ejecuta sin problemas y se muestra el valor final dentro del try como 44. Luego,
el bloque finally se ejecuta y se incrementa el valor en 1, mostrando "Valor final del finally: 45". Después del bloque finally, 
se incrementa el valor en 1 nuevamente y se muestra "Valor antes del return: 46". El método devuelve 46 y se muestra por pantalla.

Clase Dos:

kotlin
Copy code
Valor final del catch: 43
Valor final del finally: 44
Valor antes del return: 45
45
En este caso, se produce una excepción NumberFormatException dentro del bloque try al tratar de convertir la cadena "W" a un entero.
La ejecución salta al bloque catch, donde se incrementa el valor en 42 y se muestra "Valor final del catch: 43". Luego, el bloque finally 
se ejecuta y se incrementa el valor en 1, mostrando "Valor final del finally: 44". Después del bloque finally, se incrementa el valor en 1
nuevamente y se muestra "Valor antes del return: 45". El método devuelve 45 y se muestra por pantalla.

Clase Tres:

kotlin
Copy code
Valor final del catch: 1
Valor final del finally: 2
Valor antes del return: 3
3
En este caso, se produce una excepción NumberFormatException dentro del bloque try al tratar de convertir la cadena "W" a un entero. 
La ejecución salta al bloque catch, donde también se produce otra excepción al intentar convertir la cadena "W" a un entero nuevamente.
El valor se incrementa en 1 debido al bloque finally y se muestra "Valor final del finally: 2". Después del bloque finally, se incrementa 
el valor en 1 nuevamente y se muestra "Valor antes del return: 3". El método devuelve 3 y se muestra por pantalla.
     
     */
    

}

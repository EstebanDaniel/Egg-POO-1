
package Guia13Exceptions.Main;

public class ej6Exceptions {
    
    /*
     Dado el método metodoA de la clase A, indique: a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException? 
   b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException? 
class A { public void metodoA() {
   sentencia_a1 
   sentencia_a2 
try { 
     sentencia_a3
     sentencia_a4 
    }
 catch (MioException e) { 
    sentencia_a6  
}
   sentencia_a5  
  }
} 
 a) Si se produce la excepción MioException en el método metodoA, las sentencias se ejecutarían en el siguiente orden:

sentencia_a1: Se ejecuta la primera sentencia fuera del bloque try-catch.
sentencia_a2: Se ejecuta la segunda sentencia fuera del bloque try-catch.
sentencia_a3: Se ejecuta la primera sentencia dentro del bloque try.
sentencia_a4: Se ejecuta la segunda sentencia dentro del bloque try.
sentencia_a6: Si se produce la excepción MioException, se ejecuta la sentencia dentro del bloque catch.
sentencia_a5: Después de ejecutar la sentencia dentro del bloque catch, se ejecuta la siguiente sentencia fuera del bloque try-catch.
En resumen, si se produce la excepción MioException, se ejecutan las sentencias sentencia_a1, sentencia_a2, sentencia_a3, sentencia_a4, sentencia_a6 y 
luego sentencia_a5.

b) Si no se produce la excepción MioException, las sentencias se ejecutarían en el siguiente orden:

sentencia_a1: Se ejecuta la primera sentencia fuera del bloque try-catch.
sentencia_a2: Se ejecuta la segunda sentencia fuera del bloque try-catch.
sentencia_a3: Se ejecuta la primera sentencia dentro del bloque try.
sentencia_a4: Se ejecuta la segunda sentencia dentro del bloque try.
sentencia_a5: Si no se produce la excepción MioException, se ejecuta la siguiente sentencia fuera del bloque try-catch.
En resumen, si no se produce la excepción MioException, se ejecutan las sentencias sentencia_a1, sentencia_a2, sentencia_a3, sentencia_a4 y 
luego sentencia_a5.
     
     */
    
}



package Guia13Exceptions.Main;


public class ej7Exceptions {
    
    /*
    Dado el método metodoB de la clase B, indique: a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException? b) 
    ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
    class B {
    public void metodoB() {   
    sentencia_b1
    try {   
    sentencia_b2
    } catch (MioException e){  
    sentencia_b3 
    }
    finally    
    sentencia_b4 
    } 
 } 
    
    a) Si se produce la excepción MioException, las sentencias se ejecutarían en el siguiente orden:

sentencia_b1: Esta sentencia se ejecuta siempre, independientemente de si se produce una excepción o no.

sentencia_b2: Esta sentencia se ejecuta dentro del bloque try. Si se produce la excepción MioException, la ejecución 
salta inmediatamente al bloque catch.

sentencia_b3: Esta sentencia se ejecuta si se captura la excepción MioException en el bloque catch. Aquí se manejaría
la excepción o se realizarían acciones específicas relacionadas con ella.

sentencia_b4: Esta sentencia se ejecuta después del bloque try-catch, ya sea que se haya producido una excepción o no.
El bloque finally se ejecuta siempre, incluso si se produce una excepción y se maneja en el bloque catch.

b) Si no se produce la excepción MioException, las sentencias se ejecutarían en el siguiente orden:

sentencia_b1: Esta sentencia se ejecuta siempre, independientemente de si se produce una excepción o no.

sentencia_b2: Esta sentencia se ejecuta dentro del bloque try. Si no se produce la excepción MioException, la ejecución 
continúa sin saltar al bloque catch.

sentencia_b4: Esta sentencia se ejecuta después del bloque try-catch. El bloque finally se ejecuta siempre, incluso
si no se produjo una excepción.
     
    */
    
}

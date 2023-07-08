
package Guia13Exceptions.Main;


public class ej9Exceptions {
    
    /*
     Dado el método metodoC de la clase C, indique:
a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
c) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción TuException?
class C {
void metodoC() throws TuException{
sentencia_c1
try {
sentencia_c2
sentencia_c3
} catch (MioException e){
13
sentencia_c4
} catch (TuException e){
sentencia_c5
throw (e)
}
finally
sentencia_c6
}
}

a) Si se produce la excepción MioException, las sentencias se ejecutarían en el siguiente orden:

sentencia_c1: Esta sentencia se ejecuta siempre, independientemente de si se produce una excepción o no.

sentencia_c2: Esta sentencia se ejecuta dentro del bloque try.

sentencia_c3: Esta sentencia se ejecuta dentro del bloque try.

sentencia_c4: Esta sentencia se ejecuta si se captura la excepción MioException en el bloque catch. Aquí se manejaría la excepción
o se realizarían acciones específicas relacionadas con ella.

sentencia_c6: Esta sentencia se ejecuta después del bloque try-catch. El bloque finally se ejecuta siempre, incluso si
se produce una excepción y se maneja en el bloque catch.

b) Si no se produce la excepción MioException, las sentencias se ejecutarían en el siguiente orden:

sentencia_c1: Esta sentencia se ejecuta siempre, independientemente de si se produce una excepción o no.

sentencia_c2: Esta sentencia se ejecuta dentro del bloque try.

sentencia_c3: Esta sentencia se ejecuta dentro del bloque try.

sentencia_c6: Esta sentencia se ejecuta después del bloque try-catch. El bloque finally se ejecuta siempre, incluso si no se produce una excepción.

c) Si se produce la excepción TuException, las sentencias se ejecutarían en el siguiente orden:

sentencia_c1: Esta sentencia se ejecuta siempre, independientemente de si se produce una excepción o no.

sentencia_c2: Esta sentencia se ejecuta dentro del bloque try.

sentencia_c3: Esta sentencia se ejecuta dentro del bloque try.

sentencia_c5: Esta sentencia se ejecuta si se captura la excepción TuException en el bloque catch. Aquí se manejaría la excepción
o se realizarían acciones específicas relacionadas con ella.

throw (e): Esta sentencia lanza nuevamente la excepción TuException después de capturarla en el bloque catch.

sentencia_c6: Esta sentencia se ejecuta después del bloque try-catch-finally. El bloque finally se ejecuta siempre,
incluso si se produce una excepción y se maneja en el bloque catch.

     */
    
}

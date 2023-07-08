
package Guia13Exceptions.Main;


public class ej2ExceptionsArray {

    
    public static void main(String[] args) {

        int[] numeros = new int[5];
        
        try {
            numeros[6] = 10;
        } catch ( ArrayIndexOutOfBoundsException  e) {
            System.out.println("error"+e.getMessage());
            System.out.println("esto es un error de indice de array");
            
        }
        finally{
        
            System.out.println("Hola q ase");
        
        }
      
       
        
    }
    
}


package Guia13Exceptions.Main;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ej3y4ExceptionsNumber {

  
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        try {
            // Leer los números en forma de cadena
            System.out.print("Ingrese el primer número: ");
            String numero1String = scanner.nextLine();

            System.out.print("Ingrese el segundo número: ");
            String numero2String = scanner.nextLine();

            // Convertir las cadenas a tipo int
            int numero1 = Integer.parseInt(numero1String);
            int numero2 = Integer.parseInt(numero2String);

            // Realizar la división y mostrar el resultado
                int resultado = numero1 / numero2;
                System.out.println("El resultado de la división es: " + resultado);
            
        } catch (NumberFormatException e) {
            System.out.println("Error: La cadena ingresada no es un número entero válido.");
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero.");
        } catch (InputMismatchException e) {
            System.out.println("Error: El valor ingresado no es válido.");
        } finally {
            scanner.close();
        }
    }
}
    
    


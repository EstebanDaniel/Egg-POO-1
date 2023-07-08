package Guia13Exceptions.Main;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class ej5ExceptionsAdivinarNumero {

    
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAdivinar = random.nextInt(500) + 1;
        int intentos = 0;

        boolean adivinado = false;
        while (!adivinado) {
            try {
                System.out.print("Ingrese un número: ");
                int numeroUsuario = scanner.nextInt();
                intentos++;

                if (numeroUsuario == numeroAdivinar) {
                    adivinado = true;
                    System.out.println("¡Felicidades! ¡Has adivinado el número!");
                    System.out.println("Número de intentos: " + intentos);
                } else if (numeroUsuario < numeroAdivinar) {
                    System.out.println("El número a adivinar es mayor.");
                } else {
                    System.out.println("El número a adivinar es menor.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número válido.");
                scanner.next(); // Limpiar el valor no válido del scanner
                intentos++;
            }
        }

        scanner.close();
        
    }
    
}

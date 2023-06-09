/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a cada persona, que perro 
según su nombre, quiere adoptar. Dos personas no pueden adoptar al mismo perro, si la persona eligió un perro que ya estaba adoptado,
se le debe informar a la persona.  Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las personas con
sus respectivos perros. 
*/
package Guia11RelacionesEntreClases.Entity.Service.Main;

import Guia11RelacionesEntreClases.Entity.Perro;
import Guia11RelacionesEntreClases.Entity.Persona;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class ej1PersonaPerro {

    
    public static void main(String[] args) {
    
          //ejercicio 1
//         Perro perro1 = new Perro("Coquito","Pitbull",3,"Grande");
//         Perro perro2 = new Perro("Peto","Callejero",3,"Chiquito");
//         Persona persona1 = new Persona("Pepe","Santos",23,2340560,perro1);
//         Persona persona2 = new Persona("Carlos","Carolo",23,2340560,perro2);
//         
//         System.out.println(persona1.toString());
//         System.out.println(persona2.toString());

           //ejercicio 1 extra 
            Scanner scanner = new Scanner(System.in);
        List<Persona> personas = new ArrayList<>();
        Map<String, Perro> perrosDisponibles = new HashMap<>();

        // Crear algunos perros
        perrosDisponibles.put("Firulais", new Perro("Firulais"));
        perrosDisponibles.put("Rocky", new Perro("Rocky"));
        perrosDisponibles.put("Max", new Perro("Max"));
        
        // Obtener la cantidad de personas y perros a crear
        System.out.print("Ingrese la cantidad de personas: ");
        int cantidadPersonas = scanner.nextInt();
        scanner.nextLine(); // Limpiar el salto de línea

//        System.out.print("Ingrese la cantidad de perros: ");
//        int cantidadPerros = scanner.nextInt();
//        scanner.nextLine(); // Limpiar el salto de línea

        // Crear las personas
        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
            String nombrePersona = scanner.nextLine();
            personas.add(new Persona(nombrePersona));
        }

        // Mostrar los perros disponibles
        System.out.println("Perros disponibles:");
        for (Perro perro : perrosDisponibles.values()) {
            System.out.println(perro.getNombre());
        }
        
        // Asignar perros a las personas
        for (Persona persona : personas) {
            System.out.print("Ingrese el nombre del perro que " + persona.getNombre() + " desea adoptar: ");
            String nombrePerro = scanner.nextLine();
            Perro perro = perrosDisponibles.get(nombrePerro);

            if (perro != null && !perro.isAdoptado()) {
                perro.setAdoptado(true);
                persona.setPerro(perro);
            } else {
                System.out.println("El perro ya está adoptado o no existe.");
            }
        }
        
         // Mostrar las personas con sus perros asignados
        System.out.println("Personas con sus perros asignados:");
        for (Persona persona : personas) {
            String nombrePerro = (persona.getPerro() != null) ? persona.getPerro().getNombre() : "Ninguno";
            System.out.println(persona.getNombre() + ": " + nombrePerro);

 
       }
    }
}

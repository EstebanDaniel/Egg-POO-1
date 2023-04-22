
package Guia9Utilidades.Service;


import Guia9Utilidades.Entity.Persona;
import java.util.Date;
import java.util.Scanner;


public class PersonaService {
    
    Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona(){
    
        System.out.println("Ingrese nombre de la persona");
        String nombre = leer.next();
        System.out.println("Ingrese el dia de nacimiento de la persona");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento de la persona");
        int mes = leer.nextInt() - 1;
        System.out.println("Ingrese el año de nacimiento de la persona");
        int anio = leer.nextInt()-1900;
        
        Date fechaNacimiento = new Date(anio,mes,dia);
        
         return new Persona(nombre, fechaNacimiento);
    
    }
    
    public int calcularEdad(Persona persona){
 
        Date fechaActual = new Date();
        Date fechaNacimiento = persona.getFechaDeNacimiento();
        //System.out.println(fecha1.getYear()-fecha2.getYear());
        int anios = Math.abs(fechaNacimiento.getYear()-fechaActual.getYear()); 
                
        return anios;
    
    }
    
    public boolean menorQue(Persona persona, int edad){
    
       return calcularEdad(persona)<edad;
  
}
    
    public void mostrarPersona(Persona persona){
    
        System.out.println("El nombre de la persona es: "+ persona.getNombre());
        System.out.println("La fecha de nacimiento es: "+persona.getFechaDeNacimiento());
        System.out.println("La edad de la persona es: "+ calcularEdad(persona));
    
    }
}
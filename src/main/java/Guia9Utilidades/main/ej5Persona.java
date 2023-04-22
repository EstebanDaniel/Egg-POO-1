
package Guia9Utilidades.main;

import Guia9Utilidades.Entity.Persona;
import Guia9Utilidades.Service.PersonaService;

public class ej5Persona {

   
    public static void main(String[] args) {
        
        PersonaService persona = new PersonaService();
        Persona person = persona.crearPersona();
        
      
        System.out.println(persona.calcularEdad(person));
        System.out.println("es menor que: "+persona.menorQue(person, 35));
        persona.mostrarPersona(person);
        
    }
    
}

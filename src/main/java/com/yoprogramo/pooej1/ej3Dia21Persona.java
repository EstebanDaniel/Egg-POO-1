
package com.yoprogramo.pooej1;

import com.yoprogramo.pooej1.Entidad.PersonaTres;
import com.yoprogramo.pooej1.Service.PersonaService;


public class ej3Dia21Persona {

    public static void main(String[] args) {
      
        PersonaService personaService = new PersonaService();
        
        
        PersonaTres persona1 = new PersonaTres("dani",21,'H',71, 1.72);
        PersonaTres persona2 = new PersonaTres("dani",21,'H',91, 1.7);
        PersonaTres persona3 = new PersonaTres("dani",21,'H',71, 1.7);
        PersonaTres persona4 = new PersonaTres("dani",21,'H',71, 1.7);
        PersonaTres persona5 = null;
        
        
//        System.out.println(personaService.esMayorDeEdad(persona1));
//        System.out.println(personaService.calcularIMC(persona2)); 
//        personaService.mostrarPersona(persona3);
//        
//     double[] imcs = {personaService.calcularIMC(persona1),personaService.calcularIMC(persona2),personaService.calcularIMC(persona3),
//     personaService.calcularIMC(persona4)};
//      boolean[] mayoresDeEdad = {personaService.esMayorDeEdad(persona1),personaService.esMayorDeEdad(persona2),
//          personaService.esMayorDeEdad(persona3),personaService.esMayorDeEdad(persona4)};
//      
//      
//        System.out.println(personaService.PorcentajemayoresdeEdad(mayoresDeEdad));
//        System.out.println(personaService.PorcentajesImc(imcs));
        
        //ej1 guia 13 exceptions
        try {
             personaService.esMayorDeEdad(persona5);
        } catch (NullPointerException e) {
               System.out.println("error"+e.getMessage());
               System.out.println("error"+e.fillInStackTrace());
              System.out.println("Es un error de tipo null");
        }
       

        
    }
    
}

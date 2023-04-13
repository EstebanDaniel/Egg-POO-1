/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yoprogramo.pooej1.Service;

import com.yoprogramo.pooej1.Entidad.PersonaTres;
import java.util.Scanner;

/**
 *
 * @author USURIO
 */
public class PersonaService {
    
    private PersonaTres persona;
    private Scanner leer = new Scanner(System.in);
    
    //constructor del servicio
    public PersonaService(){   
    this.persona = new PersonaTres(); 
    }
    
    //constructor con parametros del servicio
//    public PersonaService(String nombre, int edad, char sexo, float peso, float altura){
//    
//        this.persona = new PersonaTres(nombre,edad,sexo,peso,altura);
//    
//    }
//    
    
    
    public boolean esMayorDeEdad(PersonaTres persona){
    
        return persona.getEdad()>= 18;
    
    }
    
    public PersonaTres crearPersona(){
        
    
        System.out.println("Ingrese nombre");
        persona.setNombre(leer.nextLine());
        System.out.println("ingrese edad");
        persona.setEdad(leer.nextInt());
        System.out.println("Ingrese sexo");
        persona.setSexo(leer.next().charAt(0));
       while(persona.getSexo() != 'H' && persona.getSexo() != 'M' && persona.getSexo() != 'O') {
            System.out.println("Sexo incorrecto. Introduzca H, M, u O");
            persona.setSexo(leer.next().charAt(0));
        }
 
        System.out.println("Ingrese peso");
        persona.setPeso(leer.nextFloat());
        System.out.println("Ingrese altura");
        persona.setAltura(leer.nextFloat());
                
        return persona;
    }
    
    public double calcularIMC(PersonaTres persona){
    
        //System.out.println("-1: Debajo del peso ideal, 0:Peso ideal, 1: Sobrepeso");
     double imc = persona.getPeso() / Math.pow(persona.getAltura(), 2);
    
       if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    
    
    }

  public void mostrarPersona(PersonaTres persona){
  
      System.out.print(persona.getNombre()+",");
      System.out.print(persona.getEdad()+",");
      System.out.print(persona.getSexo()+",");
      System.out.print(persona.getPeso()+",");
      System.out.print(persona.getAltura());
      
  }
  
     public String PorcentajesImc(double[] imcs){
        int debajoPeso = 0;
        int pesoIdeal = 0;
        int sobrepeso = 0;
       

        for (int i = 0; i < imcs.length; i++) {
            if (imcs[i] == -1) {
                debajoPeso++;
            } else if (imcs[i] == 0) {
                pesoIdeal++;
            } else {
                sobrepeso++;
            }
    
        }//for
        double porcentajeDebajoPeso = (double) debajoPeso / imcs.length * 100;
       double porcentajePesoIdeal = (double) pesoIdeal / imcs.length * 100;
       double porcentajeSobrepeso = (double) sobrepeso / imcs.length * 100;
      
       return "debajo de peso: "+porcentajeDebajoPeso + ",peso ideal: "+porcentajePesoIdeal+",Sobrepeso: "+porcentajeSobrepeso;
       
 }
     
     
     public String PorcentajemayoresdeEdad(boolean[]mayor){
        int mayoresEdad = 0;
        int menoresEdad = 0;
         for (int i = 0; i < mayor.length; i++) {
             if (mayor[i]) {
                mayoresEdad++;
            } else {
                menoresEdad++;
            }
             
         }//for
         double porcentajeMayoresEdad = (double) mayoresEdad / mayor.length * 100;
       double porcentajeMenoresEdad = (double) menoresEdad / mayor.length * 100;
     
       return "Mayores de edad: "+porcentajeMayoresEdad + ", menores de edad: "+porcentajeMenoresEdad;
     }
        
}

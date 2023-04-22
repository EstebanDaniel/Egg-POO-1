/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia9Utilidades.main;

import Guia9Utilidades.Service.FechaService;
import java.util.Date;



public class ej4ClaseDate {

   
    public static void main(String[] args) {
        FechaService edad = new FechaService();
        Date usuario = edad.fechaNacimiento();
        System.out.println(usuario+" es la fecha de nacimiento del usuario");
        Date fechaActual = edad.fechaActual();
        System.out.println(fechaActual+" es la fecha actual");
        edad.diferecia(usuario, fechaActual);
        System.out.println("Edad:");
        
    }
    
}

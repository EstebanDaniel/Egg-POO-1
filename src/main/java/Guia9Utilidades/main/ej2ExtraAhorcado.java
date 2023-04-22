/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia9Utilidades.main;

import Guia9Utilidades.Entity.Ahorcado;
import Guia9Utilidades.Service.AhorcadoService;


public class ej2ExtraAhorcado {

   
    public static void main(String[] args) {
        
        AhorcadoService ahorcadoS = new AhorcadoService();
        Ahorcado ahorcado = new Ahorcado();
        
           ahorcadoS.crearJuego(ahorcado);
           ahorcadoS.juego(ahorcado);
        
    }
    
}

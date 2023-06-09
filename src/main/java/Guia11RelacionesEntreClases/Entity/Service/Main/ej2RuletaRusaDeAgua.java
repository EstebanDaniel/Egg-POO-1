
package Guia11RelacionesEntreClases.Entity.Service.Main;

import Guia11RelacionesEntreClases.Entity.Juego;
import Guia11RelacionesEntreClases.Entity.Jugador;
import Guia11RelacionesEntreClases.Entity.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Scanner;

public class ej2RuletaRusaDeAgua {

   
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de jugadores (máximo 6): ");
        int cantidadJugadores = leer.nextInt();

        if (cantidadJugadores < 1 || cantidadJugadores > 6) {
            cantidadJugadores = 6;//siempre seran entre 1-6 jugadores
        }

        ArrayList<Jugador> jugadores = new ArrayList<>();
           
        for (int i = 1; i <= cantidadJugadores; i++) {
             System.out.println("inserte id de " + i + " jugador");
            int id = leer.nextInt();
            jugadores.add(new Jugador(id,"",false));
        }

        RevolverDeAgua revolver = new RevolverDeAgua();
        revolver.llenarRevolver();

        Juego juego = new Juego(jugadores, revolver);

        System.out.println("Comienza el juego de la ruleta rusa de agua!");

             juego.ronda();
             
    }
        
    }
    


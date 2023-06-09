/**
 Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1 y 12 (el 8 y el 9 no los incluimos) 
 * y un palo (espadas, bastos, oros y copas). Esta clase debe contener un método toString() que retorne el número de carta y el palo.
 * La baraja estará compuesta por un conjunto de cartas, 40 exactamente. 
 Las operaciones que podrá realizar la baraja son: • barajar(): cambia de posición todas las cartas aleatoriamente. • siguienteCarta():
 * devuelve la siguiente carta que está en la baraja, cuando no haya más o se haya llegado al final, se indica al usuario que no hay más cartas.
 * • cartasDisponibles(): indica el número de cartas que aún se puede repartir. • darCartas(): dado un número de cartas que nos pidan, le devolveremos
 * ese número de cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero debemos indicárselo al usuario. •
 * cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna indicárselo al usuario • mostrarBaraja(): muestra todas las
 * cartas hasta el final. Es decir, si se saca una carta y luego se llama al método, este no mostrara esa primera carta. 
 */


package Guia11RelacionesEntreClases.Entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Baraja {
    
     private List<Carta> cartas;
     List<Carta> cartasRepartidas;
     Scanner leer = new Scanner(System.in);
     

    public Baraja() {
        cartas = new ArrayList<>();
        cartasRepartidas =  new ArrayList<>();
        inicializarBaraja();
    }

    private void inicializarBaraja() {
        for (int numero = 1; numero <= 12; numero++) {
            if (numero != 8 && numero != 9){
            for (Palo palo : Palo.values()) {
                cartas.add(new Carta(numero, palo));
            }
             }
        }
    }

    public void barajar() {
        Collections.shuffle(cartas);//mezcla las cartas
    }
    
    public Carta siguienteCarta() {
        if (cartas.isEmpty()) {
            System.out.println("No hay más cartas en la baraja.");
            return null;
        }
        return cartas.remove(0);
    }

    public int cartasDisponibles() {
        return cartas.size();
    }
    
     public List<Carta> darCartas() {
         
         System.out.println("Ingrese la cantidad de cartas a repartir");
         int cantidad = leer.nextInt();
         
        if (cantidad > cartas.size()) {
            System.out.println("No hay suficientes cartas en la baraja.");
            return null;
        }

        for (int i = 0; i < cantidad; i++) {
            cartasRepartidas.add(cartas.remove(0));
        }
        return cartasRepartidas;
    }

    public List<Carta> cartasMonton() {
        
        List<Carta> cartasMonton = cartasRepartidas;
        if (cartasMonton.isEmpty()) {
            System.out.println("No ha salido ninguna carta.");
            return null;
        }
        return cartasMonton;
    }

    public void mostrarBaraja() {
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }
    
}

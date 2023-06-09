
package Guia11RelacionesEntreClases.Entity.Service.Main;

import Guia11RelacionesEntreClases.Entity.Baraja;
import Guia11RelacionesEntreClases.Entity.Carta;
import java.util.List;


public class ej3CartasEspanolas {

   
    public static void main(String[] args) {
      
             Baraja baraja = new Baraja();
             
        baraja.barajar();

        System.out.println("Cartas disponibles: " + baraja.cartasDisponibles());

        List<Carta> mano = baraja.darCartas();
        if (mano != null) {
            System.out.println("Mano:");
            for (Carta carta : mano) {
                System.out.println(carta);
            }
        }
         System.out.println("-------------------");
        baraja.mostrarBaraja();

        Carta siguienteCarta = baraja.siguienteCarta();
        if (siguienteCarta != null) {
            System.out.println("Siguiente carta: " + siguienteCarta);
        }
        
         List<Carta> cartasMonton = baraja.cartasMonton();
        if (!cartasMonton.isEmpty()) {
            System.out.println("Cartas en el montón:");
            for (Carta carta : cartasMonton) {
                System.out.println(carta);
            }
        }
             System.out.println("Cartas disponibles: " + baraja.cartasDisponibles());
        
    }
    
}

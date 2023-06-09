/*
 Nos piden hacer un programa sobre un Cine en java, que tiene una sala con un conjunto de asientos
(8 filas por 6 columnas). De Cine nos interesa conocer la película que se está reproduciendo, la sala con los 
espectadores y el precio de la entrada. Luego, de las películas nos interesa saber el título, duración, edad mínima
y director. Por último, del espectador, nos interesa saber su nombre, edad y el dinero que tiene disponible. Para 
representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son etiquetados por una letra y 
un número la fila A1 empieza al final del mapa como se muestra en la tabla. También deberemos saber si el asiento 
está ocupado por un espectador o no, si esta ocupado se muestra una X, sino un espacio vacío. 8 A X | 8 B X | 8 C X | 8 D  
| 8 E X | 8 F X  7 A X | 7 B X | 7 C X  | 7 D X | 7 E     | 7 F X  6 A X | 6 B X | 6 C     | 6 D X | 6 E X | 6 F    
5 A X | 5 B X | 5 C X | 5 D X | 5 E X | 5 F X  4 A X | 4 B X | 4 C X | 4 D X | 4 E X | 4 F X  3 A X | 3 B X | 3 C X | 3 D   
| 3 E X | 3 F X  2 A X | 2 B    | 2 C X | 2 D X | 2 E X | 2 F     1 A X | 1 B X  | 1 C X  | 1 D X  | 1 E X  | 1 F X  
 
Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y se los ubique en los asientos 
aleatoriamente (no se puede ubicar un espectador donde ya este ocupado el asiento).  Los espectadores serán ubicados
de uno en uno y para ubicarlos tener en cuenta que sólo se podrá sentar a un espectador si tiene el dinero suficiente
para pagar la entrada, si hay espacio libre en la sala y si tiene la edad requerida para ver la película. En caso de que
el asiento este ocupado se le debe buscar uno libre.  Al final del programa deberemos mostrar la tabla, podemos mostrarla 
con la letra y numero de cada asiento o solo las X y espacios vacíos.  
 */

package Guia11RelacionesEntreClases.Entity;

import java.util.Random;



public class Cine {
    
     private Pelicula pelicula;
    private String[][] sala;
    private int precioEntrada;

    public Cine(Pelicula pelicula, int precioEntrada) {
        this.pelicula = pelicula;
        this.sala = new String[8][6];
        this.precioEntrada = precioEntrada;
        inicializarSala();
    }

    public Cine() {
     
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public String[][] getSala() {
        return sala;
    }

    public void setSala(String[][] sala) {
        this.sala = sala;
    }

    public int getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(int precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    private void inicializarSala() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                sala[i][j] = " ";
            }
        }
    }

    public void mostrarSala() {
        System.out.println("------ Sala ------");
       
        for (int i = 7 ; i >= 0; i--) {
           
            for (int j = 0; j < 6; j++) {
                System.out.print(sala[i][j]);
            }
            System.out.println();
        }
        System.out.println("------------------");
    }
    
     public void agregarEspectador(Espectador espectador) {
        Random random = new Random();
        int fila, columna;

            fila = random.nextInt(8);
            columna = random.nextInt(6);
       
        if (espectador.getEdad() >= pelicula.getEdadMin()&& espectador.getDinero() >= precioEntrada &&  !sala[fila][columna].equals("X")) {
            sala[fila][columna] = "X";
            System.out.println("¡" + espectador.getNombre() + " ha ocupado el asiento " + (char) ('A' + fila) + (columna + 1) + "!");
        } else {
            System.out.println(espectador.getNombre() + " no cumple los requisitos para ver la película.");
        }
    }
}


//        public boolean ubicarEspectador(ArrayList<Espectador> espectador1) {
//            Random random = new Random();
//            int fila = random.nextInt(7);
//            int column = random.nextInt(5);
//           
//            
//                for (Espectador espectador : espectador1) {
//                            if (espectador.getDinero()< precioEntrada || espectador.getEdad() < pelicula.getEdadMin()) {
//            return false;
//        }
//                                
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 6; j++) {
//                if (sala[i][j].equals(" ")) {
//                    sala[fila+i][column+j] = "x";
//                    return true;
//                   
//                }
//            }
//        }            
//  
//}
//         return false;
// }
        
     

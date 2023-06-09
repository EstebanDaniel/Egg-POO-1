
package Guia11RelacionesEntreClases.Entity;

/*
 Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del jugador), nombre (Empezara con Jugador más su ID, 
“Jugador 1” por ejemplo) y mojado (indica si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero debe 
ser entre 1 y 6. Si no está en este rango, por defecto será 6.  Métodos: • disparo(Revolver r): el método, recibe el revolver de agua y llama 
a los métodos de  mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el revolver tira el agua, el jugador 
se moja. El atributo mojado pasa a false y el método devuelve true, sino false.  Clase Juego: esta clase posee los siguientes atributos: Jugadores
(conjunto de Jugadores) y Revolver  Métodos: • llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores y el 
revolver para guardarlos en los atributos del juego. 
 
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y aprieta el gatillo. Sí el revolver tira el agua el
jugador se moja y se termina el juego, sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que mojar. 
Al final del juego, se debe mostrar que jugador se mojó. Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
public class Jugador {
    
    private int id;
    private String nombre;
    private boolean mojado;
    private RevolverDeAgua revolver;
    
    public Jugador() {
    }

    public Jugador(int id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = "jugador"+" "+ id;
        this.mojado = mojado;
    }

    public Jugador(int id) {
        this.id = id;
    }
    
    


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public RevolverDeAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverDeAgua revolver) {
        this.revolver = revolver;
    }
   
    public boolean disparo(RevolverDeAgua revolver){
      
        if(revolver.mojar()){
           System.out.println(nombre + " se moja...");
            mojado = true;
            return true;
        } else {
            System.out.println("Click... " + nombre + " se salva.");
            revolver.siguienteChorro();
            return false;
    }
    
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    
    
    
    
}

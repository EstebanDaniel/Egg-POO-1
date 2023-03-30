
package com.yoprogramo.pooej1.Entidad;

import java.util.Scanner;


public class Juego {
    
    private int numero;
    private int adivinar;

    public Juego() {
    }

    public Juego(int numero, int adivinar) {
        this.numero = numero;
        this.adivinar = adivinar;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAdivinar() {
        return adivinar;
    }

    public void setAdivinar(int adivinar) {
        this.adivinar = adivinar;
    }
    
    
    public void iniciar_juego(){
        int cont = 3;
        Scanner leer = new Scanner(System.in);
       
        System.out.println("jugador 1 inserte el numero a adivinar");
        this.numero = leer.nextInt();
         while(cont != 0){
        System.out.println("jugador 2 intente adivinar el numero, tiene 3 intentos");
        this.adivinar = leer.nextInt();
        if(this.numero != this.adivinar){ 
            cont--;
            System.out.println("le quedan "+cont+ " intentos");
            
        }else if(this.adivinar < this.numero){
            System.out.println("el numero es mas grande...");
        } 
        else if(this.adivinar > this.numero){
            System.out.println("el numero es mas chico...");
        }
        else{
            System.out.println("Adivinaste el numero era "+numero);  
            cont = 0;
        }
             System.out.println("Fin del juego");
        }
    }
    
}

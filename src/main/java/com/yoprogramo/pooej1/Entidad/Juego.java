
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
        int ganador1=0,ganador2=0;
        int intentos = 3;
        Scanner leer = new Scanner(System.in); 
       

        for (int i = 0; i < intentos; i++) {
            
              System.out.println("jugador 1 inserte el numero a adivinar");
        this.numero = leer.nextInt();
         
        
        System.out.println("jugador 2 intente adivinar el numero, tiene 3 intentos");
        
        while(cont != 0){
        this.adivinar = leer.nextInt();
        
        if(this.numero != adivinar){ 
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
            ganador2++;
            
        }
        
        if(cont == 0){ 
        ganador1++;
        
        }
                       
  
           }
            cont = 3;
        }
        
        System.out.println("el ganador 1 gano: "+ganador1+ " veces");
         System.out.println("el ganador 2 gano: "+ganador2+ " veces");
           if(ganador1 > ganador2){
               System.out.println("el ganador uno es el vencedor!!");
           }else{
               System.out.println("]El ganador 2 es el vencedor!!");
           }      
            
        }
                
    }
        
    
    


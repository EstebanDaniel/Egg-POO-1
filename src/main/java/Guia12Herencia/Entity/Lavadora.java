
package Guia12Herencia.Entity;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {
    
     public int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, int precio, String color, char consumo_energetico, int peso) {
        super(precio, color, consumo_energetico, peso);
        this.carga = carga;
        
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
     
    public void crearLavadora(){
        Scanner leer = new Scanner(System.in);
        crearElectrodomestico();
        System.out.println("ingrese la carga del lavarropa en kg");
        setCarga(leer.nextInt());

    }

   
  
    @Override
    public void precioFinal() {
        super.precioFinal();
        if (carga > 30){
            setPrecio(getPrecio()+500);
        }
    }

   
    
}

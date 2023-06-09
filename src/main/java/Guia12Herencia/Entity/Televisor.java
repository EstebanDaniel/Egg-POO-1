
package Guia12Herencia.Entity;

import java.util.Scanner;


public class Televisor extends Electrodomestico{
    
    public int resolucion;
    public boolean sintonizadorTDT;

    public Televisor() {
    }
    
    public Televisor(int resolucion, boolean sintonizadorTDT, int precio, String color, char consumo_energetico, int peso) {
        super(precio, color, consumo_energetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public void crearTelevisor(){
        Scanner leer = new Scanner(System.in);
      crearElectrodomestico();
        System.out.println("Ingrese las pulgadas del televisor");
        setResolucion(leer.nextInt());
        System.out.println("Tiene sintonizador TDT? s/n");
        if (leer.next().equals("s")){
            setSintonizadorTDT(true);
        }
 
    }

    @Override
    public void precioFinal() {
        super.precioFinal(); 
        
        if (resolucion > 40){
              setPrecio((int)(getPrecio()*1.30));
        } 
        if (sintonizadorTDT){
            setPrecio(getPrecio()+500);
        }
        
    }
    
    
    
    
    
}

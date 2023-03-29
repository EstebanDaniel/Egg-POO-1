
package com.yoprogramo.pooej1.Entidad;

import java.util.Scanner;

public class Rectangulo {
    
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo(Rectangulo rectangulo){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese base del rectangulo");
        this.base = leer.nextInt();
        System.out.println("ingrese altura del rectangulo");
        this.altura = leer.nextInt();
   
    }
    
    public int superficie(){
        System.out.println("la superfice es: ");
       return this.base * this.altura;     
    }
    
    public int perimetro(){
        System.out.println("El perimetro es: ");
      return (this.base + this.altura)*2;
    }
    
    public void dibujarRectangulo(){
    
        System.out.println("el rectangulo dibujado:");
        
        for (int i = 0; i <= this.altura-1; i++) {
            for (int j = 0; j <= this.base-1; j++) {
                
                if((i == 0 || i == this.altura-1) || (j==0 || j == this.base-1)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
                
            }
            System.out.println(" ");  
        }
                
    
    }
    
}

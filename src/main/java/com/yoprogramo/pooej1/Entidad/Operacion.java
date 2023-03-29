
package com.yoprogramo.pooej1.Entidad;

import java.util.Scanner;


public class Operacion {
    
    private int numero1;
    private int numero2;

    public Operacion() {
    }
    

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion(){
    Scanner leer = new Scanner(System.in);
        System.out.println("ingrese valor num1");
        this.numero1 = leer.nextInt();
        System.out.println("ingrese valor num2");
        this.numero2 = leer.nextInt();

    }
    
    public int sumar(){
    
        return this.numero1 + this.numero2;
    
    }
    
    public int restar(){
        
    return this.numero1 - this.numero2;
    }
    
    public int multiplicar(){

        int resultado = 0;
    if (this.numero1!= 0 && this.numero2 != 0){
    
          resultado = this.numero1*this.numero2;
    
    }else{
        System.out.println("error");
    }
        return resultado;
    
}
    
    public float dividir(){
       float resultado;
        if(this.numero2!=0){    
           resultado = this.numero1/this.numero2;
        
        } else {
        return 0 ;
        }
    
        return resultado;
    }

    @Override
    public String toString() {
        return "Operacion{" + "suma=" + sumar() + ", resta=" + restar() + ", multiplicacion=" + multiplicar() + ", division=" + dividir() + '}';
    }
    
    
    
    
}

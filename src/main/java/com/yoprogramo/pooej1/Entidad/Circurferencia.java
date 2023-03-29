
package com.yoprogramo.pooej1.Entidad;

//ej 2 clase 15
public class Circurferencia {
    
    private float radio;

    public Circurferencia() {
    }


    public Circurferencia(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    
    public void crearCircurferencia(float radio){
            this.radio = radio;
    }
    
    public float area(){
    
          return (float) Math.pow(this.radio*3.14, 2);
    
    }
    
    public float perimetro(){
        
        return (float) (2*3.14*this.radio);
       
    
    }
    
    
    
    
}

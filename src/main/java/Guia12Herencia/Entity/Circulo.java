
package Guia12Herencia.Entity;


public class Circulo implements CalculosFormas{
    
      private double radio;
    
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    public double calcularArea() {
        return PI * Math.pow(radio, 2);
    }
    
    public double calcularPerimetro() {
        return PI * (2 * radio);
    }
    
}

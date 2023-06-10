
package Guia12Herencia.Main;

import Guia12Herencia.Entity.Circulo;
import Guia12Herencia.Entity.Rectangulo;


public class Ej4InterfaceDeFormulas {

    
    public static void main(String[] args) {
      
         // Crear objetos de las formas
        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(4, 6);
        
        // Calcular y mostrar resultados
        System.out.println("Círculo:");
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());
        
        System.out.println("\nRectángulo:");
        System.out.println("Área: " + rectangulo.calcularArea());
        System.out.println("Perímetro: " + rectangulo.calcularPerimetro());
        
    }
    
}

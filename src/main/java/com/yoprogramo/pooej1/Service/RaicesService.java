package com.yoprogramo.pooej1.Service;

import com.yoprogramo.pooej1.Entidad.Raices;


public class RaicesService {
    

    public RaicesService() {
        
    }

    public double getDiscriminante(Raices raiz){
// El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
       return (Math.pow(raiz.getB(), 2)-4*raiz.getA()*raiz.getC());   
     
    }
        
    public boolean tieneRaices(Raices raiz){
//    Método tieneRaices(): devuelve un booleano indicando si tiene dos
//soluciones, para que esto ocurra, el discriminante debe ser mayor o
//igual que 0.
       return getDiscriminante(raiz)>= 0;
    }
   
    public boolean tieneRaiz(Raices raiz){
    //c) Método tieneRaiz(): devuelve un booleano indicando si tiene una
//única solución, para que esto ocurra, el discriminante debe ser igual
//que 0.
     return getDiscriminante(raiz)==0;
    }
    
    public void obtenerRaices(Raices raiz){
           //     Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true,
//imprime las 2 posibles soluciones.
        if (tieneRaices(raiz)){
          System.out.println("positivo "+(-raiz.getB()+ Math.sqrt(getDiscriminante(raiz)))/(2*raiz.getA()));
          System.out.println("negativo "+ (-raiz.getB() - Math.sqrt(getDiscriminante(raiz)))/(2*raiz.getA()));     
        }      
    }
    
    public void obtenerRaiz(Raices raiz){
//e) Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime
//una única raíz. Es en el caso en que se tenga una única solución
//posible.
    if(tieneRaiz(raiz)){
       double x = -raiz.getB() / (2 * raiz.getA());
            System.out.println("La raiz es: x=" + x);
        } else {
            System.out.println("No tiene raiz real.");
        }
    }

    public void calcular(Raices raiz){
    //    Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(),
//y mostrará por pantalla las posibles soluciones que tiene nuestra
//ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo
//que devuelvan nuestros métodos y en caso de no existir solución, se
//mostrará un mensaje.
 if (tieneRaices(raiz)) {
            obtenerRaices(raiz);
        } else if (tieneRaiz(raiz)) {
            obtenerRaiz(raiz);
        } else {
            System.out.println("No tiene solucion real.");
        }
    }

    }

    



package Guia9Utilidades.main;

import Guia9Utilidades.Service.ArregloService;


public class ej3Arrays {

    
    public static void main(String[] args) {
        
        ArregloService arr = new ArregloService();
        
        Float[] arrA = new Float[50];
        Float[] arrB = new Float[50];
        
        System.out.println("Iniciamos A");
        arr.inicializarA(arrA);
        System.out.println("Mostramos A");
        arr.mostrar(arrA);
        System.out.println("Ordenamos A");
        arr.ordenar(arrA);
        System.out.println("Iniciamos B");
        arr.inicializarB(arrA, arrB);
        System.out.println("Mostramos B");
        arr.mostrar(arrB);
        
    }
    
}

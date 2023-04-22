/*
Crear en el Main dos arreglos. El arreglo A de 50 números reales y el
arreglo B de 20 números reales. Crear la clase ArregloService, en el
paquete servicio, con los siguientes métodos:
1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con
números aleatorios.
2) Método mostrar recibe un arreglo por parámetro y lo muestra por
pantalla.
3) Método ordenar recibe un arreglo por parámetro y lo ordena de
mayor a menor.
4) Método inicializarB copia los primeros 10 números del arreglo A en el
arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B,
mostrar A y B.

*/
package Guia9Utilidades.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;


public class ArregloService {
    
    public void inicializarA(Float[] arr){
        
        Random aleatorio =  new Random();
           for (int i = 0; i < arr.length; i++) {  
            arr[i] = aleatorio.nextFloat()*10;
        } 
}
    public void mostrar(Float[] arr){
        for (float elemento : arr) {
            System.out.println(elemento);
        }
    }
    
    public void ordenar(Float[] arr){
        
       Arrays.sort(arr, Collections.reverseOrder()); // Ordena el arreglo en orden descendente
       System.out.println(Arrays.toString(arr)); // Muestra [9, 6, 5, 5, 4, 3, 2, 1, 1]
    }
    
    public  void inicializarB(Float[] arrA, Float[] arrB) {
    for (int i = 0; i < 10; i++) {
      arrB[i] = arrA[i]; // Copia los primeros 10 números de A en B
    }
    for (int i = 10; i < arrB.length; i++) {
      arrB[i] = (float) 0.5; // Llena las últimas 10 posiciones de B con 0.5
    }
  }
}
    
    

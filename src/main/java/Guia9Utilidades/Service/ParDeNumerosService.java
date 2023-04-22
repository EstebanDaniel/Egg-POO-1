
package Guia9Utilidades.Service;

import Guia9Utilidades.Entity.ParDeNumeros;


public class ParDeNumerosService {
    
//    a) Método mostrarValores que muestra cuáles son los dos números
//guardados.
    public void mostrarValores(ParDeNumeros num) {  
        System.out.println(num.getNum1()+"\n"+num.getNum2()); 
    }
    
//    b) Método devolverMayor para retornar cuál de los dos atributos tiene
//el mayor valor
    public float devolverMayor(ParDeNumeros num){
      if(num.getNum1()>num.getNum2()){
         return num.getNum1();
      }else{
      return num.getNum2();
      }
    }
    
//    c) Método calcularPotencia para calcular la potencia del mayor valor de
//la clase elevado al menor número. Previamente se deben redondear
//ambos valores.
    public int calcularPotencia(ParDeNumeros num){
          int valor = Math.round(num.getNum1());
          int valor2 = Math.round(num.getNum2());
          System.out.println("los numeros redondeados son: "+valor+" y "+valor2);
        if (num.getNum1()>num.getNum2()){
           int result =  (int) Math.pow(valor, valor2);
          return result;
        } else{
            int result = (int) Math.pow(valor2, valor);
          return result;
        }
        
    }
    
//    d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los
//dos valores. Antes de calcular la raíz cuadrada se debe obtener el
//valor absoluto del número
    
    public void calcularRaiz(ParDeNumeros num){
        float abs = Math.abs(num.getNum1());
        float abs2 = Math.abs(num.getNum2());
        if (num.getNum1()<num.getNum2()){
            System.out.println("raiz :"+Math.sqrt(abs)); 
        }else{  
            System.out.println("raiz :"+Math.sqrt(abs2));
        }
    }
    
}

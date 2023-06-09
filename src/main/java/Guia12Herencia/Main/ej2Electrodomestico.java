
package Guia12Herencia.Main;

import Guia12Herencia.Entity.Electrodomestico;
import Guia12Herencia.Entity.Lavadora;
import Guia12Herencia.Entity.Televisor;
import java.util.ArrayList;


public class ej2Electrodomestico {

    
    public static void main(String[] args) {
        
//        Lavadora lavadora1 = new Lavadora();
//        Televisor televisor1 = new Televisor();
//        
//        lavadora1.crearLavadora();
//        lavadora1.precioFinal();
//        System.out.println(lavadora1+" + {"+lavadora1.getCarga()+ " = carga}"); 
        
        //Ej3arraylist
        Lavadora lavadora2 = new Lavadora(31,0,"blanco",'A',20);
        Lavadora lavadora3 = new Lavadora(21,0,"azul",'F',50);
        Lavadora lavadora4 = new Lavadora(11,0,"negro",'B',30);
        Lavadora lavadora5 = new Lavadora(41,0,"verde",'Z',10);
        Televisor televisor1 = new Televisor(50,true,0,"blanco",'A',20);
        Televisor televisor2 = new Televisor(20,true,0,"blanco",'A',20);
   
        ArrayList<Electrodomestico> arrayLavadoras = new ArrayList<>();
        arrayLavadoras.add(lavadora2);
        arrayLavadoras.add(lavadora3);
        arrayLavadoras.add(lavadora4);
        arrayLavadoras.add(lavadora5);
        arrayLavadoras.add(televisor1);
         arrayLavadoras.add(televisor2);
        
        int precioTotalElectro = 0;
        int precioTotalLavadora = 0;
        int precioTotalTv = 0;
        
         //precio final para las lavadoras
         for (Electrodomestico arrayLavadora : arrayLavadoras) {
                        
                   arrayLavadora.precioFinal();
                   int precioElectrodomestico = arrayLavadora.getPrecio();
                     precioTotalElectro += precioElectrodomestico;
                   if(arrayLavadora instanceof Lavadora){
                        int precioLavadora = arrayLavadora.getPrecio();
                         precioTotalLavadora += precioLavadora;
                       }else if(arrayLavadora instanceof Televisor){
                              int precioTv = arrayLavadora.getPrecio();
                              precioTotalTv += precioTv;
                       }
                   }
                   
        
        //mostrar los precios
        for (Electrodomestico arrayLavadora : arrayLavadoras) {
              System.out.println(arrayLavadora.toString());     
        }
        //precios totales
        System.out.println("Precio Electrodomestico: " + precioTotalElectro);
              System.out.println("Precio TotalLavadora: " + precioTotalLavadora);
              System.out.println("Precio TotalTv: " + precioTotalTv);
        
    }
    
}

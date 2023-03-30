package com.yoprogramo.pooej1;

import com.yoprogramo.pooej1.Entidad.Libro;



public class POOej1Libro {

    public static void main(String[] args) {
      
        Libro libro1 = new Libro();
        Libro libro2 = new Libro(1010,"dani","dado",23);
        
        
        libro1.cargarLibro(libro1);
        System.out.println(libro2.toString());
       
       
    }
    

  
    
}

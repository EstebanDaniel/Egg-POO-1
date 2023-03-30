
package com.yoprogramo.pooej1;

import com.yoprogramo.pooej1.Entidad.Cocina;
import com.yoprogramo.pooej1.Entidad.Receta;

import java.util.ArrayList;
import java.util.List;


public class Extra4POOCocina {

   
    public static void main(String[] args) {
        
         // Crear una lista de ingredientes
        List<String> ingredientes = new ArrayList<>();
        ingredientes.add("harina");
        ingredientes.add("azúcar");
        ingredientes.add("leche");
        
          List<String> ingredientesDos = new ArrayList<>();
        ingredientesDos.add("cebolla");
        ingredientesDos.add("queso");
        ingredientesDos.add("tomate");
        
           List<String> ingredientesTres = new ArrayList<>();
        ingredientesTres.add("cebolla");
        ingredientesTres.add("queso");
        ingredientesTres.add("tomate");
        ingredientesTres.add("pollo");
        ingredientesTres.add("arroz");

        // Crear una instancia de la clase Receta
        Receta receta = new Receta("Torta", ingredientes);
        Receta recetaDos = new Receta("Ensalada", ingredientesDos);
         Receta recetaTres = new Receta("Ensalada Cesar", ingredientesDos);
        Cocina cocina = new Cocina();
        
        System.out.println("agregamos las recetas");          
        cocina.agregarReceta(receta);
        cocina.agregarReceta(recetaDos);
        cocina.agregarReceta(recetaTres);
        
        // Acceder a los atributos de la instancia creada
        System.out.println("El nombre de la receta es: " + recetaDos.getNombre());
        //System.out.println("Se puede preparar algo con estos ingredientes? " + receta.sePuedePreparar(ingredientes));
        System.out.println("-----------------------------------------------");
        System.out.println( cocina.buscarReceta("Ensalada")+" es la receta que busco");
        System.out.println("-------------------------------------------------");
        System.out.println(cocina.recetasDisponibles(ingredientesTres)+"Estos son los nombres de las recetas con esos ingredientes");
      
    }
    
}

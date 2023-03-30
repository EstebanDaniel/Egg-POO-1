//Clase "Cocina" en Java con lista de objetos "Receta", métodos para agregar nuevas recetas, buscar recetas por nombre y
//obtener la lista de recetas que se pueden preparar con los ingredientes disponibles en la cocina:
package com.yoprogramo.pooej1.Entidad;

import java.util.ArrayList;
import java.util.List;

public class Cocina {
    
    private List<Receta> listaRecetas;
    
    public Cocina() {
       listaRecetas = new ArrayList<Receta>();
    }

    public Cocina(List<Receta> listaRecetas) {
        this.listaRecetas = listaRecetas;
    }


    public void agregarReceta(Receta receta) {
        listaRecetas.add(receta);
    }
    
    public String buscarReceta(String nombre) {
        for (Receta receta : listaRecetas) {
            if (receta.getNombre().equals(nombre)) {
               System.out.println(receta.getIngredientes());
            } 
        }
         return nombre;
    }
    
    public String recetasDisponibles(List<String> ingredientesDisponibles) {
        
        for (Receta receta : listaRecetas) {
            if (receta.sePuedePreparar(ingredientesDisponibles)) {  
                System.out.println(receta.getNombre()); 
            } 
        }
        return ".";
       
        
    }
}

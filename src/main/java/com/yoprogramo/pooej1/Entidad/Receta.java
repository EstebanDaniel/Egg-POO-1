
//La clase "Receta" debe tener un método llamado "sePuedePreparar" que acepte una lista de ingredientes disponibles y
//devuelva true si la receta se puede preparar con los ingredientes disponibles
//o false en caso contrario. Aquí hay una posible implementación de la clase "Receta":
//La clase "Receta" tiene un constructor que acepta el nombre de la receta y una lista de ingredientes. También tiene un 
//método "sePuedePreparar" que acepta una lista de ingredientes disponibles
//y devuelve true si la receta se puede preparar con los ingredientes disponibles o false en caso contrario.
package com.yoprogramo.pooej1.Entidad;

    import java.util.List;

public class Receta {
    
    private String nombre;
    private List<String> ingredientes;
    
    public Receta(String nombre, List<String> ingredientes) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
     public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    public boolean sePuedePreparar(List<String> ingredientesDisponibles) {
        for (String ingrediente : ingredientes) {
            if (!ingredientesDisponibles.contains(ingrediente)) { 
                return false;
            }
        }
        return true;
       
    }
}


/*
 Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos productos que venderemos y el precio que tendrán.
Además, se necesita que la aplicación cuente con las funciones básicas.  Estas las realizaremos en el servicio. Como, introducir un elemento,
modificar su precio, eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar Hashmap). El HashMap tendrá de llave 
el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas. 
 */
package Guia10Colleciones.Entity.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class TiendaService {
    
    HashMap<String,Integer>mapTienda;
    Scanner leer = new Scanner(System.in);

    public TiendaService() {
        this.mapTienda = new HashMap<>();
    }
    
    public void introducirProducto(){
       
        System.out.println("Introduzca el nombre del producto");
        String productoNombre = leer.next();
        System.out.println("Introduza el precio del producto");
        Integer precio = leer.nextInt();
        mapTienda.put(productoNombre, precio);
            
    }
    
    public void modificarPrecio(){
        System.out.println("Ingrese el nombre del producto a modificar");
        String nombreProducto = leer.next();
    if (mapTienda.containsKey(nombreProducto)) {
        System.out.println("Ingrese el nuevo precio para el producto");
        Integer nuevoPrecio = leer.nextInt();
    mapTienda.put(nombreProducto, nuevoPrecio);
    System.out.println("Precio actualizado correctamente");
  } else {
    System.out.println("El producto no existe en el inventario");
  }
    }
    
    public void borrarProducto(){
        System.out.println("Ingrese el nombre del producto a borrar");
        String nombreProducto = leer.next();
    if (mapTienda.containsKey(nombreProducto)) {
    mapTienda.remove(nombreProducto);
    System.out.println("Producto borrado correctamente");
  } else {
    System.out.println("El producto no existe en el inventario");
  }
    }
    
    public void mostrarProducto(){
        for (Map.Entry<String, Integer> producto : mapTienda.entrySet()) {
            System.out.println("Producto: "+producto.getKey() + ", "+ "Precio: "+producto.getValue()); 
    
        }
    }
    
    public void menuProducto(){
        int opcion;
        do {
            System.out.println("1. Opción 1 Agregar producto");
            System.out.println("2. Opción 2 Editar precio");
            System.out.println("3. Opción 3 Borrar");
            System.out.println("4. Opción 4 Mostrar");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    introducirProducto();
                    break;
                case 2:
                    modificarPrecio();
                    break;
                case 3:
                    borrarProducto();
                    break;
                case 4:
                    mostrarProducto();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opcion != 5);
        
        
    
    }
      
}

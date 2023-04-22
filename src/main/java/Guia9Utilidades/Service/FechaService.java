/*ej4guia9
Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService, en paquete Servicios, que tenga los siguientes métodos:
Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).
Si necesiten acá tienen más información en clase Date: Documentacion Oracle

 */
package Guia9Utilidades.Service;

import java.util.Date;
import java.util.Scanner;


public class FechaService {
    
    Scanner leer = new Scanner(System.in);
    
    public Date fechaNacimiento(){
    
        System.out.println("ingrese dia de nacimiento");
        int dia = leer.nextInt();
        System.out.println("ingrese el mes de nacimiento");
        int mes = leer.nextInt() - 1;
        System.out.println("ingrese el año de nacimiento");
        int ano = leer.nextInt() - 1900;
        return new Date(ano,mes,dia);
        
    }
    
    
    public Date fechaActual(){
        Date fechaActual = new Date();
        return fechaActual;
    }
    
    public void diferecia(Date fecha1, Date fecha2){
    
        System.out.println("Edad del usuario");
        //System.out.println(fecha1.getYear()-fecha2.getYear());
        System.out.println(Math.abs(fecha1.getYear()-fecha2.getYear()));
                
        //code whisperer para autocompletado
    }
    
}

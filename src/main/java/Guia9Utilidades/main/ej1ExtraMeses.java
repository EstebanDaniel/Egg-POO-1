/*
Crea una clase en Java donde declares una variable de tipo array de
Strings que contenga los doce meses del año, en minúsculas. A
continuación, declara una variable mesSecreto de tipo String, y hazla
igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
programa debe pedir al usuario que adivine el mes secreto. Si el usuario
acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
adivinar el mes secreto. Un ejemplo de ejecución del programa podría
ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:
febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!

 */
package Guia9Utilidades.main;

import java.util.Scanner;


public class ej1ExtraMeses {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String[] meses = new String[]{"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre"+
        "noviembre","diciembre"};
        String mesSecreto = meses[0];
        String adivinar;
        
        do{
        System.out.println("Adivine el mes secreto. Introducza el nombre del mes");
        adivinar = leer.next();
        
           if(adivinar.equals(mesSecreto)){             
               System.out.println("¡Ha acertado! el mes secreto es: "+mesSecreto);  
    
           } else{
                System.out.println("No ha acertado vuelve a intentar...");      
           }
      
        }while(!mesSecreto.equals(adivinar));
        
        leer.close();
    }
    
}

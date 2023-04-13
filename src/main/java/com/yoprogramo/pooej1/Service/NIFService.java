
package com.yoprogramo.pooej1.Service;

import com.yoprogramo.pooej1.Entidad.NIF;
import java.util.Scanner;


public class NIFService {
    
    Scanner leer = new Scanner(System.in);
    String vector[] = new String[]{"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
    
    public void crearNIF(NIF nif){
            //Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la
//letra que le corresponderá. Una vez calculado, le asigna la letra que
//le corresponde según
        System.out.println("ingrese el dni");
        nif.setDni(leer.nextLong());
        int resultado = (int) (nif.getDni() % 23);
         System.out.println("El resultado es: "+resultado);
        if (resultado >= 0 && resultado <= 22){
            
            nif.setLetra(vector[resultado]);   
    }
         
    }
    
    public void mostrar(NIF nif){
    //    c) Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un
    //guion y la letra en mayúscula; por ejemplo: 00395469-F).
           System.out.println(nif.getDni()+"-"+nif.getLetra());

    }
    
    



    
}

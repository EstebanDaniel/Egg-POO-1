
package Guia9Utilidades.main;

import Guia9Utilidades.Entity.Estudiante;
import Guia9Utilidades.Service.EstudianteService;


public class ejExtra3Estudiante {

  
    public static void main(String[] args) {
        
        EstudianteService estudiante = new EstudianteService();
        
           Estudiante[] estudiantes = new Estudiante[8];

        estudiantes[0] = new Estudiante("Juan", 8.50);
        estudiantes[1] = new Estudiante("Pedro", 9.2);
        estudiantes[2] = new Estudiante("Daniel", 7.8);
        estudiantes[3] = new Estudiante("Ana", 6.5);
        estudiantes[4] = new Estudiante("Raul", 8.0);
        estudiantes[5] = new Estudiante("Lucía", 9.0);
        estudiantes[6] = new Estudiante("Luis", 7.2);
        estudiantes[7] = new Estudiante("Laura", 9.5);
        
        System.out.println("promedio de estudiantes: "+estudiante.mostrarPromedio(estudiantes));
       // estudiante.promedioMayor(estudiantes);
        estudiante.mostrarNotaMayor(estudiantes);
        
    }
    
}

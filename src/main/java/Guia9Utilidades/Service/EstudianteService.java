
package Guia9Utilidades.Service;

import Guia9Utilidades.Entity.Estudiante;


public class EstudianteService {
    
//    1. Calcular y mostrar el promedio de notas de todo el curso
       public double mostrarPromedio(Estudiante[] estudiante){
           double sumaNota = 0;
           double promedio;
           for (Estudiante estudiante1 : estudiante) {
               sumaNota += estudiante1.getNotaFinal();
           }
           promedio = sumaNota / estudiante.length;
           return promedio;
       }
       
       //2. Retornar otro arreglo con los nombres de los alumnos que recibieron una
//nota mayor al promedio del curso
       public String[] promedioMayor(Estudiante[] estudiante){
           int cont = 0;        
           String[] notaMayor = new String[8];
           
           for (int i = 0; i < estudiante.length; i++) {
               if(estudiante[i].getNotaFinal() > mostrarPromedio(estudiante)){             
                   notaMayor[cont] = estudiante[i].getNombre();
                   cont++;
           }
               
           }
          
           return notaMayor;
       }
       
//     3. Por último, deberemos mostrar todos los estudiantes con una nota
//mayor al promedio.
        public void mostrarNotaMayor(Estudiante[] estudiante){
        
            for (String elemento : promedioMayor(estudiante)) {
                 if(elemento != null){
                System.out.println("Los estudiantes son: "+elemento);
                 }
            }
            
        }
}
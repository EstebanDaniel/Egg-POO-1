
package Guia10Colleciones.Entity.Service;

import Guia10Colleciones.Entity.Alumno;
import java.util.ArrayList;

import java.util.Scanner;


public class AlumnoService {
    
    Scanner leer = new Scanner(System.in);
    ArrayList<Alumno> listaAlumnos;

    public AlumnoService() {
        this.listaAlumnos = new ArrayList<>();
    }
    
    
   /* En el servicio de Alumno
deberemos tener un bucle que crea un objeto Alumno. Se pide toda la información al usuario y ese Alumno se guarda en una lista 
de tipo Alumno y se le pregunta al usuario si quiere crear otro Alumno o no.*/
    public Alumno crearAlumno(){   
        
         ArrayList<Integer>notasLista = new ArrayList<>(3);
        
            System.out.println("Ingrese el nombre de el alumno");
             String nombre = leer.next();
            for (int i = 0; i <= 2; i++) {
                System.out.println("ingrese nota "+(i+1)+" del alumno");
                Integer notas = leer.nextInt();
                notasLista.add(notas);
            }   
                  
                return new Alumno(nombre,notasLista);
          
        }
         
    public void agregarYCrear(Alumno alumno){
       String bandera = "";
       listaAlumnos.add(alumno);
       
       while(!bandera.equals("n")){
       
           System.out.println("Desea crear otro alumno? s/n");
           bandera = leer.next();
           if(!bandera.equals("n")){
           Alumno alum = crearAlumno();
           listaAlumnos.add(alum);
           } 
           
       }
        
    }
    
    /* Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota final y se lo busca en la lista de Alumnos.
Si está en la lista, se llama al método. Dentro del método se usará la lista notas para calcular el promedio final de alumno. Siendo este promedio 
final, devuelto por el método y mostrado en el main. */
    
    public Integer notaFinal(Alumno alumno){
        Integer suma = 0;
        Integer promedio = 0;
        System.out.println("Ingrese el nombre del alumno a buscar");
        String nombre = leer.next();

            for (Alumno listaAlumno : listaAlumnos) {
                 if(listaAlumno.getNombre().equals(nombre)){
                for (Integer nota : listaAlumno.getNotas()) {
                    suma += nota;
                }
                
          
              promedio = suma / 3;
                  System.out.println("El promedio del alumno es: "+promedio);        
                 }
                 
        }
          return promedio;
    }
    
  
    
    public void mostrarAlumno(){
    
        for (Alumno listaAlumno : listaAlumnos) {
            System.out.println(listaAlumno.toString());
            
        }
    
    }
    
}

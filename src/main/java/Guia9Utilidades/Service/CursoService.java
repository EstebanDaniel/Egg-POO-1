
package Guia9Utilidades.Service;

import Guia9Utilidades.Entity.Curso;
import java.util.Scanner;


public class CursoService {
    
    Scanner leer = new Scanner(System.in);
    
    public String[] cargarAlumnos(Curso curso){
      String[]alumnos = curso.getAlumnos();
        System.out.println("Ingrese el nombre de los alumnos");
        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i]= leer.next(); 
            System.out.println( alumnos[i] +" " + (i+1));
        }
        return alumnos;
    }
    
    public Curso crearCurso(Curso curso){
    
        System.out.println("Ingrese el nombre del curso");
        curso.setNombreCurso(leer.next());
        System.out.println("Cantidad horas por dia");
        curso.setCantidadHorasDias(leer.nextInt());
        System.out.println("Ingrese los dias por semana");
        curso.setCantidadDiasSemanas(leer.nextInt());
        System.out.println("Ingrese turno mañana o tarde");
        curso.setTurno(leer.next());
        System.out.println("Ingrese precio por hora");
        curso.setPrecioPorHora(leer.nextInt());
        String[]alumnos = cargarAlumnos(curso);
        curso.setAlumnos(alumnos);
        return curso;
    }
    
    public void calcularGananciaSemanal(Curso curso){
    
        int gananciaSemanal = (curso.getCantidadDiasSemanas()*curso.getCantidadHorasDias()*curso.getPrecioPorHora()*5);
                System.out.println("la ganancia semanal es: "+gananciaSemanal);
    }
    
    public void mostrarAlumnos(Curso curso){
    
         System.out.println("Los alumnos son: ");
        for (String elemento : curso.getAlumnos() ) {
              System.out.println(elemento);
        }
    
    }
    
}

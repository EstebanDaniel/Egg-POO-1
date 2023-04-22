
package Guia9Utilidades.main;

import Guia9Utilidades.Entity.Curso;
import Guia9Utilidades.Service.CursoService;

/**
 *
 * @author USURIO
 */
public class ej6Curso {

    
    public static void main(String[] args) {
       
        CursoService cursoS = new CursoService();
        Curso curso = new Curso();
        
      
        cursoS.crearCurso(curso);
        
        cursoS.calcularGananciaSemanal(curso);
        
        System.out.println(curso.toString());
        
        cursoS.mostrarAlumnos(curso);
    }
    
}

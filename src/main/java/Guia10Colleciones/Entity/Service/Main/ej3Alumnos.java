
package Guia10Colleciones.Entity.Service.Main;

import Guia10Colleciones.Entity.Alumno;
import Guia10Colleciones.Entity.Service.AlumnoService;


public class ej3Alumnos {

   
    public static void main(String[] args) {
        
        AlumnoService alumnoServ = new AlumnoService();
        Alumno alumno1 = alumnoServ.crearAlumno();
        
        alumnoServ.agregarYCrear(alumno1);
        alumnoServ.notaFinal(alumno1);
        alumnoServ.mostrarAlumno();
       
       
        
        
    }
    
}

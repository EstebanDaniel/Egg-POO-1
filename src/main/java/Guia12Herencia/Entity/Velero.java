
package Guia12Herencia.Entity;


public class Velero extends Barco{
    
    private int mastiles;

    public Velero() {
    }

    public Velero(int mastiles, int matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public int calcularAlquiler(Alquiler alquiler) {
        return super.calcularAlquiler(alquiler) + getMastiles(); 
         
    }
    
    
    
}

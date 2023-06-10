
package Guia12Herencia.Entity;


public class BarcoAMotor extends Barco{
    
    private int potenciaHp;

    public BarcoAMotor() {
    }

    public BarcoAMotor(int potenciaHp, int matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaHp = potenciaHp;
    }

    public int getPotenciaHp() {
        return potenciaHp;
    }

    public void setPotenciaHp(int potenciaHp) {
        this.potenciaHp = potenciaHp;
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
        return super.calcularAlquiler(alquiler) + getPotenciaHp(); 
    }
    
    
    
}

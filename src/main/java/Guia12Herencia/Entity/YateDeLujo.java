
package Guia12Herencia.Entity;


public class YateDeLujo extends Barco {
    
    private int numCamarotes;
    private int hp;

    public YateDeLujo() {
    }

    public YateDeLujo(int numCamarotes, int hp, int matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.numCamarotes = numCamarotes;
        this.hp = hp;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
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
        return super.calcularAlquiler(alquiler) + (getHp() + getNumCamarotes());
    
     
    }
}

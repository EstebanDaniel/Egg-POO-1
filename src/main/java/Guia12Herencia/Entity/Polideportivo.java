
package Guia12Herencia.Entity;


public class Polideportivo extends Edificio {
    
    private String nombre;
    private String tipoDeInstalacion;

    public Polideportivo(int ancho, int alto, int largo) {
        super(ancho, alto, largo);
    }

    public Polideportivo(int ancho, int alto, int largo,String nombre, String tipoDeInstalacion) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoDeInstalacion = tipoDeInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDeInstalacion() {
        return tipoDeInstalacion;
    }

    public void setTipoDeInstalacion(String tipoDeInstalacion) {
        this.tipoDeInstalacion = tipoDeInstalacion;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

     
    
    @Override
    public int calcularSuperficie() {
        return 2 * (ancho * largo + ancho * alto + largo * alto);
    }

    @Override
    public int calcularVolumen() {
        
      return ancho * alto * largo;
    
    }

}
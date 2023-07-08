
package Guia12Herencia.Entity;


public class EdificioDeOficinas extends Edificio{
    
    private int nOficinas;
    private int personasPorOficina;
    private int nPisos;

    public EdificioDeOficinas(int ancho, int alto, int largo) {
        super(ancho, alto, largo);
    }

    public EdificioDeOficinas(int nOficinas, int personasPorOficina, int nPisos, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.nOficinas = nOficinas;
        this.personasPorOficina = personasPorOficina;
        this.nPisos = nPisos;
    }
    

    @Override
    public int calcularSuperficie() {
         return 2 * (ancho * largo + ancho * alto + largo * alto) * nPisos;
    }

    @Override
    public int calcularVolumen() {
        return ancho * alto * largo * nPisos;
    }
    
    public void cantPersonas() {
        int totalPersonas = nOficinas * personasPorOficina;
        System.out.println("En un piso caben " + personasPorOficina + " personas.");
        System.out.println("En todo el edificio caben " + totalPersonas + " personas.");
    }
    
    
    
}

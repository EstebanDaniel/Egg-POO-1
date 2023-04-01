
package com.yoprogramo.pooej1.Entidad;


public class Cuenta {
    
    private float saldo;
    private String titular;

    public Cuenta() {
    }

    public Cuenta(float saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
        
        
    }
    
    public void retirar_dinero(int retiro){
    
        if(this.saldo <= 0 || retiro > this.saldo){
            System.out.println("El retiro supera el saldo actual");
            
        }else{
            this.saldo-= retiro;
        }
        
        //alt + shift para subir lineas de codigo
     
    }
    
}

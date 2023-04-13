
package com.yoprogramo.pooej1.Entidad;


public class CuentaTres {
    
    private int numeroCuenta;
    private int dniCliente;
    private float saldoActual;

    public CuentaTres() {
    }

    public CuentaTres(int numeroCuenta, int dniCliente, float saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public float getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(float saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    
    
    
    
}

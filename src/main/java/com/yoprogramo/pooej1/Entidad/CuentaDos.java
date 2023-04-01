/*
 Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package com.yoprogramo.pooej1.Entidad;

import java.util.Scanner;


public class CuentaDos {
    
    private int numeroCuenta;
    private long DNI;
    private double saldoActual;
    private double interes;

    public CuentaDos() {
    }

    public CuentaDos(int numeroCuenta, long DNI, double saldoActual, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
    
    public void crearCuenta(CuentaDos cuenta){
    
        Scanner leer = new Scanner(System.in);
        System.out.println("Vamos a crear su cuenta: 1. Ingrese n° de cuenta asignado");
        cuenta.setNumeroCuenta(leer.nextInt());
        System.out.println("2. Ingrese su DNI: ");
        cuenta.setDNI(leer.nextLong());
        System.out.println("Que saldo desea asignarle a la cuenta?");
        cuenta.setSaldoActual(leer.nextDouble());
          
    }
    
    public void depositarCuenta(double deposito){
       saldoActual+=deposito;     
    }
    
    public void retirarCuenta(double retiro){
        if(saldoActual >= 0 && retiro <= saldoActual){   
            saldoActual-=retiro;
        }
        
    }
    
       public double extraccionRapida(){
           
           double retiro = 0;
           
           if(saldoActual > 0){          
              retiro = saldoActual*0.20;
              saldoActual-=saldoActual*0.20;      
           } else{
               System.out.println("No se puede realizar la operacion");
           }
           
           return retiro;
        }
       
       public double consultarSaldo(){
       
         return getSaldoActual();
       
       }
       
    public String consultarDatos() {
        return "CuentaDos{" + "numeroCuenta=" + numeroCuenta + ", DNI=" + DNI + ", saldoActual=" + saldoActual + ", interes=" + interes + '}';
    }
    
}

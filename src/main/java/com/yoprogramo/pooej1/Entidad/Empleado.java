
package com.yoprogramo.pooej1.Entidad;


public class Empleado {
    
    private String nombre;
    private int edad;
    private float salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void calcular_aumento(){
    
        if(edad > 30){
          salario += salario *0.1;
        } else if(edad < 30){
           salario += salario*0.05;
        }
        
    }
    
}

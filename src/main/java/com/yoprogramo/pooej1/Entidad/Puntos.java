/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yoprogramo.pooej1.Entidad;

import java.util.Scanner;

public class Puntos {
    private int x1, y1, x2, y2;
    
    public Puntos() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese la coordenada X del primer punto: ");
        this.x1 = input.nextInt();
        System.out.print("Ingrese la coordenada Y del primer punto: ");
        this.y1 = input.nextInt();
        System.out.print("Ingrese la coordenada X del segundo punto: ");
        this.x2 = input.nextInt();
        System.out.print("Ingrese la coordenada Y del segundo punto: ");
        this.y2 = input.nextInt();
    }
    
    public double calcularDistancia() {
        double distancia = Math.sqrt(Math.pow((this.x2 - this.x1), 2) + Math.pow((this.y2 - this.y1), 2));
        return distancia;
    }
    
}
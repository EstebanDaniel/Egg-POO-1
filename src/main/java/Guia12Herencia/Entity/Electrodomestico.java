/*
 Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color, consumo energético (letras entre A y F) y peso. 
Los constructores que se deben implementar son los siguientes: • Un constructor vacío. • Un constructor con todos los atributos pasados por
parámetro. Los métodos a implementar son:  • Métodos getters y setters de todos los atributos. • Método comprobarConsumoEnergetico(char letra):
comprueba que la letra es correcta, sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el objeto y no será visible. 
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es, usa el color blanco por defecto. Los colores disponibles 
para los electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en minúsculas. Este método se invocará
al crear el objeto y no será visible. 
13 
• Metodo crearElectrodomestico(): le pide la información al usuario y llena el electrodoméstico, también llama los métodos para comprobar 
el color y el consumo. Al precio se le da un valor base de $1000. • Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor
del precio. Esta es la lista de precios: 

A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga, además de los atributos heredados. Los constructores que se
implementarán serán: • Un constructor vacío. • Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes llamar al
constructor de la clase padre. Los métodos que se implementara serán: • Método get y set del atributo carga. • Método crearLavadora (): este método
llama a crearElectrodomestico() de la clase padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos el atributo propio
de la lavadora. • Método precioFinal():  este método será heredado y se le sumará la siguiente funcionalidad. Si tiene una carga mayor de 30 kg,
aumentará el precio en $500, si la carga es menor o igual, no se incrementará el precio. Este método debe llamar al método padre y añadir el código 
necesario. Recuerda que las condiciones que hemos visto en la clase Electrodoméstico también deben afectar al precio. Se debe crear también una subclase
llamada Televisor con los siguientes atributos: resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos heredados. 
Los constructores que se implementarán serán: • Un constructor vacío. • Un constructor con la resolución, sintonizador TDT y el resto de los atributos 
heredados. Recuerda que debes llamar al constructor de la clase padre. 
 
LETRA PRECIO 
A $1000 
B $800 
C $600 
D $500 
E $300 
F $100 
PESO PRECIO 
Entre 1 y 19 kg $100 
Entre 20 y 49 kg $500 
Entre 50 y 79 kg $800 
Mayor que 80 kg $1000 
14 
Los métodos que se implementara serán: • Método get y set de los atributos resolución y sintonizador TDT. • Método crearTelevisor(): 
este método llama a crearElectrodomestico() de la clase padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor. • Método precioFinal(): este método será heredado y se le sumará la siguiente funcionalidad. Si el televisor tiene una
resolución mayor de 40 pulgadas, se incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará $500. Recuerda que
las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio. Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar el precio final de los dos electrodomésticos.  
 */
package Guia12Herencia.Entity;

import java.util.Scanner;


public class Electrodomestico {
    
    protected int precio;
    protected String color;
    protected char consumo_energetico;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(int precio, String color, char consumo_energetico, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumo_energetico = consumo_energetico;
        
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo_energetico() {
        return consumo_energetico;
    }

    public void setConsumo_energetico(char consumo_energetico) {
        this.consumo_energetico = consumo_energetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumo_energetico=" + consumo_energetico + ", peso=" + peso +
               '}';
    }
    
    
    
    /*
    Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, sino es correcta usara 
    la letra F por defecto. Este método se debe invocar al crear el objeto y no será visible. 
    */
    public char comprobarConsumoEnergetico(char letra){
//               String consumoPorfecto;
//        if (!letra.equalsIgnoreCase("A") || !letra.equalsIgnoreCase("B") || !letra.equalsIgnoreCase("C") ||
//                !letra.equalsIgnoreCase("D")||!letra.equalsIgnoreCase("E") || !letra.equalsIgnoreCase("F")){
//                 consumoPorfecto = "F";
//               setConsumo_energetico(consumoPorfecto);
//        }
//        return getConsumo_energetico();
             
        char consumo = Character.toUpperCase(letra);
        if (consumo >= 'A' && consumo <= 'F') {
           setConsumo_energetico(consumo);
             return getConsumo_energetico();
        } else {
            setConsumo_energetico('F');
            return getConsumo_energetico();// Por defecto, si la letra no es válida
        }
    }
            
    
    
    /*
    Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es, usa el
    color blanco por defecto. Los colores disponibles para los electrodomésticos son blanco, negro, rojo, azul y gris. 
    No importa si el nombre está en mayúsculas o en minúsculas. Este método se invocará al crear el objeto y no será visible. 
    */
    public String comprobarColor(String color){
        String colorPorDefecto;
        if (!color.equals("blanco") || !color.equals("negro") || !color.equals("rojo") || !color.equals("azul")||!color.equals("gris")){
               colorPorDefecto = "blanco";
               setColor(colorPorDefecto);
        }
        return getColor();
    }
    
    /*
    Metodo crearElectrodomestico(): le pide la información al usuario y llena el electrodoméstico, 
    también llama los métodos para comprobar el color y el consumo. Al precio se le da un valor base de $1000
    */
    public void crearElectrodomestico(){
    
        Scanner leer = new Scanner(System.in);
         precio = 1000;
         System.out.println("Ingrese el precio del electrodomestico");
         setPrecio(getPrecio()+leer.nextInt());
            System.out.println("Ingrese el color del electrodomestico");
         String color1 = leer.next();
         comprobarColor(color1);
         
         System.out.println("Ingrese el tipo de consumo del electrodomestico");
         String consumo = leer.next();
          char character = consumo.charAt(0);
         
         comprobarConsumoEnergetico(character);
         
         System.out.println("Ingrese el peso del electrodomestico");
         int peso1 = leer.nextInt();
          setPeso(peso1);
   
    }
    
    /*
    Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del precio. Esta es la lista de precios: 
    */
    public void precioFinal(){
      if (peso >= 1 && peso <= 19){
          setPrecio(getPrecio()+100);
      } else if(peso >=20 && peso<=49){
           setPrecio(getPrecio()+500);
      } else if (peso >= 50 && peso <= 79){
           setPrecio(getPrecio()+800);          
      } else if (peso > 80){
             setPrecio(getPrecio()+1000);
      } 
       
       switch (consumo_energetico) {
            case 'A':
                setPrecio(getPrecio()+1000);
                break;
            case 'B':
                setPrecio(getPrecio()+800);
                break;
            case 'C':
                setPrecio(getPrecio()+600);
                break;
            case 'D':
                setPrecio(getPrecio()+500);
                break;
            case 'E':
                setPrecio(getPrecio()+300);
                break;
            case 'F':
                setPrecio(getPrecio()+100);
                break;
            default:
                break;
        }
      
       
    }
      
    
}

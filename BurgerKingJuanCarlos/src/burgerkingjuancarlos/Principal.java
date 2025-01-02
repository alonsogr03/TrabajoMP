/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package burgerkingjuancarlos;

public class Principal extends Producto {

    public Principal(String nombre, String imagen, int precio, int tiempoElaboracion) {
        super(nombre, imagen, precio, tiempoElaboracion);
    }
   
    public String toString(){
        return "Plato Principal: \n" +super.toString();
    }
   
}

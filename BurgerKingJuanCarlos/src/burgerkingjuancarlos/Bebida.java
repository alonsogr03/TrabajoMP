/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package burgerkingjuancarlos;

import java.io.Serializable;

public class Bebida extends Producto implements Serializable {
    private Tamanyo cantidad;

    public Bebida(String nombre, String imagen, double precio, double tiempoElaboracion, Tamanyo cantidad) {
        super(nombre, imagen, precio, tiempoElaboracion);
        this.cantidad = cantidad;
    }
    public void setCantidad(Tamanyo tamano){
        this.cantidad = tamano;
    }
    public Tamanyo getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "  Bebida   \n"+super.toString() + "\nTamaño=" + cantidad;
    }
}


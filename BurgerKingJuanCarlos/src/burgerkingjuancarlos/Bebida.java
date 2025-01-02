/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package burgerkingjuancarlos;

public class Bebida extends Producto {
    private Tamanyo cantidad; // En mililitros

    public Bebida(String nombre, String imagen, int precio, int tiempoElaboracion, Tamanyo cantidad) {
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
        return super.toString() + ", tamaño=" + cantidad;
    }
}


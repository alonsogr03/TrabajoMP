/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package burgerkingjuancarlos;

public class Postre extends Producto {
    private Tamanyo tamanyo;

    public Postre(String nombre, String imagen, int precio, int tiempoElaboracion, Tamanyo tamanyo) {
        super(nombre, imagen, precio, tiempoElaboracion);
        this.tamanyo = tamanyo;
    }

    public Tamanyo getTamaño() {
        return tamanyo;
    }

    @Override
    public String toString() {
        return super.toString() + ", tamaño=" + tamanyo;
    }
}
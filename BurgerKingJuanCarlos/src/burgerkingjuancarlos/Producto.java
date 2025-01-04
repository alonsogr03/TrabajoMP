/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package burgerkingjuancarlos;

import java.io.Serializable;

public abstract class Producto implements Serializable {
    private String nombre;
    private String imagen;
    private double precio;
    private double tiempoElaboracion;

    public Producto(String nombre, String imagen, double precio, double tiempoElaboracion) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.precio = precio;
        this.tiempoElaboracion = tiempoElaboracion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public double getPrecio() {
        return precio;
    }
    public void setImagen(String imagen){
        this.imagen = imagen;
    }
    public void setPrecio(double precio){
        this.precio=precio;
    }
    public double getTiempoElaboracion() {
        return tiempoElaboracion;
    }
    public void setTiempoElabocion(double tiempo){
        this.tiempoElaboracion = tiempo;
    }

    @Override
    public String toString() {
        return "Nombre= " + nombre + ",\n" +
               "Precio=" + precio + "€,\n" +
               "Tiempo elaboracion=" + tiempoElaboracion + " segundos\n";
    }
}
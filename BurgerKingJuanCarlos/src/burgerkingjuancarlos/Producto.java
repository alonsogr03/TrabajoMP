/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package burgerkingjuancarlos;

import java.io.Serializable;

public abstract class Producto implements Serializable {
    private String nombre;
    private String imagen;
    private int precio;
    private int tiempoElaboracion;

    public Producto(String nombre, String imagen, int precio, int tiempoElaboracion) {
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

    public int getPrecio() {
        return precio;
    }
    public void setImagen(String imagen){
        this.imagen = imagen;
    }
    public void setPrecio(int precio){
        this.precio=precio;
    }
    public int getTiempoElaboracion() {
        return tiempoElaboracion;
    }
    public void setTiempoElabocion(int tiempo){
        this.tiempoElaboracion = tiempo;
    }

    @Override
    public String toString() {
        return "Nombre= " + nombre + ",\n" +
               "Precio=" + precio + ",\n" +
               "Tiempo elaboracion=" + tiempoElaboracion + " segundos\n";
    }
}
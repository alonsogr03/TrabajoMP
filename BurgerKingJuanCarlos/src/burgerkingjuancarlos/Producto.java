/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package burgerkingjuancarlos;

public abstract class Producto {
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

    public int getTiempoElaboracion() {
        return tiempoElaboracion;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", tiempoElaboracion=" + tiempoElaboracion + " segundos}";
    }
}
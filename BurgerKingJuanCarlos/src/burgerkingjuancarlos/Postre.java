/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package burgerkingjuancarlos;

import java.io.Serializable;

public class Postre extends Producto implements Serializable {
    private Tamanyo tamanyo;

    public Postre(String nombre, String imagen, int precio, int tiempoElaboracion, Tamanyo tamanyo) {
        super(nombre, imagen, precio, tiempoElaboracion);
        this.tamanyo = tamanyo;
    }

    public Tamanyo getTamaño() {
        return tamanyo;
    }
    public void setTamaño(Tamanyo tamaño){
        this.tamanyo= tamaño;
    }
    @Override
    public String toString() {
        return super.toString() + ", tamaño=" + tamanyo;
    }
}

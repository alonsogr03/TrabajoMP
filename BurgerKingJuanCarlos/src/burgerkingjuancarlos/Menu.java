/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package burgerkingjuancarlos;

public class Menu extends Producto {
    private Principal plato;
    private Bebida bebida;
    private Postre postre;

    public Menu(String nombre, String imagen, Principal plato, Bebida bebida, Postre postre) {
        super(nombre, imagen, plato.getPrecio() + bebida.getPrecio() + postre.getPrecio(),
                plato.getTiempoElaboracion() + bebida.getTiempoElaboracion() + postre.getTiempoElaboracion());
        this.plato = plato;
        this.bebida = bebida;
        this.postre = postre;
    }

    public Principal getPlato() {
        return plato;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public Postre getPostre() {
        return postre;
    }

    @Override
    public String toString() {
        return super.toString() + ", Plato=" + plato.getNombre() +
                ", Bebida=" + bebida.getNombre() +
                ", Postre=" + postre.getNombre();
    }
}
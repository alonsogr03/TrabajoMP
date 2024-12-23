/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package burgerkingjuancarlos;

import java.util.ArrayList;


public class CatalogoProductos {
    private ArrayList<Producto> productos;

    public CatalogoProductos() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

    public ArrayList<Producto> getProductos() {
        return (ArrayList<Producto>) productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
   
    public int tamañoCatalogo(ArrayList<Producto> productos){
        int tamañoCatalogo=0;
       //añadir algo que cuente la longitud del catalogo y te lo devuelva
        return 0;
    }
}

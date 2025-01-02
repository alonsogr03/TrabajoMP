/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package burgerkingjuancarlos;

import java.util.ArrayList;
import java.util.Iterator;


public class CatalogoProductos {
    private ArrayList<Producto> productos;

    public CatalogoProductos() {
        this.productos = new ArrayList<>();
    }
    public Producto buscarProducto(String nombre){
        Producto resultado = null;
        Iterator <Producto> it = this.productos.iterator();
        boolean encontrado = false;
        while (it.hasNext() && !encontrado){
            resultado=it.next();
            if (nombre.equals(resultado.getNombre())){
                return resultado;
                
            }  
        }
       if(encontrado == false){
           return null;
       }else{
           return resultado;
       }
    }

    public ArrayList<Principal> getPlatosPrincipales(){
        ArrayList<Principal> platos = new ArrayList<>();
        for (Producto producto:productos){
            if(producto instanceof Principal){
                platos.add((Principal) producto);
            }
        }
        return platos;
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
   
    public int tamañoCatalogo(){
        return productos.size();
    }
}

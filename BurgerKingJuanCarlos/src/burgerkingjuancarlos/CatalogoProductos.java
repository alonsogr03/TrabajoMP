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
     public Menu buscarMenu(String nombre){
        Menu resultado = null;
        ArrayList<Menu> menus = this.getMenus();
        Iterator <Menu> it = menus.iterator();
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
    
    public Bebida buscarBebida(String nombre){
        Bebida resultado = null;
        ArrayList<Bebida> bebidas = this.getBebidas();
        Iterator <Bebida> it = bebidas.iterator();
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
    public Principal buscarPlato(String nombre){
        Principal resultado = null;
        ArrayList<Principal> plato = this.getPlatosPrincipales();
        Iterator <Principal> it = plato.iterator();
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
    public Postre buscarPostre(String nombre){
        Postre resultado = null;
        ArrayList<Postre> postre = this.getPostres();
        Iterator <Postre> it = postre.iterator();
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
    public ArrayList<Postre> getPostres(){
        ArrayList<Postre> postres = new ArrayList<>();
        for (Producto producto:productos){
            if(producto instanceof Postre){
                postres.add((Postre) producto);
            }
        }
        return postres;
    }
    
    public ArrayList<Bebida> getBebidas(){
        ArrayList<Bebida> bebidas = new ArrayList<>();
        for (Producto producto:productos){
            if(producto instanceof Bebida){
                bebidas.add((Bebida) producto);
            }
        }
        return bebidas;
    }
    
    public ArrayList<Menu> getMenus(){
        ArrayList<Menu> menus = new ArrayList<>();
        for (Producto producto:productos){
            if(producto instanceof Menu){
                menus.add((Menu) producto);
            }
        }
        return menus;
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

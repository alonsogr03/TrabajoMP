/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package burgerkingjuancarlos;

import java.util.ArrayList;

public interface ModoCliente{
    ArrayList<Producto> Catalogo = new ArrayList<>();
    ArrayList<Producto> productospedidos = new ArrayList<>();
   
    default void quitarProductoPedido(Producto p){
       
        if (Catalogo.contains(p)&&productospedidos.contains(p)){
            productospedidos.remove(p);
            System.out.println("Tu producto elegido se ha eliminado");
        }
       
        else{
             System.out.println("Ha ocuriido un probema con tu elección");
         }
     
       
    }
   
     default void agregarProductoPedido(Producto p){
         if (Catalogo.contains(p)&&!(productospedidos.contains(p))){
            productospedidos.add(p);
            System.out.println("Tu producto elegido se ha añadido");
        }
         else{
             System.out.println("Ha ocuriido un probema con tu elección");
         }
    }
     
      default void FinalizarPedido(){
          ArrayList<Producto> pedidofinal = new ArrayList<>();
          if (!(productospedidos.isEmpty())){
              pedidofinal=productospedidos;
             
           
             
             
          }
         
          else{
              System.out.println("Tu pedido no contiene elementos, selecciona algun producto del catalogo. ");
          }
       
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package burgerkingjuancarlos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Hamburgueseria implements ModoCliente,ModoAdministrador,Serializable{
   
    CatalogoProductos catalogo = new CatalogoProductos();
    ArrayList<Ticket> listadoTickets = new ArrayList<>();
    private Ticket pedido;

    public CatalogoProductos getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(CatalogoProductos catalogo) {
        this.catalogo = catalogo;
    }

    public int longitudTickets(){
        return listadoTickets.size();
    }
    public ArrayList<Ticket> getListadoTickets() {
        return listadoTickets;
    }

    public void setListadoTickets(ArrayList<Ticket> listadoTickets) {
        this.listadoTickets = listadoTickets;
    }

 

    public Ticket getPedido() {
        return pedido;
    }

    public void setPedido(Ticket pedido) {
        this.pedido = pedido;
    }

}

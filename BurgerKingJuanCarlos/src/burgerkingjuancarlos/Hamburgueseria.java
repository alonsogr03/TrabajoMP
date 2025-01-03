/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package burgerkingjuancarlos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Hamburgueseria implements Serializable{
   
    CatalogoProductos catalogo = new CatalogoProductos();
    ArrayList<Ticket> listadoTickets = new ArrayList<>();
    private Ticket pedido;
    String backup;

    public CatalogoProductos getCatalogo() {
        return catalogo;
    }
    public int totalVentas(){
        int total = 0;
        for (Ticket pedido : listadoTickets) {
            total += pedido.getPrecioTotal();
        }
        return total;
    }
    
    public void ordenarTicketsTiempoEspera(){
        this.listadoTickets.sort(new ComparadorPorTiempoEspera());
    }
    public void ordenarTicketsPrecioFinal(){
        this.listadoTickets.sort(new ComparadorPorPrecioFinal());
    }
   
    public String generarResumenTickets() {
        String resumen="";
        for (Ticket pedido : listadoTickets) {
            resumen+=pedido.generarTicket()+"\n";
        }
        return resumen;
    }
    public void setPedido(Ticket ticket){
        this.pedido = ticket;
    }
    public Ticket getPedido(){
        return this.pedido;
    }
    public void anadirPedido (Ticket ticket){
        this.listadoTickets.add(ticket);
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
    public Ticket devolverTicket(int idTicket){
        Ticket ticket = null;
        Ticket devolver = null;
        boolean encontrado = false;
        for (int i=0; i<listadoTickets.size();i++){
            ticket = listadoTickets.get(i);
            if (ticket.getid()==idTicket){
                devolver=ticket;
                encontrado = true;
            }
        }
        
        return devolver;
    }
    public void setListadoTickets(ArrayList<Ticket> listadoTickets) {
        this.listadoTickets = listadoTickets;
    }


}

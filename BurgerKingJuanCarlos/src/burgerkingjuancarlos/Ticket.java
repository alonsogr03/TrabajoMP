/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package burgerkingjuancarlos;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Ticket {
    private int id;
    private ArrayList<Producto> productos;
    private double precioTotal;
    private int tiempoEstimado;
    private LocalDateTime horaPedido;

    public Ticket(int id) {
        this.id = id;
        this.productos = new ArrayList<>();
        this.horaPedido = LocalDateTime.now();
        this.precioTotal = 0;
        this.tiempoEstimado = 0;
    }

    public void añadirProducto(Producto producto, int cantidad) {
        for(int i=0; i<=cantidad; i++){
            productos.add(producto);
            
        }
        precioTotal += producto.getPrecio();
        tiempoEstimado += producto.getTiempoElaboracion();
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public int getTiempoEstimado() {
        return tiempoEstimado;
    }

    public LocalDateTime getHoraPedido() {
        return horaPedido;
    }
   
    public int getid() {
        return id;}

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public String generarTicket() {
        StringBuilder ticket = new StringBuilder();
        ticket.append("===== TICKET DE PEDIDO =====\n");
        ticket.append("ID Pedido: ").append(id).append("\n");
        ticket.append("Hora del Pedido: ").append(horaPedido).append("\n\n");
        ticket.append("Productos:\n");
        for (Producto producto : productos) {
            ticket.append("- ").append(producto.getNombre()).append(" : $").append(producto.getPrecio()).append("\n");
        }
        ticket.append("\nPrecio Total: $").append(precioTotal).append("\n");
        ticket.append("Tiempo Estimado: ").append(tiempoEstimado).append(" segundos\n");
        ticket.append("===========================\n");
        return ticket.toString();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public void setTiempoEstimado(int tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    public void setHoraPedido(LocalDateTime horaPedido) {
        this.horaPedido = horaPedido;
    }

   
}
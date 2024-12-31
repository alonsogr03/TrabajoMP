/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package burgerkingjuancarlos;

import static burgerkingjuancarlos.ModoCliente.productospedidos;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

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
    
    
    
     // Método para realizar un pedido
    public void realizarPedido() {

        Scanner scanner = new Scanner(System.in);
        int longitudListaTickets=listadoTickets.size();
        Ticket ticket = new Ticket(longitudListaTickets+1);
        int tiempoTotal = 0;

        System.out.println("--- Realizar Pedido ---");
        while (true) {
            System.out.println("\nProductos disponibles:");
            for (int i = 0; catalogo.tamañoCatalogo(productospedidos)>= i; i++) {
                Producto producto = catalogo.getProductos().get(i);
                System.out.printf("%d. %s - Precio: %d céntimos, Tiempo: %d segundos\n",
                        i + 1, producto.getNombre(), producto.getPrecio(), producto.getTiempoElaboracion());
            }

            System.out.println("0. Finalizar pedido");
            System.out.print("Seleccione el número del producto que desea agregar: ");
            int opcion = scanner.nextInt();

            if (opcion == 0) {
                break;
            }

            if (opcion > 0 && opcion <= catalogo.getProductos().size()) {
                Producto productoSeleccionado = catalogo.getProductos().get(opcion - 1);
                int cantidad=0;
               
                ticket.añadirProducto(productoSeleccionado,cantidad);
                tiempoTotal += productoSeleccionado.getTiempoElaboracion();
                System.out.printf("%s agregado al pedido.\n", productoSeleccionado.getNombre());
            } else {
                System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        }
        pedido.setTiempoEstimado(tiempoTotal);
        listadoTickets.add(pedido);
        System.out.printf("Pedido finalizado. Tiempo estimado: %d segundos, Precio total: %d céntimos\n",
                ticket.getTiempoEstimado(), ticket.getPrecioTotal());
    }

   
}
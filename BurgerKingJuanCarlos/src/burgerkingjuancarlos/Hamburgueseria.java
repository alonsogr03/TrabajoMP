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

    public CatalogoProductos getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(CatalogoProductos catalogo) {
        this.catalogo = catalogo;
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

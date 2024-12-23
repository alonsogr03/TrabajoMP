/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package burgerkingjuancarlos;
       
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public interface ModoAdministrador {
// Declaración de las listas necesarias para administrar productos y pedidos
    ArrayList<Producto> Catalogo = new ArrayList<>();
 
    ArrayList<Ticket> ticketpedidos = new ArrayList<>();

    // Métodos relacionados con backups
    default void hacerBackup() {
        String fileName = "productos" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")) + ".dat";
        try (FileOutputStream out = new FileOutputStream(fileName);
             ObjectOutputStream so = new ObjectOutputStream(out)) {
            so.writeObject(ticketpedidos);
            System.out.println("Backup guardado correctamente en " + fileName);
        } catch (IOException ex) {
            System.err.println("Error al guardar el backup: " + ex.getMessage());
        }
    }

   /*/
    default void restaurarBackup() {FileInputStream in = null;
        ObjectInputStream si = null;
        try {
            in = new FileInputStream("productos2024XXYYHHMMSS.dat");
            si = new ObjectInputStream(in);
            ticketpedidos = (ArrayList<Pedido>) si.readObject();
            si.close();
            in.close();
        } catch (FileNotFoundException exFnF) {
            System.err.println(exFnF + "Fichero no encontrado")  ;
        } catch (ClassNotFoundException exCnF) {
            System.err.println(exCnF + "Error al convertir el objeto");
        } catch (IOException ex) {
            System.err.println(ex + "Error de entrada/salida");
        }
    }
*/
    // Métodos para gestionar productos
    default void añadirProducto(Producto producto) {
        Catalogo.add(producto);
        System.out.println("Producto añadido: " + producto.getNombre());
    }

    default void eliminarProducto(String nombreProducto) {
        Catalogo.removeIf(producto -> producto.getNombre().equals(nombreProducto));
        System.out.println("Producto eliminado: " + nombreProducto);
    }

    default void modificarProducto(String nombreProducto) {
        for (Producto producto : Catalogo) {
            if (producto.getNombre().equals(nombreProducto)) {
                System.out.println("Producto encontrado: " + producto.getNombre());
                // Aquí podrías agregar lógica para modificar el producto.
                return;
            }
        }
        System.out.println("Producto no encontrado: " + nombreProducto);
    }

    // Métodos relacionados con tickets
   default void escribirTicketsFichero(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Ticket ticket : ticketpedidos) {
                writer.write(ticket.generarTicket() + "\n");
            }
            System.out.println("Tickets escritos correctamente en el fichero " + fileName);
        } catch (IOException ex) {
            System.err.println("Error al escribir los tickets: " + ex.getMessage());
        }
    }

    default void consultarTicket(int id) {
        for (Ticket ticket : ticketpedidos) {
            if (ticket.getid() == id) {
                System.out.println("Ticket encontrado: " + ticket);
                return;
            }
        }
        System.out.println("Ticket no encontrado con ID: " + id);
    }

    // Generar tickets
    default void generarTickets() {
        System.out.println("Generando tickets...");
        for (Ticket pedido : ticketpedidos) {
            System.out.println(pedido.generarTicket());
        }
    }

    // Consultar total de ventas
    default void totalVentas() {
        int total = 0;
        for (Ticket pedido : ticketpedidos) {
            total += pedido.getPrecioTotal();
        }
        System.out.println("Ventas totales: " + total + " céntimos.");
    }
}
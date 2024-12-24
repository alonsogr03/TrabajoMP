/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package burgerkingjuancarlos;

public class BurgerKingJuanCarlos implements ModoAdministrador {

    public void BurgerKingJuanCarlos() {
        
    }

    public static void main(String[] args) {
        BurgerKingJuanCarlos admin = new BurgerKingJuanCarlos();

        // Crear productos
        Producto hamburguesa = new Principal("Hamburguesa", "imagen1.jpg", 500, 300);
        Producto refresco = new Bebida("Refresco", "imagen2.jpg", 200, 60, 500);
        Producto postre = new Postre("Helado", "imagen3.jpg", 300, 120, Tamanyo.MEDIANO);

        // Añadir productos
        admin.añadirProducto(hamburguesa);
        admin.añadirProducto(refresco);
        admin.añadirProducto(postre);

        // Listar productos
        admin.Catalogo.forEach(producto ->
            System.out.println(producto.getNombre() + " - " + producto.getPrecio() + " céntimos")
        );

        // Generar tickets (simulado)
        Ticket pedido = new Ticket(1);
        pedido.añadirProducto(hamburguesa);
        pedido.añadirProducto(refresco);
        admin.ticketpedidos.add(pedido);
        admin.generarTickets();

        // Consultar total de ventas
        admin.totalVentas();
    }
}
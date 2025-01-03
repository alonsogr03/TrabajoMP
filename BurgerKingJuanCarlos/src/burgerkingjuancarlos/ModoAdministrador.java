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
    String contraseña="12345";
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

   

    

    
}
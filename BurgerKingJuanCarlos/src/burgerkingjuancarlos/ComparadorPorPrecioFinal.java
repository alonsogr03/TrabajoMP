/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package burgerkingjuancarlos;

import java.util.Comparator;

public class ComparadorPorPrecioFinal implements Comparator<Ticket> {
   
    @Override
    public int compare(Ticket p1, Ticket p2) {
        return (p2.getPrecioTotal()- p1.getPrecioTotal());  
    }
}
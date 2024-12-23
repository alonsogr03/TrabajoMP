/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package burgerkingjuancarlos;

import java.util.Comparator;

public class ComparadorPorNombre implements Comparator<Producto> {
   
    public int compare(Producto p1, Producto p2) {
        return (p1.getNombre().compareTo(p2.getNombre()));
       
    }
}
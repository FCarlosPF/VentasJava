/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ventas;

import com.gm.ventas.Orden;
import com.gm.ventas.Producto;

/**
 *
 * @author LENOVO
 */
public class Ventas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Producto producto1= new Producto("Jabon",12);
        Producto producto2= new Producto("Ace", 15);
        
        Orden orden1 = new Orden();
        Orden orden2 = new Orden();

        
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden2.agregarProducto(producto2);

        orden1.mostrarOrden();
        
        orden2.mostrarOrden();
        
        
    }
    
}

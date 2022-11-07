/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gm.ventas;

/**
 *
 * @author LENOVO
 */
public class Orden {
    
    private int idOrden;
    private Producto productos[];
    private  static int contadorOrden;
    private  int contadorProductos;
    private static final int MAX_PRODUCTOS=10;

    public Orden() {
        this.idOrden=++this.contadorOrden;
        this.productos=new Producto[MAX_PRODUCTOS];
        
    }
    
    
    public void agregarProducto(Producto producto){
    
        if(this.contadorProductos<Orden.MAX_PRODUCTOS){
        productos[contadorProductos++]= producto;
        }else{
            System.out.println("Ya se excedio la cantidad de productos maximos"+Orden.MAX_PRODUCTOS);
        }
        
    }
    
    
    public double calcularTotal(){
    
     double total=0;
     
     for(int i=0;i<contadorProductos;i++){
     
     total+= this.productos[i].getPrecio();
     }

     return total;
     
        
    }
    
    
    public void mostrarOrden(){
    
        
        
        System.out.println("Orden "+this.idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("El total de la orden es $"+totalOrden);
        for(int i=0;i<this.contadorProductos;i++){
            System.out.println(this.productos[i]);
        }
    
    }
    
    
    
    
}

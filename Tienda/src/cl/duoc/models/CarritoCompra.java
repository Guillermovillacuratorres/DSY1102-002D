/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class CarritoCompra {
    private List<Producto> carrito = new ArrayList<>();
    
    
    public void agregarProductoAlCarrito(Producto parProducto){
        carrito.add(parProducto);
        System.out.println("Producto agregado!!");
    }
    
    public void mostrarCarrito(){
        for(Producto i : carrito){
            if(i instanceof ProductoCongelado){
                ProductoCongelado congelado = (ProductoCongelado) i;
                System.out.println("ID" + i.getIdProducto() + 
                                    " NOMBRE: " + i.getNombre() +
                                    " TEMPERATURA: " + congelado.getTemperaturaCongelacion());
            }
        }
    }
    
    
}

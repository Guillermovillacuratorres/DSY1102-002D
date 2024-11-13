/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import models.Producto;

/**
 *
 * @author Cetecom
 */
public class ProductoController {
    private static List<Producto> productos = new ArrayList<>();
    private static int idProducto = 1;
    HelperController helper = new HelperController();
    
    public void agregarProducto(String parNombre, double parPrecio, int parCantidad){
        Producto productoNuevo = new Producto(idProducto++, parNombre, parPrecio, parCantidad);
        productos.add(productoNuevo);
        helper.ShowInformation("Producto agregado.");
    }
    
    public Producto buscarProducto(int parIdProducto){
        for(Producto i : productos){
            if(i.getId() == parIdProducto){
                return i;
            }
        }
        return null;
    }
    
    public void editarProducto(int parId, String parNombre, double parPrecio, int parCantidad){
        Producto productoEncontrado = buscarProducto(parId);
        if(productoEncontrado != null){
            productoEncontrado.setNombre(parNombre);
            productoEncontrado.setPrecio(parPrecio);
            productoEncontrado.setCantidad(parCantidad);
            helper.ShowInformation("Producto actualizado.");
        }else{
            helper.ShowError("Producto no encontrado");
        }
    }
    
    
    public void eliminarProducro(int parId){
        Producto productoEncontrado = buscarProducto(parId);
        if(productoEncontrado != null){
            productos.remove(productoEncontrado);
            helper.ShowInformation("Producto eliminado.");
        }else{
            helper.ShowError("Producto no encontrado.");
        }
    }
    
    
    public List<Producto> obtenerProductos(){
        return productos;
    }
    
    
    
}

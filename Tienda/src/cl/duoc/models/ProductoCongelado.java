/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class ProductoCongelado extends Producto {
    private float temperaturaCongelacion;



    public ProductoCongelado(float temperaturaCongelacion, String idProducto, String nombre, double precio, int stock) {
        super(idProducto, nombre, precio, stock);
        this.temperaturaCongelacion = temperaturaCongelacion;
    }

    public float getTemperaturaCongelacion() {
        return temperaturaCongelacion;
    }

    public void setTemperaturaCongelacion(float temperaturaCongelacion) {
        this.temperaturaCongelacion = temperaturaCongelacion;
    }

    @Override
    public String toString() {
        return "ProductoCongelado{" + "temperaturaCongelacion=" + temperaturaCongelacion + '}';
    }
    
    public void descontarStock(){
        System.out.println("Descuento Stock");
    }
    
}

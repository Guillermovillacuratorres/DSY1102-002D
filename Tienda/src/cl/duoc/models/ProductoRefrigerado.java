/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class ProductoRefrigerado extends Producto{
    private float temperaturaRefrigeracion;


    public ProductoRefrigerado(float temperaturaRefrigeracion, String idProducto, String nombre, double precio, int stock) {
        super(idProducto, nombre, precio, stock);
        this.temperaturaRefrigeracion = temperaturaRefrigeracion;
    }

    public float getTemperaturaRefrigeracion() {
        return temperaturaRefrigeracion;
    }

    public void setTemperaturaRefrigeracion(float temperaturaRefrigeracion) {
        this.temperaturaRefrigeracion = temperaturaRefrigeracion;
    }

    @Override
    public String toString() {
        return "ProductoRefrigerado{" + "temperaturaRefrigeracion=" + temperaturaRefrigeracion + '}';
    }
    
    public void descontarStock(){
        System.out.println("Descuento Stock");
    }
}

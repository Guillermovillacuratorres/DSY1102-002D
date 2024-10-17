/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class ProductoFresco extends Producto{
    private float temperaturaFresco;


    public ProductoFresco(float temperaturaFresco, String idProducto, String nombre, double precio, int stock) {
        super(idProducto, nombre, precio, stock);
        this.temperaturaFresco = temperaturaFresco;
    }

    public float getTemperaturaFresco() {
        return temperaturaFresco;
    }

    public void setTemperaturaFresco(float temperaturaFresco) {
        this.temperaturaFresco = temperaturaFresco;
    }

    @Override
    public String toString() {
        return "ProductoFresco{" + "temperaturaFresco=" + temperaturaFresco + '}';
    }
    
    public void descontarStock(){
        System.out.println("Descuento Stock");
    }
    
}

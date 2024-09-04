/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automotora;

/**
 *
 * @author Cetecom
 */
public class Vehiculo {
    private String marca, modelo,patente;
    private int precio, anio, id_vehiculo;
    private Categoria_vehiculo categoria;
    

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String patente, int precio, int anio, int id_vehiculo, Categoria_vehiculo categoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.precio = precio;
        this.anio = anio;
        this.id_vehiculo = id_vehiculo;
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getId_vehiculo() {
        return id_vehiculo;
    }

    public void setId_vehiculo(int id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }

    public Categoria_vehiculo getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria_vehiculo categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", patente=" + patente + ", precio=" + precio + ", anio=" + anio + ", id_vehiculo=" + id_vehiculo + ", categoria=" + categoria + '}';
    }
    
    
    
    
    public void calculaIvaVehiculo(){
        double precioConIva = precio * 1.19;
        
        System.out.println("EL precio del auto es: " + precio);
        System.out.println("EL precio del auto con IVA es: " + precioConIva);
    }
    
    public void pasarElementos(int n1, String nom, boolean casado, Vehiculo auto){
        System.out.println(auto.getMarca());
    }
}

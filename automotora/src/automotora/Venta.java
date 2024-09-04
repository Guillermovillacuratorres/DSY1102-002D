/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automotora;

import java.time.LocalDate;

/**
 *
 * @author Cetecom
 */
public class Venta {
    
    private int id_venta;
    private LocalDate fecha_venta;
    private Vehiculo vehiculo;
    private Vendedor vendedor;
    private Cliente cliente;

    public Venta() {
    }

    public Venta(int id_venta, LocalDate fecha_venta, Vehiculo vehiculo, Vendedor vendedor, Cliente cliente) {
        this.id_venta = id_venta;
        this.fecha_venta = fecha_venta;
        this.vehiculo = vehiculo;
        this.vendedor = vendedor;
        this.cliente = cliente;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public LocalDate getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(LocalDate fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Venta{" + "id_venta=" + id_venta + ", fecha_venta=" + fecha_venta + ", vehiculo=" + vehiculo + ", vendedor=" + 
                vendedor.getPersona().getNombre() + ", cliente=" 
                + cliente.getPersona().getNombre()+ '}';
    }
    
    
}

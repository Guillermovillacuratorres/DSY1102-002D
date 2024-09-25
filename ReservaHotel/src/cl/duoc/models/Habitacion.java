/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Habitacion {
    private String numeroHabitacion;
    private double precioNoche;
    private boolean disponible;

    public Habitacion() {
    }

    public Habitacion(String numeroHabitacion, double precioNoche) {
        this.numeroHabitacion = numeroHabitacion;
        this.precioNoche = precioNoche;
        this.disponible = true;
    }

    public String getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(String numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "numeroHabitacion=" + numeroHabitacion + ", precioNoche=" + precioNoche + ", disponible=" + disponible + '}';
    }
    
    public void reservar(){
        this.disponible = false;
    }
    
}

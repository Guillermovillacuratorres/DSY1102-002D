/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cl.duoc.reservahotel;

import cl.duoc.models.Cliente;
import cl.duoc.models.Habitacion;
import cl.duoc.models.Hotel;
import cl.duoc.models.Reserva;

/**
 *
 * @author Cetecom
 */
public class ReservaHotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Hotel hotelUno = new Hotel("H0001", "Siete estrella");
        Hotel hotelDos = new Hotel("H0002", "Cuatro estrellas");
        //System.out.println(hotelUno);
        
        
        hotelUno.agregarHabitacion(new Habitacion("HA001", 100));
        hotelUno.agregarHabitacion(new Habitacion("HA002", 1500));
        
        hotelDos.agregarHabitacion(new Habitacion("HAB001",5200));
        
        Cliente clienteUno = new Cliente("C001", "Pedro Fernandez");
        Cliente clienteDos = new Cliente("C002","Bastian Sanchez");
        
        
        hotelUno.reservarHabitacion(clienteUno);
        hotelUno.reservarHabitacion(clienteDos);
        
        hotelDos.reservarHabitacion(clienteDos);
        
        
        System.out.println("Reservas del cliente " + clienteUno.getNombreCliente() + ":");
        for(Reserva iteradorReserva : clienteUno.getReservasRealizadas()){
            System.out.println("Hotel: " + iteradorReserva.getHotel().getNombreHotel() + 
                                " Habitacion:  " + iteradorReserva.getHabitacion().getNumeroHabitacion());
            
        }
        
        
        
    }
    
}

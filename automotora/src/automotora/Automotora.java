/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package automotora;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class Automotora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        Persona cPersona = new Persona();
        Cliente clienteUno = new Cliente();
        Categoria_vehiculo categoria = new Categoria_vehiculo(1, "Sedan");
        Vehiculo autoUno = new Vehiculo("Toyota", "Yaris", "asbv12", 3500, 1120, 1, categoria);
        
        int opcion = 0;
        while(opcion != 5){
            System.out.println("******MENU******");
            System.out.println("[1] - Agregar cliente");
            System.out.println("[2] - Agregar vendedor");
            System.out.println("[3] - Agregar vehiculo");
            System.out.println("[4] - Generar venta");
            System.out.println("[5] - Salir");
            System.out.println("");
            
            opcion = entrada.nextInt();
            entrada.nextLine();
            
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el rut del cliente:");
                    while(true){
                        String rut;
                        
                        rut = entrada.nextLine();
                        
                        if(rut.isEmpty()){
                            System.out.println("Debe ingresar el rut del cliente.");
                        }else{
                            break;
                        }  
                    }
                    

                    
                    System.out.println("Ingrese el nombre del cliente:");
                    cPersona.setNombre(entrada.nextLine());
                    
                    System.out.println("Ingrese el apellido del cliente:");
                    cPersona.setApellido(entrada.next());

                    System.out.println("Ingrese el telefono del cliente:");
                    cPersona.setTelefono(entrada.nextInt());
                    
                    System.out.println("Ingrese si es casado el cliente:");
                    cPersona.setCasado(entrada.nextBoolean());
                    
                    int anio,mes,dia;
                    
                    System.out.println("Ingrese el año de nacimiento del cliente:");
                    anio = entrada.nextInt();
                    
                    System.out.println("Ingrese el mes de nacimiento del cliente:");
                    mes = entrada.nextInt();
                    
                    System.out.println("Ingrese el dia de nacimiento del cliente:");
                    dia = entrada.nextInt();
                    
                    cPersona.setFecha_nacimiento(LocalDate.of(anio, mes, dia));
                    
                    
                    clienteUno.setId_cliente(1);
                    clienteUno.setPersona(cPersona);
                    
                    break;
                case 2:
                    System.out.println("opcion 2 --- "  + clienteUno ); 
                    break;
                case 3:
                    System.out.println("opcion 3"); 
                    autoUno.calculaIvaVehiculo();
                    autoUno.pasarElementos(1121, "Juan", true, autoUno);
                    break;
                case 4:
                    System.out.println("opcion 4"); 
                    break;
                case 5:
                    System.out.println("opcion 5");
                    break;
                default:
                    System.out.println("opcion no valida"); 
                    break;
            }
        }
        
    }
    
}

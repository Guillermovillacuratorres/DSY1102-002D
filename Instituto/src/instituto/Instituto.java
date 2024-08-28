/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package instituto;

import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class Instituto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello");
        Persona p1 = new Persona();
        p1.setRut("12.123.132.8");
        p1.setNombre("Pedro");
        p1.setApellido("Sanchez");
        p1.setEdad(22);
        p1.setFecha_nacimiento("30-05-1993");
        p1.setAltura(1.71);
        p1.setGenero("Masculino");
        
        
        Persona p2 = new Persona("12.123.156-8", "Mario", "Bros", "Masculino", "15-01-1989", 12, 1.90);
        
        System.out.println(p1);
        System.out.println(p2);
        
        System.out.println(p1.validarEdad(p1.getEdad()));
        System.out.println(p2.validarEdad(p2.getEdad()));
        
        System.out.println("LARGO NOMBRE PERSONA " + p1.getNombre().length());
        System.out.println("LETRA " + p1.getNombre().charAt(2));
        
        System.out.println("Reemplazo nombe: "+ p1.getNombre().replace("d", "r"));
        
        String nombre = "DuocUC";
        if(nombre.equalsIgnoreCase("duocuc")){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }
        
        
        Alumno a1 = new Alumno
        (4.5, 
        "Desarrollo orientado a objetos",
        "Informatica", 
        p1);
        
        System.out.println("ALUMNO: "  + a1);
        
        Scanner scan = new Scanner(System.in);
        
        int opcion = 0;
        
        while(opcion != 3){
            System.out.println("=====MENU========");
            System.out.println("[1] - Opcion 1");
            System.out.println("[2] - Opcion 2");
            System.out.println("[3] - Opcion 3");
            
            opcion = scan.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Opción 1 seleccionada.");
                    break;
                case 2:
                    System.out.println("Opción 2 seleccionada.");
                    break;
                case 3:
                    System.out.println("Saliendo....");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            
            }
        }
        
        int numUno = 1;
        
        do{
            System.out.println("Numero:  " + numUno);
            numUno++;
        } while(numUno <= 0);
        
        
        for (int i = 1; i <= 100; i++) {
            System.out.println("Iteracion " + i);
        }
        
        
        
        
    }
    
}

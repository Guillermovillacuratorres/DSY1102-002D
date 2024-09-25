/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cl.duoc.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class ArrayLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<String> mascotas = new ArrayList<>();
        
        mascotas.add("Perro");
        mascotas.add("Gato");
        mascotas.add("Hamster");
        mascotas.add("Oso");
        mascotas.add("Trigre");
        mascotas.add("Leon");
        mascotas.add("Cocodrilo");
        
        //mascotas.clear();
        mascotas.remove("Oso");
        System.out.println(mascotas);
        System.out.println(mascotas.get(4));
        System.out.println(mascotas.size());
        System.out.println(mascotas.contains("Leon"));
        System.out.println(mascotas.indexOf("gato"));
        
        for(String iteradorMascota : mascotas){
            System.out.println(iteradorMascota);
        }
        
    }
    
}

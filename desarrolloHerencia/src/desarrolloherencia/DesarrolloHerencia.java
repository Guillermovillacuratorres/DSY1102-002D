/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desarrolloherencia;

import cl.duoc.model.Animal;
import cl.duoc.model.Gato;
import cl.duoc.model.Perro;

/**
 *
 * @author Cetecom
 */
public class DesarrolloHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal perro = new Perro();
        Gato gato = new Gato();
        
        perro.setNombre("Firulais");
        gato.setNombre("Michi");
        perro.hacerSonido();
        gato.hacerSonido();
        
        
    }
    
}

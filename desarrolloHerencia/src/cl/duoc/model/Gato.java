/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.model;

/**
 *
 * @author Cetecom
 */
public class Gato extends Animal{

    public Gato() {
    }

    public Gato(String nombre) {
        super(nombre);
    }
    
    public void hacerSonido(){
        System.out.println("El gato "+ super.getNombre() + " Dice miaaauuuu  miiauuuu!");
    }
}

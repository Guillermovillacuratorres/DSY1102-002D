/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automotora;

/**
 *
 * @author Cetecom
 */
public class Vendedor {
    private int id_vendedor;
    private Persona persona;

    public Vendedor() {
    }

    public Vendedor(int id_vendedor, Persona persona) {
        this.id_vendedor = id_vendedor;
        this.persona = persona;
    }

    public int getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(int id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "id_vendedor=" + id_vendedor + ", persona=" + persona + '}';
    }
    
    
}

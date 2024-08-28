/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instituto;

/**
 *
 * @author Cetecom
 */
public class Alumno {
    
    private double nota;
    private String asignatura, carrera;
    private Persona persona;

    
    
    public Alumno() {
    }
    
    

    public Alumno(double nota, String asignatura, String carrera, Persona persona) {
        this.nota = nota;
        this.asignatura = asignatura;
        this.carrera = carrera;
        this.persona = persona;
    }
    
    

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    
    public String toString(){
    return "Rut" + persona.getRut() + 
           "Nombre: " + persona.getNombre() +
           "Nota" + nota + 
           "Asignatura" + asignatura;
    }
    
}

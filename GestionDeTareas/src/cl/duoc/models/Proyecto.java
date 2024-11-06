/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class Proyecto {
    private int idproyecto;
    private String nombre;
    private List<Task> tareas = new ArrayList<>();

    public Proyecto() {
    }

    public Proyecto(int idproyecto, String nombre) {
        this.idproyecto = idproyecto;
        this.nombre = nombre;
    }

    public int getIdproyecto() {
        return idproyecto;
    }

    public void setIdproyecto(int idproyecto) {
        this.idproyecto = idproyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Task> getTareas() {
        return tareas;
    }

    public void setTareas(List<Task> tareas) {
        this.tareas = tareas;
    }
    
    
    public void agregarTarea(Task parTareaNueva){
        tareas.add(parTareaNueva);
        System.out.println("Tarea agregada!");
    }
    
    public List<Task> obtenerTareas(){
        return tareas;
    }
    
}

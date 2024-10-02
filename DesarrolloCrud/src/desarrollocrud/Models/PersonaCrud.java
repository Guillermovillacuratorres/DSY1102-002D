package desarrollocrud.Models;

import java.util.ArrayList;
import java.util.List;

public class PersonaCrud {
    private int id = 1;
    private List<Persona> personas = new ArrayList<>();
    public void crearPersona(String nombre){
        Persona nueva_p = new Persona(id++, nombre);
        personas.add(nueva_p);
        System.out.println("Persona agregada!");
    }
    public void listarPersonas(){
        System.out.println("LISTADO DE PERSONAS");
        for(Persona i : personas){
            System.out.println("ID: "+i.getId() + " Nombre: " + i.getNombre());
        }
    }
    public void actualizarPersona(int id, String nombre){
        for (Persona i : personas){
            if (i.getId() == id){
                i.setNombre(nombre);
                System.out.println("Persona actualizada!");
                return;
            }
        }
        System.out.println("Persona no encontrada.");
    }
    public void eliminarPersona(int id){
        for (Persona i : personas){
            if (i.getId() == id){
                System.out.println("Persona eliminada!     " + i.getNombre());
                personas.remove(i);
                return;
            }
        }
        System.out.println("Persona no encontrada.");
    }
}


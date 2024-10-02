package desarrollocrud;

import desarrollocrud.Models.PersonaCrud;

public class DesarrolloCrud {

    public static void main(String[] args) {
       
       PersonaCrud crud = new PersonaCrud();
       crud.crearPersona("Mario");
       crud.crearPersona("Luigi");
       crud.crearPersona("Ash");
       crud.crearPersona("Misty");
       crud.crearPersona("Brook");
       crud.actualizarPersona(10, "Maricarmen");
       
       crud.eliminarPersona(10);
       crud.listarPersonas();

    }
}
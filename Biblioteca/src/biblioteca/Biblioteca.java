/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;

import Bd.Conexion;
import controller.LibroController;
import views.ListarLibros;

/**
 *
 * @author Cetecom
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion cx = new Conexion();
        cx.conectar();
        
        LibroController lc = new LibroController();
        lc.agregarLibro("Los siete chanchitos",4);
       //System.out.println(lc.obtenerLibrosConCondicion(2));
       //lc.editar(1, "aaaa", 1);
        //lc.eliminar(1);
        
        ListarLibros l = new ListarLibros();
        l.setVisible(true);
    }
    
}

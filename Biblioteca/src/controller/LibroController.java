/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Bd.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;
import models.Libro;


/**
 *
 * @author Cetecom
 */
public class LibroController {

    Conexion cx;
    
    public LibroController() {
        cx = new Conexion();
        cx.conectar();
    }
    
    
    public void agregarLibro(String nombre, int idCategoria){
        String query = "INSERT INTO `libro` (titulo,id_categoria) VALUES (?,?)";
        try {
            PreparedStatement st = cx.getConnection().prepareStatement(query);
            st.setString(1, nombre);
            st.setInt(2, idCategoria);
            st.executeUpdate();
            System.out.println("Libro agregado.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    
    public List<Libro> obtenerLibrosConCondicion(int id){
        List<Libro> libros = new ArrayList<>();
        try {
                ResultSet rs = cx.EjecutarQuery("SELECT * FROM libro WHERE id_categoria =  " + id);
                //ResultSet rs = cx.EjecutarQuery("SELECT * FROM libro;");
            while(rs.next()){
                libros.add(new Libro(
                        rs.getInt("id"),
                        rs.getString("titulo"),
                        rs.getInt("id_categoria")
                ));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return libros;
    }
    
    
    public Libro buscarPorId(int id){
        Libro libro = null;
        String query = "SELECT * FROM libro WHERE id = " + id;
        try {
            ResultSet rs = cx.EjecutarQuery(query);
            if(rs.next()){
                libro = new Libro();
                libro.setId(rs.getInt("id"));
                libro.setTitulo(rs.getString("titulo"));
                libro.setId_categoria(rs.getInt("id_categoria"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return libro;
    }
    
    
    public boolean editar(int id, String titulo, int idCategoria){
        String query = "UPDATE libro SET titulo = '" + titulo + 
                "', id_categoria = " + idCategoria + 
                " WHERE id = " + id + ";";
        
        System.out.println(query);
        try {
            Libro libroEncontrado = buscarPorId(id);
            if(libroEncontrado != null){
                Statement st = cx.getConnection().createStatement();
                int filasAfectadas = st.executeUpdate(query);
                System.out.println("Libro actualizado.");
                return filasAfectadas > 0;
            }else{
                return false;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    
    public void eliminar(int id){
        String query = "DELETE FROM libro WHERE id = " + id  + ";";
        try {
            Libro libroEncontrado = buscarPorId(id);
            if(libroEncontrado != null){
                Statement st = cx.getConnection().createStatement();
                st.executeUpdate(query);
                System.out.println("Libro eliminado correctamente.");
            }else{
                System.out.println("Libro no encontrado.");
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }      
    }
    
    
    
    
}

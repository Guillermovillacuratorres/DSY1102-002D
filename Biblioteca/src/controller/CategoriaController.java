/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Bd.Conexion;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.Categoria;

/**
 *
 * @author Cetecom
 */
public class CategoriaController {

    Conexion cx;
    public CategoriaController() {
        cx = new Conexion();
        cx.conectar();
    }
    
        public List<Categoria> obtenerCategorias(){
        List<Categoria> categorias = new ArrayList<>();
        try {
            ResultSet rs = cx.EjecutarQuery("SELECT * FROM categoria;");
            while(rs.next()){
                categorias.add(new Categoria(
                        rs.getInt("id"),
                        rs.getString("nombre")
                ));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return categorias;
    }
    
    
    
}

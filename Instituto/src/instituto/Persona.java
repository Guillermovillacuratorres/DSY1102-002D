/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instituto;

import java.util.Date;

/**
 *
 * @author Cetecom
 */
public class Persona {
    private String rut,nombre, apellido,genero,fecha_nacimiento ;
    private int edad;
    private double altura;


    private int numero = 0;


    public Persona() {
    }

    public Persona(String rut, String nombre, String apellido, String genero, String fecha_nacimiento, int edad, double altura) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.fecha_nacimiento = fecha_nacimiento;
        this.edad = edad;
        this.altura = altura;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    @Override
    public String toString(){
    return "Rut: " + rut + "  Nombre: " + nombre  +
           " Apellido: " + apellido +
           " Edad: " + edad + "  Altura: " + altura +
           " Genero: " + genero;
    }

    public String validarEdad(int par_edad){
        if(par_edad >= 18){
            return "Es mayor de edad.";
        }
        else{
            return "Es menor de edad.";
        }
    } 




}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exeficheiros_serializable;

import java.io.Serializable;

/**
 *
 * @author finfanterodal
 */
public class Persona implements Serializable {

    private String dni;
    private String nombre;
    private String apellidos;

    public Persona(String dni, String nombre, String apellidos) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return this.dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public String getAtributos() {
        return this.getDNI() + " " + this.getApellidos() + ", "
                + this.getNombre();
    }

    @Override
    public String toString() {
        return  "dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos;
    }
    
    
}

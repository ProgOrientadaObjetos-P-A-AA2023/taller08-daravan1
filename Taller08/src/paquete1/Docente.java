/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Docente {

    protected String nombre;
    protected String cedula;

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public void establecerCedula(String ced) {
        cedula = ced;
    }
    public String obtenerNombre(){
        return nombre;  
    }
    public String obtenerCedula(){
        return cedula;  
    }
}

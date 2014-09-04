/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brasil2014;

/**
 *
 * @author Elías González <eliasgonzalezugalde@gmail.com>
 */
public class NodoJugador {

    //variables de jugadores
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;
    private int goles;
    private NodoJugador siguiente;

    public NodoJugador() {
        nombre = "";
        apellido1 = "";
        apellido2 = "";
        edad = 0;
        goles = 0;
        siguiente = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
    
    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getGoles() {
        return goles;
    }

    public NodoJugador getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoJugador siguiente) {
        this.siguiente = siguiente;
    }

}

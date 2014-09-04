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
public class NodoGrupo {

    //variables de estadios
    private String nombre;
    private ListaEquipo ListaDeEquipos;
    private ListaCalendario listaDeCalendarios;
    private NodoGrupo siguiente;

    public NodoGrupo() {
        nombre = "";
        siguiente = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ListaEquipo getListaEquipo() {
        return ListaDeEquipos;
    }

    public void setListaEquipo(ListaEquipo ListaDeEquipos) {
        this.ListaDeEquipos = ListaDeEquipos;
    }
    
    public ListaCalendario getListaDeCalentarios() {
        return listaDeCalendarios;
    }

    public void setListaDeCalentarios(ListaCalendario listaDeCalendarios) {
        this.listaDeCalendarios = listaDeCalendarios;
    }

    public NodoGrupo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoGrupo siguiente) {
        this.siguiente = siguiente;
    }
}

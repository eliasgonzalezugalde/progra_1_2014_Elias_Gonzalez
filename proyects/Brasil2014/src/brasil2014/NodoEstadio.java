/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brasil2014;

/**
 *
 * @author ideli_000
 */
public class NodoEstadio {

    //variables de estadios
    private String nombre;
    private int temperatura;
    private int precipitaciones;
    private int humedad;
    private int viento;
    private int capacidad;
    private ListaEstadio listaDeEstadios;
    private NodoEstadio siguiente;

    public NodoEstadio() {
        nombre = "";
        temperatura = 0;
        precipitaciones = 0;
        humedad = 0;
        viento = 0;
        capacidad = 0;
        siguiente = null;
        listaDeEstadios = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getPrecipitaciones() {
        return precipitaciones;
    }

    public void setPrecipitaciones(int precipitaciones) {
        this.precipitaciones = precipitaciones;
    }

    public int getHumedad() {
        return humedad;
    }

    public void setHumedad(int humedad) {
        this.humedad = humedad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getViento() {
        return viento;
    }

    public void setViento(int viento) {
        this.viento = viento;
    }
    
    public ListaEstadio getListaDeEstadios() {
        return listaDeEstadios;
    }

    public void setListaDeEstadios(ListaEstadio listaDeEstadios) {
        this.listaDeEstadios = listaDeEstadios;
    }

    public NodoEstadio getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoEstadio siguiente) {
        this.siguiente = siguiente;
    }
}

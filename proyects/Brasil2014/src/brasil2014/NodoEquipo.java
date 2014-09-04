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
public class NodoEquipo {

    //variables de equipos
    private String nombre;
    private ListaJugador ListaDeJugadores;
    private NodoEquipo siguiente;
    private int partidosJugados;
    private int partidosGanados;
    private int partidosEmpatados;
    private int partidosPerdidos;
    private int golesAFavor;
    private int golesEnContra;
    private int diferenciaDeGol;
    private int puntos;

    public NodoEquipo() {
        nombre = "";
        siguiente = null;
        partidosJugados = 0;
        partidosGanados = 0;
        partidosEmpatados = 0;
        partidosPerdidos = 0;
        golesAFavor = 0;
        golesEnContra = 0;
        diferenciaDeGol = 0;
        puntos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ListaJugador getJugadores() {
        return ListaDeJugadores;
    }

    public void setJugadores(ListaJugador ListaDeJugadores) {
        this.ListaDeJugadores = ListaDeJugadores;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getPartidosGanados() {
        return partidosGanados;
    }

    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    public int getPartidosEmpatados() {
        return partidosEmpatados;
    }

    public void setPartidosEmpatados(int partidosEmpatados) {
        this.partidosEmpatados = partidosEmpatados;
    }

    public int getPartidosPerdidos() {
        return partidosPerdidos;
    }

    public void setPartidosPerdidos(int partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }

    public int getGolesAFavor() {
        return golesAFavor;
    }

    public void setGolesAFavor(int golesAFavor) {
        this.golesAFavor = golesAFavor;
    }

    public int getGolesEnContra() {
        return golesEnContra;
    }

    public void setGolesEnContra(int golesEnContra) {
        this.golesEnContra = golesEnContra;
    }

    public int getDiferenciaDeGol() {
        return diferenciaDeGol;
    }

    public void setDiferenciaDeGol(int diferenciaDeGol) {
        this.diferenciaDeGol = diferenciaDeGol;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public NodoEquipo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoEquipo siguiente) {
        this.siguiente = siguiente;
    }

}

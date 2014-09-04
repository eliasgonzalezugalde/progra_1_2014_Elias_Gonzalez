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
public class NodoCalendario {

    //variables de calendarios
    private String fecha;
    private String hora;
    private String humedad;
    private String viento;
    private String temperaturaMinima;
    private String temperaturaMaxima;
    private int golesEquipo1;
    private int golesEquipo2;
    private String cede;

    //private ListaJugador ListaDeJugadores;
    private NodoCalendario siguiente;

    public NodoCalendario() {
        fecha = "";
        hora = "";
        humedad = "";
        viento = "";
        temperaturaMinima = "";
        temperaturaMaxima = "";
        golesEquipo1 = 0;
        golesEquipo2 = 0;
        cede = "";
        siguiente = null;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getHumedad() {
        return humedad;
    }

    public void setHumedad(String humedad) {
        this.humedad = humedad;
    }

    public String getViento() {
        return viento;
    }

    public void setViento(String viento) {
        this.viento = viento;
    }

    public String getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(String temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    public String getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void setTemperaturaMaxima(String temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public String getCede() {
        return cede;
    }

    public void setCede(String cede) {
        this.cede = cede;
    }

    public int getGolesEquipo1() {
        return golesEquipo1;
    }

    public void setGolesEquipo1(int golesEquipo1) {
        this.golesEquipo1 = golesEquipo1;
    }

    public int getGolesEquipo2() {
        return golesEquipo2;
    }

    public void setGolesEquipo2(int golesEquipo2) {
        this.golesEquipo2 = golesEquipo2;
    }

    public NodoCalendario getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCalendario siguiente) {
        this.siguiente = siguiente;
    }
}

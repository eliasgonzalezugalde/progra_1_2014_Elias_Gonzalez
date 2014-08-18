/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

/**
 *
 * @author Elías González <eliasgonzalezugalde@gmail.com>
 */
public class NodoProducto {

    private int id;
    private String descripcion;
    private int precioUnitario;
    private int cantidad;
    private boolean activo;
    private boolean esGravado;
    private int impuesto;
    private String fecha;

    private NodoProducto siguiente;

    public NodoProducto() {
        id = 0;
        descripcion = "";
        precioUnitario = 0;
        cantidad = 0;
        activo = false;
        esGravado = false;
        impuesto = 0;
        fecha = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public boolean isEsGravado() {
        return esGravado;
    }

    public void setEsGravado(boolean esGravado) {
        this.esGravado = esGravado;
    }

    public int getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(int impuesto) {
        this.impuesto = impuesto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public NodoProducto getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoProducto siguiente) {
        this.siguiente = siguiente;
    }

}

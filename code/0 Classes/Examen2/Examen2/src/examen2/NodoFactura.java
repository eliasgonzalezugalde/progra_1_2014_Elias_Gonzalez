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
public class NodoFactura {

    private int id;
    private String cliente;
    private int totalGravado;
    private int totalExcepto;
    private int subTotal;
    private String fecha;
    private int total;
    private ListaProducto listaDeProductos;
    private boolean activo;

    private NodoFactura siguiente;

    public NodoFactura() {
        id = 0;
        cliente = "";
        totalGravado = 0;
        totalExcepto = 0;
        subTotal = 0;
        fecha = "";
        total = 0;
        listaDeProductos = null;
        activo = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getTotalGravado() {
        return totalGravado;
    }

    public void setTotalGravado(int totalGravado) {
        this.totalGravado = totalGravado;
    }

    public int getTotalExcepto() {
        return totalExcepto;
    }

    public void setTotalExcepto(int totalExcepto) {
        this.totalExcepto = totalExcepto;
    }

    public int getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public ListaProducto getListaDeProductos() {
        return listaDeProductos;
    }

    public void setListaDeProductos(ListaProducto listaDeProductos) {
        this.listaDeProductos = listaDeProductos;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public NodoFactura getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoFactura siguiente) {
        this.siguiente = siguiente;
    }

}

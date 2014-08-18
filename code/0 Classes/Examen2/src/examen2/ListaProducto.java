/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import javax.swing.JOptionPane;

/**
 *
 * @author Elías González <eliasgonzalezugalde@gmail.com>
 */
public class ListaProducto {

    private NodoProducto raiz;

    public ListaProducto() {
        raiz = null;
    }
    
    public NodoProducto getRaiz() {
        return raiz;
    }
    
    //metodo insertar datos de prductos
    public void Insertar(int id, String descripcion, int precioUnitario, int cantidad, boolean activo, boolean esGravado, int impuesto, String fecha) {
        NodoProducto nuevo;
        nuevo = new NodoProducto();
        
        nuevo.setId(id);
        nuevo.setDescripcion(descripcion);
        nuevo.setPrecioUnitario(precioUnitario);
        nuevo.setCantidad(cantidad);
        nuevo.setActivo(activo);
        nuevo.setEsGravado(esGravado);
        nuevo.setImpuesto(impuesto);
        nuevo.setFecha(fecha);
        
        if (raiz == null) {
            nuevo.setSiguiente(null);
            raiz = nuevo;
        } else {
            NodoProducto auxiliar = raiz;
            while (auxiliar.getSiguiente() != null) {
                auxiliar = auxiliar.getSiguiente();
           }
            auxiliar.setSiguiente(nuevo);
        }
    }
    
    //imprime la lista de productos
    public String ImprimirLista() {
        NodoProducto recorrido = raiz;
        String ListaDeGrupos = "";
        recorrido = raiz;
        while (recorrido != null) {
            ListaDeGrupos += "Nombre: " + recorrido.getDescripcion()  + "           ID del producto: " + recorrido.getId() + "\n";
            recorrido = recorrido.getSiguiente();
        }
        return ListaDeGrupos;
    }
    
        //elimina jugadores
    public void EliminarProducto(int  sku) {
        NodoProducto siguienteProducto = raiz;
        NodoProducto anterior = siguienteProducto;

        if (siguienteProducto == null) {
            JOptionPane.showInputDialog(null, "La lista de productos esta vacía.");
            return;
        }
        
        while (siguienteProducto != null) 
        {
            if (sku == siguienteProducto.getId()) {
                if (siguienteProducto == raiz) 
                {
                    raiz = siguienteProducto.getSiguiente();
                    return;
                }
                
                anterior.setSiguiente(siguienteProducto.getSiguiente());
                return;
            }
            anterior = siguienteProducto;
            siguienteProducto = siguienteProducto.getSiguiente();
        }
    }
    
    public void desactivarProducto(int  skuDeProductoADesactivar) {
        NodoProducto siguienteProducto = raiz;

        if (siguienteProducto == null) {
            JOptionPane.showInputDialog(null, "La lista de productos esta vacía.");
            return;
        }
        
        while (siguienteProducto != null) {
            if (skuDeProductoADesactivar == siguienteProducto.getId()) 
            {
                siguienteProducto.setActivo(false);

            }
            siguienteProducto = siguienteProducto.getSiguiente();
        }
    }
    
    public void editarProducto(int skuDeProductoAModificar, String nombreDeProductoModificar, int precioProductoModificar, int cantidadProductoModificar, int estaActivoPNModificar, int impuestoProductoModificar, String fechaProductoModificar)
    {
        NodoProducto siguienteProducto = raiz;
                
        while (siguienteProducto != null) 
        {
            if (skuDeProductoAModificar == siguienteProducto.getId()) {
            
                siguienteProducto.setDescripcion(nombreDeProductoModificar);
                siguienteProducto.setPrecioUnitario(precioProductoModificar);
                siguienteProducto.setCantidad(cantidadProductoModificar);
                if (cantidadProductoModificar == 1) {
                    siguienteProducto.setActivo(true);
                } else {
                    siguienteProducto.setActivo(false);
                }
                if (estaActivoPNModificar == 1) {
                    siguienteProducto.setEsGravado(true);
                } else {
                    siguienteProducto.setEsGravado(false);
                }
                siguienteProducto.setImpuesto(impuestoProductoModificar);
                siguienteProducto.setFecha(fechaProductoModificar);
            }
            siguienteProducto = siguienteProducto.getSiguiente();
        }
    }
    
    public NodoProducto agregaProducto (int skuParaAgregar) {
        NodoProducto recorridoProducto = raiz;
        NodoProducto productoEncontrado = null;

        String partidos = "";


            while (recorridoProducto != null) {
                
                if(skuParaAgregar == recorridoProducto.getId()) {
                    productoEncontrado = recorridoProducto;
                    return productoEncontrado;
                }
                
                recorridoProducto = recorridoProducto.getSiguiente();
            }

        return null;
    }
    
    
}

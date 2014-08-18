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
public class ListaFactura {

    private NodoFactura raiz;

    public ListaFactura() {
        raiz = null;
    }

    public void Insertar(int id, String cliente, int totalGravado, int totalExcepto, int subTotal, String fecha, int total, ListaProducto listaDeProductos, boolean activo) {
        NodoFactura nuevo;
        nuevo = new NodoFactura();

        nuevo.setId(id);
        nuevo.setCliente(cliente);
        nuevo.setTotalGravado(totalGravado);
        nuevo.setTotalExcepto(totalExcepto);
        nuevo.setSubTotal(subTotal);
        nuevo.setFecha(fecha);
        nuevo.setTotal(total);
        nuevo.setListaDeProductos(listaDeProductos);
        nuevo.setActivo(activo);

        if (raiz == null) {
            nuevo.setSiguiente(null);
            raiz = nuevo;
        } else {
            NodoFactura auxiliar = raiz;
            while (auxiliar.getSiguiente() != null) {
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }
    }

    //imprime la lista de facturas
    public String ImprimirLista() {
        NodoFactura recorrido = raiz;
        String ListaDeFacturas = "";

        int contImpr = 0;
        while (recorrido != null) {
            ListaDeFacturas += "\n" + "\n" + " Cliente: " + recorrido.getCliente() + "                                          Fecha: " + recorrido.getId() + "\n" + "\n";

            NodoProducto recorridoProductos = recorrido.getListaDeProductos().getRaiz();

            while (recorridoProductos != null) {

                if (contImpr == 0) {
                    ListaDeFacturas += "Artículos:" + "\n" + "\n" + "Descripción." + "          Cantidad." + "          Precio." + "            Excepto" + "\n" + "\n";
                }

                ListaDeFacturas += recorridoProductos.getDescripcion() + "                          " + recorridoProductos.getCantidad() + "                      " + recorridoProductos.getPrecioUnitario() + "\n";
                contImpr++;

                recorridoProductos = recorridoProductos.getSiguiente();
            }
            recorrido = recorrido.getSiguiente();
        }
        return ListaDeFacturas;
    }
    
        public void editarProducto(int skuDeFacAModificar, String nombreDeFacAModificar, int cantidadProductoModificar, int estaActivoPNModificar, int impuestoProductoModificar, String fechaProductoModificar)
    {
        NodoFactura sigteFactura = raiz;
                
        while (sigteFactura != null) 
        {
            if (skuDeFacAModificar == sigteFactura.getId()) {
            
                sigteFactura.setCliente(fechaProductoModificar);
                sigteFactura.setFecha(fechaProductoModificar);
   
                sigteFactura.setActivo(true);
                sigteFactura.setTotalExcepto(estaActivoPNModificar);
                sigteFactura.setSubTotal(estaActivoPNModificar);
                sigteFactura.setTotal(estaActivoPNModificar);
                sigteFactura.setTotalGravado(estaActivoPNModificar);
            }
            sigteFactura = sigteFactura.getSiguiente();
        }
    }

    public String reimprimirFactura(int skuFac) {
        NodoFactura recorrido = raiz;
        String ListaDeFacturas = "";

        int contImpr = 0;
        while (recorrido != null) {

            if (skuFac == recorrido.getId()) {
                ListaDeFacturas += "\n" + "\n" + " Cliente: " + recorrido.getCliente() + "                                          Fecha: " + recorrido.getId() + "\n" + "\n";

                NodoProducto recorridoProductos = recorrido.getListaDeProductos().getRaiz();

                while (recorridoProductos != null) {

                    if (contImpr == 0) {
                        ListaDeFacturas += "Artículos:" + "\n" + "\n" + "Descripción." + "          Cantidad." + "          Precio." + "            Excepto" + "\n" + "\n";
                    }

                    ListaDeFacturas += recorridoProductos.getDescripcion() + "                          " + recorridoProductos.getCantidad() + "                      " + recorridoProductos.getPrecioUnitario() + "\n";
                    contImpr++;

                    recorridoProductos = recorridoProductos.getSiguiente();
                }
            }

            recorrido = recorrido.getSiguiente();
        }
        return ListaDeFacturas;
    }

}

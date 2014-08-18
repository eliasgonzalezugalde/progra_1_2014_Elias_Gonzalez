/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import java.awt.Color;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

/**
 *
 * @author Elías González <eliasgonzalezugalde@gmail.com>
 */
public class Examen2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //lista de prodcutos
        ListaProducto ListaProductos = new ListaProducto();

        //lista de equipos
        ListaFactura ListaFacturas = new ListaFactura();

        ImageIcon copa = new ImageIcon("src/img/copa.png");
        UIManager UI = new UIManager();
        UIManager.put("OptionPane.background", new ColorUIResource(153, 202, 40)); // //25, 55, 137 azul //color de linea afuera 
        UIManager.put("Panel.background", new ColorUIResource(0x99, 0xCA, 0x28)); //color de fondo de adentro #99 CA 28
        UIManager.put("TextField.margin", new Insets(2, 3, 2, 0)); //padding de los campos de texto  
        UIManager.put("Button.background", new Color(226, 226, 226, 226));

        //importamos JFrame para ponerle título a las ventanas
        JFrame frame = new JFrame("JOptionPane showMessageDialog");

        int opt = 0;
        int sku = 0;
        int skuFac = 0;

        String nombreDeProducto = "";
        int precioProductoNuevo = 0;
        int cantidadProductoNuevo = 0;
        int estaActivoPN = 0;
        boolean estaActivoProductoNuevo = false;
        int estaGravadoPN = 0;
        boolean esGravadoProductoNuevo = false;
        int impuestoProductoNuevo = 0;
        String fechaProductoNuevo = "";

        int skuDeProductoADesactivar = 0;

        int skuDeProductoAModificar = 0;
        String nombreDeProductoModificar = "";
        int precioProductoModificar = 0;
        int cantidadProductoModificar = 0;
        boolean estaActivoPNModificar = false;
        boolean estaActivoProductoModificar = false;
        boolean estaGravadoPNModificar = false;
        boolean esGravadoProductoModificar = false;
        boolean impuestoProductoModificar = false;
        String fechaProductoModificar = "";

        String productoAEliminar = "";

        String clienteFac = "";
        String fechaFac = "";
        int skuParaAgregar = 0;
        
        int skuDeFacAModificar = 0;
        String nombreDeFacAModificar = "";
        //int precioProductoModificar = 0;
        

//        ListaProductos.Insertar(1, "Arroz", 3000, 5, true, false, 0, "29/08/2014");
//        ListaProductos.Insertar(2, "Frijoles", 2000, 5, true, false, 0, "21/08/2014");
//        ListaProductos.Insertar(3, "Harina", 650, 2, true, false, 0, "28/08/2014");

        do {

            opt = Integer.parseInt((String) JOptionPane.showInputDialog(frame, "Digite una opcion del menú." + "\n"
                    + "\n" + "1. Crear nueva factura. (funciona)"
                    + "\n" + "2. Ver lista de facturas.  (funciona)"
                    + "\n" + "3. Editar factura."
                    + "\n" + "4. Desactivar factura."
                    + "\n" + "5. Reimprimir factura. (funciona)"
                    + "\n" + "6. Agregar inventario. (funciona)"
                    + "\n" + "7. Editar inventario. (funciona)"
                    + "\n" + "8. Eliminar inventario. (funciona)"
                    + "\n" + "9. Desactivar inventario."
                    + "\n" + "10. Agregar más productos a un inventario."
                    + "\n" + "0. Salir.", "Supermercado Granada.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));

            if (opt == 0) { //se sale si precionan 0
                System.exit(0);
            }
            switch (opt) {

                case 1:

                    //buscar el id del producto temporal
                    //lsitaFacturas.insertar, nombrecliente, datos y lista de procutos temporal
                    clienteFac = ((String) JOptionPane.showInputDialog(frame, "Digite el nombre del cliente.", "Supermercado Granada.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                    //buscar productos por sku y calcular
                    fechaFac = ((String) JOptionPane.showInputDialog(frame, "Digite la fecha.", "Supermercado Granada.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));

                    skuFac++;
                    ListaProducto ListaProductosTemporal = new ListaProducto();

                    do {
                        skuParaAgregar = Integer.parseInt((String) JOptionPane.showInputDialog(frame, "Los productos que hay son." + "\n" + ListaProductos.ImprimirLista() + "\n" + "Digite 0 cuando termine de añadir productos.", "Supermercado Granada.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                        if (skuParaAgregar == 0) {

                        } else {
                            //metodo q devuelva el nodo del producto
                            NodoProducto ProductoEncontrado = ListaProductos.agregaProducto(skuParaAgregar);

                            //lista de producto temporal
                            ListaProductosTemporal.Insertar(ProductoEncontrado.getId(), ProductoEncontrado.getDescripcion(), ProductoEncontrado.getPrecioUnitario(), ProductoEncontrado.getCantidad(), true, true, ProductoEncontrado.getImpuesto(), ProductoEncontrado.getFecha());
                        }

                    } while (skuParaAgregar != 0);

                    //insercion en la lista de facturas
                    ListaFacturas.Insertar(skuFac, clienteFac, 123, 23, 2, fechaFac, 2, ListaProductosTemporal, true);
                    
                    break;
                case 2:
                    JOptionPane.showMessageDialog(frame, ListaFacturas.ImprimirLista());
                    break;
                case 3:
                    skuDeProductoAModificar = Integer.parseInt((String) JOptionPane.showInputDialog(frame, "Digite el ID de la factura que desea modificar." + "\n" +  "\n" + "Digite 0 para devolverse.", "Supermercado Granada.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                    
                    
                    break;
                case 4:

                    break;
                case 5:
                    skuFac = Integer.parseInt((String) JOptionPane.showInputDialog(frame, "Digite el ID de la factura que desea reimprimir." + "\n" +  "\n" + "Digite 0 para devolverse.", "Supermercado Granada.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                    JOptionPane.showMessageDialog(frame, ListaFacturas.reimprimirFactura(skuFac));
                    break;
                case 6:
                    nombreDeProducto = ((String) JOptionPane.showInputDialog(frame, "Digite el nombre del producto.", "Supermercado Granada.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                    precioProductoNuevo = Integer.parseInt((String) JOptionPane.showInputDialog(frame, "Digite el precio del producto.", "Supermercado Granada.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                    cantidadProductoNuevo = Integer.parseInt((String) JOptionPane.showInputDialog(frame, "Digite la cantidad de productos que habrá en inventario.", "Supermercado Granada.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                    estaActivoPN = Integer.parseInt((String) JOptionPane.showInputDialog(frame, "Digite 1 o 2." + "\n"
                            + "\n" + "1. Ingresar producto activado."
                            + "\n" + "2. Ingresar producto desactivado.", "Supermercado Granada.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                    switch (estaActivoPN) {
                        case 1:
                            estaActivoProductoNuevo = true;
                            break;
                        case 2:
                            estaActivoProductoNuevo = false;
                            break;
                    }
                    estaGravadoPN = Integer.parseInt((String) JOptionPane.showInputDialog(frame, "Digite 1 o 2." + "\n"
                            + "\n" + "1. Ingresar impuesto a este producto."
                            + "\n" + "2. No ingresar impuesto a este producto.", "Supermercado Granada.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                    switch (estaGravadoPN) {
                        case 1:
                            esGravadoProductoNuevo = true;
                            impuestoProductoNuevo = Integer.parseInt((String) JOptionPane.showInputDialog(frame, "Digite el impuesto del producto.", "Supermercado Granada.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                            break;
                        case 2:
                            esGravadoProductoNuevo = false;
                            break;
                    }
                    fechaProductoNuevo = ((String) JOptionPane.showInputDialog(frame, "Digite la fecha.", "Supermercado Granada.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));

                    sku++;
                    ListaProductos.Insertar(sku, nombreDeProducto, precioProductoNuevo, cantidadProductoNuevo, estaActivoProductoNuevo, esGravadoProductoNuevo, 0, fechaProductoNuevo);
                    break;
                case 7:
                    
                    skuDeProductoAModificar = Integer.parseInt((String) JOptionPane.showInputDialog(frame, "Digite el id del producto que desea editar." + "\n" + ListaProductos.ImprimirLista() , "Supermercado Granada.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                    nombreDeProductoModificar = ((String) JOptionPane.showInputDialog(frame, "Digite el nuevo nombre." + "\n" + ListaProductos.ImprimirLista(), "Supermercado Granada.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                    precioProductoModificar = Integer.parseInt((String) JOptionPane.showInputDialog(frame, "Digite el nuevo precio." + "\n" + ListaProductos.ImprimirLista() , "Supermercado Granada.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                    cantidadProductoModificar = Integer.parseInt((String) JOptionPane.showInputDialog(frame, "Digite la nueva cantidad." + "\n" + ListaProductos.ImprimirLista() , "Supermercado Granada.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                    
                    estaActivoPN = Integer.parseInt((String) JOptionPane.showInputDialog(frame, "Digite 1 o 2." + "\n"
                            + "\n" + "1. Ingresar producto activado."
                            + "\n" + "2. Ingresar producto desactivado.", "Supermercado Granada.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                    switch (estaActivoPN) {
                        case 1:
                            estaActivoPNModificar = true;
                            break;
                        case 2:
                            estaActivoPNModificar = false;
                            break;
                    }
                    estaGravadoPN = Integer.parseInt((String) JOptionPane.showInputDialog(frame, "Digite 1 o 2." + "\n"
                            + "\n" + "1. Ingresar impuesto a este producto."
                            + "\n" + "2. No ingresar impuesto a este producto.", "Supermercado Granada.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                    switch (estaGravadoPN) {
                        case 1:
                            impuestoProductoModificar = true;
                            impuestoProductoNuevo = Integer.parseInt((String) JOptionPane.showInputDialog(frame, "Digite el impuesto del producto.", "Supermercado Granada.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                            break;
                        case 2:
                            impuestoProductoModificar = false;
                            break;
                    }
                    fechaProductoNuevo = ((String) JOptionPane.showInputDialog(frame, "Digite la fecha.", "Supermercado Granada.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                    
                    ListaProductos.editarProducto(skuDeProductoAModificar, nombreDeProductoModificar, precioProductoModificar, cantidadProductoModificar, estaActivoPN, estaGravadoPN, fechaProductoModificar);
                    break;
                case 8:
                    sku = Integer.parseInt((String) JOptionPane.showInputDialog(frame, "Digite el id del producto que desea eliminar." + "\n" + ListaProductos.ImprimirLista() , "Supermercado Granada.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                    ListaProductos.EliminarProducto(sku);
                    break;
                case 9:

                    break;
                case 10:
                    break;
            }

        } while (true);
    }
}

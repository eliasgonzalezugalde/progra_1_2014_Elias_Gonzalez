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
public class ListaEstadio {

    private NodoEstadio raiz;

    public ListaEstadio() {
        raiz = null;
    }

    public NodoEstadio getRaiz() {
        return raiz;
    }

    //inserta datos de estadio
    public void Insertar(String nombre, int temperatura, int precipitaciones, int humedad, int viento, int capacidad) {
        NodoEstadio nuevo;
        nuevo = new NodoEstadio();
        nuevo.setNombre(nombre);
        nuevo.setTemperatura(temperatura);
        nuevo.setPrecipitaciones(precipitaciones);
        nuevo.setHumedad(humedad);
        nuevo.setViento(viento);
        nuevo.setCapacidad(capacidad);

        if (raiz == null) {
            nuevo.setSiguiente(null);
            raiz = nuevo;
        } else {
            NodoEstadio auxiliar = raiz;
            while (auxiliar.getSiguiente() != null) {
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }
    }

    //inserta la lista de estadios
    public void InsertarListaDeEstadios(ListaEstadio listaDeEstadios) {
        NodoEstadio nuevo;
        nuevo = new NodoEstadio();
        nuevo.setListaDeEstadios(listaDeEstadios);

        if (raiz == null) {
            nuevo.setSiguiente(null);
            raiz = nuevo;
        } else {
            NodoEstadio auxiliar = raiz;
            while (auxiliar.getSiguiente() != null) {
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }
    }

    //modifica datos de estadio
    public void modificarEstadio(String nombreAModificarEstadio, String nuevoNombreEstadio, int nuevaTemperatura, int nuevaPrecipitaciones, int nuevaHumedad, int nuevoViento, int nuevaCapacidad) {
        NodoEstadio recorrido = raiz;

        String nombreAModificarEstadioMinuscula = nombreAModificarEstadio.toLowerCase();

        while (recorrido != null) {

            if (nombreAModificarEstadioMinuscula.equals(recorrido.getNombre().toLowerCase())) {
                recorrido.setNombre(nuevoNombreEstadio);
                recorrido.setTemperatura(nuevaTemperatura);
                recorrido.setPrecipitaciones(nuevaPrecipitaciones);
                recorrido.setHumedad(nuevaHumedad);
                recorrido.setViento(nuevoViento);
                recorrido.setCapacidad(nuevaCapacidad);
            }
            recorrido = recorrido.getSiguiente();
        }
    }

    //imprime los datos de estadios
    public String mostrarDatosDeEstadio(String nombreAModificarEstadio) {
        NodoEstadio recorrido = raiz;

        String nombreAModificarEstadioMinuscula = nombreAModificarEstadio.toLowerCase();
        String datoDeEstadio = "";

        while (recorrido != null) {

            if (nombreAModificarEstadioMinuscula.equals(recorrido.getNombre().toLowerCase())) {

                datoDeEstadio += recorrido.getNombre()
                        + "\n" + "\n" + "Temperatura: " + recorrido.getTemperatura()
                        + "° C." + "\n" + "Precipitaciones: " + recorrido.getPrecipitaciones()
                        + "%." + "\n" + "Humedad: " + recorrido.getHumedad()
                        + "%." + "\n" + "Viento: " + recorrido.getViento()
                        + " km/h." + "\n" + "Capacidad: " + recorrido.getCapacidad() + " personas.";

            }
            recorrido = recorrido.getSiguiente();
        }
        return datoDeEstadio;
    }
    
    //imprime lista de estadios
    public String ImprimirLista() {
        NodoEstadio recorrido = raiz;
        String ListaDeEstadios = "";
        int cont = 1;
        recorrido = raiz;
        while (recorrido != null) {
            ListaDeEstadios += cont + ". " + recorrido.getNombre() + "\n";
            recorrido = recorrido.getSiguiente();
            cont++;
        }
        return ListaDeEstadios;
    }
    //imprime la lista de estadios sin numeros, para cuando se pide buscar estadio por nombre
    public String ImprimirListaSinNumeros() {
        NodoEstadio recorrido = raiz;
        String ListaDeEstadios = "";
        recorrido = raiz;
        while (recorrido != null) {
            ListaDeEstadios += recorrido.getNombre() + "\n";
            recorrido = recorrido.getSiguiente();
        }
        return ListaDeEstadios;
    }
    
    //imprime la informacion de estadios
    public String Imprimir(int opt) {
        NodoEstadio recorrido = raiz;
        String datoDeEstadio = "";

        int cont = 1;

        while (recorrido != null) {
            if (cont == opt) {
                datoDeEstadio += recorrido.getNombre()
                        + "\n" + "\n" + "Temperatura: " + recorrido.getTemperatura()
                        + "° C." + "\n" + "Precipitaciones: " + recorrido.getPrecipitaciones()
                        + "%." + "\n" + "Humedad: " + recorrido.getHumedad()
                        + "%." + "\n" + "Viento: " + recorrido.getViento()
                        + " km/h." + "\n" + "Capacidad: " + recorrido.getCapacidad() + " personas.";
            }
            recorrido = recorrido.getSiguiente();
            cont++;
        }

        return datoDeEstadio;
    }
    
    //verifica si un estadio existe
    public boolean buscarEstadio(String nombreAModificarEstadio) {
        NodoEstadio recorrido = raiz;

        String nombreAModificarEstadioMinuscula = nombreAModificarEstadio.toLowerCase();

        //NodoJugador siguienteJugador = raiz;
        while (recorrido != null) {

            if (nombreAModificarEstadioMinuscula.equals(recorrido.getNombre().toLowerCase())) {
                return true;
            }
            recorrido = recorrido.getSiguiente();
        }
        return false;
    }

}

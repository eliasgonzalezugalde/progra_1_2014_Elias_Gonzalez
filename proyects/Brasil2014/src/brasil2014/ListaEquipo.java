/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brasil2014;

import javax.swing.JOptionPane;

/**
 *
 * @author Elías González <eliasgonzalezugalde@gmail.com>
 */
public class ListaEquipo {

    private NodoEquipo raiz;
    private int cantidad;

    public ListaEquipo() {
        this.cantidad = 4;
        raiz = null;
    }
    
    //sube la cantidad de jugadores del array
    public void subirCantidad() {
        cantidad++;
    }
    
    //baja la cantidad de jugadores del array
    public void bajarCantidad() {
        cantidad--;
    }

    public NodoEquipo getRaiz() {
        return raiz;
    }   
    
    //inseta los datos de equipo
    public void Insertar(String nombre, ListaJugador jugadores, int partidosJugados, int partidosGanados, int partidosEmpatados, int partidosPerdidos, int golesAFavor, int golesEnContra, int diferenciaDeGol, int puntos) {
        NodoEquipo nuevo;
        nuevo = new NodoEquipo();
        nuevo.setNombre(nombre);
        nuevo.setJugadores(jugadores);
        nuevo.setPartidosJugados(partidosJugados);
        nuevo.setPartidosGanados(partidosGanados);
        nuevo.setPartidosEmpatados(partidosEmpatados);
        nuevo.setPartidosPerdidos(partidosPerdidos);
        nuevo.setGolesAFavor(golesAFavor);
        nuevo.setGolesEnContra(golesEnContra);
        nuevo.setDiferenciaDeGol(diferenciaDeGol);
        nuevo.setPuntos(puntos);

        if (raiz == null) {
            nuevo.setSiguiente(null);
            raiz = nuevo;
        } else {
            NodoEquipo auxiliar = raiz;
            while (auxiliar.getSiguiente() != null) {
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }
    }
    
    //imprime lista de equipos
    public String ImprimirLista() {
        NodoEquipo recorrido = raiz;
        int cont = 1;
        String ListaDeEquipos = "";
        recorrido = raiz;
        while (recorrido != null) {
            ListaDeEquipos += cont + ". " + recorrido.getNombre() + "\n";
            recorrido = recorrido.getSiguiente();
            cont++;
        }
        return ListaDeEquipos;
    }
    
    //imprime jugadores de equipo
    public String imprimir(int opt) {
        NodoEquipo recorrido = raiz;
        int cont = 1;

        String nombreDeJugadores = "";
        String cadena = "";

        while (recorrido != null) {
            if (cont == opt) { //cuando encuentro el equipo que busco, saco la lista de jugadores de ese equipo 

                NodoJugador recorrido2 = recorrido.getJugadores().getRaiz(); //en lugar de hacer new, tomo la lista de mi nodo de la lista de equipos

                while (recorrido2 != null) { //recorro la lista de jugadores
                    cadena = recorrido.getNombre() + "\n" + "\n";
                    nombreDeJugadores += recorrido2.getNombre() + " " + recorrido2.getApellido1() + " " + recorrido2.getApellido2() + " " + "- Edad: " + recorrido2.getEdad() + "\n"; //voy concatenando
                    recorrido2 = recorrido2.getSiguiente();
                }
                return cadena + nombreDeJugadores; //retorno el string que tiene los nombres de los jugadores OJO: Al hacer return, el metodo termina, por lo tanto no sigue con el siguiente nodo de recorrido
            }
            recorrido = recorrido.getSiguiente();
            cont++;
        }
        cadena += "\n" + "\n" + nombreDeJugadores;
        return cadena;
    }
    
    //imprimir jugador mas joven
    public String imprimirJugadorMasJoven(int opt) {
        NodoEquipo recorrido = raiz; //es porque los jugadores es una sublista del equipo
        int cont = 1; //contador que verifica el numero del equipo digitado
        int contJugadores = 0;

        NodoJugador[] arrayJugadores = new NodoJugador[cantidad];

        String jugador = "";

        while (recorrido != null) { //recorro la lista de equipos
            if (cont == opt) { //cuando encuentro el equipo que busco, saco la lista de jugadores de ese equipo 

                NodoJugador recorrido2 = recorrido.getJugadores().getRaiz(); //en lugar de hacer new, tomo la lista de mi nodo de la lista de equipos

                while (recorrido2 != null) { //recorro la lista de jugadores
                    arrayJugadores[contJugadores] = recorrido2;
                    recorrido2 = recorrido2.getSiguiente();
                    contJugadores++;
                }

            }
            recorrido = recorrido.getSiguiente();
            cont++;
        }

        //ordenamiento de los goleadores
        //ordenamiento burbuja
        int j;
        NodoJugador aux;

        for (int i = 0; i < arrayJugadores.length - 1; i++) {
            for (j = 0; j < arrayJugadores.length - i - 1; j++) {
                //ordeno por los goles de cada jugador, de MAYOR a MENOR (>)
                if (arrayJugadores[j + 1].getEdad() < arrayJugadores[j].getEdad()) {
                    aux = arrayJugadores[j + 1];
                    arrayJugadores[j + 1] = arrayJugadores[j];
                    arrayJugadores[j] = aux;
                }
            }
        }

        //pongo 1 porque solo imprimo 1 jugador: el mas joven
        for (int jugadorMasJoven = 0; jugadorMasJoven < 1; jugadorMasJoven++) {
            jugador += arrayJugadores[jugadorMasJoven].getNombre() + " " + arrayJugadores[jugadorMasJoven].getApellido1() + " " + " Edad: " + arrayJugadores[jugadorMasJoven].getEdad()+ "\n";
        }

        return jugador;
    }

    public String imprimirJugadorMasViejo(int opt) {
        NodoEquipo recorrido = raiz;
        int cont = 1;
        int contJugadores = 0;

        NodoJugador[] arrayJugadores = new NodoJugador[cantidad];

        String jugador = "";

        while (recorrido != null) { //recorro la lista de equipos
            if (cont == opt) { //cuando encuentro el equipo que busco, saco la lista de jugadores de ese equipo 

                NodoJugador recorrido2 = recorrido.getJugadores().getRaiz(); //en lugar de hacer new, tomo la lista de mi nodo de la lista de equipos

                while (recorrido2 != null) { //recorro la lista de jugadores
                    arrayJugadores[contJugadores] = recorrido2;
                    recorrido2 = recorrido2.getSiguiente();
                    contJugadores++;
                }

            }
            recorrido = recorrido.getSiguiente();
            cont++;
        }

        //ordenamiento de los goleadores
        //ordenamiento burbuja
        int j;
        NodoJugador aux;

        for (int i = 0; i < arrayJugadores.length - 1; i++) {
            for (j = 0; j < arrayJugadores.length - i - 1; j++) {
                //ordeno por los goles de cada jugador, de MAYOR a MENOR (>)
                if (arrayJugadores[j + 1].getEdad() > arrayJugadores[j].getEdad()) {
                    aux = arrayJugadores[j + 1];
                    arrayJugadores[j + 1] = arrayJugadores[j];
                    arrayJugadores[j] = aux;
                }
            }
        }

        //pongo 1 porque solo imprimo 1 jugador: el mas viejo
        for (int jugadorMasJoven = 0; jugadorMasJoven < 1; jugadorMasJoven++) {
            jugador += arrayJugadores[jugadorMasJoven].getNombre() + " " + arrayJugadores[jugadorMasJoven].getApellido1() + " " + " Edad: " + arrayJugadores[jugadorMasJoven].getEdad()+ "\n";
        }

        return jugador;
    }
    
    //busca y verifica si el jugador existe o no
    public boolean buscarJugador(String nombreAModificar, String nombreAEliminar) {
        NodoEquipo recorrido = raiz; //es porque los jugadores es una sublista del equipo
        //en lugar de hacer new, tomo la lista de mi nodo de la lista de equipos

        String nombreAModificarMinuscula = nombreAModificar.toLowerCase();
        String nombreAEliminarMinuscula = nombreAEliminar.toLowerCase();

        while (recorrido != null) {
            NodoJugador recorrido2 = recorrido.getJugadores().getRaiz();
            while (recorrido2 != null) {

                if (nombreAModificarMinuscula.equals(recorrido2.getNombre().toLowerCase()) || nombreAEliminarMinuscula.equals(recorrido2.getNombre().toLowerCase()) ) {
                    return true;
                }
                recorrido2 = recorrido2.getSiguiente();
            }
            recorrido = recorrido.getSiguiente();
        }
        return false;
    }

}

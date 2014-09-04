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
public class ListaGrupo {

    private NodoGrupo raiz;
    private int cantidad;

    public ListaGrupo() {
        this.cantidad = 128;
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
    
    //metodo insertar datos de grupos
    public void Insertar(String nombre, ListaCalendario listaDeCalendario, ListaEquipo ListaDeEquipos) {
        NodoGrupo nuevo;
        nuevo = new NodoGrupo();
        nuevo.setNombre(nombre);
        nuevo.setListaDeCalentarios(listaDeCalendario);
        nuevo.setListaEquipo(ListaDeEquipos);

        if (raiz == null) {
            nuevo.setSiguiente(null);
            raiz = nuevo;
        } else {
            NodoGrupo auxiliar = raiz;
            while (auxiliar.getSiguiente() != null) {
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }
    }
    
    //imprime la lista de grupos
    public String ImprimirLista() {
        NodoGrupo recorrido = raiz;
        String ListaDeGrupos = "";
        recorrido = raiz;
        while (recorrido != null) {
            ListaDeGrupos += recorrido.getNombre() + "\n";
            recorrido = recorrido.getSiguiente();
        }
        return ListaDeGrupos;
    }
    
    //imprime informacion de los grupos
    public String Imprimir(int opt) {
        NodoGrupo recorrido = raiz; //es porque los jugadores es una sublista del equipo
        int cont = 1;
        int contEquipos = 0;

        String nombreDeEquipos = "";
        String partidos = "";
        String cadena = "";

        while (recorrido != null) { //recorro la lista de equipos

            NodoCalendario recorridoCalendario = recorrido.getListaDeCalentarios().getRaiz(); //GRACIAS AQUI TENGO Q METER UN BTN DE CALENDARIOS//////////////////////////////////////////////

            //NodoEstadio recorridoEstadios = recorridoCalendario.ge
            if (cont == opt) { //cuando encuentro el equipo que busco, saco la lista de jugadores de ese equipo

                NodoEquipo recorridoEquipo = recorrido.getListaEquipo().getRaiz();

                while (recorridoEquipo != null) { //recorro la lista de jugadores

                    if (contEquipos == 0) {
                        partidos += recorridoEquipo.getNombre() + " vs ";
                    }
                    if (contEquipos == 1) {
                        partidos += recorridoEquipo.getNombre() + "\n";
                        partidos += recorridoCalendario.getGolesEquipo1() + " x " + recorridoCalendario.getGolesEquipo2()
                                + "\n" + "Fecha: " + recorridoCalendario.getFecha()
                                + "\n" + "Hora: " + recorridoCalendario.getHora()
                                + "\n" + "Estadio: " + recorridoCalendario.getCede()
                                + "\n" + "Temperatura máxima: " + recorridoCalendario.getTemperaturaMaxima()
                                + "\n" + "Temperatura mínima: " + recorridoCalendario.getTemperaturaMinima()
                                + "\n" + "Humedad: " + recorridoCalendario.getHumedad()
                                + "\n" + "Viento: " + recorridoCalendario.getViento()
                                + "\n" + "\n"; //espacios que separan los 2 calendarios
                        recorridoCalendario = recorridoCalendario.getSiguiente();
                    }

                    if (contEquipos == 2) {
                        partidos += recorridoEquipo.getNombre() + " vs ";
                    }
                    if (contEquipos == 3) {
                        partidos += recorridoEquipo.getNombre() + "\n";
                        partidos += recorridoCalendario.getGolesEquipo1() + " x " + recorridoCalendario.getGolesEquipo2()
                                + "\n" + "Fecha: " + recorridoCalendario.getFecha()
                                + "\n" + "Hora: " + recorridoCalendario.getHora()
                                + "\n" + "Estadio: " + recorridoCalendario.getCede()
                                + "\n" + "Temperatura máxima: " + recorridoCalendario.getTemperaturaMaxima()
                                + "\n" + "Temperatura mínima: " + recorridoCalendario.getTemperaturaMinima()
                                + "\n" + "Humedad: " + recorridoCalendario.getHumedad()
                                + "\n" + "Viento: " + recorridoCalendario.getViento();
                    }

                    contEquipos++;

                    nombreDeEquipos += recorridoEquipo.getNombre() + "\n";
                    recorridoEquipo = recorridoEquipo.getSiguiente();
                }

                cadena = recorrido.getNombre() + "\n" + "\n" + nombreDeEquipos + "\n";
                //retorno el string que tiene los nombres de los jugadores OJO: Al hacer return, el metodo termina, por lo tanto no sigue con el siguiente nodo de recorrido

            }
            recorrido = recorrido.getSiguiente();
            cont++;
        }
        cadena += partidos;
        return cadena;
    }
    
    //imprime lista de partidos
    public String imprimeListaDePartidos() {
        NodoGrupo recorrido = raiz;
        int cont = 1;
        int contEquipos = 0;

        String partidos = "";

        while (recorrido != null) {

            NodoCalendario recorridoCalendario = recorrido.getListaDeCalentarios().getRaiz();

            NodoEquipo recorridoEquipo = recorrido.getListaEquipo().getRaiz();

            while (recorridoEquipo != null) {

                switch (contEquipos) {
                    case 0:
                        partidos += "1. " + recorridoEquipo.getNombre() + " vs ";
                        break;
                    case 1:
                        partidos += recorridoEquipo.getNombre() + "\n";
                        recorridoCalendario = recorridoCalendario.getSiguiente();
                        break;
                    case 2:
                        partidos += contEquipos + ". " + recorridoEquipo.getNombre() + " vs ";
                        break;
                    case 3:
                        partidos += recorridoEquipo.getNombre() + "\n";
                        recorridoCalendario = recorridoCalendario.getSiguiente();
                        break;
                    case 4:
                        partidos += "3. " + recorridoEquipo.getNombre() + " vs ";
                        break;
                    case 5:
                        partidos += recorridoEquipo.getNombre() + "\n";
                        recorridoCalendario = recorridoCalendario.getSiguiente();
                        break;
                    case 6:
                        partidos += "4. " + recorridoEquipo.getNombre() + " vs ";
                        break;
                    case 7:
                        partidos += recorridoEquipo.getNombre() + "\n";
                        recorridoCalendario = recorridoCalendario.getSiguiente();
                        break;
                    case 8:
                        partidos += "5. " + recorridoEquipo.getNombre() + " vs ";
                        break;
                    case 9:
                        partidos += recorridoEquipo.getNombre() + "\n";
                        recorridoCalendario = recorridoCalendario.getSiguiente();
                        break;
                    case 10:
                        partidos += "6. " + recorridoEquipo.getNombre() + " vs ";
                        break;
                    case 11:
                        partidos += recorridoEquipo.getNombre() + "\n";
                        recorridoCalendario = recorridoCalendario.getSiguiente();
                        break;
                    case 12:
                        partidos += "7. " + recorridoEquipo.getNombre() + " vs ";
                        break;
                    case 13:
                        partidos += recorridoEquipo.getNombre() + "\n";
                        recorridoCalendario = recorridoCalendario.getSiguiente();
                        break;
                    case 14:
                        partidos += "8. " + recorridoEquipo.getNombre() + " vs ";
                        break;
                    case 15:
                        partidos += recorridoEquipo.getNombre() + "\n";
                        recorridoCalendario = recorridoCalendario.getSiguiente();
                        break;
                    case 16:
                        partidos += "9. " + recorridoEquipo.getNombre() + " vs ";
                        break;
                    case 17:
                        partidos += recorridoEquipo.getNombre() + "\n";
                        recorridoCalendario = recorridoCalendario.getSiguiente();
                        break;
                    case 18:
                        partidos += "10. " + recorridoEquipo.getNombre() + " vs ";
                        break;
                    case 19:
                        partidos += recorridoEquipo.getNombre() + "\n";
                        recorridoCalendario = recorridoCalendario.getSiguiente();
                        break;
                    case 20:
                        partidos += "11. " + recorridoEquipo.getNombre() + " vs ";
                        break;
                    case 21:
                        partidos += recorridoEquipo.getNombre() + "\n";
                        recorridoCalendario = recorridoCalendario.getSiguiente();
                        break;
                    case 22:
                        partidos += "12. " + recorridoEquipo.getNombre() + " vs ";
                        break;
                    case 23:
                        partidos += recorridoEquipo.getNombre() + "\n";
                        recorridoCalendario = recorridoCalendario.getSiguiente();
                        break;
                    case 24:
                        partidos += "13. " + recorridoEquipo.getNombre() + " vs ";
                        break;
                    case 25:
                        partidos += recorridoEquipo.getNombre() + "\n";
                        recorridoCalendario = recorridoCalendario.getSiguiente();
                        break;
                    case 26:
                        partidos += "14. " + recorridoEquipo.getNombre() + " vs ";
                        break;
                    case 27:
                        partidos += recorridoEquipo.getNombre() + "\n";
                        recorridoCalendario = recorridoCalendario.getSiguiente();
                        break;
                    case 28:
                        partidos += "15. " + recorridoEquipo.getNombre() + " vs ";
                        break;
                    case 29:
                        partidos += recorridoEquipo.getNombre() + "\n";
                        recorridoCalendario = recorridoCalendario.getSiguiente();
                        break;
                    case 30:
                        partidos += "16. " + recorridoEquipo.getNombre() + " vs ";
                        break;
                    case 31:
                        partidos += recorridoEquipo.getNombre() + "\n";
                        recorridoCalendario = recorridoCalendario.getSiguiente();
                }

                contEquipos++;

                recorridoEquipo = recorridoEquipo.getSiguiente();
            }

            recorrido = recorrido.getSiguiente();

        }
        return partidos;
    }
    
    //imprime los resultados de los partidos
    public String imprimeResultadosPartidos(int opt) {
        NodoGrupo recorrido = raiz;
        int cont = 1;

        String resutado = "";

        while (recorrido != null) {

            NodoCalendario recorridoCalendario = recorrido.getListaDeCalentarios().getRaiz();

            while (recorridoCalendario != null) {
                if (cont == opt) {
                    resutado += recorridoCalendario.getGolesEquipo1() + " x " + recorridoCalendario.getGolesEquipo2();
                }
                cont++;
                recorridoCalendario = recorridoCalendario.getSiguiente();
            }

            recorrido = recorrido.getSiguiente();
            

        }
        return resutado;
    }
    
    //imprime la tabla de posiciones
    public String ImprimirTablaDePosiciones(int opt) {
        NodoGrupo recorrido = raiz;
        recorrido = raiz;

        int cont = 1;

        String cadena = "";

        while (recorrido != null) { //recorro la lista de grupos
            if (cont == opt) {
                NodoEquipo recorridoEquipo = recorrido.getListaEquipo().getRaiz();
                while (recorridoEquipo != null) { //recorro la lista de equipos

                    cadena += recorridoEquipo.getNombre() + "\n " + "PJ: " + recorridoEquipo.getPartidosJugados() + "           G: " + recorridoEquipo.getPartidosGanados() + "         E: " + recorridoEquipo.getPartidosEmpatados() + "           P: " + recorridoEquipo.getPartidosPerdidos() + "            GF: " + recorridoEquipo.getGolesAFavor() + "            GC: " + recorridoEquipo.getGolesEnContra() + "          +/- " + recorridoEquipo.getDiferenciaDeGol() + "            Pts: " + recorridoEquipo.getPuntos() + "            \n" + "\n";

                    recorridoEquipo = recorridoEquipo.getSiguiente();
                }
            }
            cont++;
            recorrido = recorrido.getSiguiente();
        }
        return cadena;
    }
    
    //imprime los goleadores
    public String imprimirGoleadores() {
        NodoGrupo recorrido = raiz;
        recorrido = raiz;

        //arreglo de tipo NodoJugador
        //tengo q comprobar la cantidad de jugadores que hay antes de crear el array
        NodoJugador[] arrayJugadores = new NodoJugador[cantidad];

        int cont = 0;

        String goleadores = "";

        while (recorrido != null) { //recorro la lista de grupos

            NodoEquipo recorridoEquipo = recorrido.getListaEquipo().getRaiz();
            while (recorridoEquipo != null) { //recorro la lista de equipos

                NodoJugador recorridoJugadores = recorridoEquipo.getJugadores().getRaiz();
                while (recorridoJugadores != null) { //recorro la lista de jugadores

                    arrayJugadores[cont] = recorridoJugadores;  //esto es cada jugador, lo tien que insertar en el arreglo

                    recorridoJugadores = recorridoJugadores.getSiguiente();

                    cont++;
                }

                recorridoEquipo = recorridoEquipo.getSiguiente();
            }
            recorrido = recorrido.getSiguiente();
        }

        //ordenamiento de los goleadores
        //ordenamiento burbuja
        int j;
        NodoJugador aux;

        for (int i = 0; i < arrayJugadores.length - 1; i++) {
            for (j = 0; j < arrayJugadores.length - i - 1; j++) {
                //ordeno por los goles de cada jugador, de MAYOR a MENOR (>)
                if (arrayJugadores[j + 1].getGoles() > arrayJugadores[j].getGoles()) {
                    aux = arrayJugadores[j + 1];
                    arrayJugadores[j + 1] = arrayJugadores[j];
                    arrayJugadores[j] = aux;
                }
            }
        }

        // pongo 5 porque son 5 los jugadores que quiero que aparezcan en la lista de goleadores
        for (int listaDeGoleadores = 0; listaDeGoleadores < 5; listaDeGoleadores++) {
            goleadores += arrayJugadores[listaDeGoleadores].getNombre() + " " + arrayJugadores[listaDeGoleadores].getApellido1() + " " + " Goles: " + arrayJugadores[listaDeGoleadores].getGoles() + "\n";
        }

        return goleadores;
        //ordenar arreglo
    }

}

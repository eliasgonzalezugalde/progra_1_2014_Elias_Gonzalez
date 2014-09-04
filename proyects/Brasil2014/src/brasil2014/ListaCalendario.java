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
public class ListaCalendario {

    private NodoCalendario raiz;

    public ListaCalendario() {
        raiz = null;
    }

    public NodoCalendario getRaiz() {
        return raiz;
    }
    
    //inserta datos de dalendarios
    public void Insertar(String fecha, String hora, String humedad, String viento, String temperaturaMinima, String temperaturaMaxima, int golesEquipo1, int golesEquipo2, String cede) {
        NodoCalendario nuevo;
        nuevo = new NodoCalendario();
        nuevo.setFecha(fecha);
        nuevo.setHora(hora);
        nuevo.setHumedad(humedad);
        nuevo.setViento(viento);
        nuevo.setTemperaturaMinima(temperaturaMinima);
        nuevo.setTemperaturaMaxima(temperaturaMaxima);
        nuevo.setGolesEquipo1(golesEquipo1);
        nuevo.setGolesEquipo2(golesEquipo2);
        nuevo.setCede(cede);

        if (raiz == null) {
            nuevo.setSiguiente(null);
            raiz = nuevo;
        } else {
            NodoCalendario auxiliar = raiz;
            while (auxiliar.getSiguiente() != null) {
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }
    }
    
    //imprime la lista de calendarios
    public String ImprimirLista() {
        NodoCalendario recorrido = raiz;
        String ListaDeEquipos = "";
        recorrido = raiz;
        while (recorrido != null) {
            //ListaDeEquipos += recorrido.getNombre() + "\n";
            recorrido = recorrido.getSiguiente();
        }
        return ListaDeEquipos;
    }
}

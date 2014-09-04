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
public class ListaJugador {
    
    private NodoJugador raiz;
    
    public ListaJugador() {
        raiz = null;
    }

    public NodoJugador getRaiz() {
        return raiz;
    }
    
    //inserta datos de jugadores
    public void Insertar(String nombre, String apellido1, String apelllido2, int edad, int goles) {
        NodoJugador nuevo;
        nuevo = new NodoJugador();
        nuevo.setNombre(nombre);
        nuevo.setApellido1(apellido1);
        nuevo.setApellido2(apelllido2);
        nuevo.setEdad(edad);
        nuevo.setGoles(goles);

        if (raiz == null) {
            nuevo.setSiguiente(null);
            raiz = nuevo;
        } else {
            NodoJugador auxiliar = raiz;
            while (auxiliar.getSiguiente() != null) {
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }
    }
    
    //modifica jugadores
    public void ModificarJugador(String nombreAModificar,String nuevoNombre, String nuevoApellido1, String nuevoApellido2, int nuevaEdad, int nuevosGoles)
    {
        NodoJugador siguienteJugador = raiz;
        
        String nombreAModificarMinuscula = nombreAModificar.toLowerCase();
        
        while (siguienteJugador != null) 
        {
            if (nombreAModificarMinuscula.equals(siguienteJugador.getNombre().toLowerCase())) 
            {
                siguienteJugador.setNombre(nuevoNombre);
                siguienteJugador.setApellido1(nuevoApellido1);
                siguienteJugador.setApellido2(nuevoApellido2);
                siguienteJugador.setEdad(nuevaEdad);
                siguienteJugador.setGoles(nuevosGoles);
            }
            siguienteJugador = siguienteJugador.getSiguiente();
        }
    }
    
    //elimina jugadores
    public void EliminarJugador(String nombre) {
        NodoJugador siguienteJugador = raiz;
        NodoJugador anterior = siguienteJugador;
        
        String nombreMinuscula = nombre.toLowerCase();

        if (siguienteJugador == null) {
            JOptionPane.showInputDialog(null, "La lista de jugadores esta vacía.");
            return;
        }
        
        while (siguienteJugador != null) 
        {
            if (nombreMinuscula.equals(siguienteJugador.getNombre().toLowerCase())) 
            {
                if (siguienteJugador == raiz) 
                {
                    raiz = siguienteJugador.getSiguiente();
                    return;
                }
                
                anterior.setSiguiente(siguienteJugador.getSiguiente());
                return;
            }
            anterior = siguienteJugador;
            siguienteJugador = siguienteJugador.getSiguiente();
        }
    }
    
}

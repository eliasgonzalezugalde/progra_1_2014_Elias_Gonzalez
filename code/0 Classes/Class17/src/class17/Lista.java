/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class17;

import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class lista {

    private nodoDeLista raiz;

    public lista() {
        raiz = null;
    }

    public void Insertar(String dato, String CuentaBancaria) {
        nodoDeLista nuevo;
        nuevo = new nodoDeLista();
        nuevo.setDato(dato);
        nuevo.setCuentaBancaria(CuentaBancaria);
        if (raiz == null) {
            nuevo.setSiguente(null);
            raiz = nuevo;
        } else {
            nodoDeLista auxiliar = raiz;
            while (auxiliar.getSiguente() != null) {
                auxiliar = auxiliar.getSiguente();
            }
            auxiliar.setSiguente(nuevo);
        }
    }

    public void Imprimir() {
        nodoDeLista recorrido = raiz;
        System.out.println("Lista de todos los elementos de la lista.");
        while (recorrido != null) {
            System.out.println(recorrido.getDato() + " , la cueta bancaria es " + recorrido.getCuentaBancaria());
            recorrido = recorrido.getSiguente();
        }
        System.out.println();
    }

    public boolean Estavacia() {
        if (raiz == null) {
            return true;
        }
        return false;
    }

    public void eliminar() { //anterior siempre va a ser raiz
        nodoDeLista recorrido = raiz;
        String eliminar;
        Scanner oScan = new Scanner(System.in);
        System.out.println("Digite el nombre que desea eliminar.");
        eliminar = oScan.next(recorrido.getDato());

        while (recorrido != null) {
            if (recorrido.getDato() == eliminar) {
                recorrido = recorrido.getSiguente();
            }
        }

    }

    public void eliminarInicio() {
    }

    public void eliminarFinal() { //ultimo.getsiguiente = null //decirle que NO HAY ULTIMO
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class_19;

/**
 *
 * @author Estudiante
 */
public class pila {
    
    private nodoDeLista raiz;
    
    public pila() {
        raiz=null;
    }
    
    public void Push(String dato){
        nodoDeLista nuevo;
        nuevo = new nodoDeLista();
        nuevo.setDato(dato);
        if (raiz==null) {
            nuevo.setSiguente(null);
            raiz=nuevo;            
        } else {
            nuevo.setSiguente(raiz);
            raiz=nuevo;
        }
    }
    
    public Object Pop() {
        if (raiz==null) {
            Object info = raiz.getDato();
            raiz=raiz.getSiguente();
            return info;
        }
        return new Object();
    }
    
    public void imprimir() {
        nodoDeLista recorrido = raiz;
        System.out.println("Listado de todos los elementos de la lista.");
        while(recorrido != null) {
            System.out.println(recorrido.getDato()+"-");
            recorrido = recorrido.getSiguente();
        }
        System.out.println();
    }
    
    public boolean Vacia() {
        if (raiz==null) {
            return true;
        }
            return false;
    }
    
    public int cantidad() {
        int cantidad=0;
        nodoDeLista recorrido=raiz;
        while(recorrido!=null) {
            cantidad++;
            recorrido=recorrido.getSiguente();
        }
        return cantidad;
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class_19;

/**
 *
 * @author Estudiante
 */
public class class_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        pila oPila = new pila();
        oPila.Push("Efren");
        oPila.Push("Joss");
        oPila.Push("Andrey");
        oPila.Push("Jose");
        oPila.imprimir();
        System.out.println("La cantidad de elementos es: "+oPila.cantidad()+".");
        
        if (!oPila.Vacia())
            System.out.println("La pila no esta vacía.");
        else
            System.out.println("Las pila esta vacía.");
        
        oPila.Pop();
        oPila.Pop();
        oPila.imprimir();
    }
}

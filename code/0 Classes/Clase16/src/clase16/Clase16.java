/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase16;

/**
 *
 * @author ideli_000
 */
public class Clase16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] arreglo={"Mario","Efren","Susana","Campbell","Agustin","Elias"};
        String[] arreglo2={"Mario","Efren","Susana","Campbell","Agustin","Elias"};
        
        BusquedaLineal bl = new BusquedaLineal();
        System.out.println("La busqueda lineal es: "+bl.BuscarNombre(arreglo, "Efren")); //va a buscar efren
        System.out.println();
        
        BusquedaBinaria bb = new BusquedaBinaria();
        
        System.out.println("La busqueda lineal es: "+bb.BuscarNombre(arreglo, "Efren")); //va a buscar efren
        System.out.println();
        
        
    }
    
}

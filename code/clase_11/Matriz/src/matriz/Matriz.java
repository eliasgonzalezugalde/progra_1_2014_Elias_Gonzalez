/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ejercicio1 oEjercicio1 = new Ejercicio1();
        oEjercicio1.cargaMatriz();
        oEjercicio1.imprimir();
        
        Ejercicio2 oEjercicio2 = new Ejercicio2();
        oEjercicio2.cargaMatriz();
        oEjercicio2.imprimirDiagonal();
        
        Ejercicio3 oEjercicio3 = new Ejercicio3();
        oEjercicio3.cargaMatriz();
        oEjercicio3.primeraFila();
        oEjercicio3.ultimaFila();
        oEjercicio3.primeraColumna();
        oEjercicio3.ultimaColumna();
        
    }
}

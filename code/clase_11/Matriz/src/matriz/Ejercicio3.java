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
public class Ejercicio3 {
    
    private int[][] matriz;
    private Scanner teclado;
    
    public void cargaMatriz() {
        teclado=new Scanner(System.in);
        matriz=new int[4][4];
        
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 4; c++) {
                System.out.println("Ingrese el número correspondiente.");
                matriz[f][c]=teclado.nextInt();
            }
        } 
    }
    
    public void primeraFila() {
        System.out.println("Primera fila de la matriz.");
        for (int c = 0; c < 4; c++) {
            System.out.println(matriz[0][c]);
        }
    }
    
    public void ultimaFila() {
        System.out.println("Última fila de la matriz.");
        for (int c = 0; c < 4; c++) {
            System.out.println(matriz[2][c]);
        }
    }
    
    public void primeraColumna() {
        System.out.println("Primer columna de la matriz.");
        for (int f = 0; f < 3; f++) {
            System.out.println(matriz[f][0]);
        }
    }
    
    public void ultimaColumna() {
        System.out.println("Última columna de la matriz.");
        for (int f = 0; f < 3; f++) {
            System.out.println(matriz[f][3]);
        }
    }
    
}

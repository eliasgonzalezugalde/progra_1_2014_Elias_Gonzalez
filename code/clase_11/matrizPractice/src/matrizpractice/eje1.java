/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizpractice;

import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class eje1 {
    
    private int[][] matriz;
    private Scanner teclado;
    
    public void cargaMatriz() {
        teclado=new Scanner(System.in);
        matriz=new int[3][5];
        
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.println("Ingrese el número correspondiente.");
                matriz[f][c]=teclado.nextInt();
            }
        } 
    }
    
    public void imprimir() {
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(matriz[f][c] +" ");
            }
            System.out.println();
        }
    }
    
}

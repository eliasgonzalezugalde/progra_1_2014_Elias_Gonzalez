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
public class Ejercicio2 {
    
    private int[][] matriz;
    private Scanner teclado;
    
    public void cargaMatriz() {
        teclado=new Scanner(System.in);
        matriz=new int[4][4];
        
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {
                System.out.println("Ingrese el número correspondiente.");
                matriz[f][c]=teclado.nextInt();
            }
        } 
    }
    
    public void imprimirDiagonal() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                
                if(i==j) {
                    System.out.print(matriz[i][i] +" ");
                } else {
                    System.out.print("_" + " ");
                }
            }
            System.out.println();
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class11_practice.matrix;

import java.util.Scanner;

/**
 *
 * @author Jose Pablo Arce Cascante.
 */
public class Exercice1 {

    private int[][] matriz;
    private Scanner teclado;

    public void CargraColumnas() {
        teclado = new Scanner(System.in);
        matriz = new int[2][5];
        int contC = 1, contF = 1;

        for (int c = 0; c < 5; c++) {
            for (int f = 0; f < 2; f++) {
                System.out.println("Ingrese el valor " + contF
                        + " para la columna " + contC + ".");
                matriz[f][c] = teclado.nextInt();
                if (contF == 2) {
                    contF = 0;
                }
                contF += 1;
            }
            contC += 1;
        }
    }

    public void Imprimir() {
        for (int f = 0; f < 2; f++) {

            for (int c = 0; c < 5; c++) {

                System.out.print(matriz[f][c] + " ");
            }
            System.out.println();
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import java.util.Scanner;
import java.util.Random;

public class matrizJugador1 {

    private char matriz[][];
    private int filas = 0;
    private int columnas = 0;
    private int barcosRandom = 0;

    private Scanner teclado;
    
    public matrizJugador1(int filas, int columnas) {
        //se crea la matriz, del largo y ancho que el usuario digitó
        matriz = new char[filas][columnas];
    }

    public void imprimeMatriz() { //imprime la matriz dependiendo de que numero valga matriz[f][c]

        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                if (matriz[f][c] == 2) {
                    System.out.print("*" + " ");
                } else if (matriz[f][c] == 3) {
                    System.out.print("0" + " ");
                } else {
                    System.out.print("_" + " ");
                }
            }
            System.out.println();
        }
    }

    public boolean verifica(int fila, int col) { //devuelve true si hay un barco en la posicion
        
        if (matriz[fila][col] == 1) {
            return true;
        } else {
            return false;
        }
    }

    public void noAcertado(int fila, int col) { //si no acierta se imprime un 0
        matriz[fila][col] = 3;
    }

    public void setBarco(int fila, int col) { //se imprime un _
        matriz[fila][col] = 1;
    }

    public void destruirBarco(int f, int c) { //si acierta se imprime un *
        matriz[f][c] = 2;
    }
    
    //sets y gets
    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public int getBarcosRandom() {
        return barcosRandom;
    }

    public void setBarcosRandom(int barcosRandom) {
        this.barcosRandom = barcosRandom;
    }
}

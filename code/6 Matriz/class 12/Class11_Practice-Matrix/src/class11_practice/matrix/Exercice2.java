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
public class Exercice2 {
    private int[][] matriz;
    private Scanner teclado;
    private int row;
    private  int column;
    
    //Set & get.
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
    
    
    public void CargarMatriz()
    {
        teclado=new Scanner(System.in);
        matriz=new int[getRow()][getColumn()];
        
        for (int f = 0; f < getRow(); f++) {
            for (int c = 0; c < getColumn(); c++) {
                System.out.println("Ingrese el numero correspondiente");
                matriz[f][c]=teclado.nextInt();
            }
        }        
    }
    
    public void Imprimir()
    {
        for (int f = 0; f < getRow(); f++) {
            
            for (int c = 0; c < getColumn(); c++) {
                
                System.out.print(matriz[f][c] +" ");
            }
            System.out.println();
        }        
    } 
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class_9;

import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class Class_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] array1 = new int[8];
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Digite 1 número");
            array1[i]  = sc.nextInt();
        }
        
        practicaArrays opracticaArrays = new practicaArrays();
        
        System.out.println(opracticaArrays.sumaArray(array1));
 
        
    }
}

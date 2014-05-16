/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int cantidad, suma=0;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite el # de impresiones que desea ver");
        cantidad = Integer.parseInt(teclado.nextLine());
        
        /**
         * Ciclo for
         */
        
        for (int i = 0; i <= cantidad; i++) {
            System.out.println(i);
        }
        
        System.out.println("\n" + "Inverso" + "\n");
        
        for (int i = cantidad; i >=0; i--) {
            System.out.println(i);
        }
        
        /**
         * Ciclo while
         */
        
        while(suma<=cantidad)
        {
            System.out.print(suma);
            System.out.print(" - ");
            suma++;
        }
        
        System.out.print("\n");
        suma = cantidad;
        while(suma>=0)
        {
            System.out.print(suma);
            System.out.print(" - ");
            suma--;
        }
        
        /**
         * Ciclo do while
         */
        
        suma = 0;
        
        System.out.print("\n" + "\n");
        
        do
        {
            System.out.print(suma);
            System.out.print(" - ");
            suma++;
            
        }while(suma<=cantidad);
        
        suma=cantidad;
        do
        {
            System.out.print(suma);
            System.out.print(" - ");
            suma++;
            
        }while(suma>=0);
                
    }
}

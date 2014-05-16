/*
 * Name: Elias Gonzalez
 * 
 */
package practice2;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Practice2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        //ejercicio1////////////////////////////////////////////////
        
        int num;

        System.out.println("Digite el # de * que desea ver");
        num = Integer.parseInt(teclado.nextLine());
        
        /**
         * Ciclo for
         */
        
        for (int i = 1; i <= num; i++) {
            System.out.println("*");
        }
        
        //ejercicio2////////////////////////////////////////////////
        
        int n=0, y=0;
        System.out.println("Digite el valor de N");
        n = Integer.parseInt(teclado.nextLine());
        
        System.out.println("Digite el valor de Y");
        y = Integer.parseInt(teclado.nextLine());
        
        for (int i = 0; i <= n; i++) {
            
            if(i%y == 0) //prestar atencion al i, que es el contador
                System.out.println("*");
            else
                System.out.println(i);
        }
        
        //ejercicio3////////////////////////////////////////////////
        
        float vi=0, vf=0, id=0;
        System.out.println("Digite el valor inicial");
        vi = Integer.parseInt(teclado.nextLine());
        
        System.out.println("Digite el valor final");
        vf = Integer.parseInt(teclado.nextLine());
        
        System.out.println("Digite el incremento deseado");
        id = Integer.parseInt(teclado.nextLine());
        
        for (float i = vi; i <= vf; i=i+id) {
            System.out.println(i);
        }
        
        //ejercicio4(no se hace)////////////////////////////////////
        //ejercicio5////////////////////////////////////////////////
        
        float base = 0;
        int exp = 0;
        float resultadoPot=0;
        
        System.out.println("Digite el valor de la base");
        base = Integer.parseInt(teclado.nextLine());
        
        System.out.println("Digite el valor del exponente");
        exp = Integer.parseInt(teclado.nextLine());
        
        for (int i = 0; i < exp; i++) {
            resultadoPot=(base*base)+resultadoPot;
        }
        
        System.out.println(resultadoPot);
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Clase7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner oScanner = new Scanner(System.in);
        
        int opcion=0;
        
        do {
            System.out.println("Digite la opción que desea.");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2"); 
            opcion=oScanner.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Digite su Email");
                    oScanner = new Scanner(System.in);
                    ejercicio1 oejercicio1 = new ejercicio1(oScanner.nextLine());
                    System.out.println(oejercicio1.ValidarCorreo());
                break;
                
                case 2:
                    System.out.println("Digite la cadena a evaluar");
                    ejercicio2 oejercicio2 = new ejercicio2();
                    oScanner = new Scanner(System.in);
                    oejercicio2.setCadena(oScanner.nextLine());
                    System.out.println(oejercicio2.mediaCadena());
                    System.out.println(oejercicio2.ultimoValor());
                    System.out.println(oejercicio2.alRevez());
                    System.out.println(oejercicio2.guion());
                    System.out.println(oejercicio2.Vocales());
                    System.out.println(oejercicio2.palindromo());
                    
                break;
            }
            
        }while(opcion<=7);
        
        
        
    }
}

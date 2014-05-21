/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaswitch;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class PracticaSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //variables
        int mes=0;
        int numeroEntero=0;
        char ultimoNumero;
        int ultimoNumeroComodin=0;
        int numeroEnteroRespuesta=0;
        

        Scanner teclado = new Scanner(System.in);
        
        //Ejercicio1////////////////////////////////////////
  
        System.out.println("Digite el valor del primer número");
        mes= Integer.parseInt(teclado.nextLine());
        
        eje1 eeje1 = new eje1();
        eeje1.mes(mes);
        
        //Ejercicio2////////////////////////////////////////
        
        System.out.println("Digite un número entero");
        numeroEntero= Integer.parseInt(teclado.nextLine());
        System.out.println("Vuelva a digitar el número");
        ultimoNumero=teclado.nextLine().charAt(0);
        
        eje2 eeje2 = new eje2();
        System.out.println(eeje2.operaciones(ultimoNumero, numeroEntero));
        
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase8;

import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class Clase8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        clsVarios v = new clsVarios();
        
        System.out.println("Digite la cadena a evaluar");
        v.setCadena(teclado.nextLine());
        
        System.out.println("Cadena al revez.");
        System.out.println(v.alRevez());
        
        System.out.println("Palindromo.");
        System.out.println(v.palindromo1());
        
        System.out.println("Digite un texto para buscar la cadena que se digitó anteriormente. (Será marcada por un -)");
        v.setTexto(teclado.nextLine());
        System.out.println(v.buscaPalabra());
        
    }
}

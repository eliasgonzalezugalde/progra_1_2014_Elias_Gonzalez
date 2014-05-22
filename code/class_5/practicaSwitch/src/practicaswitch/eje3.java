/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaswitch;

/**
 *
 * @author Elías
 */
public class eje3 {

    public void abcde(char letra) {
        switch (letra) {
            case 'a':
            case 'A':
                System.out.println("Excelente.");
                break;

            case 'b':
            case 'B':
                System.out.println("Bueno.");
                break;

            case 'c':
            case 'C':
                System.out.println("Regular.");
                break;

            case 'd':
            case 'D':
                System.out.println("Malo.");
                break;

            case 'e':
            case 'E':
                System.out.println("Pésimo.");
                break;
            default:
                System.out.println("Se digitó una letra incorrecta o un número.");
        }
    }

}

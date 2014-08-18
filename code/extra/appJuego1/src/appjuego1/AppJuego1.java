/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appjuego1;

import javax.swing.JOptionPane;

/**
 *
 * @author Elías
 */
public class AppJuego1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num;
        int adivina = 0;
        int intentos = 8;
        int Numdintentos = 0;
        
        do {
          JOptionPane.showMessageDialog(null, "The missing number." + '\n' + '\n' + "Instructions:" + '\n' + "First, ask someone to type a random number (from 1 to 50)." + '\n' + "Be sure you don't see that number, it would screw up the game sense." + '\n' + "Then, try to guess which is the number with less than 8 attempts. Good luck.");
          num = Integer.parseInt(JOptionPane.showInputDialog("Type a number (from 1 to 50)."));
        } while(num >50 || num < 0 );
        
        ClsAdivina a = new ClsAdivina(num);
        
        do {
             
        adivina = Integer.parseInt(JOptionPane.showInputDialog("Attempts left: " + intentos + '\n' + "Guess the number."));
        intentos = intentos - 1;
        Numdintentos = Numdintentos + 1;
        
        if ( a.termina(intentos) == true ) {
            JOptionPane.showMessageDialog(null, "You suck!"+ '\n' + "Game over.");
            adivina = num;
        } else {
            if ( a.adivinaNum(adivina) == true ) {
                JOptionPane.showMessageDialog(null, "You rock!" + '\n' + "Attempts: " + Numdintentos);
            } else {
                JOptionPane.showMessageDialog(null, a.Pista(adivina));
            }
        }
        
        } while( a.adivinaNum(adivina)==false );
    }
    
}

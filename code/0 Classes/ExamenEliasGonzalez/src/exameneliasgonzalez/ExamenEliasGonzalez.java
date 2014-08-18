/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exameneliasgonzalez;

import javax.swing.JOptionPane;

/**
 *
 * @author Elías
 */
public class ExamenEliasGonzalez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //variables
        char r = 's';
        clsNumero n = null;
        int opt, num;
        char resp;
        int pot;
        int div;

        do {

            do {
                opt = Integer.parseInt(JOptionPane.showInputDialog("Menú:"
                        + "\n" + "1. Digite un número." + "\n" + "2. Potencia." + "\n" + "3.División." + "\n" + "4.Serie." + "\n" + "5.Salir."));

                switch (opt) {
                    case 1:
                        n = new clsNumero();
                        num = Integer.parseInt(JOptionPane.showInputDialog("Digite el número."));
                        n.setN(num);
                        break;
                    case 2:
                        pot = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para elevar."));
                        JOptionPane.showMessageDialog((null), "La potencia es: " + n.potencia(pot) + ".");
                        break;
                    case 3:
                        div = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para dividir por el número inicial."));
                        JOptionPane.showMessageDialog((null), "La división esta hecha con /. Se que está mala. Disculpe.");
                        JOptionPane.showMessageDialog((null), "La división es: " + n.divideNumero(div) + ".");
                        break;
                    case 4:
                        JOptionPane.showMessageDialog((null), "La secuencia es: " + n.secuencia() + ".");
                        break;
                    case 5:

                        break;

                    default:
                        JOptionPane.showMessageDialog((null), "Error, digite un número del meñu.");
                }
                //loop de las opciones del menu
            } while (opt > 0 && opt < 3);
            
            //loop desea continuar
            resp = JOptionPane.showInputDialog("¿Desea continuar?").charAt(0);
        } while (resp == 'S' || resp == 's');

    }

}

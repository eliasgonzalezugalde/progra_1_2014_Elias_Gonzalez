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
public class eje7 {

    public void mes(int diaMes) {

        if (diaMes > 7) {
            diaMes = diaMes % 7;
        }

        switch (diaMes) {
            case 1:
                System.out.println("Lunes.");
                break;
            case 2:
                System.out.println("Martes.");
                break;
            case 3:
                System.out.println("Miércoles.");
                break;
            case 4:
                System.out.println("Jueves.");
                break;
            case 5:
                System.out.println("Viernes.");
                break;
            case 6:
                System.out.println("Sábado.");
                break;
<<<<<<< HEAD
            case 0:
=======
            case 7:
>>>>>>> 98819e51697fadc063781dd869dce3cc7c3a45e4
                System.out.println("Domingo.");
                break;
        }

    }
}

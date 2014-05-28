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
public class eje4 {

    public void numeroMes(int meseje4, int añoeje4) {

        switch (meseje4) {
            case 1:
                System.out.println("Enero tiene 31 días.");
                break;
            case 2:
                if (añoeje4 % 4 == 0) {
                    System.out.println("Febrero tiene 30 días, en año bisiesto.");
                } else {
                    System.out.println("Febrero tiene 28 días.");
                }
                break;
            case 3:
                System.out.println("Marzo tiene 31 días.");
                break;
            case 4:
                System.out.println("Abril tiene 30 días.");
                break;
            case 5:
                System.out.println("Mayo tiene 31 días.");
                break;
            case 6:
                System.out.println("Junio tiene 30 días.");
                break;
            case 7:
                System.out.println("Julio tiene 31 días.");
                break;
            case 8:
                System.out.println("Agosto tiene 31 días.");
                break;
            case 9:
                System.out.println("Septiembre tiene 31 días.");
                break;
            case 10:
                System.out.println("Octubre tiene 31 días.");
                break;
            case 11:
                System.out.println("Noviembre tiene 30 días.");
                break;
            case 12:
                System.out.println("Diciembre tiene 31 días.");
                break;
        }

    }

}

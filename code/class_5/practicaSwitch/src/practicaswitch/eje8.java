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
public class eje8 {
    
    int numeroDeDiasDelMes;
    int numeroDeDiaDeSemana;
    int diaActual=0;
    
    public void diaUno(String dia1, int diaFechaActual){
        
        switch (dia1) {
            case "Lunes":
            case "lunes":
                numeroDeDiaDeSemana = 1;
                break;

            case "Martes":
            case "martes":
                numeroDeDiaDeSemana = 2;
                break;

            case "Miercoles":
            case "miercoles":
            case "Miércoles":
            case "miércoles":
                numeroDeDiaDeSemana = 3;
                break;

            case "Jueves":
            case "jueves":
                numeroDeDiaDeSemana = 4;
                break;

            case "Viernes":
            case "viernes":
                numeroDeDiaDeSemana = 5;
                break;
                
            case "Sabado":
            case "sabado":
            case "sábado":
            case "Sábado":
                numeroDeDiaDeSemana = 6;
                break;
                
            case "Domingo":
            case "domingo":
                numeroDeDiaDeSemana = 7;
                break;    
            default:
                System.out.println("No se digitó un día de la semana.");
        }
        
        diaActual=(diaFechaActual-numeroDeDiaDeSemana)%7;
        
        switch (diaActual) {
            case 1:
                System.out.println("Hoy es lunes.");
                break;
            case 2:
                System.out.println("Hoy es martes.");
                break;
            case 3:
                System.out.println("Hoy es miércoles.");
                break;
            case 4:
                System.out.println("Hoy es jueves.");
                break;
            case 5:
                System.out.println("Hoy es viernes.");
                break;
            case 6:
                System.out.println("Hoy es sábado.");
                break;
            case 7:
                System.out.println("Hoy es domingo.");
                break;
        }

    }
    
}

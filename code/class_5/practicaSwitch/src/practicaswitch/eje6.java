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
public class eje6 {
    
    public String diaAnterior(int dia, int mes, int año)
    {   
        String fechaAnterior="";
        
        if(dia==1){
            switch (mes) {
            case 1:
                mes=12;
                dia=31;
                año--;
                break;
            case 2:
                dia=31;
                mes=1;
                break;
            case 3:
                if (año % 4 == 0) {
                    dia=30;
                } else {
                    dia=28;
                }
                mes=2;
                break;
            case 4:
                dia=31;
                mes=3;
                break;
            case 5:
                dia=30;
                mes=4;
                break;
            case 6:
                dia=31;
                mes=5;
                break;
            case 7:
                dia=30;
                mes=6;
                break;
            case 8:
                dia=31;
                mes=7;
                break;
            case 9:
                dia=31;
                mes=8;
                break;
            case 10:
                dia=31;
                mes=9;
                break;
            case 11:
                dia=31;
                mes=10;
                break;
            case 12:
                dia=30;
                mes=11;
                break;
        }
        }
        else {
            dia--;
        }
        fechaAnterior = fechaAnterior + dia + " / " + mes + " / " + año;
        return fechaAnterior;
        
        
        
        
        
    }
    
}

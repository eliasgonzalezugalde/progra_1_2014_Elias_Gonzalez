/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaswitch;

/**
 *
 * @author Estudiante
 */
public class eje2 {
    public int operaciones(char ultimoNumero, int numeroEntero)
    {   
        int ultimoNumeroComodin = 0;
        if((ultimoNumero==2)||(ultimoNumero==5)||(ultimoNumero==8))
            ultimoNumeroComodin=1;
        else if ((ultimoNumero==4)||(ultimoNumero==7)||(ultimoNumero==9))
            ultimoNumeroComodin=2;
        
        switch (ultimoNumeroComodin) {
            case 1:
                return numeroEntero*numeroEntero;
            case 2:
                return numeroEntero*5;
            default:
                 return numeroEntero;
        }
    }
}

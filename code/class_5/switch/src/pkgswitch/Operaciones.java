/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

/**
 *
 * @author Estudiante
 */
public class Operaciones {
    
    public double Sumar(double valor1, double valor2) {
        return valor1+valor2;
    }
    public double Restar(double valor1, double valor2) {
        return valor1-valor2;
    }
    public double Dividir(double valor1, double valor2) {
        if(valor2==0)
            return 0;
        else
            return valor1/valor2;
    }
    public double Multiplicar(double valor1, double valor2) {
        return valor1*valor2;
    }
    public double Raiz(double valor1) {
        return Math.sqrt(valor1);
    }
    public double Potencia(double valor1, double valor2) {
        return Math.pow(valor1, valor2);
    }
}

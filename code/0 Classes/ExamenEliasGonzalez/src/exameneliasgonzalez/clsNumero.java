/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exameneliasgonzalez;

/**
 *
 * @author Elías
 */
public class clsNumero {

    private int n;

    public int getN() {
        return n;
    }

    public void setN(int num) {
        this.n = num;
    }

    //metodo que calcula la potencia
    public int potencia(int pot) {
        int resultPOT = n * n;
        for (int i = 2; i < pot; i++) {
            resultPOT = resultPOT * n;
        }
        if (pot < 0) {
            resultPOT = 1 / resultPOT;
        }
        
        return (resultPOT);
    }

    //el metodo que divide, no lo pude hacer, pero lo intenté!
    public int divideNumero(int div) {
        int resDIV;
        resDIV = n/div;
        return (resDIV);
    }

    //metodo que calcula la secuencia
    public String secuencia() {
        String sec = "2";

        int cont1 = 3;
        int cont2 = 2;
        int comodin = cont1 + cont2;

        for (; comodin <= n; comodin = cont1 + cont2) {
            sec = sec + "; " + comodin;
            cont1 = cont2;
            cont2 = comodin;
        }

        return (sec);
    }

}

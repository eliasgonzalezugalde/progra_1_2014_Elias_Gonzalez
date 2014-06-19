/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class10_arrays;

/**
 *
 * @author Jose Pablo Arce Cascante.
 */
public class Exercice1 {

    private int vectores[] = new int[8];

    public void IngresarVectores(int vector) {
        for (int i = 0; i < vectores.length; i++) {
            if (vectores[i] == 0) {
                vectores[i] = vector;
                break;
            }
        }
    }

    public String SumaDeVectores() {
        String retorno = "";
        int suma = 0;
        for (int i = 0; i < vectores.length; i++) {
            suma = suma + vectores[i];
        }
        retorno = "La suma de los vectores es de " + suma + ".";

        return retorno;
    }

    public String MayorA36() {
        String first = "";
        for (int i = 0; i < vectores.length; i++) {
            if (vectores[i] > 36) {
                first += vectores[i] + "\n";
            }
        }
        if (first == "") {
            first = "No se encontraron valores mayores a 36.";
        } else {
            first = "Los vectores mayores a 36, que se ha encontrado son:"
                    + "\n" + first;
        }
        return first;
    }

    public String MayorA50() {
        String second = "";
        for (int i = 0; i < vectores.length; i++) {
            if (vectores[i] > 50) {
                second += vectores[i] + "\n";
            }
        }
        if (second == "") {
            second = "No se encontraron valores mayores a 50.";
        } else {
            second = "Los vectores mayores a 50, que se ha encontrado son:"
                    + "\n" + second;
        }
        return second;
    }

}

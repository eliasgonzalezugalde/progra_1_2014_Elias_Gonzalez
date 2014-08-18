/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosordenacion;

/**
 *
 * @author ideli_000
 */
public class MetodoBurbuja {

    public int[] OrdenamientoBurbuja(int arreglo2[], String ordenamiento) {
        int auxiliar;

        if (ordenamiento.equals("A")) {
            for (int indice = 0; indice < arreglo2.length - 1; indice++) {
                for (int indice2 = 0; indice2 < (((arreglo2.length) - indice) - 1); indice2++) {
                    if (arreglo2[indice2 + 1] < arreglo2[indice2]) {
                        auxiliar = arreglo2[indice2 + 1];
                        arreglo2[indice2 + 1] = arreglo2[indice2];
                        arreglo2[indice2] = auxiliar;
                    }
                }
            }
        } else { //este deberia ordenar al reves
            for (int indice = 0; indice > arreglo2.length - 1; indice++) {
                for (int indice2 = 0; indice2 > (((arreglo2.length) - indice) - 1); indice2++) {
                    if (arreglo2[indice2 + 1] < arreglo2[indice2]) {
                        auxiliar = arreglo2[indice2 + 1];
                        arreglo2[indice2 + 1] = arreglo2[indice2];
                        arreglo2[indice2] = auxiliar;
                    }
                }
            }
        }

        return arreglo2;
    }

}

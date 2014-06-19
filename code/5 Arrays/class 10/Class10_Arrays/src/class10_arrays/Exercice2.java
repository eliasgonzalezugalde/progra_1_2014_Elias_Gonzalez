/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class10_arrays;

/**
 *
 * @author Jose Pablo Arce Cascante.
 */
public class Exercice2 {

    private float firstArray[] = new float[4];
    private float secondArray[] = new float[4];

    public void Array1(float array1) {
        //First vectors group.
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] == 0) {
                firstArray[i] = array1;
                break;
            }
        }
    }

    public void Array2(float array2) {
        //Second vectors group.
        for (int i = 0; i < secondArray.length; i++) {
            if (secondArray[i] == 0) {
                secondArray[i] = array2;
                break;
            }
        }
    }

    public String SumaDeVectores() {
        String print = "";
        float suma1 = 0;
        float suma2 = 0;
        float suma = 0;

        //First summation.
        for (int i = 0; i < firstArray.length; i++) {
            suma1 = suma1 + firstArray[i];
        }

        //Second summation.
        for (int i = 0; i < secondArray.length; i++) {
            suma2 = suma2 + secondArray[i];
        }
        suma= suma2 + suma1;
        print = "La suma del primer vector es de " + suma1 + "." + "\n"
                + "La suma del segundo vector es de " + suma2 + "." + "\n"
                + "La suma de los dos vectores es de " + suma + "." + "\n";
        return print;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class10_arrays;

/**
 *
 * @author Jose Pablo Arce Cante
 */
public class Exercice3 {

    private float ClassA[] = new float[5];
    private float ClassB[] = new float[5];

    public void Class1(float class1) {
        //First vectors group.
        for (int i = 0; i < ClassA.length; i++) {
            if (ClassA[i] == 0) {
                ClassA[i] = class1;
                break;
            }
        }
    }

    public void Class2(float class2) {
        //Second vectors group.
        for (int i = 0; i < ClassB.length; i++) {
            if (ClassB[i] == 0) {
                ClassB[i] = class2;
                break;
            }
        }
    }

    public String SumaDePromedios() {
        String print = "";
        float suma1 = 0;
        float suma2 = 0;
        float suma = 0;

        //First class.
        for (int i = 0; i < ClassA.length; i++) {
            suma1 = suma1 + ClassA[i];
        }

        //Second summation.
        for (int i = 0; i < ClassB.length; i++) {
            suma2 = suma2 + ClassB[i];
        }
        suma1 = suma1/5;
        suma2 = suma2/5;
        
        if (suma1 > suma2) {
            print = "El curso A obtuvo un mayor promedio general de " + suma1 + ".";
        }else{
            print = "El curso B obtuvo un mayor promedio general de " + suma2 + ".";
        }
        if (suma1 == suma2) {            
            print = "Los promedios del curso A(" + suma1 + ") y el curso B("
                    + suma2 + ") son iguales.";
        }
        
        return print;
    }

}

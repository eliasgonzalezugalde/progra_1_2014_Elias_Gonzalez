/*
 *Name: Class11_PracticeMatrix.
 
 *Information: Class11 Practice. 
 
 *Date: 11/6/2014.
 
 *Copyright.
  
 */
package class11_practice.matrix;

import java.util.Scanner;

/**
 *
 * @author Jose Pablo Arce Cascante.
 */
public class Class11_PracticeMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opt = 0;
        Scanner teclado = new Scanner(System.in);
        
        //Options frame.
        do {
            //Menu.
            System.out.println("Ejercicio de matrices.");
            System.out.println("1. Realizar la carga por columnas.");
            System.out.println("2. Intercambiar la primera fila por la segunda.");
            System.out.println("3. ");
            System.out.println("4. ");
            System.out.println("5. Salir.");
            opt = teclado.nextInt();
            switch (opt) {
                //Options.
                case 1://Load first the colums.
                    Exercice1 oExercice1 = new Exercice1();
                    oExercice1.CargraColumnas();
                    oExercice1.Imprimir();
                    break;
                case 2://Interchange the first row to second row.
                    Exercice2 oExercice2 = new Exercice2(); 
                    System.out.println("Ingrese la cantidad de filas.");
                    teclado = new Scanner(System.in);
                    oExercice2.setRow(teclado.nextInt());
                    System.out.println("Ingrese la cantidad de columnas.");
                    oExercice2.setColumn(teclado.nextInt());
                    oExercice2.Imprimir();


                    break;

                default:
                    break;
            }

        } while (opt < 5);

    }

}

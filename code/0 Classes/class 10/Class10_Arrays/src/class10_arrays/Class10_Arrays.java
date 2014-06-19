/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class10_arrays;

import java.util.Scanner;

/**
 *
 * @author Jose Pablo Arce Cascante.
 */
public class Class10_Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables declaring.

        int option = 0;
        Scanner keyboard = new Scanner(System.in);

        //Bucle.
        do { //Menu.
            System.out.println("Prática Arreglos, seleccione una de las"
                    + " siguientes opciones.");
            System.out.println("1. Acumulado y comparaciones de 8 vectores que"
                    + " se deben de ingresados.");
            System.out.println("2. Cargar dos vectores numéricos enteros de"
                    + " 4 elementos y mostrar sus respectivos resultados.");
            System.out.println("3. Igresar las notas de dos cursos, este"
                    + " averiguará cual tiene un promedio general mayor.");
            System.out.println("4. Ejercicio 4.");
            System.out.println("5. Salir.");
            //Stop Variable.
            option = keyboard.nextInt();
            switch (option) {
                case 1://8 arrays.
                    Exercice1 oExercice1 = new Exercice1();
                    for (int i = 0; i < 8; i++) {
                        keyboard = new Scanner(System.in);
                        System.out.println("Introdusca el valor del vector " + (i + 1));
                        //oEjercicio1.AgregarSalario(teclado.nextDouble());
                        oExercice1.IngresarVectores(keyboard.nextInt());
                    }
                    System.out.println("\n" + oExercice1.SumaDeVectores() + "\n");
                    System.out.println(oExercice1.MayorA36() + "\n");
                    System.out.println(oExercice1.MayorA50());
                    break;
                case 2:// 2 arrays with 4 elements everyone.
                    Exercice2 oExercice2 = new Exercice2();
                    //First array.
                    for (int i = 0; i < 4; i++) {
                        keyboard = new Scanner(System.in);
                        System.out.println("Vector 1: Ingrese el valor #" + (i + 1));
                        oExercice2.Array1(keyboard.nextFloat());
                    }
                    //Second array.
                    for (int i = 0; i < 4; i++) {
                        keyboard = new Scanner(System.in);
                        System.out.println("Vector 2: Ingrese el valor #" + (i + 1));
                        oExercice2.Array2(keyboard.nextFloat());
                    }
                    System.out.println(oExercice2.SumaDeVectores());
                    break;
                case 3:
                    Exercice3 oExercice3 = new Exercice3();
                    //First class.
                    for (int i = 0; i < 5; i++) {
                        keyboard = new Scanner(System.in);
                        System.out.println("Curso A, ingrese la nota del estudiante #" + (i + 1));
                        oExercice3.Class1(keyboard.nextFloat());
                    }
                    //Second class.
                    for (int i = 0; i < 5; i++) {
                        keyboard = new Scanner(System.in);
                        System.out.println("Curso B, ingrese la nota del estudiante #" + (i + 1));
                        oExercice3.Class2(keyboard.nextFloat());
                    }
                    System.out.println(oExercice3.SumaDePromedios());
                    break;
                case 4:
                    // Copy u.u
                    Exercice4 oExercice4 = new Exercice4();
                    for (int i = 0; i < 10; i++) {
                        keyboard = new Scanner(System.in);
                        System.out.println("Digite valor del vector 1 # " + (i + 1));
                        oExercice4.AgregarVector(keyboard.nextInt());
                    }
                    boolean estado = oExercice4.EstaOrdenado();
                    if (estado) {
                        System.out.println("El vector esta ordenado :");
                    } else {
                        System.out.println("El vector esta desordenado:");
                    }
                    break;
                case 5://Exit.
                    option = 6;
                    break;
                default:
                    break;

            }

        } while (option < 5);

    }
}

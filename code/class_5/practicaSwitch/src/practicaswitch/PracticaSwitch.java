/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaswitch;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class PracticaSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //variables ejercicio 1
        int mes1=0;
        
        //variables ejercicio 2
        int numeroEntero=0, ultimoNumeroComodin=0, numeroEnteroRespuesta=0;
        char ultimoNumero;
        
        //variables ejercicio 3
        char letra;
        
        //variables ejercicio 4
        int meseje4=0, añoeje4=0;
        
        //variables ejercicio 5
        int numeroRandom = (int) (Math.random () * (3000) + 1);
        
        //variables ejercicio 6
        int dia, mes, año;
        
        //variables ejercicio 7
        int diaMes = 0;
        
        //scanner
        Scanner teclado = new Scanner(System.in);
        
        //Ejercicio1////////////////////////////////////////
  
        System.out.println("Digite un número");
        mes1= Integer.parseInt(teclado.nextLine());
        
        eje1 eeje1 = new eje1();
        System.out.print("Este número corresponde al mes de: ");
        eeje1.mes(mes1);
        
        //Ejercicio2////////////////////////////////////////
        
//        System.out.println("Digite un número entero");
//        numeroEntero= Integer.parseInt(teclado.nextLine());
//        System.out.println("Vuelva a digitar el número");
//        ultimoNumero=teclado.nextLine().charAt(0);
// 
//        
//        eje2 eeje2 = new eje2();
//        System.out.println(eeje2.operaciones(ultimoNumero, numeroEntero));
        
        //Ejercicio3////////////////////////////////////////
        
        System.out.println("Digte una letra entre: A - B - C - D - E");
        letra=teclado.nextLine().charAt(0);
        
        eje3 eeje3 = new eje3();
        eeje3.abcde(letra);
        
        //Ejercicio4////////////////////////////////////////
        
        System.out.println("Digite un mes (el número).");
        meseje4= Integer.parseInt(teclado.nextLine());
        
        System.out.println("Digite el año (el número).");
        añoeje4= Integer.parseInt(teclado.nextLine());
        System.out.println("A continuación el mes y los días que tiene:");
        eje4 eeje4 = new eje4();
        eeje4.numeroMes(meseje4, añoeje4);
        
        //Ejercicio5////////////////////////////////////////
        
        eje5 eeje5 = new eje5();
        System.out.println("Se generó un número aleatorio entre 1 y 3000, este es: ");
        System.out.println(numeroRandom);
        System.out.println("El número aleatorio convertido a números romanos sería: ");
        System.out.println(eeje5.Romanos(numeroRandom));
        
        //Ejercicio6////////////////////////////////////////
        System.out.println("Digite una fecha, y se imprimirá el día anterior a la fecha que se digite.");
        System.out.println("Digite el dia.");
        dia= Integer.parseInt(teclado.nextLine());
        
        System.out.println("Digite el mes.");
        mes= Integer.parseInt(teclado.nextLine());
        
        System.out.println("Digite el año.");
        año= Integer.parseInt(teclado.nextLine());
        
        System.out.println("El día anterior a la fecha que se digitó es: ");
        eje6 eeje6 = new eje6();
        System.out.println(eeje6.diaAnterior(dia, mes, año));
        
        //Ejercicio7////////////////////////////////////////
        System.out.println("Digite un día del mes (con numeros).");
        diaMes= Integer.parseInt(teclado.nextLine());
        System.out.print("Este número corresponde al día: ");
        eje7 eeje7 = new eje7();
        eeje7.mes(diaMes);
        
        //Ejercicio7////////////////////////////////////////
        System.out.println("Digite el día de la semana que fue primero del mes actual .");
        
    }
}

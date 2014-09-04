/*
 * Fecha de inicio: 3 de junio.
 * Fecha de inicio: 11 de julio.
 */
package battleship;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ideli_000
 */
public class battleship {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //variables
        String nombre1 = "", nombre2 = "";
        int barcosRandom = 0;
        int elegirBando = 0;
        int filas = 0, columnas = 0;
        char opt = 0;
        char opt2 = 0;
        boolean turno = false;
        int barcosCaidosJugador1 = 0, barcosCaidosJugador2 = 0;
        int intentosFallidosJugador1 = 0, intentosFallidosJugador2 = 0;
        boolean rendirse = false;
        boolean rendirse1 = false;
        boolean rendirse2 = false;
        int filaJ1 = 0, filaJ2 = 0;
        int columnaJ1 = 0, columnaJ2 = 0;
        char resp;
        int contPartidas = 0;
        int partidasGanadasJ1 = 0, partidasGanadasJ2 = 0;

        Scanner teclado = new Scanner(System.in);
        do { //ciclo para al final poder preguntar si repetir el juego

            System.out.println("☢ Battleship ☢");
            System.out.println();

            System.out.println("Digite el nombre del jugador número 1.");
            System.out.print("→ ");
            nombre1 = teclado.next();
            System.out.println();

            System.out.println("Digite el nombre del jugador número 2.");
            System.out.print("→ ");
            nombre2 = teclado.next();

            System.out.println();

            do { // validación de aliado o enemigo, el aliado comienza a jugar
                System.out.println("Elija el bando del jugador número 1. (Selecciona 1 o 2)."
                        + "\n" + "1. Aliado." + "\n" + "2. Enemigo.");

                opt = teclado.next().charAt(0);

                switch (opt) {
                    case '1':
                        turno = true;
                        break;
                    case '2':
                        turno = false;
                        break;

                    default:
                        System.out.println("Digite un número del menú.");
                }

            } while (opt < '0' || opt > '2');

            System.out.println();

            do { //validacion numero de filas
                try {
                    System.out.println("Digite el número de filas del terreno de juego.");
                    System.out.print("→ ");
                    filas = Integer.parseInt(teclado.next());
                } catch (Exception e) {
                    System.out.println("Digite un valor entre 0 - 100.");
                }
            } while ((filas <= 0) || (filas > 100));

            do { //validacion numero de columnas
                try {
                    System.out.println("Digite el número de columnas del terreno de juego.");
                    System.out.print("→ ");
                    columnas = Integer.parseInt(teclado.next());
                } catch (Exception e) {
                    System.out.println("Digite un valor entre 0 - 100.");
                }
            } while ((columnas <= 0) || (columnas > 100));

            matrizJugador1 oMatrizJugador1 = new matrizJugador1(filas, columnas);
            matrizJugador2 oMatrizJugador2 = new matrizJugador2(filas, columnas);

            //sets filas y columnas            
            oMatrizJugador1.setFilas(filas);
            oMatrizJugador1.setColumnas(columnas);
            oMatrizJugador2.setFilas(filas);
            oMatrizJugador2.setColumnas(columnas);

            do { //validacion numero de barcos
                try {
                    System.out.println("Digite la cantidad de barcos.");
                    System.out.print("→ ");
                    barcosRandom = Integer.parseInt(teclado.next());
                } catch (Exception e) {
                    System.out.println("Digite un valor menor a: " + (columnas * filas));
                }
                oMatrizJugador1.setBarcosRandom(barcosRandom);
                oMatrizJugador2.setBarcosRandom(barcosRandom);
            } while ((barcosRandom >= (columnas * filas)) || (barcosRandom <= 0));

            System.out.println();

            for (int i = 0; i < barcosRandom; i++) { //genera el numero de barcos random
                int filaAleatoria;
                int colAleatoria;
                Random rand = new Random();
                do { //do para jugador 1

                    filaAleatoria = rand.nextInt(filas);
                    colAleatoria = rand.nextInt(columnas);

                } while ((oMatrizJugador1.verifica(filaAleatoria, colAleatoria) == true));
                oMatrizJugador1.setBarco(filaAleatoria, colAleatoria);

                do { //do para jugador 2

                    filaAleatoria = rand.nextInt(filas);
                    colAleatoria = rand.nextInt(columnas);

                } while ((oMatrizJugador2.verifica(filaAleatoria, colAleatoria) == true));
                oMatrizJugador2.setBarco(filaAleatoria, colAleatoria);
            }

            dogeneral:
            do { //do con los 2 turnos
                while (turno == true) {

                    do { //turno del jugador 1

                        if (barcosCaidosJugador1 == barcosRandom) {
                            break dogeneral;
                        }

                        System.out.println("Turno de " + nombre1);

                        System.out.println("Campo marítimo de: " + nombre2);

                        oMatrizJugador1.imprimeMatriz();

                        System.out.println();

                        //switch de atacar o rendirse
                        System.out.println("Elija una opcion: "
                                + "\n" + "1. Atacar." + "\n" + "2. Rendirce.");

                        opt = teclado.next().charAt(0);

                        System.out.println();

                        switch (opt) {
                            case '1': //atacar
                                do { //validacion numero de fila
                                    try {
                                    System.out.println("Digite el número de la fila.");
                                    System.out.print("→ ");
                                    
                                        filaJ1 = Integer.parseInt(teclado.next());
                                    } catch (Exception e) {
                                        System.out.println("Digite un número.");
                                    }

                                } while ((filaJ1 >= filas) || (filaJ1 < 0));
                                do { //validacion numero de columna
                                    System.out.println("Digite el número de la columna.");
                                    System.out.print("→ ");
                                    try {
                                        columnaJ1 = Integer.parseInt(teclado.next());
                                    } catch (Exception e) {
                                        System.out.println("Digite un número.");
                                    }

                                } while ((columnaJ1 >= columnas) || (columnaJ1 < 0));

                                oMatrizJugador1.verifica(filaJ1, columnaJ1);

                                System.out.println();

                                if (oMatrizJugador1.verifica(filaJ1, columnaJ1) == true) { //dice si se acertó o no un barco
                                    System.out.println("Has acertado un barco.");
                                } else {
                                    System.out.println("No has acertado ningún barco.");
                                }

                                System.out.println("Campo marítimo de: " + nombre2 + ", después de tu ataque.");

                                oMatrizJugador2.verifica(filaJ1, columnaJ1);

                                if (oMatrizJugador1.verifica(filaJ1, columnaJ1) == true) {
                                    oMatrizJugador1.destruirBarco(filaJ1, columnaJ1);
                                    barcosCaidosJugador1++;

                                } else {
                                    intentosFallidosJugador1++;
                                    turno = false;
                                    oMatrizJugador1.noAcertado(filaJ1, columnaJ1);
                                }

                                System.out.println("");

                                oMatrizJugador1.imprimeMatriz(); //imprime la matriz, con o sin cambios

                                System.out.println("");

                                //estadisticas jugador 1
                                System.out.println(nombre1 + " → Barcos acertados: " + barcosCaidosJugador1);
                                System.out.println(nombre1 + " → Intentos fallidos: " + intentosFallidosJugador1);

                                System.out.println("");

                                break;
                            case '2': //rendirse
                                rendirse1 = true; //este boolean se usa para las impresiones cuando el ciclo se rompe
                                break dogeneral;

                            default:
                                System.out.println("Digite un número del menú.");
                        }

                    } while (opt < '0' || opt > '2');
                }

                while (turno == false) {

                    do { //turno del jugador 1

                        if (barcosCaidosJugador2 == barcosRandom) {
                            break dogeneral;
                        }

                        System.out.println("Turno de " + nombre2);

                        System.out.println("Campo marítimo de: " + nombre1);

                        oMatrizJugador2.imprimeMatriz();

                        System.out.println();

                        //switch de atacar o rendirse
                        System.out.println("Elija una opcion: "
                                + "\n" + "1. Atacar." + "\n" + "2. Rendirce.");

                        opt = teclado.next().charAt(0);

                        System.out.println();

                        switch (opt) {
                            case '1': //atacar
                                do { //validacion numero de fila
                                    try {
                                    System.out.println("Digite el número de la fila.");
                                    System.out.print("→ ");
                                    
                                        filaJ2 = Integer.parseInt(teclado.next());
                                    } catch (Exception e) {
                                        System.out.println("Digite un número.");
                                    }

                                } while ((filaJ2 >= filas) || (filaJ2 < 0));
                                do { //validacion numero de columna
                                    try {
                                    System.out.println("Digite el número de la columna.");
                                    System.out.print("→ ");
                                    
                                        columnaJ2 = Integer.parseInt(teclado.next());
                                    } catch (Exception e) {
                                        System.out.println("Digite un número.");
                                    }

                                } while ((columnaJ2 >= columnas) || (columnaJ2 < 0));

                                System.out.println();

                                if (oMatrizJugador1.verifica(filaJ1, columnaJ1) == true) { //dice si se acertó o no un barco
                                    System.out.println("Has acertado un barco.");
                                } else {
                                    System.out.println("No has acertado ningún barco.");
                                }

                                System.out.println("Campo marítimo de: " + nombre1 + ", después de tu ataque.");

                                oMatrizJugador2.verifica(filaJ2, columnaJ2);

                                if (oMatrizJugador2.verifica(filaJ2, columnaJ2) == true) {
                                    oMatrizJugador2.destruirBarco(filaJ2, columnaJ2);
                                    barcosCaidosJugador2++;

                                } else {
                                    intentosFallidosJugador2++;
                                    turno = true;
                                    oMatrizJugador2.noAcertado(filaJ2, columnaJ2);
                                }

                                System.out.println("");

                                oMatrizJugador2.imprimeMatriz(); //imprime la matriz, con o sin cambios

                                System.out.println("");

                                //estadisticas jugador 2
                                System.out.println(nombre2 + " → Barcos acertados: " + barcosCaidosJugador2);
                                System.out.println(nombre2 + " → Intentos fallidos: " + intentosFallidosJugador2);

                                System.out.println("");

                                break;
                            case '2': //rendirse
                                rendirse2 = true; //este boolean se usa para las impresiones cuando el ciclo se rompe
                                break dogeneral;

                            default:
                                System.out.println("Digite un número del menú.");
                        }

                    } while (opt < '0' || opt > '2');
                }

            } while (rendirse == false);

            //impresiones del final, dependiendo de lo que pase
            if (rendirse1 == true) {
                System.out.println(nombre1 + " se ha rendido.");
                System.out.println("El ganador es: " + nombre2);
            }
            if (rendirse2 == true) {
                System.out.println(nombre2 + " se ha rendido.");
                System.out.println("El ganador es: " + nombre1);
            }
            if (barcosCaidosJugador1 == barcosRandom) {
                System.out.println(nombre2 + " ha perdido.");
                System.out.println("El ganador es: " + nombre1);
                partidasGanadasJ1++;
            }
            if (barcosCaidosJugador2 == barcosRandom) {
                System.out.println(nombre1 + " ha perdido.");
                System.out.println("El ganador es: " + nombre2);
                partidasGanadasJ2++;
            }

            System.out.println();

            System.out.println("El juego ha terminado.");

            System.out.println();

            System.out.println("Estadísticas: ");

            System.out.println();

            System.out.println("Jugador 1.");
            System.out.println(nombre1 + " → Barcos acertados: " + barcosCaidosJugador1);
            System.out.println(nombre1 + " → Intentos fallidos: " + intentosFallidosJugador1);
            System.out.println("Patidas ganadas de " + nombre1 + ": " + partidasGanadasJ1);

            System.out.println();

            System.out.println("Jugador 2.");
            System.out.println(nombre2 + " → Barcos acertados: " + barcosCaidosJugador2);
            System.out.println(nombre2 + " → Intentos fallidos: " + intentosFallidosJugador2);
            System.out.println("Patidas ganadas de " + nombre2 + ": " + partidasGanadasJ2);

            System.out.println();

            contPartidas++;
            System.out.println("Partidas jugadas: " + contPartidas);

            //limpiar variables
            barcosCaidosJugador1 = 0;
            barcosCaidosJugador2 = 0;
            barcosRandom = 0;
            intentosFallidosJugador1 = 0;
            intentosFallidosJugador2 = 0;
            barcosCaidosJugador1 = 0;
            barcosCaidosJugador2 = 0;

            System.out.println("Desea jugar nuevamente?. S/N");
            resp = teclado.next().charAt(0);

            System.out.println();

        } while (resp == 'S' || resp == 's');

    }
}

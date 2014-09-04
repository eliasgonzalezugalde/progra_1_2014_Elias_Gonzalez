/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brasil2014;

import java.awt.Color;
import java.awt.Insets;
import static java.lang.Integer.parseInt;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

/**
 *
 * @author ideli_000
 */
public class Brasil2014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //entero para el menu
        int opt = 0;
        String nombreAEliminar = "";
        String nombreAAgregar = "";
        String apellidoAAgregar = "";
        int edadAAgregar = 0;
        int golesAAgregar = 0;
        String nombreAModificar = "";
        String nuevoNombre = "";
        String nuevoApellido1 = "";
        String nuevoApellido2 = "";
        int nuevaEdad = 0;
        int nuevosGoles = 0;
        String nombreAModificarEstadio = "";
        String nuevoNombreEstadio = "";
        int nuevaTemperatura = 0;
        int nuevaPrecipitaciones = 0;
        int nuevaHumedad = 0;
        int nuevoViento = 0;
        int nuevaCapacidad = 0;

        //Scanner
        Scanner teclado = new Scanner(System.in);

        //lista de estadios
        ListaEstadio ListaEstadios = new ListaEstadio();

        ListaEstadios.Insertar("Maracana", 25, 0, 65, 18, 78838);
        ListaEstadios.Insertar("Arena Amazônia Manaos", 31, 10, 58, 11, 40549);
        ListaEstadios.Insertar("Castelão Fortaleza", 28, 30, 58, 26, 67037);
        ListaEstadios.Insertar("Arena Pantanal Cuiaba", 36, 50, 32, 21, 41112);
        ListaEstadios.Insertar("Arena Fonte Nova Salvador", 26, 50, 78, 21, 51708);
        ListaEstadios.Insertar("Nacional Brasilia", 27, 20, 32, 21, 69349);
        ListaEstadios.Insertar("Mineirão Belo Horizonte", 22, 10, 38, 16, 62160);
        ListaEstadios.Insertar("Arena de Sao Paulo", 24, 0, 50, 14, 61606);
        ListaEstadios.Insertar("Arena Pernambuco Recife", 25, 20, 83, 27, 46154);
        ListaEstadios.Insertar("Estadio Das Dunas", 26, 50, 65, 32, 45000);
        ListaEstadios.Insertar("Arena da Baixada Curitiba", 21, 0, 56, 13, 39631);
        ListaEstadios.Insertar("Estadio Beira-Rio Porto Alegre", 26, 0, 43, 2, 42991);

        //ListaEstadios.InsertarListaDeEstadios(ListaEstadios);
        //lista de grupos
        ListaGrupo ListaGrupos = new ListaGrupo();

        //lista de equipos
        ListaEquipo ListaEquipos = new ListaEquipo();

        //lista de jugadores
        ListaJugador ListaJugadores = new ListaJugador();

        //Grupo A///////////////////////////////////////////////////////////////
        String grupoTemp1 = "1. Grupo A";
        ListaCalendario listCalendar1 = new ListaCalendario();
        listCalendar1.Insertar("17/06/14", "5:00pm", "66%", "27 m/s", "26° C", "28° C", 0, 0, "Castelão Fortaleza"); //Brasil - Mexico
        listCalendar1.Insertar("18/06/14", "6:00pm", "86%", "6 m/s", "27° C", "28° C", 4, 0, "Arena Pernambuco Recife"); //Croacia - Camerun

        ListaEquipo ListaEquiposGrupoA = new ListaEquipo(); //Lista de equipos del Grupo A

        String equipoTemp7 = "Brasil";
        ListaJugador listJugador7 = new ListaJugador();
        listJugador7.Insertar("Julio Cesar", "Soares", "", 34, 0);
        listJugador7.Insertar("Neymar", "da Silva Santos", "", 22, 4);
        listJugador7.Insertar("Dani", "Albes", "", 31, 0);
        listJugador7.Insertar("David", "Luiz", "", 27, 2);
        ListaEquiposGrupoA.Insertar(equipoTemp7, listJugador7, 3, 2, 1, 0, 7, 2, 5, 7);
        ListaEquipos.Insertar(equipoTemp7, listJugador7, 3, 2, 1, 0, 7, 2, 5, 7);

        ListaEquipo ListaEquipos25 = new ListaEquipo();
        String equipoTemp25 = "Mexico (no era penal).";
        ListaJugador listJugador25 = new ListaJugador();
        listJugador25.Insertar("Guillermo", "Ochoa", "", 29, 0);
        listJugador25.Insertar("Javier", "Hernandez", "", 26, 1);
        listJugador25.Insertar("Rafael", "Marquez", "", 32, 1);
        listJugador25.Insertar("Giovani", "dos Santos", "", 25, 1);
        ListaEquiposGrupoA.Insertar(equipoTemp25, listJugador25, 3, 2, 1, 0, 4, 1, 3, 7);
        ListaEquipos.Insertar(equipoTemp25, listJugador25, 3, 2, 1, 0, 4, 1, 3, 7);

        ListaEquipo ListaEquipos13 = new ListaEquipo();
        String equipoTemp13 = "Croacia";
        ListaJugador listJugador13 = new ListaJugador();
        listJugador13.Insertar("Stipe", "Pletikosa", "", 35, 0);
        listJugador13.Insertar("Luka", "Modric", "", 28, 0);
        listJugador13.Insertar("Mario", "Mandzukic", "", 28, 2);
        listJugador13.Insertar("Ivaca", "Olic", "", 34, 0);
        ListaEquiposGrupoA.Insertar(equipoTemp13, listJugador13, 3, 1, 0, 2, 6, 6, 0, 3);
        ListaEquipos.Insertar(equipoTemp13, listJugador13, 3, 1, 0, 2, 6, 6, 0, 3);

        ListaEquipo ListaEquipos8 = new ListaEquipo();
        String equipoTemp8 = "Camerun";
        ListaJugador listJugador8 = new ListaJugador();
        listJugador8.Insertar("Charles", "Itandje", "", 31, 0);
        listJugador8.Insertar("Samuel", "Eto'o", "", 33, 0);
        listJugador8.Insertar("Alex", "Song", "", 26, 0);
        listJugador8.Insertar("Pierre", "Webo", "", 32, 0);
        ListaEquiposGrupoA.Insertar(equipoTemp8, listJugador8, 3, 0, 0, 3, 1, 9, -8, 0);
        ListaEquipos.Insertar(equipoTemp8, listJugador8, 3, 0, 0, 3, 1, 9, -8, 0);

        //insersion
        ListaGrupos.Insertar(grupoTemp1, listCalendar1, ListaEquiposGrupoA);

        //Grupo B///////////////////////////////////////////////////////////////
        String grupoTemp2 = "2. Grupo B";
        ListaCalendario listCalendar2 = new ListaCalendario();
        listCalendar2.Insertar("23/06/14", "1:00pm", "53%", "6 m/s", "20° C", "21° C", 2, 0, "Arena de Sao Paulo"); //Paises Bajos - Chile
        listCalendar2.Insertar("23/06/14", "1:00pm", "73%", "8 m/s", "18° C", "19° C", 3, 0, "Arena da Baixada Curitiba"); //España - Australia

        ListaEquipo ListaEquiposGrupoB = new ListaEquipo(); //Lista de equipos del Grupo B

        String equipoTemp27 = "Paises Bajos";
        ListaJugador listJugador27 = new ListaJugador();
        listJugador27.Insertar("Jasper", "Cillessen", "", 25, 0);
        listJugador27.Insertar("Argen", "Rooben", "", 30, 3);
        listJugador27.Insertar("Robin", "Van Persie", "", 30, 4);
        listJugador27.Insertar("Wesley", "Sneijder", "", 30, 1);
        ListaEquiposGrupoB.Insertar(equipoTemp27, listJugador27, 3, 3, 0, 0, 10, 3, 7, 9);
        ListaEquipos.Insertar(equipoTemp27, listJugador27, 3, 3, 0, 0, 10, 3, 7, 9);

        String equipoTemp9 = "Chile";
        ListaJugador listJugador9 = new ListaJugador();
        listJugador9.Insertar("Claudio", "Bravo", "", 31, 0);
        listJugador9.Insertar("Alexis", "Sanchez", "", 25, 2);
        listJugador9.Insertar("Arturo", "Vidal", "", 27, 0);
        listJugador9.Insertar("Eduardo", "Vargas", "", 24, 1);
        ListaEquiposGrupoB.Insertar(equipoTemp9, listJugador9, 3, 2, 0, 1, 5, 3, 2, 6);
        ListaEquipos.Insertar(equipoTemp9, listJugador9, 3, 2, 0, 1, 5, 3, 2, 6);

        String equipoTemp16 = "España";
        ListaJugador listJugador16 = new ListaJugador();
        listJugador16.Insertar("Iker", "Casillas", "", 33, 0);
        listJugador16.Insertar("Andres", "Iniesta", "", 30, 0);
        listJugador16.Insertar("David", "Villa", "", 32, 1);
        listJugador16.Insertar("Fernando", "Torres", "", 30, 0);
        ListaEquiposGrupoB.Insertar(equipoTemp16, listJugador16, 3, 1, 0, 2, 4, 7, -3, 3);
        ListaEquipos.Insertar(equipoTemp16, listJugador16, 3, 1, 0, 2, 4, 7, -3, 3);

        String equipoTemp4 = "Australia";
        ListaJugador listJugador4 = new ListaJugador();
        listJugador4.Insertar("Masthew", "Ryan", "", 21, 0);
        listJugador4.Insertar("Tim", "Cahill", "", 34, 2);
        listJugador4.Insertar("Mile", "Jedinak", "", 29, 1);
        listJugador4.Insertar("Jason", "Davidson", "", 23, 0);
        ListaEquiposGrupoB.Insertar(equipoTemp4, listJugador4, 3, 0, 0, 3, 3, 9, -6, 0);
        ListaEquipos.Insertar(equipoTemp4, listJugador4, 3, 0, 0, 3, 3, 9, -6, 0);

        //insersion
        ListaGrupos.Insertar(grupoTemp2, listCalendar2, ListaEquiposGrupoB);

        //Grupo C///////////////////////////////////////////////////////////////
        String grupoTemp3 = "3. Grupo C";
        ListaCalendario listCalendar3 = new ListaCalendario();
        listCalendar3.Insertar("14/06/14", "1:00pm", "51%", "11 m/s", "24° C", "25° C", 3, 0, "MineirãoBelo Horizonte"); //Colombia - Grecia
        listCalendar3.Insertar("14/06/14", "4:00pm", "77%", "10%", "26° C", "27° C", 2, 1, "Arena Pernambuco Recife"); //Costa de Marfil - Japon

        ListaEquipo ListaEquiposGrupoC = new ListaEquipo(); //Lista de equipos del Grupo C

        String equipoTemp10 = "Colombia";
        ListaJugador listJugador10 = new ListaJugador();
        listJugador10.Insertar("David", "Ospina", "", 25, 0);
        listJugador10.Insertar("James", "Rodriguez", "", 23, 6);
        listJugador10.Insertar("Juan", "Cuadrado", "", 26, 1);
        listJugador10.Insertar("Teofilo", "Gutierrez", "", 29, 1);
        ListaEquiposGrupoC.Insertar(equipoTemp10, listJugador10, 3, 3, 0, 0, 9, 2, 7, 9);
        ListaEquipos.Insertar(equipoTemp10, listJugador10, 3, 3, 0, 0, 9, 2, 7, 9);

        String equipoTemp19 = "Grecia";
        ListaJugador listJugador19 = new ListaJugador();
        listJugador19.Insertar("Orestis", "Karnezis", "", 29, 0);
        listJugador19.Insertar("Georgios", "Samaras", "", 29, 1);
        listJugador19.Insertar("Giorgos", "Karagounis", "", 37, 0);
        listJugador19.Insertar("Panagiotis", "Kone", "", 27, 0);
        ListaEquiposGrupoC.Insertar(equipoTemp19, listJugador19, 3, 1, 1, 1, 2, 4, -2, 4);
        ListaEquipos.Insertar(equipoTemp19, listJugador19, 3, 1, 1, 1, 2, 4, -2, 4);

        String equipoTemp11 = "Costa de Marfil";
        ListaJugador listJugador11 = new ListaJugador();
        listJugador11.Insertar("Boubacar", "Barry", "", 34, 0);
        listJugador11.Insertar("Didier", "Drogba", "", 36, 0);
        listJugador11.Insertar("Yaya", "Toure", "", 31, 0);
        listJugador11.Insertar("Kolo", "Toure", "", 33, 0);
        ListaEquiposGrupoC.Insertar(equipoTemp11, listJugador11, 3, 1, 0, 2, 4, 5, -1, 3);
        ListaEquipos.Insertar(equipoTemp11, listJugador11, 3, 1, 0, 2, 4, 5, -1, 3);

        String equipoTemp24 = "Japon";
        ListaJugador listJugador24 = new ListaJugador();
        listJugador24.Insertar("Eiji", "Kawashima", "", 31, 0);
        listJugador24.Insertar("Keisuke", "Honda", "", 28, 1);
        listJugador24.Insertar("Shinji", "Kagawa", "", 25, 0);
        listJugador24.Insertar("Atsuto", "Uchida", "", 26, 0);
        ListaEquiposGrupoC.Insertar(equipoTemp24, listJugador24, 3, 0, 1, 2, 2, 6, -4, 1);
        ListaEquipos.Insertar(equipoTemp24, listJugador24, 3, 0, 1, 2, 2, 6, -4, 1);

        //insersion
        ListaGrupos.Insertar(grupoTemp3, listCalendar3, ListaEquiposGrupoC);

        //Grupo D///////////////////////////////////////////////////////////////
        String grupoTemp4 = "4. Grupo D";
        ListaCalendario listCalendar4 = new ListaCalendario();
        listCalendar4.Insertar("14/06/14", "4:00pm", "58%", "19 m/s", "30° C", "32° C", 3, 1, "Castelão Fortaleza"); //Costa Rica Uruguay
        listCalendar4.Insertar("14/06/14", "6:00pm", "44%", "14 m/s", "28° C", "30° C", 2, 1, "Arena Amazônia Manaos"); //Italia - Inglaterra

        ListaEquipo ListaEquiposGrupoD = new ListaEquipo(); //Lista de equipos del Grupo D

        String equipoTemp12 = "Costa Rica";
        ListaJugador listJugador12 = new ListaJugador();
        listJugador12.Insertar("Keylor", "Navas", "", 27, 0);
        listJugador12.Insertar("Joel", "Campbell", "", 22, 1);
        listJugador12.Insertar("Bryan", "Ruiz", "", 28, 2);
        listJugador12.Insertar("Celso", "Borges", "", 26, 0);
        ListaEquiposGrupoD.Insertar(equipoTemp12, listJugador12, 3, 2, 1, 0, 4, 1, 3, 7);
        ListaEquipos.Insertar(equipoTemp12, listJugador12, 3, 2, 1, 0, 4, 1, 3, 7);

        String equipoTemp32 = "Uruguay";
        ListaJugador listJugador32 = new ListaJugador();
        listJugador32.Insertar("Fernando", "Muslera", "", 28, 0);
        listJugador32.Insertar("Luis", "Suarez", "", 27, 2);
        listJugador32.Insertar("Diego", "Forlan", "", 35, 0);
        listJugador32.Insertar("Edinson", "Cavani", "", 27, 1);
        ListaEquiposGrupoD.Insertar(equipoTemp32, listJugador32, 3, 2, 0, 1, 4, 4, 0, 6);
        ListaEquipos.Insertar(equipoTemp32, listJugador32, 3, 2, 0, 1, 4, 4, 0, 6);

        String equipoTemp23 = "Italia";
        ListaJugador listJugador23 = new ListaJugador();
        listJugador23.Insertar("Gianluigi", "Buffon", "", 36, 0);
        listJugador23.Insertar("Mario", "Balotelli", "", 23, 1);
        listJugador23.Insertar("Andrea", "Pirlo", "", 35, 0);
        listJugador23.Insertar("Claudio", "Marchisio", "", 28, 1);
        ListaEquiposGrupoD.Insertar(equipoTemp23, listJugador23, 3, 1, 0, 2, 2, 3, -1, 3);
        ListaEquipos.Insertar(equipoTemp23, listJugador23, 3, 1, 0, 2, 2, 3, -1, 3);

        String equipoTemp21 = "Inglaterra";
        ListaJugador listJugador21 = new ListaJugador();
        listJugador21.Insertar("Joe", "Hart", "", 27, 0);
        listJugador21.Insertar("Wayne", "Rooney", "", 28, 1);
        listJugador21.Insertar("Frank", "Lampard", "", 36, 0);
        listJugador21.Insertar("Daniel", "Sturridge", "", 24, 1);
        ListaEquiposGrupoD.Insertar(equipoTemp21, listJugador21, 3, 0, 1, 2, 2, 4, -2, 1);
        ListaEquipos.Insertar(equipoTemp21, listJugador21, 3, 0, 1, 2, 2, 4, -2, 1);

        //insersion
        ListaGrupos.Insertar(grupoTemp4, listCalendar4, ListaEquiposGrupoD);

        //Grupo E///////////////////////////////////////////////////////////////
        String grupoTemp5 = "5. Grupo E";
        ListaCalendario listCalendar5 = new ListaCalendario();
        listCalendar5.Insertar("20/06/14", "4:00pm", "69%", "12 m/s", "26° C", "27° C", 5, 2, "Arena Fonte Nova Salvador"); //Francia - Suiza
        listCalendar5.Insertar("20/06/14", "7:00pm", "77%", "3 m/s", "13° C", "14° C", 2, 1, "Arena da Baixada Curitiba"); //Ecuador - Honduras

        ListaEquipo ListaEquiposGrupoE = new ListaEquipo(); //Lista de equipos del Grupo E

        String equipoTemp17 = "Francia";
        ListaJugador listJugador17 = new ListaJugador();
        listJugador17.Insertar("Hugo", "Lloris", "", 27, 0);
        listJugador17.Insertar("Karim", "Benzema", "", 26, 3);
        listJugador17.Insertar("Antoine", "Griezmann", "", 23, 0);
        listJugador17.Insertar("Olivier", "Giroud", "", 27, 1);
        ListaEquiposGrupoE.Insertar(equipoTemp17, listJugador17, 3, 2, 1, 0, 8, 2, 6, 7);
        ListaEquipos.Insertar(equipoTemp17, listJugador17, 3, 2, 1, 0, 8, 2, 6, 7);

        String equipoTemp31 = "Suiza";
        ListaJugador listJugador31 = new ListaJugador();
        listJugador31.Insertar("Yann", "Sommer", "", 25, 0);
        listJugador31.Insertar("Xherdan", "Shaqiri", "", 22, 3);
        listJugador31.Insertar("Granit", "Xhaka", "", 21, 1);
        listJugador31.Insertar("Ricardo", "Rodriguez", "", 21, 0);
        ListaEquiposGrupoE.Insertar(equipoTemp31, listJugador31, 3, 2, 0, 1, 7, 6, 1, 6);
        ListaEquipos.Insertar(equipoTemp31, listJugador31, 3, 2, 0, 1, 7, 6, 1, 6);

        String equipoTemp14 = "Ecuador";
        ListaJugador listJugador14 = new ListaJugador();
        listJugador14.Insertar("Alexander", "Domingez", "", 27, 0);
        listJugador14.Insertar("Antonio", "Valencia", "", 28, 0);
        listJugador14.Insertar("Enner", "Valencia", "", 25, 3);
        listJugador14.Insertar("Jefferson", "Montero", "", 24, 0);
        ListaEquiposGrupoE.Insertar(equipoTemp14, listJugador14, 3, 1, 1, 1, 3, 3, 0, 4);
        ListaEquipos.Insertar(equipoTemp14, listJugador14, 3, 1, 1, 1, 3, 3, 0, 4);

        String equipoTemp20 = "Honduras";
        ListaJugador listJugador20 = new ListaJugador();
        listJugador20.Insertar("Noel", "Valladares", "", 37, 0);
        listJugador20.Insertar("Jerry", "Bengtson", "", 27, 0);
        listJugador20.Insertar("Jerry", "Palacios", "", 32, 0);
        listJugador20.Insertar("Carlo", "Costly", "", 32, 1);
        ListaEquiposGrupoE.Insertar(equipoTemp20, listJugador20, 3, 0, 0, 3, 1, 8, -7, 0);
        ListaEquipos.Insertar(equipoTemp20, listJugador20, 3, 0, 0, 3, 1, 8, -7, 0);

        //insersion
        ListaGrupos.Insertar(grupoTemp5, listCalendar5, ListaEquiposGrupoE);

        //Grupo F///////////////////////////////////////////////////////////////
        String grupoTemp6 = "6. Grupo F";
        ListaCalendario listCalendar6 = new ListaCalendario();
        listCalendar6.Insertar("25/06/14", "1:00pm", "87%", "10 m/s", "20° C", "21° C", 3, 2, "Estadio Beira-Rio Porto Alegrer"); //Argentina - Nigeria
        listCalendar6.Insertar("25/06/14", "1:00pm", "76", "10 m/s", "25° C", "26° C", 3, 1, "Arena Fonte Nova Salvador"); //Bosnia y Herzegovina - Iran

        ListaEquipo ListaEquiposGrupoF = new ListaEquipo(); //Lista de equipos del Grupo F

        String equipoTemp3 = "Argentina";
        ListaJugador listJugador3 = new ListaJugador();
        listJugador3.Insertar("Sergio", "Romero", "", 27, 0);
        listJugador3.Insertar("Lionel", "Messi", "", 27, 4);
        listJugador3.Insertar("Sergio", "Aguero", "", 26, 0);
        listJugador3.Insertar("Angel", "Di Maria", "", 26, 1);
        ListaEquiposGrupoF.Insertar(equipoTemp3, listJugador3, 3, 3, 0, 0, 6, 3, 3, 9);
        ListaEquipos.Insertar(equipoTemp3, listJugador3, 3, 3, 0, 0, 6, 3, 3, 9);

        String equipoTemp26 = "Nigeria";
        ListaJugador listJugador26 = new ListaJugador();
        listJugador26.Insertar("Vicent", "Enyeama", "", 31, 0);
        listJugador26.Insertar("Obi", "Mikel", "", 27, 0);
        listJugador26.Insertar("Emmanuel", "Emike", "", 27, 0);
        listJugador26.Insertar("Victor", "Moses", "", 23, 0);
        ListaEquiposGrupoF.Insertar(equipoTemp26, listJugador26, 3, 1, 1, 1, 3, 3, 0, 4);
        ListaEquipos.Insertar(equipoTemp26, listJugador26, 3, 1, 1, 1, 3, 3, 0, 4);

        String equipoTemp6 = "Bosnia y Herzegovina";
        ListaJugador listJugador6 = new ListaJugador();
        listJugador6.Insertar("Asmir", "Begovic", "", 27, 0);
        listJugador6.Insertar("Edin", "Dzeko", "", 28, 1);
        listJugador6.Insertar("Miralem", "Pjanic", "", 24, 1);
        listJugador6.Insertar("Vedad", "Ibisevic", "", 29, 1);
        ListaEquiposGrupoF.Insertar(equipoTemp6, listJugador6, 3, 1, 0, 2, 4, 4, 0, 3);
        ListaEquipos.Insertar(equipoTemp6, listJugador6, 3, 1, 0, 2, 4, 4, 0, 3);

        String equipoTemp22 = "Iran";
        ListaJugador listJugador22 = new ListaJugador();
        listJugador22.Insertar("Daniel", "Davari", "", 26, 0);
        listJugador22.Insertar("Ashkan", "Dejagah", "", 28, 0);
        listJugador22.Insertar("Jabad", "Nekounam", "", 33, 0);
        listJugador22.Insertar("Karim", "Asarifard", "", 24, 0);
        ListaEquiposGrupoF.Insertar(equipoTemp22, listJugador22, 3, 0, 1, 2, 1, 4, -3, 1);
        ListaEquipos.Insertar(equipoTemp22, listJugador22, 3, 0, 1, 2, 1, 4, -3, 1);

        //insersion
        ListaGrupos.Insertar(grupoTemp6, listCalendar6, ListaEquiposGrupoF);

        //Grupo F///////////////////////////////////////////////////////////////
        String grupoTemp7 = "7. Grupo G";
        ListaCalendario listCalendar7 = new ListaCalendario();
        listCalendar7.Insertar("26/06/14", "1:00pm", "19%", "12 m/s", "27° C", "28° C", 1, 0, "Arena Pernambuco Recife"); //Alemania - EEUU
        listCalendar7.Insertar("26/06/14", "1:00pm", "50%", "21 m/s", "26° C", "28° C", 2, 1, "Nacional Brasilia"); //Portugal - Ghana

        ListaEquipo ListaEquiposGrupoG = new ListaEquipo(); //Lista de equipos del Grupo G

        String equipoTemp1 = "Alemania";
        ListaJugador listJugardor = new ListaJugador();
        listJugardor.Insertar("Manuel", "Neuer", "", 28, 0);
        listJugardor.Insertar("Miroslav", "Klose", "", 36, 2);
        listJugardor.Insertar("Thomas", "Muller", "", 24, 5);
        listJugardor.Insertar("Mesut", "Ozil", "", 25, 0);
        ListaEquiposGrupoG.Insertar(equipoTemp1, listJugardor, 3, 2, 1, 0, 7, 2, 5, 7);
        ListaEquipos.Insertar(equipoTemp1, listJugardor, 3, 2, 1, 0, 7, 2, 5, 7);

        String equipoTemp15 = "EE UU";
        ListaJugador listJugador15 = new ListaJugador();
        listJugador15.Insertar("Tim", "Howard", "", 35, 0);
        listJugador15.Insertar("Clint", "Dempsey", "", 31, 2);
        listJugador15.Insertar("Josy", "Altidore", "", 24, 0);
        listJugador15.Insertar("Jermaine", "Jones", "", 32, 1);
        ListaEquiposGrupoG.Insertar(equipoTemp15, listJugador15, 3, 1, 1, 1, 4, 4, 0, 4);
        ListaEquipos.Insertar(equipoTemp15, listJugador15, 3, 1, 1, 1, 4, 4, 0, 4);

        String equipoTemp28 = "Portugal";
        ListaJugador listJugador28 = new ListaJugador();
        listJugador28.Insertar("Rui", "Patricio", "", 26, 0);
        listJugador28.Insertar("Cristiano", "Ronaldo", "", 29, 1);
        listJugador28.Insertar("Luis Carlos", "Almeida", "", 27, 0);
        listJugador28.Insertar("Raul", "Meireles", "", 31, 0);
        ListaEquiposGrupoG.Insertar(equipoTemp28, listJugador28, 3, 1, 1, 1, 4, 7, -3, 4);
        ListaEquipos.Insertar(equipoTemp28, listJugador28, 3, 1, 1, 1, 4, 7, -3, 4);

        String equipoTemp18 = "Ghana";
        ListaJugador listJugador18 = new ListaJugador();
        listJugador18.Insertar("Fatau", "Dauda", "", 29, 0);
        listJugador18.Insertar("Kevin-Price", "Boateng", "", 27, 0);
        listJugador18.Insertar("Asamoah", "Gyan", "", 28, 2);
        listJugador18.Insertar("Sulley", "Muntari", "", 29, 0);
        ListaEquiposGrupoG.Insertar(equipoTemp18, listJugador18, 3, 0, 1, 2, 4, 6, -2, 1);
        ListaEquipos.Insertar(equipoTemp18, listJugador18, 3, 0, 1, 2, 4, 6, -2, 1);

        //insersion
        ListaGrupos.Insertar(grupoTemp7, listCalendar7, ListaEquiposGrupoG);

        //Grupo H///////////////////////////////////////////////////////////////
        String grupoTemp8 = "8. Grupo H";
        ListaCalendario listCalendar8 = new ListaCalendario();
        listCalendar8.Insertar("17/06/14", "10:00am", "37%", "5 m/s", "29° C", "30° C", 2, 1, "Mineirão Belo Horizonte"); //Belgica - Algeria
        listCalendar8.Insertar("17/06/14", "6:00pm", "70%", "20 m/s", "26° C", "27° C", 1, 1, "Arena Pantanal Cuiabá"); //Rusia - Republica de Corea      
        ListaEquipo ListaEquiposGrupoH = new ListaEquipo(); //Lista de equipos del Grupo H

        String equipoTemp5 = "Belgica";
        ListaJugador listJugador5 = new ListaJugador();
        listJugador5.Insertar("Thibaut", "Courtois", "", 22, 0);
        listJugador5.Insertar("Eden", "Hazard", "", 23, 0);
        listJugador5.Insertar("Adnan", "Hazard", "", 19, 0);
        listJugador5.Insertar("Vincent", "Kompany", "", 28, 0);
        ListaEquiposGrupoH.Insertar(equipoTemp5, listJugador5, 3, 3, 0, 0, 4, 1, 3, 9);
        ListaEquipos.Insertar(equipoTemp5, listJugador5, 3, 3, 0, 0, 4, 1, 3, 9);

        String equipoTemp2 = "Algeria";
        ListaJugador listJugador2 = new ListaJugador();
        listJugador2.Insertar("Rais", "M'Bolhi", "", 28, 0);
        listJugador2.Insertar("Islam", "Slimani", "", 26, 2);
        listJugador2.Insertar("Sofiane", "Feghouli", "", 24, 1);
        listJugador2.Insertar("Saphir", "Taider", "", 22, 0);
        ListaEquiposGrupoH.Insertar(equipoTemp2, listJugador2, 3, 1, 1, 1, 6, 5, 1, 4);
        ListaEquipos.Insertar(equipoTemp2, listJugador2, 3, 1, 1, 1, 6, 5, 1, 4);

        String equipoTemp30 = "Rusia";
        ListaJugador listJugador30 = new ListaJugador();
        listJugador30.Insertar("Yuri", "Lodyguin", "", 24, 0);
        listJugador30.Insertar("Aleksandr", "Kerzhakov", "", 31, 1);
        listJugador30.Insertar("Yuri", "Zhirkov", "", 30, 0);
        listJugador30.Insertar("Igor", "Denisov", "", 30, 0);
        ListaEquiposGrupoH.Insertar(equipoTemp30, listJugador30, 3, 0, 2, 1, 2, 3, -1, 2);
        ListaEquipos.Insertar(equipoTemp30, listJugador30, 3, 0, 2, 1, 2, 3, -1, 2);

        String equipoTemp29 = "Republica de Corea";
        ListaJugador listJugador29 = new ListaJugador();
        listJugador29.Insertar("Jung", "Chung-ryong", "", 29, 0);
        listJugador29.Insertar("Park", "Chu-Young", "", 29, 0);
        listJugador29.Insertar("Son", "Heung-Min", "", 22, 1);
        listJugador29.Insertar("Ki", "Sung-Yong", "", 25, 0);

        ListaEquiposGrupoH.Insertar(equipoTemp29, listJugador29, 3, 0, 1, 2, 3, 6, -3, 1);
        ListaEquipos.Insertar(equipoTemp29, listJugador29, 3, 0, 1, 2, 3, 6, -3, 1);

        //insersion
        ListaGrupos.Insertar(grupoTemp8, listCalendar8, ListaEquiposGrupoH);

        ImageIcon copa = new ImageIcon("src/img/copa.png");
        UIManager UI = new UIManager();
        UIManager.put("OptionPane.background", new ColorUIResource(153, 202, 40)); // //25, 55, 137 azul //color de linea afuera 
        UIManager.put("Panel.background", new ColorUIResource(0x99, 0xCA, 0x28)); //color de fondo de adentro #99 CA 28
        UIManager.put("TextField.margin", new Insets(2, 3, 2, 0)); //padding de los campos de texto  
        UIManager.put("Button.background", new Color(226, 226, 226, 226));

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //importamos JFrame para ponerle título a las ventanas
        JFrame frame = new JFrame("JOptionPane showMessageDialog");

        //ciclo general
        dogeneral:
        do {
            try {
                opt = Integer.parseInt((String) JOptionPane.showInputDialog(frame, "Digite una opcion del menú.." + "\n"
                        + "\n" + "1. Reportes."
                        + "\n" + "2. Inserción y actualización de información."
                        + "\n" + "3. Consultas."
                        + "\n" + "0. Salir.", "Copa mundial - Brasil 2014", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));

                if (opt == 0) { //se sale si precionan 0
                    System.exit(0);
                }
                switch (opt) {
                    case 1:
                        //reportes
                        do {

                            opt = Integer.parseInt((String) JOptionPane.showInputDialog(frame, "Digite una opcion del menú." + "\n"
                                    + "\n" + "1. Estadios."
                                    + "\n" + "2. Equipos."
                                    + "\n" + "3. Grupos."
                                    + "\n" + "4. Goleadores (ordenados por goleo)."
                                    + "\n" + "5. Tabla de posiciones por grupo."
                                    + "\n" + "0. Salir.", "Copa mundial - Brasil 2014.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                            switch (opt) {
                                case 1:
                                    //estadios
                                    do {
                                        opt = Integer.parseInt((String) JOptionPane.showInputDialog(frame, ListaEstadios.ImprimirLista() + "0. Salir", "Brasil 2014 - Estadios.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                                        if (opt != 0 && opt > 0 && opt < 13) {
                                            JOptionPane.showMessageDialog(frame, ListaEstadios.Imprimir(opt), "Brasil 2014 - Estadios.", JOptionPane.INFORMATION_MESSAGE, copa);
                                        }
                                    } while (opt != 0);
                                    break;
                                case 2:
                                    //equipos
                                    do {
                                        opt = Integer.parseInt((String) JOptionPane.showInputDialog(frame, ListaEquipos.ImprimirLista() + "0. Salir", "Brasil 2014 - Equipos.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                                        if (opt != 0 && opt > 0 && opt < 33) {
                                            JOptionPane.showMessageDialog(frame, ListaEquipos.imprimir(opt), "Brasil 2014 - Jugadores.", JOptionPane.INFORMATION_MESSAGE, copa);
                                        }
                                    } while (opt != 0);
                                    break;
                                case 3:
                                    //grupos
                                    do {
                                        opt = Integer.parseInt((String) JOptionPane.showInputDialog(frame, ListaGrupos.ImprimirLista() + "0. Salir", "Brasil 2014 - Equipos.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                                        if (opt != 0 && opt > 0 && opt < 9) {
                                            JOptionPane.showMessageDialog(frame, ListaGrupos.Imprimir(opt), "Brasil 2014 - Jugadores.", JOptionPane.INFORMATION_MESSAGE, copa);
                                        }
                                    } while (opt != 0);
                                    break;
                                case 4:
                                    //goleadores
                                    JOptionPane.showMessageDialog(frame, ListaGrupos.imprimirGoleadores(), "Brasil 2014 - Jugadores.", JOptionPane.INFORMATION_MESSAGE, copa);
                                    break;
                                case 5:
                                    //tabla de posiciones por grupo
                                    do {
                                        opt = Integer.parseInt((String) JOptionPane.showInputDialog(frame, ListaGrupos.ImprimirLista() + "0. Salir", "Brasil 2014 - Equipos.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                                        if (opt != 0 && opt > 0 && opt < 9) {
                                            JOptionPane.showMessageDialog(frame, ListaGrupos.ImprimirTablaDePosiciones(opt), "Brasil 2014 - Jugadores.", JOptionPane.INFORMATION_MESSAGE, copa);
                                        }

                                    } while (opt != 0);
                                    break;
                            }

                        } while (opt != 0);

                        break;

                    case 2:
                        //insercion y actualizacion de informacion
                        do {

                            opt = Integer.parseInt((String) JOptionPane.showInputDialog(frame, "Digite una opcion del menú." + "\n"
                                    + "\n" + "1. Modificar datos de jugadores."
                                    + "\n" + "2. Modificar datos de estadios."
                                    + "\n" + "3. Insertar jugador."
                                    + "\n" + "4. Borrar jugador."
                                    + "\n" + "0. Salir.", "Copa mundial - Brasil 2014", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                            switch (opt) {
                                case 1:
                                    //modificar datos de jugadores
                                    do {
                                        opt = Integer.parseInt((String) JOptionPane.showInputDialog(frame, "Selecciona el equipo del cual desea modificar un jugador." + "\n" + ListaEquipos.ImprimirLista() + "0. Salir", "Brasil 2014 - Equipos.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                                        if (opt != 0) {

                                            nombreAModificar = ((String) JOptionPane.showInputDialog(frame, ListaEquipos.imprimir(opt) + "\n" + "Digite el nombre del jugador al cual desea realizarle una modificación." + "\n" + "0. Salir", "Brasil 2014 - Equipos.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                                            if ("0".equals(nombreAModificar)) {

                                            } else {
                                                if (ListaEquipos.buscarJugador(nombreAModificar, nombreAEliminar) == true) {
                                                    nuevoNombre = ((String) JOptionPane.showInputDialog(frame, ListaEquipos.imprimir(opt) + "\n" + "Digite el nuevo nombre.", "Brasil 2014 - Equipos.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                                                    nuevoApellido1 = ((String) JOptionPane.showInputDialog(frame, ListaEquipos.imprimir(opt) + "\n" + "Digite el nuevo primer apellido", "Brasil 2014 - Equipos.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                                                    nuevoApellido2 = ((String) JOptionPane.showInputDialog(frame, ListaEquipos.imprimir(opt) + "\n" + "Digite el nuevo segundo apellido.", "Brasil 2014 - Equipos.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                                                    nuevaEdad = parseInt((String) JOptionPane.showInputDialog(frame, ListaEquipos.imprimir(opt) + "\n" + "Digite la nueva edad.", "Brasil 2014 - Equipos.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                                                    nuevosGoles = parseInt((String) JOptionPane.showInputDialog(frame, ListaEquipos.imprimir(opt) + "\n" + "Digite los nuevos goles.", "Brasil 2014 - Equipos.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                                                } else {
                                                    JOptionPane.showMessageDialog(frame, "El jugador digitado no existe.            ", "Error.", JOptionPane.INFORMATION_MESSAGE, copa);
                                                }

                                            }

                                            switch (opt) {
                                                case 1:
                                                    listJugador7.ModificarJugador(nombreAModificar, nuevoNombre, nuevoApellido1, nuevoApellido2, nuevaEdad, nuevosGoles);
                                                    break;
                                                case 2:
                                                    listJugador25.ModificarJugador(nombreAModificar, nuevoNombre, nuevoApellido1, nuevoApellido2, nuevaEdad, nuevosGoles);
                                                    break;
                                                case 3:
                                                    listJugador13.ModificarJugador(nombreAModificar, nuevoNombre, nuevoApellido1, nuevoApellido2, nuevaEdad, nuevosGoles);
                                                    break;
                                                case 4:
                                                    listJugador8.ModificarJugador(nombreAModificar, nuevoNombre, nuevoApellido1, nuevoApellido2, nuevaEdad, nuevosGoles);
                                                    break;
                                                case 5:
                                                    listJugador27.ModificarJugador(nombreAModificar, nuevoNombre, nuevoApellido1, nuevoApellido2, nuevaEdad, nuevosGoles);
                                                    break;
                                                case 6:
                                                    listJugador9.ModificarJugador(nombreAModificar, nuevoNombre, nuevoApellido1, nuevoApellido2, nuevaEdad, nuevosGoles);
                                                    break;
                                                case 7:
                                                    listJugador16.ModificarJugador(nombreAModificar, nuevoNombre, nuevoApellido1, nuevoApellido2, nuevaEdad, nuevosGoles);
                                                    break;
                                                case 8:
                                                    listJugador4.ModificarJugador(nombreAModificar, nuevoNombre, nuevoApellido1, nuevoApellido2, nuevaEdad, nuevosGoles);
                                                    break;
                                                case 9:
                                                    listJugador10.ModificarJugador(nombreAModificar, nuevoNombre, nuevoApellido1, nuevoApellido2, nuevaEdad, nuevosGoles);
                                                    break;
                                                case 10:
                                                    listJugador19.ModificarJugador(nombreAModificar, nuevoNombre, nuevoApellido1, nuevoApellido2, nuevaEdad, nuevosGoles);
                                                    break;
                                                case 11:
                                                    listJugador11.ModificarJugador(nombreAModificar, nuevoNombre, nuevoApellido1, nuevoApellido2, nuevaEdad, nuevosGoles);
                                                    break;
                                                case 12:
                                                    listJugador24.ModificarJugador(nombreAModificar, nuevoNombre, nuevoApellido1, nuevoApellido2, nuevaEdad, nuevosGoles);
                                                    break;
                                                case 13:
                                                    listJugador12.ModificarJugador(nombreAModificar, nuevoNombre, nuevoApellido1, nuevoApellido2, nuevaEdad, nuevosGoles);
                                                    break;
                                                case 14:
                                                    listJugador32.ModificarJugador(nombreAModificar, nuevoNombre, nuevoApellido1, nuevoApellido2, nuevaEdad, nuevosGoles);
                                                    break;
                                                case 15:
                                                    listJugador23.ModificarJugador(nombreAModificar, nuevoNombre, nuevoApellido1, nuevoApellido2, nuevaEdad, nuevosGoles);
                                                    break;
                                                case 16:
                                                    listJugador21.ModificarJugador(nombreAModificar, nuevoNombre, nuevoApellido1, nuevoApellido2, nuevaEdad, nuevosGoles);
                                                    break;
                                                case 17:
                                                    listJugador17.ModificarJugador(nombreAModificar, nuevoNombre, nuevoApellido1, nuevoApellido2, nuevaEdad, nuevosGoles);
                                                    break;
                                                case 18:
                                                    listJugador31.ModificarJugador(nombreAModificar, nuevoNombre, nuevoApellido1, nuevoApellido2, nuevaEdad, nuevosGoles);
                                                    break;
                                                case 19:
                                                    listJugador14.ModificarJugador(nombreAModificar, nuevoNombre, nuevoApellido1, nuevoApellido2, nuevaEdad, nuevosGoles);
                                                    break;
                                                case 20:
                                                    listJugador20.ModificarJugador(nombreAModificar, nuevoNombre, nuevoApellido1, nuevoApellido2, nuevaEdad, nuevosGoles);
                                                    break;
                                                case 21:
                                                    listJugador3.ModificarJugador(nombreAModificar, nuevoNombre, nuevoApellido1, nuevoApellido2, nuevaEdad, nuevosGoles);
                                                    break;
                                                case 22:
                                                    listJugador26.ModificarJugador(nombreAModificar, nuevoNombre, nuevoApellido1, nuevoApellido2, nuevaEdad, nuevosGoles);
                                                    break;
                                                case 23:
                                                    listJugador6.ModificarJugador(nombreAModificar, nuevoNombre, nuevoApellido1, nuevoApellido2, nuevaEdad, nuevosGoles);
                                                    break;
                                                case 24:
                                                    listJugador22.ModificarJugador(nombreAModificar, nuevoNombre, nuevoApellido1, nuevoApellido2, nuevaEdad, nuevosGoles);
                                                    break;
                                                case 25:
                                                    listJugardor.ModificarJugador(nombreAModificar, nuevoNombre, nuevoApellido1, nuevoApellido2, nuevaEdad, nuevosGoles);
                                                    break;
                                                case 26:
                                                    listJugador15.ModificarJugador(nombreAModificar, nuevoNombre, nuevoApellido1, nuevoApellido2, nuevaEdad, nuevosGoles);
                                                    break;
                                                case 27:
                                                    listJugador28.ModificarJugador(nombreAModificar, nuevoNombre, nuevoApellido1, nuevoApellido2, nuevaEdad, nuevosGoles);
                                                    break;
                                                case 28:
                                                    listJugador18.ModificarJugador(nombreAModificar, nuevoNombre, nuevoApellido1, nuevoApellido2, nuevaEdad, nuevosGoles);
                                                    break;
                                                case 29:
                                                    listJugador5.ModificarJugador(nombreAModificar, nuevoNombre, nuevoApellido1, nuevoApellido2, nuevaEdad, nuevosGoles);
                                                    break;
                                                case 30:
                                                    listJugador2.ModificarJugador(nombreAModificar, nuevoNombre, nuevoApellido1, nuevoApellido2, nuevaEdad, nuevosGoles);
                                                    break;
                                                case 31:
                                                    listJugador30.ModificarJugador(nombreAModificar, nuevoNombre, nuevoApellido1, nuevoApellido2, nuevaEdad, nuevosGoles);
                                                    break;
                                                case 32:
                                                    listJugador29.ModificarJugador(nombreAModificar, nuevoNombre, nuevoApellido1, nuevoApellido2, nuevaEdad, nuevosGoles);
                                                    break;
                                            }

                                        }
                                    } while (opt != 0);

                                    break;
                                case 2:
                                    //modificar datos de estadios

                                    nombreAModificarEstadio = ((String) JOptionPane.showInputDialog(frame, ListaEstadios.ImprimirListaSinNumeros() + "\n" + "Digite el nombre del estadio al cual desea realizarle una modificación." + "\n" + "0. Salir", "Brasil 2014 - Equipos.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                                    if ("0".equals(nombreAModificarEstadio)) {

                                    } else {
                                        if (ListaEstadios.buscarEstadio(nombreAModificarEstadio) == true) {
                                            nuevoNombreEstadio = ((String) JOptionPane.showInputDialog(frame, ListaEstadios.mostrarDatosDeEstadio(nombreAModificarEstadio) + "\n" + "Digite el nuevo nombre del estadio.", "Brasil 2014 - Equipos.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                                            nuevaTemperatura = parseInt((String) JOptionPane.showInputDialog(frame, ListaEstadios.mostrarDatosDeEstadio(nombreAModificarEstadio) + "\n" + "Digite la nueva temperatura.", "Brasil 2014 - Equipos.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                                            nuevaPrecipitaciones = parseInt((String) JOptionPane.showInputDialog(frame, ListaEstadios.mostrarDatosDeEstadio(nombreAModificarEstadio) + "\n" + "Digite las nuevas precipitaciones.", "Brasil 2014 - Equipos.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                                            nuevaHumedad = parseInt((String) JOptionPane.showInputDialog(frame, ListaEstadios.mostrarDatosDeEstadio(nombreAModificarEstadio) + "\n" + "Digite la nueva humedad.", "Brasil 2014 - Equipos.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                                            nuevoViento = parseInt((String) JOptionPane.showInputDialog(frame, ListaEstadios.mostrarDatosDeEstadio(nombreAModificarEstadio) + "\n" + "Digite el nuevo viento.", "Brasil 2014 - Equipos.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                                            nuevaCapacidad = parseInt((String) JOptionPane.showInputDialog(frame, ListaEstadios.ImprimirLista() + "\n" + "Digite la nueva capacidad.", "Brasil 2014 - Equipos.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                                        } else {
                                            JOptionPane.showMessageDialog(frame, "El estadio digitado no existe.            ", "Error.", JOptionPane.INFORMATION_MESSAGE, copa);
                                        }

                                    }

                                    ListaEstadios.modificarEstadio(nombreAModificarEstadio, nuevoNombreEstadio, nuevaTemperatura, nuevaPrecipitaciones, nuevaHumedad, nuevoViento, nuevaCapacidad);

                                    break;
                                case 3:
                                    //insertar jugador
                                    do {

                                        opt = Integer.parseInt((String) JOptionPane.showInputDialog(frame, "Selecciona el equipo al cual desea añadirle un jugador." + "\n" + ListaEquipos.ImprimirLista() + "0. Salir", "Brasil 2014 - Equipos.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                                        if (opt != 0) {
                                            nombreAAgregar = ((String) JOptionPane.showInputDialog(frame, ListaEquipos.imprimir(opt) + "\n" + "Digite el nombre del nuevo jugador." + "\n" + "0. Salir", "Brasil 2014 - Equipos.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                                            if ("0".equals(nombreAAgregar)) {

                                            } else {
                                                apellidoAAgregar = ((String) JOptionPane.showInputDialog(frame, ListaEquipos.imprimir(opt) + "\n" + "Digite el apellido del nuevo jugador." + "\n" + "0. Salir", "Brasil 2014 - Equipos.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                                                edadAAgregar = parseInt((String) JOptionPane.showInputDialog(frame, ListaEquipos.imprimir(opt) + "\n" + "Digite la edad del nuevo jugador." + "\n" + "0. Salir", "Brasil 2014 - Equipos.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                                                golesAAgregar = parseInt((String) JOptionPane.showInputDialog(frame, ListaEquipos.imprimir(opt) + "\n" + "Digite los goles del nuevo jugador." + "\n" + "0. Salir", "Brasil 2014 - Equipos.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                                            }

                                            switch (opt) {

                                                case 1:
                                                    listJugador7.Insertar(nombreAAgregar, apellidoAAgregar, "", edadAAgregar, golesAAgregar);
                                                    break;
                                                case 2:
                                                    listJugador25.Insertar(nombreAAgregar, apellidoAAgregar, "", edadAAgregar, golesAAgregar);
                                                    break;
                                                case 3:
                                                    listJugador13.Insertar(nombreAAgregar, apellidoAAgregar, "", edadAAgregar, golesAAgregar);
                                                    break;
                                                case 4:
                                                    listJugador8.Insertar(nombreAAgregar, apellidoAAgregar, "", edadAAgregar, golesAAgregar);
                                                    break;
                                                case 5:
                                                    listJugador27.Insertar(nombreAAgregar, apellidoAAgregar, "", edadAAgregar, golesAAgregar);
                                                    break;
                                                case 6:
                                                    listJugador9.Insertar(nombreAAgregar, apellidoAAgregar, "", edadAAgregar, golesAAgregar);
                                                    break;
                                                case 7:
                                                    listJugador16.Insertar(nombreAAgregar, apellidoAAgregar, "", edadAAgregar, golesAAgregar);
                                                    break;
                                                case 8:
                                                    listJugador4.Insertar(nombreAAgregar, apellidoAAgregar, "", edadAAgregar, golesAAgregar);
                                                    break;
                                                case 9:
                                                    listJugador10.Insertar(nombreAAgregar, apellidoAAgregar, "", edadAAgregar, golesAAgregar);
                                                    break;
                                                case 10:
                                                    listJugador19.Insertar(nombreAAgregar, apellidoAAgregar, "", edadAAgregar, golesAAgregar);
                                                    break;
                                                case 11:
                                                    listJugador11.Insertar(nombreAAgregar, apellidoAAgregar, "", edadAAgregar, golesAAgregar);
                                                    break;
                                                case 12:
                                                    listJugador24.Insertar(nombreAAgregar, apellidoAAgregar, "", edadAAgregar, golesAAgregar);
                                                    break;
                                                case 13:
                                                    listJugador12.Insertar(nombreAAgregar, apellidoAAgregar, "", edadAAgregar, golesAAgregar);
                                                    break;
                                                case 14:
                                                    listJugador32.Insertar(nombreAAgregar, apellidoAAgregar, "", edadAAgregar, golesAAgregar);
                                                    break;
                                                case 15:
                                                    listJugador23.Insertar(nombreAAgregar, apellidoAAgregar, "", edadAAgregar, golesAAgregar);
                                                    break;
                                                case 16:
                                                    listJugador21.Insertar(nombreAAgregar, apellidoAAgregar, "", edadAAgregar, golesAAgregar);
                                                    break;
                                                case 17:
                                                    listJugador17.Insertar(nombreAAgregar, apellidoAAgregar, "", edadAAgregar, golesAAgregar);
                                                    break;
                                                case 18:
                                                    listJugador31.Insertar(nombreAAgregar, apellidoAAgregar, "", edadAAgregar, golesAAgregar);
                                                    break;
                                                case 19:
                                                    listJugador14.Insertar(nombreAAgregar, apellidoAAgregar, "", edadAAgregar, golesAAgregar);
                                                    break;
                                                case 20:
                                                    listJugador20.Insertar(nombreAAgregar, apellidoAAgregar, "", edadAAgregar, golesAAgregar);
                                                    break;
                                                case 21:
                                                    listJugador3.Insertar(nombreAAgregar, apellidoAAgregar, "", edadAAgregar, golesAAgregar);
                                                    break;
                                                case 22:
                                                    listJugador26.Insertar(nombreAAgregar, apellidoAAgregar, "", edadAAgregar, golesAAgregar);
                                                    break;
                                                case 23:
                                                    listJugador6.Insertar(nombreAAgregar, apellidoAAgregar, "", edadAAgregar, golesAAgregar);
                                                    break;
                                                case 24:
                                                    listJugador22.Insertar(nombreAAgregar, apellidoAAgregar, "", edadAAgregar, golesAAgregar);
                                                    break;
                                                case 25:
                                                    listJugardor.Insertar(nombreAAgregar, apellidoAAgregar, "", edadAAgregar, golesAAgregar);
                                                    break;
                                                case 26:
                                                    listJugador15.Insertar(nombreAAgregar, apellidoAAgregar, "", edadAAgregar, golesAAgregar);
                                                    break;
                                                case 27:
                                                    listJugador28.Insertar(nombreAAgregar, apellidoAAgregar, "", edadAAgregar, golesAAgregar);
                                                    break;
                                                case 28:
                                                    listJugador18.Insertar(nombreAAgregar, apellidoAAgregar, "", edadAAgregar, golesAAgregar);
                                                    break;
                                                case 29:
                                                    listJugador5.Insertar(nombreAAgregar, apellidoAAgregar, "", edadAAgregar, golesAAgregar);
                                                    break;
                                                case 30:
                                                    listJugador2.Insertar(nombreAAgregar, apellidoAAgregar, "", edadAAgregar, golesAAgregar);
                                                    break;
                                                case 31:
                                                    listJugador30.Insertar(nombreAAgregar, apellidoAAgregar, "", edadAAgregar, golesAAgregar);
                                                    break;
                                                case 32:
                                                    listJugador29.Insertar(nombreAAgregar, apellidoAAgregar, "", edadAAgregar, golesAAgregar);
                                                    break;
                                            }
                                            ListaGrupos.subirCantidad();
                                            ListaEquipos.subirCantidad();

                                        }

                                    } while (opt != 0);

                                    break;
                                case 4:
                                    //borrar jugador
                                    do {

                                        opt = Integer.parseInt((String) JOptionPane.showInputDialog(frame, "Selecciona el equipo del jugador a el cual desea eliminar." + "\n" + ListaEquipos.ImprimirLista() + "0. Salir", "Brasil 2014 - Equipos.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                                        if (opt != 0) {
                                            nombreAEliminar = ((String) JOptionPane.showInputDialog(frame, ListaEquipos.imprimir(opt) + "\n" + "Digite el nombre del jugador que desea eliminar." + "\n" + "0. Salir", "Brasil 2014 - Equipos.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                                            if (ListaEquipos.buscarJugador(nombreAEliminar, nombreAModificar)== true) { ///////////////////////////////VALIDACION
                                                switch (opt) {
                                                case 1:
                                                    listJugador7.EliminarJugador(nombreAEliminar);
                                                    break;
                                                case 2:
                                                    listJugador25.EliminarJugador(nombreAEliminar);
                                                    break;
                                                case 3:
                                                    listJugador13.EliminarJugador(nombreAEliminar);
                                                    break;
                                                case 4:
                                                    listJugador8.EliminarJugador(nombreAEliminar);
                                                    break;
                                                case 5:
                                                    listJugador27.EliminarJugador(nombreAEliminar);
                                                    break;
                                                case 6:
                                                    listJugador9.EliminarJugador(nombreAEliminar);
                                                    break;
                                                case 7:
                                                    listJugador16.EliminarJugador(nombreAEliminar);
                                                    break;
                                                case 8:
                                                    listJugador4.EliminarJugador(nombreAEliminar);
                                                    break;
                                                case 9:
                                                    listJugador10.EliminarJugador(nombreAEliminar);
                                                    break;
                                                case 10:
                                                    listJugador19.EliminarJugador(nombreAEliminar);
                                                    break;
                                                case 11:
                                                    listJugador11.EliminarJugador(nombreAEliminar);
                                                    break;
                                                case 12:
                                                    listJugador24.EliminarJugador(nombreAEliminar);
                                                    break;
                                                case 13:
                                                    listJugador12.EliminarJugador(nombreAEliminar);
                                                    break;
                                                case 14:
                                                    listJugador32.EliminarJugador(nombreAEliminar);
                                                    break;
                                                case 15:
                                                    listJugador23.EliminarJugador(nombreAEliminar);
                                                    break;
                                                case 16:
                                                    listJugador21.EliminarJugador(nombreAEliminar);
                                                    break;
                                                case 17:
                                                    listJugador17.EliminarJugador(nombreAEliminar);
                                                    break;
                                                case 18:
                                                    listJugador31.EliminarJugador(nombreAEliminar);
                                                    break;
                                                case 19:
                                                    listJugador14.EliminarJugador(nombreAEliminar);
                                                    break;
                                                case 20:
                                                    listJugador20.EliminarJugador(nombreAEliminar);
                                                    break;
                                                case 21:
                                                    listJugador3.EliminarJugador(nombreAEliminar);
                                                    break;
                                                case 22:
                                                    listJugador26.EliminarJugador(nombreAEliminar);
                                                    break;
                                                case 23:
                                                    listJugador6.EliminarJugador(nombreAEliminar);
                                                    break;
                                                case 24:
                                                    listJugador22.EliminarJugador(nombreAEliminar);
                                                    break;
                                                case 25:
                                                    listJugardor.EliminarJugador(nombreAEliminar);
                                                    break;
                                                case 26:
                                                    listJugador15.EliminarJugador(nombreAEliminar);
                                                    break;
                                                case 27:
                                                    listJugador28.EliminarJugador(nombreAEliminar);
                                                    break;
                                                case 28:
                                                    listJugador18.EliminarJugador(nombreAEliminar);
                                                    break;
                                                case 29:
                                                    listJugador5.EliminarJugador(nombreAEliminar);
                                                    break;
                                                case 30:
                                                    listJugador2.EliminarJugador(nombreAEliminar);
                                                    break;
                                                case 31:
                                                    listJugador30.EliminarJugador(nombreAEliminar);
                                                    break;
                                                case 32:
                                                    listJugador29.EliminarJugador(nombreAEliminar);
                                                    break;
                                            }
                                            ListaGrupos.bajarCantidad();
                                            ListaEquipos.bajarCantidad();
                                            } else {
                                                JOptionPane.showMessageDialog(frame, "El jugador digitado no existe.            ", "Error.", JOptionPane.INFORMATION_MESSAGE, copa);
                                            }
                                            

                                            

                                        }

                                    } while (opt != 0);

                                    break;
                            }

                        } while (opt != 0);
                        break;
                    case 3:
                        //consultas
                        do {

                            opt = Integer.parseInt((String) JOptionPane.showInputDialog(frame, "Copa mundial - Brasil 2014" + "\n" + "\n" + "Digite una opcion del menú." + "\n"
                                    + "\n" + "1. Consultar el resultado de un partido."
                                    + "\n" + "2. Consultar el nombre del jugador más joven de un equipo 'x'."
                                    + "\n" + "3. Consultar el nombre del jugador más viejo de un equipo 'x'."
                                    + "\n" + "0. Salir.", "Brasil 2014 - Equipos.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                            switch (opt) {
                                case 1:
                                    //consultar el resultado de un partido
                                    do {
                                        opt = Integer.parseInt(JOptionPane.showInputDialog(ListaGrupos.imprimeListaDePartidos() + "0. Salir"));
                                        if (opt != 0 && opt > 0 && opt < 17) {
                                            JOptionPane.showMessageDialog(null, ListaGrupos.imprimeResultadosPartidos(opt));
                                        }
                                    } while (opt != 0);
                                    break;
                                case 2:
                                    //consultar el nombre del jugador más joven de un equipo 'x'
                                    do {
                                        opt = Integer.parseInt((String) JOptionPane.showInputDialog(frame, "Seleccione el equipo del cual quiere saber cual es el jugador mas joven." + "\n" + ListaEquipos.ImprimirLista() + "0. Salir", "Brasil 2014 - Equipos.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                                        if (opt != 0) {
                                            JOptionPane.showMessageDialog(frame, ListaEquipos.imprimirJugadorMasJoven(opt), "Brasil 2014 - Jugadores.", JOptionPane.INFORMATION_MESSAGE, copa);
                                        }
                                    } while (opt != 0);
                                    break;
                                case 3:
                                    //consultar el nombre del jugador más viejo de un equipo 'x'
                                    do {
                                        opt = Integer.parseInt((String) JOptionPane.showInputDialog(frame, "Seleccione el equipo del cual quiere saber cual es el jugador mas viejo." + "\n" + ListaEquipos.ImprimirLista() + "0. Salir", "Brasil 2014 - Equipos.", JOptionPane.INFORMATION_MESSAGE, copa, null, ""));
                                        if (opt != 0) {
                                            JOptionPane.showMessageDialog(frame, ListaEquipos.imprimirJugadorMasViejo(opt), "Brasil 2014 - Jugadores.", JOptionPane.INFORMATION_MESSAGE, copa);
                                        }
                                    } while (opt != 0);
                                    break;

                            }

                        } while (opt != 0);
                        break;
                    case 0:
                        break dogeneral;
                    default:
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(frame, "Error, digita un número del menú.         ", "Error.", JOptionPane.INFORMATION_MESSAGE, copa);
            }
        } while (true);

    }

}
